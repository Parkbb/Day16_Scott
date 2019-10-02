package com.iu.salgrade;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.iu.util.DBConnector;

public class SalgradeDAO {
	//내가
	//전체등급조회
	public ArrayList<SalgradeDTO> getselectList() {
		Connection con = null;
		PreparedStatement st = null;
		ResultSet rs = null;
		ArrayList<SalgradeDTO> ar = new ArrayList<SalgradeDTO>();

		try {
			con = DBConnector.getConnect();
			String sql = "select * from salgrade";

			st = con.prepareStatement(sql);

			rs = st.executeQuery();

			while(rs.next()) {

				SalgradeDTO salDTO = new SalgradeDTO();
				salDTO.setGrade(rs.getInt(1));
				salDTO.setLosal(rs.getInt(2));
				salDTO.setHisal(rs.getInt(3));
				ar.add(salDTO);
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				st.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} return ar;
	}
	//등급하나조회
	public SalgradeDTO getselectOne(int salgrade) {
		Connection con = null;
		PreparedStatement st = null;
		ResultSet rs = null;
		SalgradeDTO salDTO = null;
		try {
			con = DBConnector.getConnect();
			String sql = "select * from salgrade "
					+ "where grade = ? ";
			
			st = con.prepareStatement(sql);
			
			st.setInt(1, salgrade);
			
			rs = st.executeQuery();
			if(rs.next()) {
				salDTO = new SalgradeDTO();
				salDTO.setGrade(rs.getInt(1));
				salDTO.setLosal(rs.getInt(2));
				salDTO.setHisal(rs.getInt(3));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				st.close();
				con.close();
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		return salDTO;
	}
	//등급추가
	public int insert(SalgradeDTO salDTO) {
		Connection con = null;
		PreparedStatement st = null;
		
		int result = 0;
		try {
			con = DBConnector.getConnect();
			String sql = "insert into salgrade "
					+ "values(?,?,?)";
			st = con.prepareStatement(sql);
			st.setInt(1, salDTO.getGrade());
			st.setInt(2, salDTO.getLosal());
			st.setInt(3, salDTO.getHisal());
			result = st.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				st.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} return result;
	}
	//등급삭제?
	public int delete(int grade) {
		Connection con = null;
		PreparedStatement st = null;
		
		int result = 0;
		try {
			con = DBConnector.getConnect();
			String sql = "delete salgrade "
					+ "where grade = ? ";
			st = con.prepareStatement(sql);
			st.setInt(1, grade);
			result = st.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				st.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} return result;
	}

}
