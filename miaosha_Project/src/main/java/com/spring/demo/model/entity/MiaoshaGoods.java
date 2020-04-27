package com.spring.demo.model.entity;

import lombok.Data;

import java.util.Date;

@Data
public class MiaoshaGoods {
	private Long id;
	private Long goodsId;
	private Integer stockCount;
	private Date startDate;
	private Date endDate;
}
