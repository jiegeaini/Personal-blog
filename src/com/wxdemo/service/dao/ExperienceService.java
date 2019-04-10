package com.wxdemo.service.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.wxdemo.pojo.Experience;

public interface ExperienceService {
	List<Experience> getAll();
	Experience getExperience(@Param("id")int id);
	void addExperience(Experience experience);
	void updateExperience(Experience experience);
	void deleteExperience(@Param("id")int id);
}
