package com.iu.control;

import java.util.Scanner;

import com.iu.salgrade.SalgradeDAO;

public class SalgradeController {

	private Scanner sc;
	
	public void start() {
		boolean check = true;
		sc = new Scanner(System.in);
		SalgradeDAO salDAO = new SalgradeDAO();
		while(check) {
			System.out.println("1. 전체급여등급조회");
			System.out.println("2. 개별급여등급조회");
			System.out.println("3. 급 여 등 급 추 가");
			System.out.println("4. 급 여 등 급 삭 제");
			int select = sc.nextInt();
			
			switch(select) {
			case 1:
				salDAO.getselectList();
				break;
			case 2:
				
				salDAO.getselectOne(select);
				break;
			case 3:
				
				salDAO.insert(salDTO);
				break;
			case 4:
				
				salDAO.delete(grade);
			default :
				check = false;
				break;
				
			}
		}
		
	}
}
