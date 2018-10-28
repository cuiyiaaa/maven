package com.itheima.domain;

import lombok.Data;

import java.util.Date;

@Data
public class Items {
    private Integer id;
    private String name;
    private Double price;
    private String pic;
    private Date createTime;
    private String detail;

}
