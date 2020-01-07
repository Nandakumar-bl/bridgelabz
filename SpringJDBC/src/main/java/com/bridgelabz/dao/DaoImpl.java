package com.bridgelabz.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.bridgelabz.model.Employee;
import com.bridgelabz.service.Dao;

public class DaoImpl implements Dao
{ 
	private JdbcTemplate jdbcTemplate;  
		
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		  this.jdbcTemplate = jdbcTemplate;  
		
	}

	public int saveEmployee(Employee e) {
		 String query="insert into employee values('"+e.getId()+"','"+e.getName()+"','"+e.getSalary()+"')";  
		    return jdbcTemplate.update(query);  
	}

	public int updateEmployee(Employee e) {
		   String query="update employee set name='"+e.getName()+"',salary='"+e.getSalary()+"' where id='"+e.getId()+"' ";  
		    return jdbcTemplate.update(query);  
	}

	public int deleteEmployee(int id) {
		 String query="delete from employee where id='"+id+"' ";  
		    return jdbcTemplate.update(query);  
	}
}
