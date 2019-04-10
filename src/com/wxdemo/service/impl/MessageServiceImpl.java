package com.wxdemo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wxdemo.mapper.MessageMapper;
import com.wxdemo.pojo.Message;
import com.wxdemo.service.dao.MessageService;
@Service
public class MessageServiceImpl implements MessageService{

	@Autowired
	MessageMapper mapper;
	
	@Override
	public List<Message> getAll() {
		return mapper.getAll();
	}

	@Override
	public Message getMessage(int id) {
		return mapper.getMessage(id);
	}

	@Override
	public void addMessage(Message message) {
		mapper.addMessage(message);
	}

	@Override
	public void updateMessage(Message message) {
		mapper.updateMessage(message);
	}

	@Override
	public void deleteMessage(int id) {
		mapper.deleteMessage(id);
	}
	
}
