package com.geunho.study28.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;

import com.geunho.study28.Dto.ContentDto;


public class ContentDao implements IDao {

	JdbcTemplate template;

	@Autowired
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	@Override
	public void deleteDao(String mid) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void writeDao(final String mwriter, final String mcontent) {
		// TODO Auto-generated method stub
		
		this.template.update(new PreparedStatementCreator() {
			
			@Override
			public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
				// TODO Auto-generated method stub
				String sql = "INSERT INTO board(mid, mwriter, mcontent) VALUES (board_seq.nextval,?,?)";
				PreparedStatement pstmt = con.prepareStatement(sql);
				pstmt.setString(1, mwriter);
				pstmt.setString(2, mcontent);
				
				return pstmt;
			}
		});
		
	}

	@Override
	public ArrayList<ContentDto> listDao() {
		// TODO Auto-generated method stub
		return null;
	}

	

	

}
