package SERVICE;

import java.sql.SQLException;
import java.util.List;

import DAO.CustomerDao;
import MODEL.Customer;

public class CustomerService {
        private CustomerDao customerDao;

        public CustomerService() {
            customerDao = new CustomerDao();
        }

        public void addCustomer(Customer customer) throws SQLException, ClassNotFoundException {
            customerDao.addCustomer(customer);
        }
        public Customer getCustomerById(int id) throws SQLException, ClassNotFoundException {
            return customerDao.getCustomerId(id);
        }

        public List<Customer> getAllCustomer() throws SQLException, ClassNotFoundException {
            return customerDao.getAllcustomers();
        }

        public void updateCustomer(Customer customer) throws SQLException, ClassNotFoundException {
            customerDao.updateCustomer(customer);
        }

        public void deleteCustomer(int id) throws SQLException, ClassNotFoundException {
            customerDao.deleteCustomer(id);
        }
}
