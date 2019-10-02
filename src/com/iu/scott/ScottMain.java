package com.iu.scott;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.iu.dept.DeptDAO;
import com.iu.dept.DeptDTO;
import com.iu.emp.EmpDAO;
import com.iu.emp.EmpDTO;
import com.iu.util.DBConnector;
import com.iu.view.DeptView;
import com.iu.view.EmpView;

public class ScottMain {
	public static void main(String[] args) {
		Connection con = null;
		ArrayList<Object> ar = null;
		Scanner sc = new Scanner(System.in);
		EmpDAO dao = new EmpDAO();
		EmpDTO empDTO = null;
		EmpView ev = new EmpView();
		DeptDAO ddao = new DeptDAO();
		DeptDTO deptDTO = null;
		DeptView dv = new DeptView();
		

//		deptDTO = ddao.deptSelectOne(10);
//		dv.view(deptDTO);
		
//		List<DeptDTO> aar = ddao.deptselectList();
//		dv.view(aar);
		
//		System.out.println("번호입력");
//		int empno = sc.nextInt();
//		empDTO = dao.getselectOne(empno);
//		ev.view(empDTO);
		
	
	}
}

