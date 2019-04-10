package com.wxdemo.controller;

import java.io.IOException;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wxdemo.formBean.ContentFormBean;
import com.wxdemo.pojo.Content;
import com.wxdemo.service.dao.WxService;

@Controller
public class WxController {
	
	@Autowired
	WxService service;
	
	@RequestMapping("/getAll")
	@ResponseBody
	public List<Content> getAll(int number,int id){
		return service.getAll(number,id);
	}
	@RequestMapping("/getCid")
	@ResponseBody
	public Content getContent(int id){
		return service.getContent(id);
	}
	@RequestMapping("/getAll_c")
	@ResponseBody
	public List<Content> getContent_c(Integer id){
		if (id == null) {
			return null;
		}
		return service.getAll(id);
	}
	@RequestMapping(value="/addContent",method=RequestMethod.POST)
	public String addContent(ContentFormBean bean,HttpServletRequest request) 
			throws IllegalStateException, IOException {
		if (bean.getName() == null) {
			return "redirect:page/getLogin";
		}
		service.addContent(bean, request);
		return "redirect:page/getIndex";
	}
	@RequestMapping(value="/updateContent",method=RequestMethod.POST)
	public String updateContent(ContentFormBean bean,HttpServletRequest request) 
			throws IllegalStateException, IOException {
		if (bean.getName() == null) {
			return "redirect:page/getLogin";
		}
		service.updateContent(bean, request);
		return "redirect:page/getIndex";
	}
	@RequestMapping("/deleteContent")
	public String deleteContent(Integer id) {
		if (id == null) {
			return "redirect:page/getLogin";
		}
		service.deleteContent(id);
		return "redirect:page/getIndex";
	}
}
