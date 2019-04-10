package com.wxdemo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.wxdemo.pojo.ExperienceMessage;
import com.wxdemo.service.dao.ExperienceMessageService;

@Controller
public class ExperienceMessageController {

	@Autowired
	ExperienceMessageService service;
	
	@RequestMapping("/getAll_ExperienceMessage")
	@ResponseBody
	public List<ExperienceMessage> getAll(){
		return service.getAll();
	}
	
	@RequestMapping("/getExperienceMessage")
	@ResponseBody
	public ExperienceMessage getExperienceMessage(Integer id) {
		if (id == null) {
			return null;
		}
		return service.getExperienceMessage(id);
	}
	
	@RequestMapping(value="/addExperienceMessage",method=RequestMethod.POST)
	public String addExperienceMessage(ExperienceMessage message) {
		if (message.getTitle() == null) {
			return "redirect:page/getLogin";
		}
		service.addExperienceMessage(message);
		return "redirect:page/getExperienceMess";
	}
	
	@RequestMapping(value="/updateExperienceMessage",method=RequestMethod.POST)
	public String updateExperienceMessage(ExperienceMessage message) {
		if (message.getTitle() == null) {
			return "redirect:page/getLogin";
		}
		service.updateExperienceMessage(message);
		return "redirect:page/getExperienceMess";
	}
	
	@RequestMapping("/deleteExperienceMessage")
	public String deleteExperienceMessage(Integer id) {
		if (id == null) {
			return "redirect:page/getLogin";
		}
		service.deleteExperienceMessage(id);
		return "redirect:page/getExperienceMess";
	}
}
