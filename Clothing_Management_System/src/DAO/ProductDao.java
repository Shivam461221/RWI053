package DAO;

import MODEL.Product;
import UTIL.DBUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductDao {
	public void addProduct(Product product) throws SQLException, ClassNotFoundException {
		String sql = "INSERT INTO Products (ProductName, Category, Size, Price, SupplierID)"
				+ " VALUES (?, ?, ?, ?, ?)";

		try (Connection conn = DBUtil.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
			stmt.setString(1, product.getProductName());
			stmt.setString(2, product.getCategory());
			stmt.setString(3, product.getSize());
			stmt.setDouble(4, product.getPrice());
			stmt.setInt(5, product.getSupplierId());
			stmt.executeUpdate();

		}
	}

	public List<Product> getAllProduct() throws SQLException, ClassNotFoundException {
		List<Product> products = new ArrayList<>();
		String sql = "SELECT * FROM products";

		try (Connection conn = DBUtil.getConnection();
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(sql)) {
			while (rs.next()) {
				Product product = new Product();
				product.setProductId(rs.getInt("productId"));
				product.setProductName(rs.getString("productName"));
				product.setCategory(rs.getString("category"));
				product.setSize(rs.getString("size"));
				product.setPrice(rs.getDouble("price"));
				product.setSupplierId(rs.getInt("supplierId"));
				products.add(product);
			}
		}
		return products;
	}

	public Product getProductID(int id) throws SQLException, ClassNotFoundException {
		String sql = "SELECT * FROM products WHERE productId=?";
		Product product = null;

		try (Connection conn = DBUtil.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
			stmt.setInt(1, id);
			try (ResultSet rs = stmt.executeQuery()) {
				if (rs.next()) {
					product = new Product();
					product.setProductName(rs.getNString("productName"));
					product.setCategory(rs.getNString("category"));
					product.setSize(rs.getNString("size"));
					product.setPrice(rs.getDouble("price"));
					product.setSupplierId(rs.getInt("supplierId"));

				}
			}

			return product;
		}
	}

	public void updateProduct(Product product) throws SQLException, ClassNotFoundException {
		String sql = "INSERT INTO Products (ProductName, Category, Size, Price, SupplierID)"
				+ " VALUES (?, ?, ?, ?, ?)";

		try (Connection conn = DBUtil.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
			stmt.setString(1, product.getProductName());
			stmt.setString(2, product.getCategory());
			stmt.setString(3, product.getSize());
			stmt.setDouble(4, product.getPrice());
			stmt.setInt(5, product.getSupplierId());

			stmt.executeUpdate();
		}
	}

	public void deleteProduct(int id) throws SQLException, ClassNotFoundException {
		String sql = "DELETE FROM products WHERE productId = ?";

		try (Connection conn = DBUtil.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
			stmt.setInt(1, id);

			stmt.executeUpdate();
		}

	}

	public void updateProductBySupplierID(int id) throws SQLException, ClassNotFoundException {
		String sql = "UPDATE products SET SupplierID=? WHERE SupplierID=?";

		try (Connection conn = DBUtil.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
			stmt.setNull(1, Types.INTEGER);
			stmt.setInt(2, id);
			stmt.executeUpdate();
		}
	}
	

	public Product getProductIdBySupplierId(int id) throws SQLException, ClassNotFoundException 
	{
		String sql = "SELECT * FROM products WHERE SupplierID=?";
		Product product=null;

		try (Connection conn = DBUtil.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) 
		{
			stmt.setInt(1, id);
			try (ResultSet rs = stmt.executeQuery()) {
				if (rs.next()) {
					product = new Product();
					product.setProductName(rs.getNString("productName"));
					product.setCategory(rs.getNString("category"));
					product.setSize(rs.getNString("size"));
					product.setPrice(rs.getDouble("price"));
					product.setSupplierId(rs.getInt("supplierId"));
					product.setProductId(rs.getInt("productId"));
				}
			}

			return product;
		}
	}
}
