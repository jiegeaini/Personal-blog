package com.wxdemo.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


import com.wxdemo.pojo.ClassMaster;
import com.wxdemo.pojo.Comment;
import com.wxdemo.pojo.Content;
import com.wxdemo.pojo.Download;
import com.wxdemo.pojo.Experience;
import com.wxdemo.pojo.ExperienceMessage;
import com.wxdemo.pojo.Message;
import com.wxdemo.pojo.Question;
import com.wxdemo.service.dao.CommentSerivce;
import com.wxdemo.service.dao.DownloadService;
import com.wxdemo.service.dao.ExperienceMessageService;
import com.wxdemo.service.dao.ExperienceService;
import com.wxdemo.service.dao.MessageService;
import com.wxdemo.service.dao.QuestionService;
import com.wxdemo.service.dao.WxClassService;
import com.wxdemo.service.dao.WxService;

@Controller
@RequestMapping("/page")
public class PageController {
	
	@Autowired
	WxService service;
	@Autowired
	WxClassService classService;
	@Autowired
	QuestionService questionService;
	@Autowired
	ExperienceService experienceService;
	@Autowired
	MessageService messageService;
	@Autowired
	ExperienceMessageService expermessService;
	@Autowired
	CommentSerivce commentService;
	@Autowired
	DownloadService downloadService;

	@RequestMapping("/getIndex")
	public String getIndex(Model model) {
		List<Content> list = service.getAll();
		model.addAttribute("content", list);
		return "index";
	}
	
	@RequestMapping("/getLogin")
	public String getLogin() {
		return "login";
	}
	
	@RequestMapping("/getupdateContentPage")
	public String getupdateContentPage(Model model,Integer id) {
		if (id == null) {
			return "redirect:getIndex";
		}
		Content content = service.getContent(id);
		List<ClassMaster> list = classService.getClassM();
		
		model.addAttribute("c", content);
		model.addAttribute("cate", list);
		return "contentUpdate";
	}
	
	@RequestMapping("/getAddPage")
	public String getAddPage(Model model) {
		List<ClassMaster> list = classService.getClassM();
		model.addAttribute("cate", list);
		return "contentAdd";
	}
	
	@RequestMapping("/getCategory")
	public String getCategory(Model model) {
		List<ClassMaster> list = classService.getClassM();
		model.addAttribute("content", list);
		return "category";
	}
	@RequestMapping("/getAddCategory")
	public String getAddCategory() {
		return "addCategory";
	}
	
	@RequestMapping("/getUpdateCategory")
	public String getUpdateCategory(Model model,Integer id) {
		if (id == null) {
			return "redirect:getIndex";
		}
		ClassMaster master = classService.getClassMaster(id);
		model.addAttribute("c", master);
		return "updateCategory";
	}
	
	@RequestMapping("/getQuestion")
	public String getQuestion(Model model) {
		List<Question> list = questionService.getAll();
		model.addAttribute("content", list);
		return "question";
	}
	@RequestMapping("/getAddQuestion")
	public String getAddQuestion(Model model) {
		List<Message> message = messageService.getAll();
		model.addAttribute("mess", message);
		return "addQuestion";
	}
	
	@RequestMapping("/getUpdateQuestion")
	public String getUpdateQuestion(Model model,Integer id) {
		if (id == null) {
			return "redirect:getIndex";
		}
		Question question = questionService.getQuestion(id);
		model.addAttribute("c", question);
		List<Message> message = messageService.getAll();
		model.addAttribute("mess", message);
		return "updateQuestion";
	}
	
	@RequestMapping("/getMessage")
	public String getMessage(Model model) {
		List<Message> list = messageService.getAll();
		model.addAttribute("content", list);
		return "message";
	}
	@RequestMapping("/getAddMessage")
	public String getAddMessage() {
		return "addMessage";
	}
	
	@RequestMapping("/getUpdateMessage")
	public String getUpdateMessage(Model model,Integer id) {
		if (id == null) {
			return "redirect:getIndex";
		}
		Message message = messageService.getMessage(id);
		model.addAttribute("c", message);
		return "updateMessage";
	}
	
	@RequestMapping("/getExperience")
	public String getExperience(Model model) {
		List<Experience> list = experienceService.getAll();
		model.addAttribute("content", list);
		return "experience";
	}
	@RequestMapping("/getAddExperience")
	public String getAddExperience(Model model) {
		List<ExperienceMessage> list = expermessService.getAll();
		model.addAttribute("mess", list);
		return "addExperience";
	}
	
	@RequestMapping("/getUpdateExperience")
	public String getUpdateExperience(Model model,Integer id) {
		if (id == null) {
			return "redirect:getIndex";
		}
		Experience experience = experienceService.getExperience(id);
		model.addAttribute("c", experience);
		List<ExperienceMessage> list = expermessService.getAll();
		model.addAttribute("mess", list);
		return "updateExperience";
	}
	
	@RequestMapping("/getExperienceMess")
	public String getExperienceMess(Model model) {
		List<ExperienceMessage> list = expermessService.getAll();
		model.addAttribute("content", list);
		return "experienceMess";
	}
	@RequestMapping("/getAddExperienceMess")
	public String getAddExperienceMess() {
		return "addExperienceMess";
	}
	
	@RequestMapping("/getUpdateExperienceMess")
	public String getUpdateExperienceMess(Model model,Integer id) {
		if (id == null) {
			return "redirect:getIndex";
		}
		ExperienceMessage experienceMess = expermessService.getExperienceMessage(id);
		model.addAttribute("c", experienceMess);
		return "updateExperienceMess";
	}
	@RequestMapping("/getUploadImg")
	public String getUploadImg() {
		return "uploadImg";
	}
	
	@RequestMapping("/getComment")
	public String getComment(Model model) {
		List<Comment> list = commentService.getAll_all();
		model.addAttribute("content", list);
		return "comment";
	}
	
	@RequestMapping("/getDownload")
	public String getDownload(Model model) {
		List<Download> list = downloadService.getAll();
		model.addAttribute("content", list);
		return "download";
	}
	
	@RequestMapping("/getUpdateDownload")
	public String getUpdateDownload(Model model,Integer id) {
		if (id == null) {
			return "redirect:getIndex";
		}
		Download download = downloadService.getDownload(id);
		model.addAttribute("c", download);
		return "updateDownload";
	}
	
	@RequestMapping("/getAddDownload")
	public String getAddDownload() {
		return "addDownload";
	}
	
}
