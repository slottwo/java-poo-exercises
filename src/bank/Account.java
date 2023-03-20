package bank;

public class Account {
  private double balance;
  private String agencyID;
  private String accountID;
  private Client owner;

  public Account(String agencyID, String accountID, Client owner) {
    this.balance = 0;
    this.agencyID = agencyID;
    this.accountID = accountID;
    this.owner = owner;
  }

  public double getBalance() {
    return this.balance;    
  }

  public String getAgency() {
    return this.agencyID;    
  }
  public String getAccount() {
    return this.accountID;    
  }
  
  public Client getOwner() {
    return this.owner;   
  }
}
