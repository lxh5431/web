package lxh.crm.action.base;

import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.List;
import java.lang.reflect.Type;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import lxh.crm.entity.Clazz;
import lxh.crm.service.ClazzService;
import lxh.crm.service.CourseService;
import lxh.crm.service.CousuService;
import lxh.crm.service.DepartmentService;
import lxh.crm.service.EmployeeService;
import lxh.crm.service.StudentService;

public class BaseAction<T> extends ActionSupport implements ModelDriven<T> {
	protected Integer deptId;
	protected int currPage=1;
	protected  int pageSize=2;
	protected T model;
	protected DepartmentService departServ;
	protected EmployeeService employServ;
	protected CourseService courseServ;
	protected ClazzService clazzServ;
	protected CousuService cousuServ;
	protected StudentService stuServ;
	protected List<T>list=new ArrayList<T>();
	public BaseAction(){
		ParameterizedType type=(ParameterizedType) this.getClass().getGenericSuperclass();
	Type[] typeArguments=type.getActualTypeArguments();
	Class<T>clazz=(Class<T>)typeArguments[0];
	try{
		model=clazz.newInstance();
		
	}catch(InstantiationException e){
		e.printStackTrace();
	}catch(IllegalAccessException e){
		e.printStackTrace();
	}
	}
	
	@Override
	public T getModel() {
		// TODO Auto-generated method stub
		return this.model;
	}

	public Integer getDeptId() {
		return deptId;
	}

	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}

	public int getCurrPage() {
		return currPage;
	}

	public void setCurrPage(int currPage) {
		this.currPage = currPage;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public DepartmentService getDepartServ() {
		return departServ;
	}

	public void setDepartServ(DepartmentService departServ) {
		this.departServ = departServ;
	}

	public EmployeeService getEmployServ() {
		return employServ;
	}

	public void setEmployServ(EmployeeService employServ) {
		this.employServ = employServ;
	}

	public CourseService getCourseServ() {
		return courseServ;
	}

	public void setCourseServ(CourseService courseServ) {
		this.courseServ = courseServ;
	}

	public ClazzService getClazzServ() {
		return clazzServ;
	}

	public void setClazzServ(ClazzService clazzServ) {
		this.clazzServ = clazzServ;
	}

	public CousuService getCousuServ() {
		return cousuServ;
	}

	public void setCousuServ(CousuService cousuServ) {
		this.cousuServ = cousuServ;
	}

	public StudentService getStuServ() {
		return stuServ;
	}

	public void setStuServ(StudentService stuServ) {
		this.stuServ = stuServ;
	}

	public List<T> getList() {
		return list;
	}

	public void setList(List<T> list) {
		this.list = list;
	}
	public void setContextValue(String str,Object obj){
		ActionContext.getContext().getValueStack().set(str, obj);
	}
	public void push(Object obj){
		ActionContext.getContext().getValueStack().push(obj);
	}

}
