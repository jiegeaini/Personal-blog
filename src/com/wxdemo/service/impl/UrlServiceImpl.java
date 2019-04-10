package com.wxdemo.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wxdemo.mapper.UrlMapper;
import com.wxdemo.pojo.Wx_url;
import com.wxdemo.service.dao.UrlService;
@Service
public class UrlServiceImpl implements UrlService{

	@Autowired
	UrlMapper mapper;
	
	@Override
	public List<Wx_url> getAll() {
		return mapper.getAll();
	}
	

}
