package com.wxdemo.service.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.wxdemo.pojo.Message;

public interface MessageService {
	List<Message> getAll();
	Message getMessage(int id);
	void addMessage(Message message);
	void updateMessage(Message message);
	void deleteMessage(@Param("id")int id);
}
