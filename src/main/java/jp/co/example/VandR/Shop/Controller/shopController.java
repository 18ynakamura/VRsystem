package jp.co.example.VandR.Shop.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import jp.co.example.VandR.Shop.entity.Reservation;
import jp.co.example.VandR.Shop.entity.ShopSessionInfo;
import jp.co.example.VandR.Shop.service.IReservationService;

@Controller
public class shopController {
	@Autowired
	IReservationService reservationService;
	@Autowired
	ShopSessionInfo sessioninfo;

    @RequestMapping(value = "/shopIndex", method = RequestMethod.GET)
	public String index(Model model) {
    	return "shopIndex";
    }

    @RequestMapping(value = "/shopLogin", method = RequestMethod.POST)
	public String login(Model model) {
    	return "shopMenu";
    }

    @RequestMapping(value = "/shopMenu", method = RequestMethod.GET)
    public String menu(Model model) {
    	return "shopMenu";
}

    @RequestMapping(value = "/shopProfile", method = RequestMethod.GET)
    public String profile(Model model) {
    	return "shopProfile";
    }

    @RequestMapping(value = "/shopProfileUpdateInput", method = RequestMethod.GET)
    public String profileUpdate(Model model) {
    	return "shopProfileUpdateInput";
    }

//	@RequestMapping(value = "/updateInputBack")
//	public String updateInputBack(Model model) {
//		return "shopProfileUpdateInput";
//	}

//    @RequestMapping(value = "/shopProfileUpdateConfirm", method = RequestMethod.POST)
//    public String profileUpdateConfirm(Model model) {
//    	return "shopProfileUpdateConfirm";
//    }

    @RequestMapping(value = "/shopProfileUpdate", method = RequestMethod.POST)
    public String profileUpdateResult(Model model) {
    	return "shopProfileUpdateResult";
    }
    //予約情報を一覧表示
    @RequestMapping(value = "/shopReservationCheck", method = RequestMethod.GET)
    public String reservation(Model model) {

    	int id = sessioninfo.getShop_id();
    	//findByShopIdの()には、sessionInfoに保存した店舗idが入ります
    	List<Reservation> resultList = reservationService.findByShopId(1);
    	model.addAttribute("reservelist", resultList);

    	return "shopReservationCheck";
    }

    @RequestMapping(value = "/shopReservationInsert", method = RequestMethod.GET)
    public String reservationInsert(Model model) {
    	return "shopReservationInsert";
    }

    @RequestMapping(value = "/shopReservationInsertResult", method = RequestMethod.POST)
    public String reservationInsertResult(Model model) {
    	return "shopReservationInsertResult";
    }
    //reserve_idをもとに予約を削除します
    @RequestMapping(value = "/shopReservationDelete", method = RequestMethod.POST)
    public String reservationDelete(@RequestParam("shopReservationDelete")int id, Model model) {
    	Reservation reservation = reservationService.findById(id);
    	model.addAttribute("reservation",reservation);


    	return "shopReservationDelete";
    }

    @RequestMapping(value = "/shopReservationDeleteResult", method = RequestMethod.POST)
    public String reservationDeleteResult(@RequestParam("shopReservationDeleteResult") int id, Model model) {
    	reservationService.delete(id);
    	return "shopReservationDeleteResult";
    }

    @RequestMapping(value = "/shopAnalysisCheckMonth", method = RequestMethod.GET)
    public String analysisMonth(Model model) {
    	return "shopAnalysisCheckMonth";
    }

    @RequestMapping(value = "/shopAnalysisCheckDate", method = RequestMethod.GET)
    public String analysisDate(Model model) {
    	return "shopAnalysisCheckDate";
    }

    @RequestMapping(value = "/shopAnalysisCheckTime", method = RequestMethod.GET)
    public String analysisTime(Model model) {
    	return "shopAnalysisCheckTime";
    }

    @RequestMapping(value = "/shopLogout", method = RequestMethod.GET)
    public String logout(Model model) {
    	return "shopLogout";
    }

    @RequestMapping(value = "/shopAnalysisCheckYear", method = RequestMethod.GET)
    public String analysisYear(Model model) {
    	return "shopAnalysisCheckYear";
    }
}