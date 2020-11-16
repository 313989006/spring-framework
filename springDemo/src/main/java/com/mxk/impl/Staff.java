package com.mxk.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

/**
 * @ClassName Staff
 * @Description TODO
 * @Author ma.kangkang
 * @Date 2020/11/15 16:24
 **/
@Repository
@Scope(value = "prototype")
public class Staff {

	@Autowired
	private Company company;

	private Staff(Company company){
		this.company = company;
	}
}
