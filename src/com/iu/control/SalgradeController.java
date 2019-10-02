package com.iu.control;

import java.util.ArrayList;
import java.util.Scanner;

import com.iu.input.SalInput;
import com.iu.salgrade.SalgradeDAO;
import com.iu.salgrade.SalgradeDTO;
import com.iu.view.SalView;

public class SalgradeController {

	private Scanner sc;

	
	public void start() {
		boolean check = true;
		sc = new Scanner(System.in);
		SalgradeDAO salDAO = new SalgradeDAO();
		SalInput salIn = new SalInput();
		SalView view = new SalView();
		ArrayList<SalgradeDTO> ar = null;
		SalgradeDTO salDTO = null;
		while(check) {
			System.out.println("1. 전체급여등급조회");
			System.out.println("2. 개별급여등급조회");
			System.out.println("3. 급 여 등 급 추 가");
			System.out.println("4. 급 여 등 급 삭 제");
			int select = sc.nextInt();
			
			switch(select) {
			case 1:
				ar = salDAO.getselectList();
				view.view(ar);
				break;
			case 2:
				select = salIn.gradeInput();
				salDTO = salDAO.getselectOne(select);
				view.view(salDTO);
				break;
			case 3:
				salDTO = salIn.insert();
				salDAO.insert(salDTO);
				break;
			case 4:
				int grade = salIn.delete();
				salDAO.delete(grade);
			default :
				check = false;
				break;
				
			}
		}
		
	}
}
