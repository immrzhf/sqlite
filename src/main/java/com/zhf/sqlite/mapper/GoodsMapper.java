package com.zhf.sqlite.mapper;

import com.zhf.sqlite.entity.Goods;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * Created by zhaohongfei
 * 2018/10/16 11:08
 */
@Mapper
public interface GoodsMapper {

    List<Map<String, Object>> getGoodsList();

    void addGoods(Goods goods);

    Goods isExistGoods(String name);
}
