package com.zhf.sqlite.service.impl;

import com.zhf.sqlite.entity.Goods;
import com.zhf.sqlite.mapper.GoodsMapper;
import com.zhf.sqlite.service.GoodsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by zhaohongfei
 * 2018/10/16 11:07
 */
@Service
public class GoodsServiceImpl implements GoodsService {

    @Resource
    private GoodsMapper goodsMapper;

    @Override
    public List<Map<String, Object>> getGoodsList() {
        List<Map<String,Object>> list = goodsMapper.getGoodsList();
        return list;
    }

    @Override
    public void addGoods(Goods goods) {
        goodsMapper.addGoods(goods);
    }

    @Override
    public Goods isExistGoods(String name) {
        return goodsMapper.isExistGoods(name);
    }


}
