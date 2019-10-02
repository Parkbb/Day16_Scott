package com.iu.dept;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.iu.util.DBConnector;

public class DeptDAO {

	//inputdept
	public int deptInsert(DeptDTO deptDTO) {
		Connection con = null;
		PreparedStatement st = null;
		int result = 0;
		try {
			con = DBConnector.getConnect();
			String sql = "insert into dept (deptno, dname, loc) "
					+ "values(?, ?, ?)";
			st = con.prepareStatement(sql);
			st.setInt(1, deptDTO.getDeptno());
			st.setString(2, deptDTO.getDname());
			st.setString(3, deptDTO.getLoc());
			
			result = st.executeUpdate();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				st.close();
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return result;
	}
	
	//selectOne
	public DeptDTO deptSelectOne(int deptno) {
		DeptDTO deptDTO = null;
		Connection con = null;
		PreparedStatement st = null;
		ResultSet rs = null;
		
		try {
			con = DBConnector.getConnect();
			String sql = "select * from dept "
					+ "where deptno = ?";
			
			st = con.prepareStatement(sql);
			st.setInt(1, deptno);
			
			rs = st.executeQuery();
			
			if(rs.next()) {
				deptDTO = new DeptDTO();
				deptDTO.setDeptno(rs.getInt(1));
				deptDTO.setDname(rs.getString(2));
				deptDTO.setLoc(rs.getString(3));		
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
		
		return deptDTO;
	}
	
	public  ArrayList<DeptDTO> deptselectList() {

			DeptDTO deptDTO = null;
			Connection con = null;
			PreparedStatement st = null;
			ResultSet rs = null;
			ArrayList<DeptDTO> ar = new ArrayList<DeptDTO>();
			
			try {
				con = DBConnector.getConnect();
				String sql = "select * from dept "
						+ "order by deptno asc ";
				
				st = con.prepareStatement(sql);

				
				rs = st.executeQuery();
				
				while(rs.next()) {
					deptDTO = new DeptDTO();
					deptDTO.setDeptno(rs.getInt(1));
					deptDTO.setDname(rs.getString(2));
					deptDTO.setLoc(rs.getString(3));	
					ar.add(deptDTO);
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
			
			return ar;
		}
	}



