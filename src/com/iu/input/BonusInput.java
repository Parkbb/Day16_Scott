package com.iu.input;

import java.util.Scanner;

import com.iu.bonus.BonusDTO;

public class BonusInput {
//내가
	private Scanner sc;
	
	public BonusInput() {
		sc = new Scanner(System.in);
	}//생성자
	
	public String bonusInput() {
		String ename = null;
		System.out.println("이름을 입력하세요");
		ename = sc.next();		
		return ename;
	}
	
	public BonusDTO insert() {
		BonusDTO bonusDTO = new BonusDTO();
		System.out.println("name을 입력");
		bonusDTO.setEname(sc.next());
		System.out.println("job을 입력");
		bonusDTO.setJob(sc.next());
		System.out.println("sal을 입력");
		bonusDTO.setSal(sc.nextInt());
		System.out.println("comm을 입력");
		bonusDTO.setComm(sc.nextInt());
		
		return bonusDTO;
	}
	
	public String delete() {
		System.out.println("삭제할 이름");
		String name = sc.next();
		return name;
	}
}
