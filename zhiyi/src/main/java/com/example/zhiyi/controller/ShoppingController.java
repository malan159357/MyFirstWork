package com.example.zhiyi.controller;

import com.example.zhiyi.model.entity.Shopping;
import com.example.zhiyi.model.vo.Echarts;
import com.example.zhiyi.service.ShoppingService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/shopping")
@CrossOrigin(origins = "http://localhost:8081",allowCredentials = "true")
public class ShoppingController {
    @Resource
    private ShoppingService shoppingService;

    @GetMapping("getAll")
    public List<Shopping> getAll() {
        List<Shopping> shoppings = shoppingService.getAllShopping();
        return shoppings;
    }

    @GetMapping("/getEcharts")
    public List<Echarts> getEcharts() {
        List<Echarts> shoppings = shoppingService.getEcharts();
        return shoppings;
    }
}
