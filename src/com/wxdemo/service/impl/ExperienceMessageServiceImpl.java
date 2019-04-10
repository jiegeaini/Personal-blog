package com.wxdemo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wxdemo.mapper.ExperienceMessageMapper;
import com.wxdemo.pojo.ExperienceMessage;
import com.wxdemo.service.dao.ExperienceMessageService;
@Service
public class ExperienceMessageServiceImpl implements ExperienceMessageService{

	@Autowired
	ExperienceMessageMapper mapper;
	
	@Override
	public List<ExperienceMessage> getAll() {
		return mapper.getAll();
	}

	@Override
	public ExperienceMessage getExperienceMessage(int id) {
		return mapper.getExperienceMessage(id);
	}

	@Override
	public void addExperienceMessage(ExperienceMessage message) {
		mapper.addExperienceMessage(message);
	}

	@Override
	public void updateExperienceMessage(ExperienceMessage message) {
		mapper.updateExperienceMessage(message);
	}

	@Override
	public void deleteExperienceMessage(int id) {
		mapper.deleteExperienceMessage(id);
	}

}
