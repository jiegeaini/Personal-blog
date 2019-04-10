package com.wxdemo.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wxdemo.pojo.Aboutme;
import com.wxdemo.pojo.User;
import com.wxdemo.service.dao.AboutmeService;
import com.wxdemo.service.dao.UserService;

@Controller
public class AboutmeController {
	
	@Autowired
	AboutmeService service;
	@Autowired
	UserService userService;
	
	
	@RequestMapping("/getAll_aboutme")
	@ResponseBody
	public List<Aboutme> getAll(){
		return service.getAll();
	}
	@RequestMapping("/uploadImg")
	public String uploadImg(com.wxdemo.pojo.Image image,HttpServletRequest request) throws IllegalStateException, IOException {
		if (image.getName() == null) {
			return "redirect:page/getLogin";
		}
		System.out.println("upload img...");
		String newFileName = image.getName();
		String filepath = request.getServletContext().getRealPath("/")+"../images/wx";
		File file = new File(filepath,newFileName);
		image.getImage().transferTo(file);
		return "redirect:page/getUploadImg";
	}
	
	@RequestMapping("/login")
	public String login(User user,HttpServletRequest request) {
		System.out.println(user);
		if (user.getName() != null) {
			if (userService.login(user)) {
				request.getSession().setAttribute("username", user.getName());
				return "redirect:page/getIndex";
			}
		}
		return "redirect:page/getLogin";
	}
	
	@RequestMapping("/outLogin")
	public String outLogin(HttpServletRequest request) {
		request.getSession().removeAttribute("username");
		return "redirect:page/getLogin";
	}
	
}
