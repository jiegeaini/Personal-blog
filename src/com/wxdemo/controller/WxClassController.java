package com.wxdemo.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wxdemo.formBean.ClassMasterFormBean;
import com.wxdemo.pojo.ClassMaster;
import com.wxdemo.service.dao.WxClassService;

@Controller
public class WxClassController {

	@Autowired
	WxClassService service;
	
	@RequestMapping("/getMainAll")
	@ResponseBody
	public List<ClassMaster> getAll(){
		return service.getClassM();
	}
	
	@RequestMapping(value="/addCategory",method=RequestMethod.POST)
	public String addCategory(ClassMasterFormBean bean,HttpServletRequest request) 
			throws IllegalStateException, IOException {
		System.out.println(bean);
		if (bean.getName() == null) {
			return "redirect:page/getLogin";
		}
		service.addClassMaster(bean, request);
		return "redirect:page/getCategory";
	}
	
	@RequestMapping(value="/updateCategory",method=RequestMethod.POST)
	public String updateCategory(ClassMasterFormBean bean,HttpServletRequest request) 
			throws IllegalStateException, IOException {
		System.out.println(bean);
		if (bean.getName() == null) {
			return "redirect:page/getLogin";
		}
		service.updateClassMaster(bean, request);
		return "redirect:page/getCategory";
	}
	
	@RequestMapping("/deleteCategory")
	public String deleteCategory(Integer id) {
		if (id == null) {
			return "redirect:page/getLogin";
		}
		service.deleteClassMaster(id);
		return "redirect:page/getCategory";
	}
	
}
