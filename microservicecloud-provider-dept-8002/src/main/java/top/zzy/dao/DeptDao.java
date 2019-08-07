package top.zzy.dao;

import org.apache.ibatis.annotations.Mapper;
import top.zzy.entity.Dept;

import java.util.List;

//boot里面一定要加，或者mapperscan加启动类
@Mapper
public interface DeptDao {
	
	boolean addDept(Dept dept);

	Dept findById(Integer id);

	List<Dept> findAll();
}
