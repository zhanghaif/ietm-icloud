package cn.com.icloud.test.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.com.icloud.core.service.AbstractService;
import cn.com.icloud.test.mapper.TestMapper;
import cn.com.icloud.test.model.entity.SysTest;
import cn.com.icloud.test.service.TestService;
import lombok.AllArgsConstructor;


@Service
@AllArgsConstructor
@Transactional(rollbackFor = Exception.class)
public class TestServiceImpl extends AbstractService<SysTest> implements TestService{
	

}
