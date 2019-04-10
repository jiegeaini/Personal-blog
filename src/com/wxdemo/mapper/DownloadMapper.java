package com.wxdemo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.wxdemo.pojo.Download;

public interface DownloadMapper {
	List<Download> getAll();
	Download getDownload(@Param("id")int id);
	void addDownload(Download download);
	void updateDownload(Download download);
	void deleteDownload(@Param("id")int id);
}
