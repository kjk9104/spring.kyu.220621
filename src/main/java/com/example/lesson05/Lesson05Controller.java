package com.example.lesson05;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Lesson05Controller {

	
	// http://localhost/lesson05/ex01
	@RequestMapping("/lesson05/ex01")
	public String ex01() {
		return "lesson05/ex01";
	}
	
	// http://localhost/lesson05/ex02
	@RequestMapping("/lesson05/ex02")
	public String ex02(Model model) {
		List<String> fruits = new ArrayList();
		fruits.add("사과");
		fruits.add("바나나");
		fruits.add("체리");
		fruits.add("포도");
		fruits.add("감");
		
		//List<Map>
		List<Map<String, Object>> users = new ArrayList<>();
		Map<String, Object> user = new HashMap<>();
		user.put("name", "kyu");
		user.put("age", 30);
		user.put("hobby", "컴퓨터");
		users.add(user);
		
		user = new HashMap<>();
		user.put("name", "sun");
		user.put("age", 20);
		user.put("hobby", "런닝");
		users.add(user);
		model.addAttribute("fruits",fruits);
		model.addAttribute("users",users);
		
		return "lesson05/ex02";
	}
	
	// http://localhost/lesson05/ex03
	@RequestMapping("/lesson05/ex03")
	public String ex03(Model model) {
		Date today = new Date();
		
		model.addAttribute("today",today);
		return "lesson05/ex03";
	}
	
	// http://localhost/lesson05/ex04
	@RequestMapping("/lesson05/ex04")
	public String ex04() {
		
		return "lesson05/ex04";
	}
}
