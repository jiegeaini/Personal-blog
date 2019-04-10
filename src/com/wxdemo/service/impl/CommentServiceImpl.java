package com.wxdemo.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wxdemo.mapper.CommentMapper;
import com.wxdemo.pojo.Comment;
import com.wxdemo.service.dao.CommentSerivce;
import com.wxdemo.util.DateUtil;

@Service
public class CommentServiceImpl implements CommentSerivce{

	@Autowired
	CommentMapper mapper;
	
	@Override
	public List<Comment> getAll(int number) {
		List<Comment> list = new ArrayList<>();
		if (number ==1) {
			list = mapper.getAll(0,10);
		}else if (number != 1 && number >= 1) {
			list = mapper.getAll(number*10-10,10);
		}
		return list;
	}

	@Override
	public void addComment(Comment comment) {
		String time = DateUtil.getTime();
		comment.setTime(time);
		mapper.addComment(comment);
	}

	@Override
	public void deleteComment(int id) {
		mapper.deleteComment(id);
	}

	@Override
	public List<Comment> getAll_all() {
		return mapper.getAll_all();
	}
	
}
