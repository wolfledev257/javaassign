import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class thirteen {
    public static void main(String[] args){
        AccountManager manager = new AccountManager();
        int option;
        Scanner scan = new Scanner(System.in);
        do{
            menu_text();
            option = scan.nextInt();
            switch(option){
                case 1:
                    System.out.println("Enter name of customer: ");
                    String name = scan.nextLine();
                    scan.nextLine();
                    float balance;
                    System.out.println("Enter balance of customer: ");
                    balance = scan.nextFloat();
                    manager.addAccount(new BankAccount(balance, name));
                    break;
                case 2:
                    System.out.println("Enter account number of customer: ");
                    int accno = scan.nextInt();
                    manager.removeAccount(accno);
            }
        }while(option!=0);

    }
    static void menu_text(){
        System.out.println("ENTER OPTION: ");
        System.out.println("1. ADD CUSTOMER. ");
        System.out.println("2. REMOVE CUSTOMER. ");
        System.out.println("3. CREDIT ACCOUNT. ");
        System.out.println("4. DEBIT ACCOUNT. ");
    }
}
class BankAccount{
    private int AccountNumber;
    private static int genAccount=100;
    private float balance;
    private String ownerName;
    BankAccount(float balance, String ownerString){
        this.AccountNumber = genAccount++;
        this.balance = balance;
        this.ownerName = ownerString;
    }
    BankAccount(){
        this(0,"NULL");
    }
    public void add(int amt){
        this.balance += amt;
    }
    public void getBalance(){
        System.out.println("The balance for accounter holder: "+ ownerName+" is "+balance);
    }
    public void setBalance(int balance){
        this.balance = balance;
    }
    public void getName(){
        System.out.println("The account holder name is "+ownerName);
    }
    public void setName(String name){
        this.ownerName = name;
    }
    public void subtract(int amt){
        balance -= amt;
    }
    public int getAccountNo(){
        return this.AccountNumber;
    }
}
class AccountManager{
    List<BankAccount> accarray;
    AccountManager(){
        accarray = new ArrayList<>();
    }
    public void addAccount(BankAccount b){
        accarray.add(b);
    }
    public void removeAccount(int accno){
        BankAccount b_to_delete = null;
        for(BankAccount b:accarray){
            if(b.getAccountNo() == accno){
                System.out.println("Account found. ");
                b_to_delete = b;
            }
        }
        if(b_to_delete==null) System.out.println("Element not found.");
        else {
            accarray.remove(b_to_delete);
            System.out.println("Account deleted. ");
        }
    }
    public BankAccount find(){
        BankAccount b_to_delete = null;
        for(BankAccount b:accarray){
            if(b.getAccountNo() == accno){
                System.out.println("Account found. ");
                b_to_delete = b;
            }
        }
        if(b_to_delete==null) System.out.println("Element not found.");
        else {
            accarray.remove(b_to_delete);
            System.out.println("Account deleted. ");
        }
    }
    public void credit(int accno, int amt){
        for(B)
    }
    public void display(){
        for(BankAccount b:this.accarray){
            System.out.println("Customer Account number: "+b.getAccountNo());
            b.getBalance();
        }
    }
}
                                             