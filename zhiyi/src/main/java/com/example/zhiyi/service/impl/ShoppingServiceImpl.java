package com.example.zhiyi.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.zhiyi.mapper.ShoppingMapper;
import com.example.zhiyi.model.vo.Echarts;
import com.example.zhiyi.service.ShoppingService;
import com.example.zhiyi.model.entity.Shopping;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
* @author 马兰
* @description 针对表【shopping】的数据库操作Service实现
* @createDate 2024-05-23 09:40:37
*/
@Service
public class ShoppingServiceImpl extends ServiceImpl<ShoppingMapper, Shopping>
    implements ShoppingService {
    @Resource
    private ShoppingMapper shoppingMapper;
    @Override
    public List<Shopping> getAllShopping() {
        List<Shopping> shoppings=shoppingMapper.getAllShopping();
        return shoppings;
    }

    @Override
    public List<Echarts> getEcharts() {
        List<Echarts> shoppings=shoppingMapper.getEcharts();
        return shoppings;
    }
}




