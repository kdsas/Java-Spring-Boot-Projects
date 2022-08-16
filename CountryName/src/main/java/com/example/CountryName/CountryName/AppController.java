package com.example.CountryName.CountryName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import java.util.*;

import com.example.CountryName.CountryName.CoService;
import com.example.CountryName.CountryName.CoRepo;

@Controller
public class AppController {
	@Autowired
	CoService coService;

	@RequestMapping("/")  // what request method here, its get
	public String welcome(Model model)
	{
		// not invoking any services.
		// get some data from Service Layer
		// make some data here.
		// share that data to the thymleaf/html
		
		model.addAttribute("message1", "hello, iam from controller");
		return "index";
	}
	@RequestMapping("/new")
	public String showCoForm(Model model)
	{
		Country c = new Country();
		model.addAttribute(c);
		return "new_country";
	}
	@RequestMapping("/list_countries") // here its get
	public String listCountries(Model model)
	{
		List<Country> listCo=coService.getList();
		model.addAttribute("country123",listCo); // scopes req,session,app,
		
		return "countries";
	}
	@RequestMapping(value="/save",method = RequestMethod.POST)
	public String saveCo(@ModelAttribute("country") Country  co)
	{
		
		coService.save(co);
		return "redirect:/list_countries";
	}
	@RequestMapping("/edit/{id}")
	public ModelAndView showEditCountryPage(@PathVariable(name="id") long id)
	{
		ModelAndView mav = new ModelAndView("edit_country");
		Country c = coService.get(id);
		mav.addObject("country",c);
		return mav;
		
		
	}
	@RequestMapping("/delete/{id}")
	public String deleteCountry(@PathVariable(name="id") long id)
	{
		coService.delete(id);
		// you create a new theymeleaf.
		return "redirect:/list_countries";
		
	}
	
}
