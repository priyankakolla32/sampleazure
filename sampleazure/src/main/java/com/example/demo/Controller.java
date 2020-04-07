package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controller {
    @RequestMapping("/web")
    public String home(){
        return "home";
    }

	@Autowired
	ServiceEx serviceEx;

	@GetMapping("/getMethod")
	public String method1() {
		return "HAI EVERYONE";
	}

//	@GetMapping("/get")
//	public String method2()
//	{
//		return serviceEx.getData();
//	}

	@GetMapping("/getString/{name}/{city}")
	public String getString(@PathVariable String name, @PathVariable String city) {
		return serviceEx.getString(name, city);
	}

	@PostMapping("/getObject")
	public String getObject(@RequestBody BeanEx exampleBean) {
		return serviceEx.getObject(exampleBean);
	}

}
