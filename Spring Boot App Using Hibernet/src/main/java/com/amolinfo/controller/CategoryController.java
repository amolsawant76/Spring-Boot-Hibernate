package com.amolinfo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.amolinfo.dao.CategoryDAO;
import com.amolinfo.dto.Category;

@Controller
public class CategoryController {

	@Autowired
	CategoryDAO categoryDAO;
	
	@RequestMapping("/category")
	public ModelAndView showAllCategories()
	{
		List<Category> list =categoryDAO.getAllCategories();
		ModelAndView nextView = new ModelAndView("categoryAll","categories",list);
		return nextView;
	}
}

