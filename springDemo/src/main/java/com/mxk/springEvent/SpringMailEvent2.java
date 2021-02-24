package com.mxk.springEvent;

import org.springframework.context.ApplicationEvent;

/**
 * 发送邮件的事件
 **/
public class SpringMailEvent2 extends ApplicationEvent {
	private static final long serialVersionUID = -1440341743170566816L;


	// 属性
//	private String content;

//	public String getContent() {
//		return content;
//	}
//
//	public void setContent(String content) {
//		this.content = content;
//	}

	/**
	 * Create a new {@code ApplicationEvent}.
	 *
	 * @param source the object on which the event initially occurred or with
	 *               which the event is associated (never {@code null})
	 */
	/**
	* 重写构造方法
	*/
	public SpringMailEvent2(Object source) {
		super(source);
	}

}
