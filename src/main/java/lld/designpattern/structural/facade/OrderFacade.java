package main.java.lld.designpattern.structural.facade;

public class OrderFacade {
  ProductDAO productDAO;
  Invoice invoice;
  Payment payment;
  Notification notification;

  public OrderFacade() {
    productDAO = new ProductDAO();
    invoice = new Invoice();
    payment = new Payment();
    notification = new Notification();
  }

  public void createOrder() {
    Product product = productDAO.getProduct(121);
    payment.makePayment();
    invoice.generateInvoice();
    notification.sendNotification();
  }
}
