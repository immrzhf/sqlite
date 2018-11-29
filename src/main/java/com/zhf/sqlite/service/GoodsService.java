package com.zhf.sqlite.service;

import com.zhf.sqlite.entity.Goods;

import java.util.List;
import java.util.Map;

/**
 * Created by zhaohongfei
 * 2018/10/16 11:06
 */
public interface GoodsService {

    List<Map<String, Object>> getGoodsList();

    void addGoods(Goods goods);

    Goods isExistGoods(String name);
}
