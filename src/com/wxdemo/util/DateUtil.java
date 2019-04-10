package com.wxdemo.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 获取时间的工具
 * @author jiege
 *
 */
public class DateUtil {

	/**
	 * 获取当前时间
	 * @类型
	 * yyyy-MM-dd
	 */
	public static String getTime() {
		Date date = new Date();
		SimpleDateFormat simpleDateFormat = 
				new SimpleDateFormat("yyyy-MM-dd HH:mm");
		String time = simpleDateFormat.format(date).toString();
		System.out.println(time);
		return time;
	}
}
