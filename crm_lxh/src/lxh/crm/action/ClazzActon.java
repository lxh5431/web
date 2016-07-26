package lxh.crm.action;

import java.util.List;

import lxh.crm.action.base.BaseAction;
import lxh.crm.entity.Clazz;
import lxh.crm.entity.Course;
import lxh.crm.entity.Student;
import page.Page;

public class ClazzActon extends BaseAction<Clazz>{
	public String list(){
		Page page=clazzServ.list(currPage, pageSize);
		push(page);
		list=page.getList();
		return "listSucc";
		
	}
	public String add(){
		clazzServ.save(model);
		return "addSucc";
	}
	public String addUI(){
		List<Course>cours=courseServ.findAll();
		setContextValue("courselist",cours);
		return "addUI";
		
	}
	public String edit(){
		Clazz clazz=clazzServ.findById(model.getId());
		push(clazz);
		List<Course>cours=courseServ.findAll();
		setContextValue("courselist",cours);
		return "editSucc";
		
	}
	public String realEdit(){
		Clazz clazz=clazzServ.findById(model.getId());
		clazz.setName(model.getName());
		clazz.setStatus(model.getStatus());
		clazz.setBeginTime(model.getBeginTime());
	    clazz.setEndTime(model.getEndTime());
	
	System.out.println(model.getName());
	int courseId=model.getCourse().getId();
	Course cou=courseServ.findById(courseId);
	clazz.setCourse(cou);
	clazzServ.update(clazz);
	return "updateSucc";
	}
	public String view(){
		Clazz clazz=clazzServ.findById(model.getId());
		push(clazz);
		List<Student>stus=stuServ.findStuByClazz(clazz);
		setContextValue("stus",stus);
		return "viewSucc";
		
	
	
	}


}
