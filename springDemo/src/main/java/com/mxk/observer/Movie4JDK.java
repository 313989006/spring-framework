package com.mxk.observer;

import java.util.Observable;

/**
 * @ClassName Movie4JDK
 * @Description TODO
 * @Author ma.kangkang
 * @Date 2021/2/24 10:43
 **/
public class Movie4JDK extends Observable {

	public void move(){
		// 通知状态改变
		setChanged();
		// 通知所有观察者,做出响应
		notifyObservers();

	}
}
