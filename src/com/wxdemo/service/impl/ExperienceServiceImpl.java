package com.wxdemo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wxdemo.mapper.ExperienceMapper;
import com.wxdemo.pojo.Experience;
import com.wxdemo.service.dao.ExperienceService;
@Service
public class ExperienceServiceImpl implements ExperienceService{

	@Autowired
	ExperienceMapper mapper;
	
	@Override
	public List<Experience> getAll() {
		return mapper.getAll();
	}

	@Override
	public Experience getExperience(int id) {
		return mapper.getExperience(id);
	}

	@Override
	public void addExperience(Experience experience) {
		mapper.addExperience(experience);
	}

	@Override
	public void updateExperience(Experience experience) {
		mapper.updateExperience(experience);
	}

	@Override
	public void deleteExperience(int id) {
		mapper.deleteExperience(id);
	}

}
