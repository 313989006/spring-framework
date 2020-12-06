package service;

import entity.HeadLine;
import entity.Result;

/**
 * @InterfaceName HeadLineService
 * @Description TODO
 * @Author ma.kangkang
 * @Date 2020/12/6 17:21
 **/
public interface HeadLineService {

	Result<Boolean> insert(HeadLine headLine);

}