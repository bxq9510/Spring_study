package com.human.bbs;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MemberController {
	@RequestMapping(value = "/MemberForm", method = RequestMethod.GET)
	public String MemberForm() {
		return "memberForm";
	}
	@RequestMapping(value = "/MemberinputForm", method = RequestMethod.GET)
	public String MemberinputForm() {
		return "memberForm";
	}
	@RequestMapping(value = "/MemberInput", method = RequestMethod.POST)
	public String MemberInput(HttpServletRequest httpServletRequest, Model model) {
		String id = httpServletRequest.getParameter("id");
		String pw = httpServletRequest.getParameter("pw");
		System.out.println("id : " + id + "pw : " + pw);
		
		model.addAttribute("id", id);
		model.addAttribute("pw", pw);
		
		return "memberList";
	}
}
