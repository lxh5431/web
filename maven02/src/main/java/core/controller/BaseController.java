package core.controller;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import core.exception.MyException;
import core.util.StringUtil;

public class BaseController {
private static Logger logger=LoggerFactory.getLogger(BaseController.class);
protected Integer getUserId(HttpServletRequest request){
	String sId=request.getHeader("userId");
	if(!StringUtil.isEmpty(sId)){
		try{
			Integer userId=StringUtil.toInt(sId);
			return userId;
		}catch(NumberFormatException e){
			logger.warn("�����ͷ����userId������ʽ����{}"+sId);
			
		}
	}
	return null;
}
protected Integer getNotNullUserId(HttpServletRequest request)throws MyException{
	Integer userId=getUserId(request);
	if(userId==null){
		throw new MyException("�û�ID����Ϊ��");
		
	}
	return userId;
}

}
