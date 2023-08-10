import java.util.UUID;

public class SBIBANK implements BankInterface {
    private String Name;
    private String Password;
    private double Balance;
    private String AccountNo;
    final String IFSCcode = "SBI921800";
    final double rateOfIntrest = 7.1;

    @Override
    public String toString() {
        return "SBIBANK{" +
                "Name='" + Name + '\'' +
                ", Password='" + Password + '\'' +
                ", Balance=" + Balance +
                ", AccountNo='" + AccountNo + '\'' +
                ", IFSCcode='" + IFSCcode + '\'' +
                ", rateOfIntrest=" + rateOfIntrest +
                '}';
    }

    public SBIBANK() {
    }

    // here i am not taking account no as parameter because account no should generate by bank
    // i am taking parameters which is given by users
   public SBIBANK(String name, String password, double balance) {
        Name = name;
        Password = password;
        Balance = balance;
        this.AccountNo = String.valueOf(UUID.randomUUID());
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public double getBalance() {
        return Balance;
    }

    public void setBalance(double balance) {
        Balance = balance;
    }

    public String getAccountNo() {
        return AccountNo;
    }

    public void setAccountNo(String accountNo) {
        AccountNo = accountNo;
    }

    public String getIFSCcode() {
        return IFSCcode;
    }

    public double getRateOfIntrest() {
        return rateOfIntrest;
    }

    @Override
    public String fetchBalance(String password) {
        if(this.Password.equals(password)){
            return "Your balance"+this.Balance;
        }
        return "Your password is incorrect";
    }

    @Override
    public String addMoney(double amount) {
        this.Balance += amount;

        return "Your balance is"+this.Balance;
    }

    @Override
    public String withdrawMoney(double amount, String password) {
        if(this.Balance >= amount && this.Balance != 0 && this.Password.equals(password)){
            this.Balance -= amount;
            return "Amount has been Deducted"+this.Balance;
        }
        else if(this.Balance < amount) return " Insufficient Balance";
        return "Incorrect Password";
    }

    @Override
    public String changePassword(String oldPassword, String newPassword) {
        if(this.Password.equals(oldPassword)){
            this.Password = newPassword;
            return " Password hac been successfully updated";
        }
        return "Incorrect Password";
    }

    @Override
    public double calculateIntrest(int year) {
        return ((this.Balance*year*rateOfIntrest)/100.0);
    }
}
