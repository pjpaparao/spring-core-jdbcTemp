package com.jdbcTemp;

import org.springframework.jdbc.core.JdbcTemplate;

public class UserDao {
	
	UserDao(){
		System.out.println("constructor got created");
		
	}

	private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
	
	
	
	public void create(String name, double salary) {
        String sql = "INSERT INTO employee1 (name, salary) VALUES (?, ?)";
        jdbcTemplate.update(sql, name, salary);
    }
}
