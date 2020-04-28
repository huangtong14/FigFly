package com.SIF.pj.activity.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.SIF.pj.activity.pojo.Activity;

@Mapper
public interface activityDao {
	
	/**
	 * 查询所有活动的信息
	 */
	@Select("select * from tb_activity")
	List<Activity> fandActivity();
	
	/**
	 * 根据id删除活动信息
	 * @param id
	 */
	 @Delete("delete from tb_activity where id=#{id}")
	 void deleteById(Integer id);
	 
	 /**
	  * 新增活动信息
	  * @param activity
	  */
	 void insertActivity(Activity activity);

}
