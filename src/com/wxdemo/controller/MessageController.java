package com.wxdemo.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wxdemo.pojo.Message;
import com.wxdemo.service.dao.MessageService;

@Controller
public class MessageController {

	@Autowired
	MessageService service;
	
	@RequestMapping("/getAll_message")
	@ResponseBody
	public List<Message> getAll(){
		return service.getAll();
	}
	
	@RequestMapping("/getMessage")
	@ResponseBody
	public Message getMessage(Integer id) {
		if (id == null) {
			return null;
		}
		return service.getMessage(id);
	}
	
	@RequestMapping(value="/addMessage",method=RequestMethod.POST)
	public String addMessage(Message message) {
		if (message.getTitle() == null) {
			return "redirect:page/getLogin";
		}
		service.addMessage(message);
		return "redirect:page/getMessage";
	}
	
	@RequestMapping(value="/updateMessage",method=RequestMethod.POST)
	public String updateMessage(Message message) {
		if (message.getTitle() == null) {
			return "redirect:page/getLogin";
		}
		service.updateMessage(message);
		return "redirect:page/getMessage";
	}
	
	@RequestMapping("/deleteMessage")
	public String deleteMessage(Integer id) {
		if (id == null) {
			return "redirect:page/getLogin";
		}
		service.deleteMessage(id);
		return "redirect:page/getMessage";
	}
}
