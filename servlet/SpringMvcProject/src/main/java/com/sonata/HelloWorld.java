package com.sonata;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

//@RestController
@Controller
@RequestMapping("/hello")
public class HelloWorld {
	//@RequestMapping("/hello")
	
	//@RequestMapping(method=RequestMethod.GET)
	@RequestMapping(value="/helloString/{helloID}",method=RequestMethod.GET)
	public String myURLPath(@PathVariable String helloID,@RequestParam("myCity")String city,Model model)
	{
		model.addAttribute("message"+helloID,"message"+helloID+"is selected"+" i live in this city"+city);
		return "myPage"+helloID;
	}
	@RequestMapping(method=RequestMethod.GET)
	@ResponseBody
	public String sayHi() {
		return "hi welcome to roy sonata";
	}
	
	@RequestMapping(value="/myview")
	@ResponseBody
	public String MyMethod() {
		return "view page";
	}
	
	@RequestMapping(value="/mypageview")
	//@ResponseBody
	public String MyShow(ModelMap model) {
		model.addAttribute("message1","myspring web page");
		return "myPage1";
		
	}
	
	@RequestMapping(value = "/sayspring", method = RequestMethod.GET)
	// Return type is String
	// Receives Map type model object as argument
	public String helloWorld(Map<String, String> map) {
		map.put("message2", "Spring MVC Example!");

		return "myPage2";
	}
	
	@RequestMapping(value = "/sayspringmvc", method = RequestMethod.GET)
	// Return type is ModelAndView
	// ModelAndView object is created inside the handler method
	public ModelAndView helloWorld() {
		ModelAndView modelAndView = new ModelAndView("mypage3");
		modelAndView.addObject("message3", "Spring MVC!");

		return modelAndView;
	}
	@RequestMapping(value = "/sayspringcore", method = RequestMethod.GET)
	// Return type is String
	// Receives Model type model object as argument
	public String helloWorld(Model model) {
		model.addAttribute("message4", "Spring Core!");

		return "myPage4";
	}
	
	// Handles helloworld/sayspringbatch
		@RequestMapping(value = "/sayspringbatch", method = RequestMethod.GET)
		// Because the return type is "void", the value of the URL,
		// "/helloworld/sayspringbatch" is set as logical view name,
		// which in turn results in displaying "/helloworld/sayspringbatch.jsp".
		// Receives Model type model object as argument
		public void helloWorld2(Model model) {
			model.addAttribute("message5", "Spring Batch!");
		}
	/*
	@RequestMapping(method = RequestMethod.GET)
	// Return type is String
	// Receives ModelMap type model object as argument
	public String helloWorld(ModelMap modelMap) {
	modelMap.addAttribute("message1", "Welcome to Sonata!");
	System.out.println("---->/helloworld");
	return "mypage1";
	}
	*/

}