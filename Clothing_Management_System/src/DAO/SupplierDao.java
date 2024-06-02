package DAO;

import MODEL.OrderDetails;
import MODEL.Product;
import MODEL.Supplier;
import UTIL.DBUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class SupplierDao {
    public void addSupplier(Supplier supplier) throws SQLException, ClassNotFoundException {
        String sql = "INSERT INTO Suppliers (SupplierName, ContactEmail, ContactPhone)" +
                " VALUES (?, ?, ?)";

        try (Connection conn = DBUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, supplier.getSupplierName());
            stmt.setString(2, supplier.getContactEmail());
            stmt.setString(3, supplier.getContactPhone());
            stmt.executeUpdate();

        }
    }
        public List<Supplier> getAllSuppliers() throws SQLException, ClassNotFoundException {
            List<Supplier> suppliers = new ArrayList<>();
            String sql = "SELECT * FROM suppliers";

            try (Connection conn = DBUtil.getConnection();
                 Statement stmt = conn.createStatement();
                 ResultSet rs = stmt.executeQuery(sql)) {
                while (rs.next()) {
                    Supplier supplier = new Supplier();
                    supplier.setSupplierName(rs.getString("supplierName"));
                    supplier.setContactEmail(rs.getString("contactEmail"));
                    supplier.setContactPhone(rs.getString("contactPhone"));
                    suppliers.add(supplier);
                }
            }
            return suppliers;
        }

        public Supplier getSupplierID(int id) throws SQLException, ClassNotFoundException {
            String sql = "SELECT * FROM supplier WHERE supplierId=?";
            Supplier supplier = null;

            try (Connection conn = DBUtil.getConnection();
                 Statement stmt = conn.createStatement();
                 ResultSet rs = stmt.executeQuery(sql)) {
                while (rs.next()) {
                    supplier = new Supplier();
                    supplier.setSupplierName(rs.getString("supplierName"));
                    supplier.setContactEmail(rs.getString("contactEmail"));
                    supplier.setContactPhone(rs.getString("contactPhone"));

                }
            }
            return supplier;

        }
        public void updateSupplier(Supplier supplier) throws SQLException, ClassNotFoundException {
            String sql = "INSERT INTO suppliers ( supplierName ,ContactEmail , ContactPhone )+" +
                     " VALUES (?, ?, ? )";

            try (Connection conn = DBUtil.getConnection();
                 PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setString(1, supplier.getSupplierName());
                stmt.setString(2, supplier.getContactEmail());
                stmt.setString(3, supplier.getContactPhone());
                stmt.executeUpdate();
            }
        }
        public void deleteSupplier(int id) throws SQLException, ClassNotFoundException {
            String sql = "DELETE FROM suppliers WHERE supplierId = ?";

            try (Connection conn = DBUtil.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setInt(1, id);
                stmt.executeUpdate();
            }

        }
    }


