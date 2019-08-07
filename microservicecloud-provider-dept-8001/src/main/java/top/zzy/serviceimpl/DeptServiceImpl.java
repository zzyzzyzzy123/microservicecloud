package top.zzy.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.zzy.dao.DeptDao;
import top.zzy.service.DeptService;
 
import top.zzy.entity.Dept;

@Service
public class DeptServiceImpl implements DeptService {
	@Autowired
	DeptDao deptDao;
	
	@Override
	public boolean add(Dept dept) {
		// TODO Auto-generated method stub
		return deptDao.addDept(dept);
	}

	@Override
	public Dept get(Integer id) {
		// TODO Auto-generated method stub
		return deptDao.findById(id);
	}

	@Override
	public List<Dept> list() {
		// TODO Auto-generated method stub
		return deptDao.findAll();
	}

}
