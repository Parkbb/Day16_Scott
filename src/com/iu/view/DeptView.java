package com.iu.view;

import java.util.List;

import com.iu.dept.DeptDTO;

public class DeptView {
	
	public void view(String str) {
		System.out.println(str);
	}

	public void view(DeptDTO deptDTO) {
		
		System.out.print(deptDTO.getDeptno()+"\t");
		System.out.print(deptDTO.getDname()+"\t");
		System.out.println(deptDTO.getLoc());
		
	}
	
	public void view(List<DeptDTO> ar) {
		
		for (DeptDTO deptDTO : ar) {
			this.view(deptDTO);
		}
	}
}
