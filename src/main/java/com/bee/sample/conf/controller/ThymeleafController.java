package com.bee.sample.conf.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/exampleone")
public class ThymeleafController {

	// 引入命名空间
	@GetMapping("/m01")
	public String m01() {
		return "m01.html";
	}

	// URL路径的处理
	@GetMapping("/m02")
	public String m02() {
		return "m02.html";
	}

	// 获取请求的参数

	@GetMapping("/m03")
	public String m03() {
		return "m03.html";
	}

	// 获取Model中的数据

	@GetMapping("/m04")
	public String m04(Model model) {
		model.addAttribute("name", "from model");
		return "m04.html";
	}
	
	// 运算符

		@GetMapping("/m05")
		public String m05(Model model) {
			model.addAttribute("age", 20);
			return "m05.html";
		}
		
		// 分支

				@GetMapping("/m06")
				public String m06(Model model) {
					model.addAttribute("age", 20);
					return "m06.html";
				}
				// 循环

				@GetMapping("/m07")
				public String m07(Model model) {
					List<Integer> list = new ArrayList<Integer>();
					list.add(1);
					list.add(2);
					list.add(3);
					list.add(4);
					Map<String,String> map = new HashMap<String,String>();
					map.put("1", "1");
					map.put("2", "2");
					map.put("3", "3");
					int[] array = new int[] {1,2,3,4,5};
					model.addAttribute("list", list);
					model.addAttribute("map", map);
					model.addAttribute("array", array);
					return "m07.html";
				}
				
				// 日期数字格式化

				@GetMapping("/m08")
				public String m08(Model model) {
					model.addAttribute("age", 20);
					return "m08.html";
				}
}
