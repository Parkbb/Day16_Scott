package com.iu.control;

import java.util.ArrayList;
import java.util.Scanner;

import com.iu.input.SalInput;
import com.iu.salgrade.SalgradeDAO;
import com.iu.salgrade.SalgradeDTO;
import com.iu.view.SalView;

public class SalgradeController {

	private Scanner sc;
	private SalgradeDAO salDAO;
	private SalgradeDTO salDTO;
	private SalInput salIn;
	private SalView view;

	public SalgradeController() {
		sc = new Scanner(System.in);
		salDAO = new SalgradeDAO();
		salIn = new SalInput();
		view = new SalView();
		salDTO = new SalgradeDTO();

	}


	public void start() {
		boolean check = true;
		ArrayList<SalgradeDTO> ar = null;
		int select = 0;
		while(check) {
			System.out.println("1. 전체급여등급조회");
			System.out.println("2. 개별급여등급조회");
			System.out.println("3. 급 여 등 급 추 가");
			System.out.println("4. 급 여 등 급 삭 제");
			System.out.println("5. 종                료");

			select = sc.nextInt();

			switch(select) {
			case 1:
				ar = salDAO.getselectList();
				if(ar.size()>0) {
					view.view(ar);					
				}
				break;
			case 2:
				select = salIn.gradeInput();
				salDTO = salDAO.getselectOne(select);
				if(salDTO != null) {

					view.view(salDTO);
				}else {
					view.view("없는 등급");
				}
				break;
			case 3:
				salDTO = salIn.insert();
				select = salDAO.insert(salDTO);
				String s = "등급 정보 입력 실패";
				if(select >0) {
					s = "등급 정보 입력 성공";
				}
				view.view(s);
				break;
			case 4:
				int grade = salIn.delete();
				grade = salDAO.delete(grade);
				s = "등급 삭제 실패";
				if(grade >0) {
					s = "등급 삭제 성공";
				}
			default :
				check = false;
				break;

			}
		}

	}
}
