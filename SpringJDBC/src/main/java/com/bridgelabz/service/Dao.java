package com.bridgelabz.service;

import org.springframework.jdbc.core.JdbcTemplate;

import com.bridgelabz.model.Employee;

public interface Dao 
{
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate);
	public int saveEmployee(Employee e);
	public int updateEmployee(Employee e);
	public int deleteEmployee(int id);
}
