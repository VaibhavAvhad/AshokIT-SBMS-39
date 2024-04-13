package com.cc.dao;

import org.springframework.jdbc.core.JdbcTemplate;

public class BookDaoImpl implements BookDao {

	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public boolean save() {
		String sql = "insert into book values (100, 'chhava', 200)";
		jdbcTemplate.execute(sql);
		return true;

	}

}
