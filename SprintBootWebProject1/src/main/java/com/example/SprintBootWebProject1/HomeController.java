package com.example.SprintBootWebProject1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String Home() {
		System.out.println("Home method called...");
		
		return "index";
		
		//return "index.jsp";
	}
	
	@RequestMapping("add")
	public ModelAndView add(@RequestParam("num1")int num,@RequestParam("num2")int numm, ModelAndView mv) {
		
		//public String add(@RequestParam("num1")int num,@RequestParam("num2")int numm, Model model) {
		//public String add(int num1,int num2,HttpSession ses) {
		//public String add(HttpServletRequest req,HttpSession ses) {
		//int num1 = Integer.parseInt(req.getParameter("num1"));
		//int num2 = Integer.parseInt(req.getParameter("num2"));
		int result = num+numm;
		//System.out.println(num1+num2);
		//ses.setAttribute("result", result);
		//model.addAttribute("result",result);
		
		mv.addObject("result",result);
		mv.setViewName("result");
		
		return mv;
		//return "result.jsp";
	}
	
	@ModelAttribute("course")
	public String course() {
		return "java";
	}
	
	@RequestMapping("addAlien")
	public String addAlien(Alien alien) {
		
		//public ModelAndView addAlien(@RequestParam("aid")int aid,@RequestParam("aname")String aname, ModelAndView mv) {
		System.out.println("alien method is called");
		
//		Alien alien = new Alien();
//		alien.setAid(aid);
//		alien.setAname(aname);
		
	//	mv.addObject("alien",alien);
	//	mv.setViewName("alien");
		return "alien";
	}
}
