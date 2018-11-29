package com.zhf.sqlite.entity;

public class Goods {

    private int id;
    private String name;
    private String price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String toString(){
        return "商品信息添加：{ id：" + id + " ；name：" + name + " ；price：" + price +" }";
    }
}
