package com.human.resource.management.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import com.human.resource.management.dto.ManagerDTO;
import com.human.resource.management.util.DBUtil;


public class ManagerDAO {
	private DBUtil dbUtil;

	public ManagerDAO(DBUtil dbUtil) {
		this.dbUtil = dbUtil;
	}

	final private String INSERT_MANAGER_DETAILS = "insert into human_resource_manager(name, mobile_number, email, branch_id, aadhar_card_number, aadhar_photo, pan_card_number, pan_card_photo, sallary, password) value (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

	final private String FIND_MANAGER_DETAILS_BY_ID = "select * from human_resource_manager where id =?";

	final private String FIND_ALL_MANAGER_DETAILS = "select * from human_resource_manager";

	final private String UPDATE_MANAGER_DETAILS = " update human_resource_manager set name = ?, mobile_number = ?, email=?,  password = ?, sallary = ? where id=?";

	final private String DELETE_MANAGER_DETAILS_BY_ID = "delete from human_resource_manager where id = ?";
	
	final private String FIND_MANAGER_DETAIL_BY_EMAIL_PASSWORD = "select * from human_resource_manager where (email = ? or mobile_number = ?) and password = ?";
	
	public int insertManagerDetail(ManagerDTO managerDTO) throws Exception {
		Connection connection = null;
		PreparedStatement pstmt = null;
		try {
			

			connection = dbUtil.getConnection();
			pstmt = connection.prepareStatement(INSERT_MANAGER_DETAILS);
			
			pstmt.setString(1, managerDTO.getName());
			pstmt.setInt(2, managerDTO.getMobileNumber());
			pstmt.setString(3, managerDTO.getEmail());
			pstmt.setInt(4, managerDTO.getBranchId());
			pstmt.setInt(5, managerDTO.getAadharCardNumber());
			pstmt.setString(6, managerDTO.getAadharCardPhoto());
			pstmt.setString(7, managerDTO.getPanCardNumber());
			pstmt.setString(8,managerDTO.getPanCardphoto());
			pstmt.setDouble(9, managerDTO.getSallary());
			pstmt.setString(10, managerDTO.getPassword());
			

			int count = pstmt.executeUpdate();
			return count;
		} catch (Exception e) {
			throw e;
		} finally {
			dbUtil.close(pstmt, connection);
		}

	}

	public ManagerDTO findManagerDetailById(int id) throws Exception {
		Connection connection = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			connection = dbUtil.getConnection();

			pstmt = connection.prepareStatement(FIND_MANAGER_DETAILS_BY_ID);
			pstmt.setInt(1, id);

			rs = pstmt.executeQuery();
			ManagerDTO managerDTO = null;
			if (rs.next()) {
				managerDTO = new ManagerDTO();
				managerDTO.setId(rs.getInt("id"));
				managerDTO.setName(rs.getString("name"));
				managerDTO.setMobileNumber(rs.getInt("mobile_number"));
				managerDTO.setEmail(rs.getString("email"));
				managerDTO.setBranchId(rs.getInt("branch_id"));
				managerDTO.setSallary(rs.getDouble("sallary"));
				}

			return managerDTO;
		} catch (Exception e) {
			throw e;
		} finally {
			dbUtil.close(rs, pstmt, connection);
		}

	}
	
	
	
	public List<ManagerDTO> findAllManagerDetail() throws Exception {
		Connection connection = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			connection = dbUtil.getConnection();
			pstmt = connection.prepareStatement(FIND_ALL_MANAGER_DETAILS);
			rs = pstmt.executeQuery();
			
			
			List<ManagerDTO> managerDTOList = new ArrayList<>();
			while (rs.next()) {
				ManagerDTO managerDTO = new ManagerDTO();
				managerDTO.setId(rs.getInt("id"));
				managerDTO.setName(rs.getString("name"));
				managerDTO.setMobileNumber(rs.getInt("mobile_number"));
				managerDTO.setEmail(rs.getString("email"));
				managerDTO.setBranchId(rs.getInt("branch_id"));
				managerDTO.setSallary(rs.getDouble("sallary"));
				
				managerDTOList.add(managerDTO);
			}

			return managerDTOList;
		} catch (Exception e) {
			throw e;
		} finally {
			dbUtil.close(rs, pstmt, connection);
		}

	}
	
	public int updateManagerDetail(ManagerDTO managerDTO) throws Exception {
		int count = 0;
		Connection connection = null;
		PreparedStatement pstmt = null;
		try {
			connection = dbUtil.getConnection();

			pstmt = connection.prepareStatement(UPDATE_MANAGER_DETAILS);

			pstmt.setString(1, managerDTO.getName());
			pstmt.setInt(2, managerDTO.getMobileNumber());
			pstmt.setString(3, managerDTO.getEmail());
			pstmt.setString(4, managerDTO.getPassword());
			pstmt.setDouble(5, managerDTO.getSallary());
			pstmt.setInt(6, managerDTO.getId());
			
			count = pstmt.executeUpdate();
			return count;
			
		} catch (Exception e) {
			throw e;
		} finally {
			dbUtil.close(pstmt, connection);
		}
		

	}
	
	public int deleteManagerDetailById(int id) throws Exception {
		Connection connection = null;
		PreparedStatement pstmt = null;
		try {
			connection = dbUtil.getConnection();

			pstmt = connection.prepareStatement(DELETE_MANAGER_DETAILS_BY_ID);
			pstmt.setInt(1, id);

			int count = pstmt.executeUpdate();

			return count;
		} catch (Exception e) {
			throw e;
		} finally {
			dbUtil.close(pstmt, connection);
		}

	}
	
	public ManagerDTO findManagerByUsernamePassword(String username, String password) throws Exception {
		Connection connection = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {

			connection = dbUtil.getConnection();

			pstmt = connection.prepareStatement(FIND_MANAGER_DETAIL_BY_EMAIL_PASSWORD);
			pstmt.setString(1, username);
			pstmt.setString(2, username);
			pstmt.setString(3, password);

			rs = pstmt.executeQuery();
			ManagerDTO managerDTO = null;
			if (rs.next()) {
				managerDTO = new ManagerDTO();
				managerDTO.setName(rs.getString("name"));
				managerDTO.setMobileNumber(rs.getInt("mobile_number"));
				managerDTO.setEmail(rs.getString("email"));
				managerDTO.setBranchId(rs.getInt("branch_id"));
				managerDTO.setAadharCardNumber(rs.getInt("aadhar_card_number"));
				managerDTO.setPanCardNumber(rs.getString("pan_card_number"));
				managerDTO.setSallary(rs.getDouble("sallary"));
				
			}

			return managerDTO;
		} catch (Exception e) {
			throw e;
		} finally {
			dbUtil.close(rs, pstmt, connection);
		}

	}

}
