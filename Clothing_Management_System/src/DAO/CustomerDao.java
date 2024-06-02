package DAO;

import MODEL.Customer;
import UTIL.DBUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CustomerDao {
	public void addCustomer(Customer customer) throws SQLException, ClassNotFoundException {
		String sql = "INSERT INTO customers (firstname, lastname , email, phone)" + " VALUES (?, ?, ? , ?)";

		try (Connection conn = DBUtil.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
			stmt.setString(1, customer.getFirstName());
			stmt.setString(2, customer.getLastName());
			stmt.setString(3, customer.getEmail());
			stmt.setString(4, customer.getPhone());
			stmt.executeUpdate();
		}
	}

	public List<Customer> getAllcustomers() throws SQLException, ClassNotFoundException {
		List<Customer> customers = new ArrayList<>();
		String sql = "SELECT * FROM customers";

		try (Connection conn = DBUtil.getConnection();
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(sql)) {
			while (rs.next()) {
				Customer customer = new Customer();
				customer.setCustomerId(rs.getInt("customerId"));
				customer.setFirstName(rs.getString("firstName"));
				customer.setLastName(rs.getString("lastName"));
				customer.setEmail(rs.getString("email"));
				customer.setPhone(rs.getString("phone"));
				customers.add(customer);
			}
		}
		return customers;
	}

	public Customer getCustomerId(int id) throws SQLException, ClassNotFoundException {
		String sql = "SELECT * FROM customers WHERE  CustomerID=?";
		Customer customer = null;

		try (Connection conn = DBUtil.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
			stmt.setInt(1, id);
			try (ResultSet rs = stmt.executeQuery()) {
				if (rs.next()) {
					customer = new Customer();
					customer.setCustomerId(rs.getInt("customerId"));
					customer.setFirstName(rs.getString("firstName"));
					customer.setLastName(rs.getString("lastName"));
					customer.setEmail(rs.getString("email"));
					customer.setPhone(rs.getString("phone"));
				}
			}

			return customer;
		}
	}

	public void updateCustomer(Customer customer) throws SQLException, ClassNotFoundException {
		String sql = "UPDATE customers SET firstName = ?, lastName = ?, email = ? , phone = ? WHERE  CustomerID = ?";

		try (Connection conn = DBUtil.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {

			stmt.setString(1, customer.getFirstName());
			stmt.setString(2, customer.getLastName());
			stmt.setString(3, customer.getEmail());
			stmt.setString(4, customer.getPhone());
			stmt.setInt(5, customer.getCustomerId());
			stmt.executeUpdate();
		}
	}

	public void deleteCustomer(int id) throws SQLException, ClassNotFoundException {
		String sql = "DELETE FROM customers WHERE  CustomerID = ?";

		try (Connection conn = DBUtil.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
			stmt.setInt(1, id);
			stmt.executeUpdate();
		}

	}
}
