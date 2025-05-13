package com.kh.chap04_assist.part02_object.run;

import com.kh.chap04_assist.part03_data.model.dao.DataDAO;

public class Run {
	
	public static void main(String[] args) {
		DataDAO dao = new DataDAO();
		dao.fileRead();
	}

}
