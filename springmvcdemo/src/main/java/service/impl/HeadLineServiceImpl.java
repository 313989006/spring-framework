package service.impl;

import entity.HeadLine;
import entity.Result;
import org.springframework.stereotype.Service;
import service.HeadLineService;

/**
 * @ClassName HeadLineServiceImpl
 * @Description TODO
 * @Author ma.kangkang
 * @Date 2020/12/6 17:21
 **/
@Service
public class HeadLineServiceImpl implements HeadLineService {

	@Override
	public Result<Boolean> insert(HeadLine headLine) {
		System.out.printf("addHeadLine 方法被执行了，lineName[{%s}],lineLink[{%s}],lineImg[{%s}],priority[{%s}]",
				headLine.getLineName(),headLine.getLineLink(),headLine.getLineImg(),headLine.getPriority());
		Result<Boolean> result = new Result<>();
		result.setCode(200);
		result.setData(true);
		result.setMsg("请求成功啦");
		return result;
	}

}