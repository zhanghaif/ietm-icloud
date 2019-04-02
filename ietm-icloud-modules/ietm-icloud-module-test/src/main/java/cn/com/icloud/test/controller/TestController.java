package cn.com.icloud.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import cn.com.icloud.core.response.Result;
import cn.com.icloud.core.response.ResultGenerator;

@RestController
@RequestMapping("/v1/test")
public class TestController {

	@GetMapping("/{msg}")
	public Result get(String msg) {
		return ResultGenerator.genOkResult(msg);
	}
	
	@GetMapping
	public Result list(String msg) {
		return ResultGenerator.genOkResult(msg);
	}
	
	@PostMapping
	public Result add(String msg) {
		return ResultGenerator.genOkResult(msg);
	}
}
