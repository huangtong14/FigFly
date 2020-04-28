package com.SIF.pj.activity.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.SIF.pj.activity.Service.ActivityService;
import com.SIF.pj.activity.pojo.Activity;

@Controller
@RequestMapping("/activity")
public class ActivityController {

	@Autowired
	private ActivityService service;

	/**
	 * 查询所有活动信息
	 * 
	 * @param model
	 * @return
	 * @throws InterruptedException 
	 */
	@RequestMapping("/doFandAcivity")
	@ResponseBody
	public List<Activity> doFandAcivity(Model model) throws InterruptedException {
		List<Activity> list = service.fandActivity();
		//将此线程休眠3秒
		Thread.sleep(1000);
		return list;
	}

	/**
	 * 显示静态页面
	 * 
	 * @return
	 */
	@RequestMapping("/doActivity")
	public String doActivity() {

		return "activity";
	}

	@RequestMapping("doDeleteById")
	@ResponseBody
	public String doDeleteById(Integer id) {
		service.deleteById(id);
		return "deleteById OK";
	}

	/**
	 * 插入
	 * 
	 * @param activity
	 * @return
	 */
	@RequestMapping("/doinsertActivity")
	@ResponseBody
	public String doinsertActivity(Activity activity) {
		service.insertActivity(activity);
//		return "redirect:doActivity";
		return "insert into OK!";
	}

}
