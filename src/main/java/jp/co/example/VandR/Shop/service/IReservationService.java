package jp.co.example.VandR.Shop.service;

import java.util.List;

import jp.co.example.VandR.Shop.entity.Reservation;

public interface IReservationService {
	public List<Reservation> findByShopId(Integer id);
	public Reservation findById(Integer id);
	public void delete(Integer id);
}
