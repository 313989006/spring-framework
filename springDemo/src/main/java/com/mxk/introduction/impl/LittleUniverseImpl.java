package com.mxk.introduction.impl;

import com.mxk.introduction.LittleUniverse;

/**
 * @ClassName LittleUniverseImpl
 * @Description introduction :引入型 Advice,强制给一个类赋上一个接口，比如给 每个Controller附上 LittleUniverse 接口
 *  一般情况下很少使用
 * @Author ma.kangkang
 * @Date 2020/11/16 16:17
 **/
public class LittleUniverseImpl implements LittleUniverse {
	@Override
	public void burningUp() {
		System.out.println("燃烧吧，小宇宙");
	}
}
