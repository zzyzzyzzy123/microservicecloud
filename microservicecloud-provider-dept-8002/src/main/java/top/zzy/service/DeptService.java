package top.zzy.service;

import top.zzy.entity.Dept;

import java.util.List;

public interface DeptService {

	boolean add(Dept dept);
	
	Dept get(Integer id);
	
	List<Dept> list();
}
