package jp.co.example.VandR.Shop.DAO.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import jp.co.example.VandR.Shop.DAO.IReservationDao;
import jp.co.example.VandR.Shop.entity.Reservation;


@Repository
public class ReservationDao implements IReservationDao {

	@Autowired
    private NamedParameterJdbcTemplate jdbcTemplate;


	@Override
	public List<Reservation> findByShopId(Integer id) {
		String sql = "SELECT * FROM reservation WHERE shop_id = :id";

		MapSqlParameterSource param = new MapSqlParameterSource();
		List<Map<String,Object>> resultList = jdbcTemplate.queryForList(sql,param.addValue("id", id));
		List<Reservation> reservationList = new ArrayList<Reservation>();
		for(Map<String, Object> result: resultList) {
			Reservation reservation = new Reservation();
			reservation.setUser_name((String) result.get("user_name"));
			reservation.setNum((String) result.get("num"));
			reservation.setTime((String) result.get("time"));
			reservation.setSeat_id((int) result.get("seat_id"));
			reservation.setReservation_id((int)result.get("reservation_id"));
			reservationList.add(reservation);
		}
		return reservationList;
	}

	public Reservation findById(Integer id) {
		String sql = "SELECT * FROM reservation WHERE reservation_id = :id";
		MapSqlParameterSource param = new MapSqlParameterSource();
		return jdbcTemplate.queryForObject(sql, param.addValue("id",id),
				new BeanPropertyRowMapper<Reservation>(Reservation.class));

	}

	public String getSeatInfo(Integer id) {
		String sql = "SELECT s.seattype, s.num FROM seat s "
				+ "JOIN vacancy c ON s.seat_id = v.seat_id"
				+ "JOIN reservation r ON v.vacancy_id = r.vacancy_id"
				+ "WHERE reservation_id = :id";
	}

	//reservation_idをもとに削除
	public void delete(Integer id) {
		String sql = "DELETE FROM reservation WHERE reservation_id = :id";
		MapSqlParameterSource param = new MapSqlParameterSource();
		param.addValue("id", id);

		jdbcTemplate.update(sql,  param);
	}



}
