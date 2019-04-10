package com.wxdemo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wxdemo.mapper.AboutmeMapper;
import com.wxdemo.pojo.Aboutme;
import com.wxdemo.service.dao.AboutmeService;
@Service
public class AboutmeServiceImpl implements AboutmeService{

	@Autowired
	AboutmeMapper mapper;
	
	@Override
	public List<Aboutme> getAll() {
		return mapper.getAll();
	}

}
