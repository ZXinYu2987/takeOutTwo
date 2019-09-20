package com.bz.take.history.service.impl;

import com.bz.take.history.entity.THystory;
import com.bz.take.history.mapper.THystoryMapper;
import com.bz.take.history.service.HystoryService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@Service
public class HystoryServiceImpl implements HystoryService {
    @Resource
    private THystoryMapper hystoryMapper;



    @Override
    public List<THystory> findall() {
        return hystoryMapper.selectAll();
    }
}
