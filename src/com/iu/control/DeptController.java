package com.iu.control;

import java.util.Scanner;

import com.iu.dept.DeptDAO;
import com.iu.view.DeptView;

public class DeptController {
	private Scanner sc;
	private DeptDAO dao;
	private DeptView deptview;

	public DeptController() {
		sc= new Scanner(System.in);
		dao = new DeptDAO();
		deptview = new DeptView();
		
	}
	
	
}
