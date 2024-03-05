package Classes;

public class BankAccount {
    private String bankName;
    private String branchName;
    private String accountHoldeName;
    private double balance;
    private String ifscCode;
    private long accountNumber;
    private String currencyType;

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public String getIfscCode() {
        return ifscCode;
    }

    public void setIfscCode(String ifscCode) {
        this.ifscCode = ifscCode;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHoldeName() {
        return accountHoldeName;
    }

    public void setAccountHoldeName(String accountHoldeName) {
        this.accountHoldeName = accountHoldeName;
    }

    public double getBalance() {
        return balance;
    }

    public String getBalanceWithCurrrency() {
        if (currencyType=="DOL") {
            return "$" + balance;  
        }else{
            return "RS"+balance;
        }
       
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setBankName(String name) {
        bankName = name;
    }

    String getBankName() {
        return bankName;
    }

    public String getCurrencyType() {
        return currencyType;
    }

    public void setCurrencyType(String currencyType) {
        this.currencyType = currencyType;
    }
   
}

class BankAccountDetails {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount();
        BankAccount b2 = new BankAccount();

        set(b1, "HDFC", "ammerpet", "HDFC0004194", 798779759579480L, "hare",  20000, "INR");
        set(b2, "HDFC", "ammerpet", "HDFC0004194", 79877975956740L, "KRISHNA", 20000, "DOL");

        //printing bank account details
        printaccountdetails(b1);
        System.out.println("-----------------------------------------");
        printaccountdetails(b2);
    }
    public static void set(BankAccount b, String bn, String brn, String ifsc, long acn, String name, double bal, String ct){
        b.setBankName(bn);
        b.setBranchName(brn);
        b.setIfscCode(ifsc);
        b.setAccountNumber(acn);
        b.setAccountHoldeName(name);
        b.setBalance(bal);
        b.setCurrencyType(ct);
    }
    public static void printaccountdetails(BankAccount b){
        System.out.println("BankName          :" + b.getBankName());
        System.out.println("BranchName        :" + b.getBranchName());
        System.out.println("IFSC Code         :" + b.getIfscCode());
        System.out.println("AccountNumber     :" + b.getAccountNumber());
        System.out.println("AccountHolderName :" + b.getAccountHoldeName());
        System.out.println("Balance           :" + b.getBalanceWithCurrrency());


    }
    
}