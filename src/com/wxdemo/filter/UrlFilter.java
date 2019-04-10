package com.wxdemo.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UrlFilter implements Filter {

	private String[] list = {"getIndex","getupdateContentPage","getAddPage",
			"getCategory","getAddCategory","getUpdateCategory","getQuestion",
			"getAddQuestion","getUpdateQuestion","getMessage","getAddMessage",
			"getUpdateMessage","getExperience","getAddExperience","getUpdateExperience",
			"getExperienceMess","getAddExperienceMess","getUpdateExperienceMess",
			"getUploadImg","getComment","getDownload","getUpdateDownload",
			"getAddDownload"};
	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		boolean bl = true;
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response;
		String url = req.getRequestURI().toString();
        	
		if (url.length() > 6) {
			String urlAddr = url.substring(6, url.length());
			System.out.println(urlAddr);
			for (String string : list) {
				if (string.equals(urlAddr)) {
					String name = (String) req.getSession().getAttribute("username");
					if (name == null) {
						bl = false;
						break;
					}
				}
			}		
		}
		
		if (bl) {
			chain.doFilter(request, response);
		}else {
			res.sendRedirect("getLogin");
		}
		
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		System.out.println("filter init");
	}


	
	
}
