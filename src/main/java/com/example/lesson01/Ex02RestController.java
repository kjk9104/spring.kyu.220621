package com.example.lesson01;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

// Spring bean
@RequestMapping("/lesson01/ex01")
@RestController
public class Ex02RestController {
	//localhost:8080/lesson01/ex01/3
	@RequestMapping("/3")
	public String ex01_3() {
		return "@RestController를 사용해서 String을 리턴해본다.";
	}
	//localhost:8080/lesson01/ex01/4
	@RequestMapping("/4")
	public Map<String, String> ex01_4(){
		Map<String, String> map = new HashMap<>();
		map.put("aaa", "111");
		map.put("bbb", "222");
		map.put("ccc", "333");
		return map;
	}
	
	//localhost:8080/lesson01/ex01/5
	@RequestMapping("/5")
	public Data ex01_5() {
		Data data = new Data();
		data.setId(1);
		data.setName("kyu");
		return data; // jacson 라이브러리로 인해 json string이 된다. 
	}
	
	//localhost:8080/lesson01/ex01/5
	@RequestMapping("/6")
	public ResponseEntity<Data> ex01_6(){
		Data data = new Data();
		data.setId(11);
		data.setName("보라돌이");
		
		return new ResponseEntity<>(data, HttpStatus.INTERNAL_SERVER_ERROR);
		
		
		
		
		
		//400 : bad request 파라미터가 불일치
		//403 : method 불일치
		//404 : page not found
		
		//500 : 서버에 요청은 됐는데, 서버 로직 문제 발생
		
		//302 : redirect 
		
		//-HTML String
		//-JSON String -> Objects
		//-HTML =jsp
	}
	
}	
