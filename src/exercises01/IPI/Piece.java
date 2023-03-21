package exercises01.IPI;

public class Piece {
  private String id;
  private double unitPrice;
  private int quantity;

  public Piece(String id, double unitPrice, int quantity) {
    this.id = id;
    this.unitPrice = unitPrice;
    this.quantity = quantity;
  }

  public Piece(String id, double unitPrice) {
    this(id, unitPrice, 1);
  }

  public String getId() {
    return id;
  }

  public double getUnitPrice() {
    return unitPrice;
  }

  public int getQuantity() {
    return quantity;
  }

  public double getPrice() {
    return quantity * unitPrice;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  public void setUnitPrice(double unitPrice) {
    this.unitPrice = unitPrice;
  }
}
