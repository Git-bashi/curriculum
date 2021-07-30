package com.example.security.springsecurity.goods;

import com.example.security.springsecurity.cart.Entity;
import com.example.security.springsecurity.cart.Id;
import com.example.security.springsecurity.cart.Table;

@Entity
@Table(name="goods")
public class Goods {
    @Id
    private String id;
    private String name;
    private Integer price;
    private Integer size;
    private String color;
    private String infomation;

    public void setId(String id) {
        this.id = id;
    }
    public String getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getEmpname() {
        return name;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getPrice() {
        return price;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setColor(String Color) {
        this.color = Color;
    }

    public String Color() {
        return color;
    }

    public void setInfomation(String infomation) {
        this.infomation = infomation;
    }

    public String getInfomation() {
        return infomation;
    }



}
