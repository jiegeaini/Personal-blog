package com.wxdemo.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wxdemo.pojo.Question;
import com.wxdemo.service.dao.QuestionService;

@Controller
public class QuestionController {
	
	@Autowired
	QuestionService service;
	
	@RequestMapping("/getAll_question")
	@ResponseBody
	public List<Question> getAll(){
		return service.getAll();
	}
	
	@RequestMapping(value="/addQuestion",method=RequestMethod.POST)
	public String addCategory(Question question) {
		if (question.getName() == null) {
			return "redirect:page/getLogin";
		}
		service.addQuestion(question);
		return "redirect:page/getQuestion";
	}
	
	@RequestMapping(value="/updateQuestion",method=RequestMethod.POST)
	public String updateCategory(Question question) {
		System.out.println(question);
		if (question.getName() == null) {
			return "redirect:page/getLogin";
		}
		service.updateQuestion(question);
		return "redirect:page/getQuestion";
	}
	
	@RequestMapping("/deleteQuestion")
	public String deleteCategory(Integer id) {
		if (id == null) {
			return "redirect:page/getLogin";
		}
		service.deleteQuestion(id);
		return "redirect:page/getQuestion";
	}
}
