package com.iu.emp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.iu.util.DBConnector;

public class EmpDAO {
	
	public int delete(int empno) {
		Connection con = null;
		PreparedStatement st = null;
		int result = 0;
		try {
			con = DBConnector.getConnect();
			String sql = "delete emp where empno = ? ";
			
			st = con.prepareStatement(sql);
			st.setInt(1, empno);
			
			result = st.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}

	public int insert(EmpDTO empDTO) {
		Connection con = null;
		PreparedStatement st = null;
		int result = 0;
		try {
			con = DBConnector.getConnect();
			String sql = "insert into emp values(?,?,?,?, sysdate ,?,?,?) ";
			
			st = con.prepareStatement(sql);
			st.setInt(1, empDTO.getEmpno());
			st.setString(2, empDTO.getEname());
			st.setString(3, empDTO.getJob());
			st.setInt(4, empDTO.getMgr());
			st.setInt(5, empDTO.getSal());
			st.setInt(6, empDTO.getComm());
			st.setInt(7, empDTO.getDeptno());
			
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
	
	public EmpDTO getselectOne(int empno){
		Connection con = null;
		PreparedStatement st = null;
		ResultSet rs = null;
		EmpDTO empDTO = null;
		try {
			con = DBConnector.getConnect();
			String sql = "select empno, ename, job, mgr, hiredate, sal, "
					+ "NVL(comm, 0) comm, deptno from emp "
					+ "where empno = ? ";
					
			st = con.prepareStatement(sql);
			
			st.setInt(1, empno);
			
			rs = st.executeQuery();
			if(rs.next()){
				empDTO = new EmpDTO();
				empDTO.setEmpno(rs.getInt(1));
				empDTO.setEname(rs.getString(2));
				empDTO.setJob(rs.getString(3));
				empDTO.setMgr(rs.getInt(4));
				empDTO.setHiredate(rs.getDate(5));
				empDTO.setSal(rs.getInt(6));
				empDTO.setComm(rs.getInt(7));
				empDTO.setDeptno(rs.getInt(8));
			}
			

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				st.close();
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}


		return empDTO;
	}
	//getselectList
	//전체사원정보 - 최신입사일순

	public ArrayList<EmpDTO> getselectlist() {

		//getselectOne
		//매개변수 사원번호
		//리턴
		Connection con = null;
		PreparedStatement st = null;
		ResultSet rs = null;
		ArrayList<EmpDTO> ar = new ArrayList<EmpDTO>();
		try {
			con = DBConnector.getConnect();
			String sql = "select empno, ename, job, mgr, hiredate, sal, "
					+ "NVL(comm,0) comm, deptno from emp ";
			st = con.prepareStatement(sql);
			
			rs = st.executeQuery();
			
			while(rs.next()) {

				EmpDTO empDTO = new EmpDTO();
				empDTO.setEmpno(rs.getInt(1));
				empDTO.setEname(rs.getString(2));
				empDTO.setJob(rs.getString(3));
				empDTO.setMgr(rs.getInt(4));
				empDTO.setHiredate(rs.getDate(5));
				empDTO.setSal(rs.getInt(6));
				empDTO.setComm(rs.getInt(7));
				empDTO.setDeptno(rs.getInt(8));
				ar.add(empDTO);
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				st.close();
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}


		return ar;
	}
}
