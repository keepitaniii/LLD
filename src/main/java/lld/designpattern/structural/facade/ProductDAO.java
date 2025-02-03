package main.java.lld.designpattern.structural.facade;

public class ProductDAO {
  public Product getProduct(int productId) {
    return new Product();
  }
}
