package BankManagementSystem;

public class Customer{
    private String name;
    private long mobileNumber;
    private String password;

    public Customer(String name, long mobileNumber, String password){
        this.name = name;
        this.mobileNumber = mobileNumber;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public long getMobileNumber() {
        return mobileNumber;
    }

    public String getPassword() {
        return password;
    }
}
