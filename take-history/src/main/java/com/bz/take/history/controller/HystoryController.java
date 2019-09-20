package com.bz.take.history.controller;

import com.bz.take.history.entity.THystory;
import com.bz.take.history.service.HystoryService;
import com.netflix.discovery.converters.Auto;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@Api(tags = {"浏览历史管理"})
@RestController
public class HystoryController {
    @Autowired
    private HystoryService hystoryService;
    @ApiOperation(value = "查询所欲哦",notes="查询findall")
    @GetMapping("/hystory")
    public List<THystory> findall(){
        return hystoryService.findall();
    }

}
