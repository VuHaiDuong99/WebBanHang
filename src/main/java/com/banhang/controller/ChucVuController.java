package com.banhang.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.banhang.entity.Chucvu;
import com.banhang.entity1.ChucVu;
import com.banhang.service.ChucVuService;

@Controller
public class ChucVuController {
	@Autowired
	ChucVuService chucVuService;
	@RequestMapping(value="/ChucVu")
	public String ChucVu(ModelMap model) {
		model.addAttribute("insertChucVu", new Chucvu());	
		return "ChucVu";
	}
	@RequestMapping(value="/ThemChucVu",method  = RequestMethod.POST)
	public String ThemChucVu(@ModelAttribute("insertChucVu") ChucVu chucVu, ModelMap model) {
		chucVuService.insertChucVu(chucVu);
		return "ThanhCong";
	}
}
