package jp.co.example.VandR.Admin.DAO.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import jp.co.example.VandR.Admin.DAO.IUserInfoDao;
import jp.co.example.VandR.Admin.entity.UserInfo;

@Repository
public class UserInfoDao implements IUserInfoDao {

    @Autowired
    private NamedParameterJdbcTemplate jdbcTemplate;

	@Override
	public List<UserInfo> findAll() {
		String sql = "SELECT * FROM user_info ORDER BY user_id";

		List<UserInfo> resultList = jdbcTemplate.query(sql, new BeanPropertyRowMapper<UserInfo>());

		return resultList;
	}

	@Override
	public List<UserInfo> findByConditions(UserInfo userInfo) {

		List<String> condition = new ArrayList<String>();
		MapSqlParameterSource param = new MapSqlParameterSource();

		Integer userId = userInfo.getUserId();
		String userName = userInfo.getUserName();
		String telephone = userInfo.getTelephone();

		if(userId != null) {
			condition.add("user_id = :userId");
			param.addValue("userId", userId);
		}

		if(userName != null && !userName.isEmpty()) {
			condition.add("user_name = :userName");
			param.addValue("userName", userName);

		}

		if(telephone != null && !telephone.isEmpty()) {
			condition.add("telephone = :telephone");
			param.addValue("telephone", telephone);

		}

		String whereString = String.join(" AND ", condition.toArray(new String[]{}));

		String sql = "SELECT * FROM user_info WHERE " + whereString + " ORDER BY user_id";

		List<UserInfo> resultList = jdbcTemplate.query(sql, param, new BeanPropertyRowMapper<UserInfo>(UserInfo.class));

		return resultList;
	}
}


