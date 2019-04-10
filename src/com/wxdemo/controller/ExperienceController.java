package com.wxdemo.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.wxdemo.pojo.Experience;

import com.wxdemo.service.dao.ExperienceService;

@Controller
public class ExperienceController {
	
	@Autowired
	ExperienceService service;
	
	@RequestMapping("/getAll_experience")
	@ResponseBody
	public List<Experience> getAll(){
		return service.getAll();
	}
	
	@RequestMapping(value="/addExperience",method=RequestMethod.POST)
	public String addMessage(Experience experience) {
		if (experience.getName() == null) {
			return "redirect:page/getLogin";
		}
		service.addExperience(experience);
		return "redirect:page/getExperience";
	}
	
	@RequestMapping(value="/updateExperience",method=RequestMethod.POST)
	public String updateExperience(Experience experience) {
		if (experience.getName() == null) {
			return "redirect:page/getLogin";
		}
		service.updateExperience(experience);
		return "redirect:page/getExperience";
	}
	
	@RequestMapping("/deleteExperience")
	public String deleteExperience(Integer id) {
		if (id == null) {
			return "redirect:page/getLogin";
		}
		service.deleteExperience(id);
		return "redirect:page/getExperience";
	}
}
