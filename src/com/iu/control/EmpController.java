package com.iu.control;

import java.util.ArrayList;
import java.util.Scanner;

import com.iu.emp.EmpDAO;
import com.iu.emp.EmpDTO;
import com.iu.input.DeptInput;
import com.iu.view.EmpView;

public class EmpController {
	private Scanner sc;
	private EmpDAO empDAO;
	private EmpView empView;
	private DeptInput empInput;
	
	//start
	//1. 사원전체정보출력
	//2. 사원검색출력
	//3. 종료
	public void start() {
		boolean check = true;
		int select = 0;
		sc = new Scanner(System.in);
		while(check) {
			System.out.println("1.사원정보 전체출력");
			System.out.println("2.사원검색출력");
			System.out.println("3.종료");
			
			select = sc.nextInt();
			
			switch(select) {
			case 1:
				break;
				
			case 2:
				
				break;
				
			case 3:
				
				break;
			}
		}
	}
	
	//com.iu.dept.DeptDTO
	//com.iu.dept.DeptDAO
	//com.iu.view.DeptView
	//com.iu.inout.DeptInput
	//com.iu.controll.DeptController
	
	
}
