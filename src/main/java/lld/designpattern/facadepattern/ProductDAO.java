package main.java.lld.designpattern.facadepattern;

public class ProductDAO {
  public Product getProduct(int productId) {
    return new Product();
  }
}
