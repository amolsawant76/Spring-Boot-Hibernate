package com.amolinfo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.amolinfo.dao.UserDAO;
import com.amolinfo.dto.User;

@Controller
public class UserController {

	@Autowired
	UserDAO  userDAO;
	
	@RequestMapping("/Login")
	
	public void Login(Model data)
	{
		data.addAttribute("loginDetails" , new User());
	}
	
	@RequestMapping("/authenticate")
	public ModelAndView authenticate(@ModelAttribute("loginDetails") User objUser )
	{
			if (userDAO.validateUser(objUser.getUserName(), objUser.getPassword()))
				return new ModelAndView("welcome","massage","Successfully Authenticate,Welcome to the Online Sopping");
			else
				return new ModelAndView("failure","msg","Better Luck Next Time");
	}
}