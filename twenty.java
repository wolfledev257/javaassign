import java.util.List;
import java.util.ArrayList;

public class twenty{
    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.addAccount(new CurrentAccount("Mr. A", 1000));
        manager.addAccount(new SavingsAccount("Mr. B", 2000, 5));
        manager.addAccount(new SavingsAccount("Mr. C", 4000, 2));
        manager.addAccount(new SavingsAccount("Mr. D", 6000, 3));
        manager.addAccount(new CurrentAccount("Mr. E", 9000));
        manager.getDetails();
    }
}
//creating the parent account class
class Account{
    private int accountNumber, balance;
    private static int genAccountNumber = 100;
    private String holderName;
    Account(String holderName, int balance){
        this.accountNumber = genAccountNumber++;
        this.holderName = holderName;
        this.balance = balance;
    }
    public int getBalance(){
        return this.balance;
    }
    public void printDetails(){
        System.out.println("A/C no: "+this.accountNumber+",\tA/C holder name: "+this.holderName+",\tbalance: "+this.balance);
    }
}
//creating the child savings account class
class SavingsAccount extends Account{
    float interestRate;
    SavingsAccount(String holderName, int balance, float interestRate){
        super(holderName, balance);
        this.interestRate = interestRate;
    }
    private float calculateYearlyInterest(){
        return (this.getBalance()*this.interestRate)/100;
    }
    public void printDetails(){
        System.out.println("This is a savings account.");
        super.printDetails();
        System.out.println("Yearly Interest rate: "+this.interestRate+",\tYearly interest: "+this.calculateYearlyInterest());
    }
}
//creating the child current account class
class CurrentAccount extends Account{
    CurrentAccount(String holderName, int balance){
        super(holderName, balance);
    }
    public void printDetails(){
        System.out.println("This is a savings account.");
        super.printDetails();
    }
}
class Manager{
    private List<Account> accounts;
    Manager(){
        accounts = new ArrayList<Account>();
    }
    void addAccount(Account account){
        if(search(account)){
            System.out.println("Already present in list.");
            return;
        }
        accounts.add(account);
        System.out.println("Account added successfully.");
    }
    boolean search(Account account){
        for(Account a : accounts){
            if(a==account){
                return true;
            }
        }
        return false;
    }
    public void getDetails(){
        for(int i = 0;i<accounts.size();i++){
            System.out.println((i+1)+"th account: ");
            accounts.get(i).printDetails();
            System.out.println("");
        }
    }
}