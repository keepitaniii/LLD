package main.java.lld.designpattern.facade;

public class ProductDAO {
  public Product getProduct(int productId) {
    return new Product();
  }
}
