package lxh.crm.service;

import java.util.List;

import lxh.crm.entity.Clazz;
import lxh.crm.entity.Student;
import page.Page;

public interface StudentService {

	Page list(int currPage, int pageSize);

	Student findById(Integer id);

	void update(Student stu, Integer clazzId);

	List<Student> findStuByClazz(Clazz clazz);
	
}
