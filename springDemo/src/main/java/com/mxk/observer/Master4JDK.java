package com.mxk.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * @ClassName Master4JDK
 * @Description TODO
 * @Author ma.kangkang
 * @Date 2021/2/24 10:41
 **/
public class Master4JDK implements Observer {
	@Override
	public void update(Observable o, Object arg) {
		System.out.println("Observer=============Master====");
	}
}
