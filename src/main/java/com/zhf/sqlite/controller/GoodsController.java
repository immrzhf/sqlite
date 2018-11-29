package com.zhf.sqlite.controller;

import com.alibaba.fastjson.JSONObject;
import com.zhf.sqlite.entity.Goods;
import com.zhf.sqlite.service.GoodsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin
@RestController
@EnableAutoConfiguration
public class GoodsController {

    private Logger logger = LoggerFactory.getLogger(GoodsController.class);

    @Resource
    GoodsService goodsService;

    @RequestMapping(value = "/getGoodsList")
    public Object getGoodsList(){
        JSONObject result = new JSONObject();
        result.put("success",true);
        try{
            List<Map<String,Object>> list = goodsService.getGoodsList();
            result.put("data",list);
        }catch (Exception e){
            e.printStackTrace();
            result.put("success",false);
        }
        return result;
    }

    @RequestMapping(value = "/addGoods")
    public Object addGoods(String name,String price){
        JSONObject result = new JSONObject();
        result.put("success",true);
        result.put("isExist",false);
        try {
            Goods goods;
            goods = goodsService.isExistGoods(name);
            if(goods == null){
                goods = new Goods();
                goods.setName(name);
                goods.setPrice(price);
                goodsService.addGoods(goods);
                logger.info(goods.toString());
            }else{
                result.put("isExist",true);
            }
            result.put("goods",goods);
        }catch (Exception e){
            e.printStackTrace();
            result.put("success",false);
        }
        return result;
    }

}
