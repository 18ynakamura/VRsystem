package jp.co.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NakamuraController {

	@RequestMapping({ "/adminShopDetailInsert" })
	public String index1() {
		return "nakamura_adminShopDetailInsertInput";
	}

	@RequestMapping({ "/adminShopDetailInsertInput" })
	public String index2() {
		return "nakamura_adminShopDetailInsertConfirm";
	}

	@RequestMapping({ "/adminShopDetailInsertConfirm" })
	public String index3() {
		return "nakamura_adminShopDetailInsertResult";
	}

	@RequestMapping({ "/adminShopDetailDelete" })
	public String index4() {
		return "nakamura_adminShopDetailDeleteConfirm";
	}

	@RequestMapping({ "/adminShopDetailDeleteConfirm" })
	public String index5() {
		return "nakamura_adminShopDetailDeleteResult";
	}
	@RequestMapping({ "/adminShopDetailUpdate" })
	public String index6() {
		return "nakamura_adminShopDetailUpdateInput";
	}
	@RequestMapping({ "/adminShopDetailUpdateInput" })
	public String index7() {
		return "nakamura_adminShopDetailUpdateConfirm";
	}

	@RequestMapping({ "/adminShopDetailUpdateConfirm" })
	public String index8() {
		return "nakamura_adminShopDetailUpdateResult";
	}

	@RequestMapping({ "/adminShopDetailSelect" })
	public String index9() {
		return "nakamura_adminShopDetailSelectInput";
	}
	@RequestMapping({ "/adminShopDetailSelectInput" })
	public String index10() {
		return "nakamura_adminShopDetailSelectResult";
	}
	@RequestMapping({ "/menu" })
	public String index11() {
		return "menu";
	}

	@RequestMapping({ "/adminAnalyzingSelectHour" })
	public String index16() {
		return "adminAnalyzingSelectHour";
	}

	@RequestMapping({ "/adminAnalyzingSelectDay" })
	public String index17() {
		return "adminAnalyzingSelectDay";
	}
//分析画面の最初に表示するやつ
	@RequestMapping({ "/adminAnalyzingSelectMonth" })
	public String index18() {
		return "adminAnalyzingSelectMonth";
	}

	@RequestMapping({ "/adminAnalyzingDelete" })
	public String index19() {
		return "adminAnalyzingDeleteConfirm";
	}

	@RequestMapping({ "/adminAnalyzingDeleteConfirm" })
	public String index20() {
		return "adminAnalyzingDeleteResult";
	}

}