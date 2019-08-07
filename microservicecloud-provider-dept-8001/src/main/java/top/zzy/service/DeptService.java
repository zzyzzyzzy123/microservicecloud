package top.zzy.service;

import java.util.List;

import top.zzy.entity.Dept;

public interface DeptService {

	boolean add(Dept dept);
	
	Dept get(Integer id);
	
	List<Dept> list();
}
