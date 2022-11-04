package com.geunho.study28.Dao;

import java.util.ArrayList;

import com.geunho.study28.Dto.ContentDto;

public interface IDao {
	
	public void deleteDao(String mid);
	public void writeDao(String mwriter, String mcontent);
	public ArrayList<ContentDto> listDao();

}
