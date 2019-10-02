package com.iu.input;

import java.util.Scanner;

import com.iu.emp.EmpDTO;

public class EmpInput {

	private Scanner sc;
	
	public int delete() {
		System.out.println("삭제할 사원 번호");
		int select = sc.nextInt();
		return select;
	}
	public EmpDTO insert() {
		sc= new Scanner(System.in);
		EmpDTO empDTO = new EmpDTO();
		System.out.println("empno");
		empDTO.setEmpno(sc.nextInt());
		System.out.println("ename");
		empDTO.setEname(sc.next());
		System.out.println("job");
		empDTO.setJob(sc.next());
		System.out.println("mgr");
		empDTO.setMgr(sc.nextInt());
		System.out.println("sal");
		empDTO.setSal(sc.nextInt());
		System.out.println("comm");
		empDTO.setComm(sc.nextInt());
		System.out.println("deptno");
		empDTO.setDeptno(sc.nextInt());
		
		
		return empDTO;
	}
}
