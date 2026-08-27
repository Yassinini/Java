// A class representing a BankAccount.
//
// 1. Instance variables: owner (String), balance (double)
// 2. Constructor: takes owner and initialBalance
// 3. deposit(double amount) — adds amount to balance, does nothing if amount <= 0
// 4. withdraw(double amount) — subtracts amount, does nothing if amount <= 0 or amount > balance
// 5. getBalance() — returns balance
// 6. toString() — returns "Account[owner=NAME, balance=BALANCE]"

public class idk {
    private String owner;
    private double balance;

    public idk(String owner, double balance){

      this.owner = owner;
      this.balance = balance;
    }

    public void deposit(double amount){
      if (amount >= 0) balance += amount;
    }
    public void withdraw(double amount){
      if (amount >= 0 && balance-amount >=0) balance -= amount;
    }
    public double getBalance(){
      return balance;
    }
    public String toString(){
      return "Account [ " +"owner= " +owner + ", " + "balance=" + balance + "]";
    }

    public static void main(String[] args) {
        idk b = new idk("Suupa", 100.0);
        b.deposit(50.0);
        System.out.println(b.getBalance());  // 150.0
        b.withdraw(30.0);
        System.out.println(b.getBalance());  // 120.0
        b.withdraw(200.0);
        System.out.println(b.getBalance());  // 120.0 (no change)
        b.deposit(-10.0);
        System.out.println(b.getBalance());  // 120.0 (no change)
        System.out.println(b);              // Account[owner=Suupa, balance=120.0]
    }
}
