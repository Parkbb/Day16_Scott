package com.iu.scott;

import java.util.ArrayList;

import com.iu.salgrade.SalgradeDAO;
import com.iu.salgrade.SalgradeDTO;

public class TestMain {
	public static void main(String[] args) {
		SalgradeDTO salDTO = null;
		SalgradeDAO salDAO = new SalgradeDAO();
		ArrayList<SalgradeDTO> ar = new ArrayList<SalgradeDTO>();
		int result =0;
		String str = "실패";

		//	ar = salDAO.getselectList();
		//	
		//	for (int i = 0; i < ar.size(); i++) {
		//		salDTO =ar.get(i);
		//		System.out.println("등급 : "+salDTO.getGrade());
		//		System.out.println("Losal : "+salDTO.getLosal());
		//		System.out.println("Hisal : "+salDTO.getHisal());
		//		System.out.println();
		//	}

		//	salDTO = salDAO.getselectOne(1);
		//	System.out.println(salDTO.getGrade());
		//	System.out.println(salDTO.getLosal());
		//	System.out.println(salDTO.getHisal());

//		salDTO = new SalgradeDTO();
//		salDTO.setGrade(6);
//		salDTO.setLosal(4000);
//		salDTO.setHisal(5000);
//		result = salDAO.insert(salDTO);
		
		
		result = salDAO.delete(6);
		
		if(result>0) {
			str = "성공";
		}
		
		System.out.println(str);
	}
}
