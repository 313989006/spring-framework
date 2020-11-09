package com.mxk.demo.resource;

import org.springframework.core.io.FileSystemResource;

import java.io.*;

/**
 * @ClassName ResourceDemo
 * @Description Resource 接口的demo，FileSystemResource 可以编辑文件
 * @Author ma.kangkang
 * @Date 2020/11/9 9:30
 **/
public class ResourceDemo {

	public static void main(String[] args) throws IOException {

		FileSystemResource resource =
				new FileSystemResource("G:\\myGitHubProject\\spring-framework\\springDemo\\src\\main\\java\\com\\mxk\\demo\\resource\\test.txt");

		// 获取文件
		File file = resource.getFile();

		// 获取文件输出流
		OutputStream outputStream = resource.getOutputStream();

		// 获取writer, BufferedWriter : 默认缓冲区大小构造字符缓冲输出流对象
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(outputStream));

		// 向缓冲区写入
		writer.write("hello mxk!");
		// 刷新缓冲区，将缓冲区写入文件流
		writer.flush();

		// 关闭文件输出流
		outputStream.close();
		// 关闭缓冲区
		writer.close();
		// 验证test.txt文件内容是否改为hello mxk!

	}
}
