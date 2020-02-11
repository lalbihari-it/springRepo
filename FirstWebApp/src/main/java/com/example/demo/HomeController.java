package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	/*
	 * @RequestMapping("home") public String home() {
	 * System.out.println("i am home method"); return "home.jsp"; }
	 * 
	 */
	
	//Spring is calling jsp by RequestDispatcher method not sendRedirect
	/*
	 * @RequestMapping("home") public String home(HttpServletRequest req) { String
	 * name = req.getParameter("name");
	 * 
	 * req.setAttribute("name", name); //HttpSession session = req.getSession();
	 * //session.setAttribute("name", name);
	 * 
	 * System.out.println("My name is: " + name); return "home"; }
	 */

	@RequestMapping("home")
	//public String home(String name, HttpSession session) {
	//public String home(@RequestParam("name") String name, HttpSession session) {
	/*public ModelAndView home(@RequestParam("name") String name) {
		//System.out.println("My name is: " + name);
		//session.setAttribute("name", name);
		ModelAndView mv = new ModelAndView();
		mv.addObject("name", name);
		mv.setViewName("home");
		
		return mv;
	}*/
	
	public ModelAndView student(Student std) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("obj", std);
		mv.setViewName("home1");
		return mv;
	}
}
