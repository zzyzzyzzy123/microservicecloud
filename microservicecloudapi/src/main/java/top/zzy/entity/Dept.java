package top.zzy.entity;


import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@SuppressWarnings("all")
//全参构造
@AllArgsConstructor
//无参构造
@NoArgsConstructor
//getset
@Data
//链式风格访问
@Accessors(chain=true)
public class Dept implements Serializable{
	private Integer id;
	private String dname;
	//数据库名称
	private String db_source;
	

	
}
