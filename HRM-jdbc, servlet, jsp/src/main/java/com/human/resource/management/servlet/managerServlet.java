package com.human.resource.management.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.human.resource.management.dao.ManagerDAO;
import com.human.resource.management.dto.ManagerDTO;
import com.human.resource.management.service.ManagerService;
import com.human.resource.management.util.DBUtil;

@WebServlet("/managers")

public class managerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	DBUtil dbUtil = null;
	ManagerDAO managerDAO = null;
	ManagerService managerService = null;

	public managerServlet() {
		System.out.println("object created");
		dbUtil = new DBUtil();
		managerDAO = new ManagerDAO(dbUtil);
		managerService = new ManagerService(managerDAO);
	}

	public void init(ServletConfig config) throws ServletException {
		System.out.println("UserServlet: Init");
	}

	public void destroy() {
		System.out.println("UserServlet: Destroy");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("ManagerServlet: GET");
		String task = request.getParameter("task");
		System.out.println("Task: " + task);
		if (task.equalsIgnoreCase("findById")) {
			findById(request, response);
		} else if (task.equalsIgnoreCase("findAll")) {
			findAll(request, response);
		} else if (task.equalsIgnoreCase("deleteById")) {
			deleteById(request, response);
		} else if (task.equalsIgnoreCase("editByManagerId")) {
			editByManagerId(request, response);
		} else {

		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("UserServlet: POST");

		String task = request.getParameter("task");
		System.out.println("Task: " + task);
		if (task.equalsIgnoreCase("login")) {
			login(request, response);
		} else if (task.equalsIgnoreCase("signup")) {
			signup(request, response);
		} else if (task.equalsIgnoreCase("update")) {
			update(request, response);
		} else {

		}
	}

	private void login(HttpServletRequest request, HttpServletResponse response) {
		try {
			String username = request.getParameter("userName");
			String password = request.getParameter("password");

			ManagerDTO managerDTO = managerService.findManagerByUsernamePassword(username, password);
			if (managerDTO == null) {
				System.out.println("Wrong username or password. Try again or click Forgot password to reset it");
				PrintWriter writer = response.getWriter();

				writer.append("<html><body onload='myFunction()'><script>function myFunction() {");
				writer.append("alert('Wrong username or password. Try again or click Forgot password to reset it');");
				writer.append("}</script></body></html>");

				RequestDispatcher requestDispatcher = request.getRequestDispatcher("login.jsp");
				requestDispatcher.include(request, response);

			} else {
				System.out.println("Login successfully, Creating session..");
				request.setAttribute("activeManagerDTO", managerDTO);

				RequestDispatcher requestDispatcher = request.getRequestDispatcher("home.jsp");
				requestDispatcher.forward(request, response);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private void signup(HttpServletRequest request, HttpServletResponse response) {
		try {
			ManagerDTO managerDTO = new ManagerDTO();

			managerDTO.setName(request.getParameter("fullName"));
			managerDTO.setMobileNumber(Integer.parseInt(request.getParameter("mobileNumber")));
			managerDTO.setEmail(request.getParameter("Email"));
			managerDTO.setPassword(request.getParameter("password"));
			managerDTO.setBranchId(Integer.parseInt(request.getParameter("branchId")));

			int count = managerService.insertManagerDetail(managerDTO);
			System.out.println(count);
			if (count == 0) {
				System.out.println("registration not done.");
				PrintWriter writer = response.getWriter();

				writer.append("<html><body onload='myFunction()'><script>function myFunction() {");
				writer.append("alert('Sign up unsuccessful, please enter correct values');");
				writer.append("}</script></body></html>");

				RequestDispatcher requestDispatcher = request.getRequestDispatcher("signup.jsp");
				requestDispatcher.include(request, response);

			} else {
				System.out.println("registration successfull.");
				PrintWriter writer = response.getWriter();

				writer.append("<html><body onload='myFunction()'><script>function myFunction() {");
				writer.append("alert('Sign up successful');");
				writer.append("}</script></body></html>");

				request.setAttribute("activeManagerDTO", managerDTO);

				RequestDispatcher requestDispatcher = request.getRequestDispatcher("login.jsp");
				requestDispatcher.forward(request, response);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void update(HttpServletRequest request, HttpServletResponse response) {
		try {

			ManagerDTO managerDTO = new ManagerDTO();
			managerDTO.setId(Integer.parseInt(request.getParameter("managerId")));
			managerDTO.setName(request.getParameter("Name"));
			managerDTO.setPassword(request.getParameter("Password"));
			managerDTO.setMobileNumber(Integer.parseInt(request.getParameter("mobileNumber")));
			managerDTO.setEmail(request.getParameter("email"));
			managerDTO.setSallary(Double.parseDouble(request.getParameter("sallary")));

			int count = managerService.updateManagerDetail(managerDTO);
			if (count < 0) {
				System.out.println("Failed to update manager data.");
				PrintWriter writer = response.getWriter();

				writer.append("<html><body onload='myFunction()'><script>function myFunction() {");
				writer.append("alert('Failed to update manager details.');");
				writer.append("}</script></body></html>");
//				RequestDispatcher requestDispatcher = request.getRequestDispatcher("home.jsp");
//				requestDispatcher.include(request, response);
				findAll(request, response);

			} else {
				System.out.println("Manager data updated successfully.");
				PrintWriter writer = response.getWriter();

				writer.append("<html><body onload='myFunction()'><script>function myFunction() {");
				writer.append("alert('Manager data updated successfully.');");
				writer.append("}</script></body></html>");

				RequestDispatcher requestDispatcher = request.getRequestDispatcher("home.jsp");
				requestDispatcher.include(request, response);

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void findById(HttpServletRequest request, HttpServletResponse response) {
		try {
			String managerid = request.getParameter("managerid");

			ManagerDTO managerDTO = managerService.findManagerDetailById(Integer.parseInt(managerid));
			if (managerDTO == null) {
				System.out.println("Wrong manager id inserted,please insert correct value");
				PrintWriter writer = response.getWriter();

				writer.append("<html><body onload='myFunction()'><script>function myFunction() {");
				writer.append("alert('Wrong user id inserted,please insert correct value');");
				writer.append("}</script></body></html>");

				RequestDispatcher requestDispatcher = request.getRequestDispatcher("home.jsp");
				requestDispatcher.include(request, response);
			} else {
				System.out.println("Data found successfully..");
				request.setAttribute("managerDTO", managerDTO);
				RequestDispatcher requestDispatcher = request.getRequestDispatcher("home.jsp");
				requestDispatcher.forward(request, response);

			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	private void findAll(HttpServletRequest request, HttpServletResponse response) {
		try {

			List<ManagerDTO> managerDTOList = managerService.findAllManagerDetail();
			if (managerDTOList.isEmpty()) {
				System.out.println("Faild to find manager detail");
				PrintWriter writer = response.getWriter();

				writer.append("<html><body onload='myFunction()'><script>function myFunction() {");
				writer.append("alert('No manager data found');");
				writer.append("}</script></body></html>");

				RequestDispatcher requestDispatcher = request.getRequestDispatcher("home.jsp");
				requestDispatcher.include(request, response);

			} else {
				System.out.println("Data found successfully.. with list size: " + managerDTOList.size());
				request.setAttribute("managerDTOList", managerDTOList);
				RequestDispatcher requestDispatcher = request.getRequestDispatcher("home.jsp");
				requestDispatcher.forward(request, response);

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void editByManagerId(HttpServletRequest request, HttpServletResponse response) {
		try {
			String managerid = request.getParameter("managerId");

			ManagerDTO managerDTO = managerService.findManagerDetailById(Integer.parseInt(managerid));
			if (managerDTO == null) {
				System.out.println("Wrong manager id inserted,please insert correct value");
				PrintWriter writer = response.getWriter();

				writer.append("<html><body onload='myFunction()'><script>function myFunction() {");
				writer.append("alert('Wrong manager id inserted,please insert correct value');");
				writer.append("}</script></body></html>");

				RequestDispatcher requestDispatcher = request.getRequestDispatcher("home.jsp");
				requestDispatcher.include(request, response);

			} else {
				System.out.println("Data found successfully..");
				request.setAttribute("editManagerDTO", managerDTO);
				RequestDispatcher requestDispatcher = request.getRequestDispatcher("home.jsp");
				requestDispatcher.forward(request, response);

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void deleteById(HttpServletRequest request, HttpServletResponse response) {
		try {
			String managerid = request.getParameter("managerId");
			PrintWriter writer = response.getWriter();

			int count = managerService.deleteManagerDetailById(Integer.parseInt(managerid));
			if (count == 0) {
				System.out.println("Wrong manager id inserted,please insert correct value");

				writer.append("<html><body onload='myFunction()'><script>function myFunction() {");
				writer.append("alert('Wrong manager id inserted,please insert correct value');");
				writer.append("}</script></body></html>");

				RequestDispatcher requestDispatcher = request.getRequestDispatcher("home.jsp");
				requestDispatcher.include(request, response);

			} else {
				System.out.println("Data deleted successfully..");

				writer.append("<html><body onload='myFunction()'><script>function myFunction() {");
				writer.append("alert('Data deleted successfully');");
				writer.append("}</script></body></html>");

				RequestDispatcher requestDispatcher = request.getRequestDispatcher("home.jsp");
				requestDispatcher.include(request, response);

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
