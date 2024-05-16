package com.human.resource.management.service;

import java.util.List;

import com.human.resource.management.dao.ManagerDAO;
import com.human.resource.management.dto.ManagerDTO;

public class ManagerService {

	private ManagerDAO managerDAO;

	public ManagerService(ManagerDAO managerDAO) {
		this.managerDAO = managerDAO;
	}

	public int insertManagerDetail(ManagerDTO managerDTO) throws Exception {
		int count = managerDAO.insertManagerDetail(managerDTO);
		return count;
	}
	
	public ManagerDTO findManagerDetailById(int id) throws Exception {
		return managerDAO.findManagerDetailById(id);
	}
	
	public List<ManagerDTO> findAllManagerDetail() throws Exception {
		return managerDAO.findAllManagerDetail();
	}

	public int updateManagerDetail(ManagerDTO managerDTO) throws Exception {
		return managerDAO.updateManagerDetail(managerDTO);
	}
	
	public int deleteManagerDetailById(int id) throws Exception {
		return managerDAO.deleteManagerDetailById(id);
	}
	
	public ManagerDTO findManagerByUsernamePassword(String username, String password) throws Exception {
		return managerDAO.findManagerByUsernamePassword(username, password);
	}
}
