package com.mxk.observer;

/**
 * JDK 底层实现观察者模式
 **/
public class Test4JDK {

	public static void main(String[] args) {

		// 被观察者
		Movie4JDK movie4JDK = new Movie4JDK();
		// 观察者
		Master4JDK master4JDK = new Master4JDK();
		// 观察者
		FatTigger4JDK fatTigger4JDK = new FatTigger4JDK();

		movie4JDK.addObserver(master4JDK);
		movie4JDK.addObserver(fatTigger4JDK);

		movie4JDK.move();
	}
}
