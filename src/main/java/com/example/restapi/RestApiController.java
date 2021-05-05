package com.example.restapi;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/reqres.in/api/users")
public class RestApiController {

	@GetMapping("/{id}")
	public Map<String, Data> getData(@PathVariable int id) {
		Map<String, Data> map = new HashMap<>();
		Support support = new Support("https://reqres.in/#support-heading",
				"To keep ReqRes free, contributions towards server costs are appreciated!");
		Data data = new Data(1, "purn@gmail.com", "purnendu", "pradhan", support);
		if((id == 1) || (id == 2) || (id == 3) ) {
		map.put("data", data);
		}else {
			throw new RuntimeException("Unable to find id = "+id);
		}
		return map;
		
	}
	
		
}
