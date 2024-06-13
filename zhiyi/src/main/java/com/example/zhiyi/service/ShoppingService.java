package com.example.zhiyi.service;

import com.example.zhiyi.model.entity.Shopping;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.zhiyi.model.vo.Echarts;

import java.util.List;

/**
* @author 马兰
* @description 针对表【shopping】的数据库操作Service
* @createDate 2024-05-23 09:40:37
*/
public interface ShoppingService extends IService<Shopping> {
    List<Shopping> getAllShopping();
    List<Echarts> getEcharts();
}
