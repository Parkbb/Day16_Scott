package com.iu.view;

import java.util.ArrayList;

import com.iu.emp.EmpDTO;

public class EmpView {

	public void view (EmpDTO empDTO) {
		System.out.println("-------------");
		System.out.println(empDTO.getEmpno());
		System.out.println(empDTO.getEname());
		System.out.println(empDTO.getJob());
		System.out.println(empDTO.getMgr());
		System.out.println(empDTO.getHiredate());
		System.out.println(empDTO.getSal());
		System.out.println(empDTO.getComm());
		System.out.println(empDTO.getDeptno());
	}
	
	public void view (ArrayList<Object> ar) {
		
		System.out.println();
	}
}
