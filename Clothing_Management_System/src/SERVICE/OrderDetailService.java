package SERVICE;

import DAO.CustomerDao;
import DAO.OrderDetailsDao;
import MODEL.Customer;
import MODEL.OrderDetails;

import java.sql.SQLException;
import java.util.List;

public class OrderDetailService {
    private OrderDetailsDao orderDetailsDao;

    public OrderDetailService() {
        orderDetailsDao = new OrderDetailsDao();
    }

    public void addOrderDetails(OrderDetails orderDetails) throws SQLException, ClassNotFoundException {
        orderDetailsDao.addOrderDetails(orderDetails);
    }
    public OrderDetails getOrderDetailsById(int id) throws SQLException, ClassNotFoundException {
        return orderDetailsDao.getOrderDetailsId(id);
    }

    public List<OrderDetails> getAllOrderDetails() throws SQLException, ClassNotFoundException {
        return orderDetailsDao.getAllOrderDetails();
    }

    public void updateOrderDetails(OrderDetails orderDetails) throws SQLException, ClassNotFoundException {
        orderDetailsDao.updateOrderDetails(orderDetails);
    }

    public void deleteOrderDetails(int id) throws SQLException, ClassNotFoundException {
        orderDetailsDao.deleteOrderDetails(id);
    }
    public void deleteOrderDetailsByPID(int id) throws SQLException, ClassNotFoundException {
        orderDetailsDao.deleteOrderDetailsByPId(id);
    }
    
    public void deleteOrderDetailsByOrderId(int id) throws SQLException, ClassNotFoundException {
        orderDetailsDao.deleteOrderDetailsByOrderId(id);
    }
}
