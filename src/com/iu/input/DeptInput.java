package com.iu.input;

import java.util.Scanner;

import com.iu.dept.DeptDTO;


public class DeptInput {

	private Scanner sc;

	public DeptInput() {
		sc = new  Scanner(System.in);
	}
	
	public DeptDTO insert() {
		DeptDTO deptDTO = new DeptDTO();
		System.out.println("부서번호 입력");
		deptDTO.setDeptno(sc.nextInt());
		System.out.println("부서명 입력");
		deptDTO.setDname(sc.next());
		System.out.println("지역 입력");
		deptDTO.setLoc(sc.next());
		
		return deptDTO;
	}
	//empnoInput
	//사원번호를 입력하세요
}
