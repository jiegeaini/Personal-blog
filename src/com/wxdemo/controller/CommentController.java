package com.wxdemo.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.wxdemo.pojo.Comment;
import com.wxdemo.service.dao.CommentSerivce;

@Controller
public class CommentController {

	@Autowired
	CommentSerivce service;
	
	@RequestMapping("/getAll_comment")
	@ResponseBody
	public List<Comment> getAll(int number){
		return service.getAll(number);
	}
	
	@RequestMapping("/addComment_m")
	@ResponseBody
	public String addComment(String name,String content,Comment comment) {
		System.out.println(name+" "+content);
		if(name == null || content == null){
			return "false";
		}else{
			comment.setName(name);
			comment.setContent(content);
			service.addComment(comment);
			return "true";
		}
		
	}
	
	
	@RequestMapping(value="/addComment",method=RequestMethod.POST)
	public void addComment(Comment comment,HttpServletResponse response) throws IOException {
		System.out.println(comment.getName()+" "+comment.getContent());
		if(comment.getName() == null || comment.getContent() == null){
			response.sendRedirect("https://www.maguangjie.com/comment.html");
		}else{
			service.addComment(comment);
			response.sendRedirect("https://www.maguangjie.com/comment.html");
		}
		
	}
	
	@RequestMapping("/deleteComment")
	public String deleteComment(Integer id) {
		if (id == null) {
			return "redirect:page/getLogin";
		}
		service.deleteComment(id);
		return "redirect:page/getComment";
	}
}
