package mainchild;

public class VIPCustomer extends Person{
  
  private int Discount;

  public VIPCustomer() {}
  public VIPCustomer( int Discount) {
      this.Discount = Discount;
  }
  public void hienThiThongTin() {
      System.out.println("\nDiscount: " + Discount);
  } 
}
