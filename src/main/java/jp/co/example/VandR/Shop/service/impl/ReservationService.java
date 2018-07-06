package jp.co.example.VandR.Shop.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.co.example.VandR.Shop.DAO.IReservationDao;
import jp.co.example.VandR.Shop.entity.Reservation;
import jp.co.example.VandR.Shop.service.IReservationService;
@Service
public class ReservationService implements IReservationService {
	@Autowired
	private IReservationDao reservationDao;
	@Override
	public List<Reservation> findByShopId(Integer id) {
		return reservationDao.findByShopId(id);
	}

	public Reservation findById(Integer id) {
		return reservationDao.findById(id);
	}

	public void delete(Integer id) {
		reservationDao.delete(id);
	}
}
