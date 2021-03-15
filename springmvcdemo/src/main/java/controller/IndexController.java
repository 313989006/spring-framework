package controller;

import org.springframework.beans.factory.support.ManagedProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName IndexController
 * @Description TODO
 * @Author ma.kangkang
 * @Date 2021/3/1 9:42
 **/
@Controller
public class IndexController {

	@RequestMapping("/index")
	@ResponseBody
	public Map<String,String> index(){
		System.out.println("=========================index=========================");
		Map<String,String> map = new HashMap<>();
		map.put("index","index");
		return map;
	}
}
