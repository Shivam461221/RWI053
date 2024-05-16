package com.human.resource.management.servlet;

import java.util.List;

import com.human.resource.management.dao.ManagerDAO;
import com.human.resource.management.dto.ManagerDTO;
import com.human.resource.management.service.ManagerService;
import com.human.resource.management.util.DBUtil;

public class TestingMain {
//	public static void main(String[] args) {
//
//		try {
//
//			DBUtil dbUtil = new DBUtil();
//			ManagerDAO managerDAO = new ManagerDAO(dbUtil);
//			ManagerService managerService = new ManagerService(managerDAO);
//
//			ManagerDTO managerDTO = new ManagerDTO();
//
//			managerDTO.setName("Satyam");
//			managerDTO.setMobileNumber(07312423);
//			managerDTO.setEmail("satyam@123");
//			managerDTO.setBranchId(1);
//			managerDTO.setAadharCardNumber(33344455);
//			managerDTO.setAadharCardPhoto("images/satyamaadhar");
//			managerDTO.setPanCardNumber("bpl378345");
//			managerDTO.setPanCardphoto("images/satyampan");
//			managerDTO.setSallary(15000.00);
//			managerDTO.setPassword("satyam@123");
//			
//
//			int count = managerService.insertManagerDetail(managerDTO);
//			if (count > 0)
//				System.out.println("Manager data save successfully.");
//			else
//				System.out.println("Failed to save Manager data.");
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
	

//	public static void main(String[] args) {
//		try {
//			DBUtil dbUtil = new DBUtil();
//			ManagerDAO managerDAO = new ManagerDAO(dbUtil);
//			ManagerService managerService = new ManagerService(managerDAO);
//	
//
//			ManagerDTO managerDTO = managerService.findManagerDetailById(1);
//			
//			if(managerDTO != null) {
//				System.out.println("Manager detail found successfully.");
//				System.out.println("Firstname: " + managerDTO.getName());
//				System.out.println("mobile number: " + managerDTO.getMobileNumber());
//				System.out.println("email: " + managerDTO.getEmail() );
//				System.out.println("aadharnumber: " + managerDTO.getAadharCardNumber());
//			}else {
//				System.out.println("Unable to find manager detail.");
//			}
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//			System.err.println(e.getMessage());
//		}
//	}
//
//	public static void main(String[] args) {
//		try {
//			DBUtil dbUtil = new DBUtil();
//			ManagerDAO managerDAO = new ManagerDAO(dbUtil);
//			ManagerService managerService = new ManagerService(managerDAO);
//	
//
//			List<ManagerDTO> managerDTOList = managerService.findAllManagerDetail();
//			if(!managerDTOList.isEmpty()) {
//				System.out.println("User detail found successfully.");
//			
//				int i=0;
//						for (ManagerDTO userDTO : managerDTOList) {
//					System.out.println("Index: " + i++);
//
//					System.out.println("Firstname: " + userDTO.getName());
//				}
//				
//			}else {
//				System.out.println("Unable to find manager detail.");
//			}
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//			System.err.println(e.getMessage());
//		}
//	}
	
	public static void main(String[] args) {
		try {
			DBUtil dbUtil = new DBUtil();
			ManagerDAO managerDAO = new ManagerDAO(dbUtil);
			ManagerService managerService = new ManagerService(managerDAO);

			ManagerDTO managerDTO = new ManagerDTO();
			
			managerDTO.setName("Chinmai");
			managerDTO.setMobileNumber(2222222);
			managerDTO.setEmail("chin@123");
			managerDTO.setSallary(15000);
			managerDTO.setPassword("cn123");
			managerDTO.setId(6);
			
			int count = managerService.updateManagerDetail(managerDTO);
			if(count > 0) {
				System.out.println("Manager detail update successfully.");
			}else {
				System.out.println("Unable to update manager detail.");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println(e.getMessage());
		}
	}

//	public static void main(String[] args)
//	{
//		try {
//		  DBUtil dbUtil = new DBUtil();
//		  ManagerDAO managerDAO= new ManagerDAO(dbUtil);
//		  ManagerService managerService= new ManagerService(managerDAO);
//		  
//		  int count = managerService.deleteManagerDetailById(2);
//		  if(count >0)
//			  System.out.println("manager data deleted sucessfully");
//		  else 
//			  System.out.println("Failed to delete manager data");
//			  
//		  } catch (Exception e) {
//			e.printStackTrace();
//		} kjh sfd
//   }
//	
//	public static void main(String[] args) {
//		try {
//			DBUtil dbUtil = new DBUtil();
//			ManagerDAO managerDAO = new ManagerDAO(dbUtil);
//			ManagerService managerService = new ManagerService(managerDAO);
//	
//
//			ManagerDTO managerDTO = managerService.findManagerByUsernamePassword(, null)
//			
//			if(managerDTO != null) {
//				System.out.println("Manager detail found successfully.");
//				System.out.println("Firstname: " + managerDTO.getName());
//				System.out.println("mobile number: " + managerDTO.getMobileNumber());
//				System.out.println("email: " + managerDTO.getEmail() );
//				System.out.println("aadharnumber: " + managerDTO.getAadharCardNumber());
//			}else {
//				System.out.println("Unable to find manager detail.");
//			}
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//			System.err.println(e.getMessage());
//		}
//	}
}
