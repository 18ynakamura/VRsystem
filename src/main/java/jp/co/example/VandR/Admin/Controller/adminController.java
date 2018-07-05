package jp.co.example.VandR.Admin.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class adminController {
	@RequestMapping("/adminTop")
	public String index1(Model model){
		model.addAttribute("msg", "Hello MVC!");
		return "Mazaki_adminTop";
	}

	@RequestMapping("/adminMenu")
	public String index0(Model model){
		//model.addAttribute("msg", "Hello MVC!");

		return "Mazaki_adminMenu";
	}

	@RequestMapping("/adminLogin")
	public String index2(Model model){
		//model.addAttribute("msg", "Hello MVC!");

		return "Mazaki_adminLogin";
	}

	@RequestMapping(value="/adminLogin",method=RequestMethod.POST)
	public String index3(@RequestParam("id") String id ,
			@RequestParam("pass") String pass ,Model model){
		model.addAttribute("msg", "Hello MVC!");
		return "Mazaki_adminMenu";
	}


	@RequestMapping("/adminUpdateInput" )
	public String index4(Model model){
		model.addAttribute("msg", "Hello MVC!");
		return "Mazaki_adminUpdateInput";
	}

	@RequestMapping(value="/adminUpdateConfirm" ,method=RequestMethod.POST)
	public String index5(Model model){
		model.addAttribute("msg", "Hello MVC!");
		System.out.print(8);
		return "Mazaki_adminUpdateConfirm";
	}

	@RequestMapping(value="/adminUpdateResult" ,method=RequestMethod.POST)
	public String index6(Model model){
		model.addAttribute("msg", "Hello MVC!");
	return "Mazaki_adminUpdateResult";
	}


	@RequestMapping("/adminMemberSelectInput")
	public String index7(Model model){
		model.addAttribute("msg", "Hello MVC!");
		return "Mazaki_adminMemberSelectInput";
	}

	@RequestMapping(value="/adminMemberSelectResult" ,method=RequestMethod.POST)
	public String index8(Model model){
		model.addAttribute("msg", "Hello MVC!");
		return "Mazaki_adminMemberSelectResult";
	}

	@RequestMapping(value="/adminMemberDeleteConfirm" ,method=RequestMethod.POST)
	public String index9(Model model){
		model.addAttribute("msg", "Hello MVC!");
		return "Mazaki_adminMemberDeleteConfirm";
	}

	@RequestMapping(value="/adminMemberDeleteResult" ,method=RequestMethod.POST)
	public String index10(Model model){
		model.addAttribute("msg", "Hello MVC!");
		return "Mazaki_adminMemberDeleteResult";
	}

	@RequestMapping("/adminShopMenu")
	public String index11(Model model){
		model.addAttribute("msg", "Hello MVC!");
		return "Mazaki_adminShopMenu";
	}

	@RequestMapping(value="/adminLogout" ,method=RequestMethod.GET)
	public String index12(Model model){
		model.addAttribute("msg", "Hello MVC!");
		return "Mazaki_adminLogout";
	}

}

