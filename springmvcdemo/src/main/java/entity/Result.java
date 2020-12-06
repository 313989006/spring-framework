package entity;

/**
 * @ClassName Result
 * @Description 返回结果集的泛型类
 * @Author ma.kangkang
 * @Date 2020/11/1 11:36
 **/
public class Result<T> {

	// 本次请求返回结果集的状态码，200为成功
	private int code;

	// 本次请求返回结果集的详情
	private String msg;

	// 本次请求返回的结果集
	private T data;

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
}
