package jp.co.example.VandR.Admin.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class NakamuraController {

	@RequestMapping({ "/adminShopDetailInsert" })
	public String index1(Model model){
		return "nakamura_adminShopDetailInsertInput";
	}

	@RequestMapping({ "/adminShopDetailInsertInput" })
	public String index2(Model model){
		return "nakamura_adminShopDetailInsertConfirm";
	}

	@RequestMapping(value= "/adminShopDetailInsertConfirm" ,method=RequestMethod.POST)
	public String index3(Model model){
		return "nakamura_adminShopDetailInsertResult";
	}

	@RequestMapping({ "/adminShopDetailDelete" })
	public String index4(Model model){
		return "nakamura_adminShopDetailDeleteConfirm";
	}

	@RequestMapping(value= "/adminShopDetailDeleteConfirm" ,method=RequestMethod.POST)
	public String index5(Model model){
		return "nakamura_adminShopDetailDeleteResult";
	}

	@RequestMapping({ "/adminShopDetailUpdate" })
	public String index6(Model model){
		return "nakamura_adminShopDetailUpdateInput";
	}

	@RequestMapping(value= "/adminShopDetailUpdateInput" ,method=RequestMethod.POST)
	public String index7(Model model){
		return "nakamura_adminShopDetailUpdateConfirm";
	}

	@RequestMapping(value= "/adminShopDetailUpdateConfirm" ,method=RequestMethod.POST)
	public String index8(Model model){
		return "nakamura_adminShopDetailUpdateResult";
	}

	@RequestMapping({ "/adminShopDetailSelect" })
	public String index9(Model model){
		return "nakamura_adminShopDetailSelectInput";
	}

	@RequestMapping(value= "/adminShopDetailSelectInput" ,method=RequestMethod.POST)
	public String index10(Model model){
		return "nakamura_adminShopDetailSelectResult";
	}

	@RequestMapping({ "/menu" })
	public String index11(Model model){
		return "menu";
	}

	@RequestMapping({ "/adminAnalyzingSelectHour" })
	public String index16(Model model){
		return "adminAnalyzingSelectHour";
	}

	@RequestMapping({ "/adminAnalyzingSelectDay" })
	public String index17(Model model){
		return "adminAnalyzingSelectDay";
	}

//分析画面の最初に表示するやつ
	@RequestMapping({ "/adminAnalyzingSelectMonth" })
	public String index18(Model model){
		return "adminAnalyzingSelectMonth";
	}

	@RequestMapping({ "/adminAnalyzingDelete" })
	public String index19(Model model){
		return "adminAnalyzingDeleteConfirm";
	}

	@RequestMapping(value= "/adminAnalyzingDeleteConfirm" ,method=RequestMethod.POST)
	public String index20(Model model){
		return "adminAnalyzingDeleteResult";
	}

}