package controller;

import entity.HeadLine;
import entity.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import service.HeadLineService;

/**
 * @ClassName HeadLineController
 * @Description TODO
 * @Author ma.kangkang
 * @Date 2020/12/6 17:18
 **/
@Controller
@RequestMapping(value = "/headline")
public class HeadLineController {

	@Autowired
	private HeadLineService headLineService;

	@RequestMapping(value = "/add",method = RequestMethod.POST)
	public ModelAndView add(@RequestParam("lineName") String lineName, @RequestParam("lineLink") String lineLink,
							@RequestParam("lineImg") String lineImg, @RequestParam("priority") Integer priority){
		HeadLine headLine = new HeadLine();
		headLine.setLineName(lineName);
		headLine.setLineImg(lineImg);
		headLine.setLineLink(lineLink);
		headLine.setPriority(priority);
		Result<Boolean> result = headLineService.insert(headLine);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("addHeadLine");
		modelAndView.addObject("result",result);
		return modelAndView;
	}

	@RequestMapping(value = "/open",method = RequestMethod.GET)
	public String openPage(){
		return "addHeadLine";
	}
}
