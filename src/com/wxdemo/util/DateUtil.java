package com.wxdemo.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * ��ȡʱ��Ĺ���
 * @author jiege
 *
 */
public class DateUtil {

	/**
	 * ��ȡ��ǰʱ��
	 * @����
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
