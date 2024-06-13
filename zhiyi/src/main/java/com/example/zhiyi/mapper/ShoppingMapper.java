package com.example.zhiyi.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.zhiyi.model.entity.Shopping;
import com.example.zhiyi.model.vo.Echarts;

import java.util.List;

/**
* @author 马兰
* @description 针对表【shopping】的数据库操作Mapper
* @createDate 2024-05-23 09:40:37
* @Entity com.example.zhiyi.entity.Shopping
*/
public interface ShoppingMapper extends BaseMapper<Shopping> {
    List<Shopping> getAllShopping();
    List<Echarts> getEcharts();
}




