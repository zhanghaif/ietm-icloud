package cn.com.icloud.test.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import cn.com.icloud.core.response.Result;
import cn.com.icloud.core.response.ResultGenerator;
import cn.com.icloud.test.model.entity.SysTest;
import cn.com.icloud.test.service.TestService;

@RestController
@RequestMapping("/v1/test")
public class TestController {

	@Resource
	TestService testService;
	
	@GetMapping("/{id}")
	public Result get(@PathVariable final Long id) {
		return ResultGenerator.genOkResult(testService.findById(id));
	}
	
	@GetMapping
	public Result list() {
		return ResultGenerator.genOkResult(testService.findAll());
	}
	
	@PostMapping
	public Result add(@RequestBody final SysTest test) {
		testService.save(test);
		return ResultGenerator.genOkResult(test);
	}
}
