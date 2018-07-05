package jp.co.example.VandR.User.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import jp.co.example.VandR.Admin.DAO.impl.UserInfoDao;
import jp.co.example.VandR.Admin.entity.UserInfo;
import jp.co.example.VandR.User.service.IUserInfoService;



@Service
@Transactional
public class UserInfoService implements IUserInfoService {

	@Autowired
	private UserInfoDao userInfoDao;

	@Override
	public List<UserInfo> find(UserInfo userInfo) {

		if (userInfo.isConditionsEmpty()) {
			return userInfoDao.findAll();
		} else {
			return userInfoDao.findByConditions(userInfo);
		}
	}

}
