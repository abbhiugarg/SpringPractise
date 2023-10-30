package QuestionBank;
public class Account {
    private long accountNo;
    private String custName;
    private String custAddress;
    private long contactNo;

    private long accountBalance;

    public Account(long accountNo, String custName, String custAddress, long contactNo, long accountBalance) {
        this.accountNo = accountNo;
        this.custName = custName;
        this.custAddress = custAddress;
        this.contactNo = contactNo;
        this.accountBalance = accountBalance;
    }

    public Account() {
    }

    public long getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(long accountNo) {
        this.accountNo = accountNo;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getCustAddress() {
        return custAddress;
    }

    public void setCustAddress(String custAddress) {
        this.custAddress = custAddress;
    }

    public long getContactNo() {
        return contactNo;
    }

    public void setContactNo(long contactNo) {
        this.contactNo = contactNo;
    }

    public long getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(long accountBalance) {
        this.accountBalance = accountBalance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNo=" + accountNo +
                ", custName='" + custName + '\'' +
                ", custAddress='" + custAddress + '\'' +
                ", contactNo=" + contactNo +
                ", accountBalance=" + accountBalance +
                '}';
    }
}
