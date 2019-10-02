package com.iu.view;

import java.util.ArrayList;
import java.util.List;

import com.iu.bonus.BonusDTO;
import com.iu.salgrade.SalgradeDTO;

public class BonusView {
//내가
	
	//bonus 출력
	public void view(BonusDTO bonusDTO) {
		System.out.println("ename : " + bonusDTO.getEname());
		System.out.println("job : " + bonusDTO.getJob());
		System.out.println("sal : " + bonusDTO.getSal());
		System.out.println("comm : " + bonusDTO.getComm());
		System.out.println("------------------------");
		
	}
	
	//전체 출력
	public void view(List<BonusDTO> ar) {
		for(BonusDTO bonusDTO : ar) {
			this.view(bonusDTO);
		}
	}
	//메시지 출력
	public void view(String str) {
		System.out.println(str);
	}
}
