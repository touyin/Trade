package com.example.trade.entity;

public class Message {
    public String image_src;//图片路径
    public String open_type;//打开方式
    public int goods_id;//商品id
    public String navigator_url;//导航链接


    public Message() {
    }

    public Message(String image_src, String open_type, int goods_id, String navigator_url) {
        this.image_src = image_src;
        this.open_type = open_type;
        this.goods_id = goods_id;
        this.navigator_url = navigator_url;
    }

    public String getImage_src() {
        return image_src;
    }

    public void setImage_src(String image_src) {
        this.image_src = image_src;
    }

    public String getOpen_type() {
        return open_type;
    }

    public void setOpen_type(String open_type) {
        this.open_type = open_type;
    }

    public int getGoods_id() {
        return goods_id;
    }

    public void setGoods_id(int goods_id) {
        this.goods_id = goods_id;
    }

    public String getNavigator_url() {
        return navigator_url;
    }

    public void setNavigator_url(String navigator_url) {
        this.navigator_url = navigator_url;
    }
}
