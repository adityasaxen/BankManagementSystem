package BankManagementSystem;
import java.util.ArrayList;
public class CustomerList{
    private ArrayList<Customer>customers;
    public CustomerList(){
        customers=new ArrayList<>();
    }
    public void addCustomer(Customer customer){
        customers.add(customer);
    }
    public String toString(){
        String s="";
        for(Customer customer:customers)
            s="Name: "+customer.getName()+"\n"+"Mobile number: "+customer.getMobileNumber()+"\n"+"Password: "+customer.getPassword()+"\n";
        return s;
    }
    public boolean checkDetails(String name,String password){
        for(Customer customer:customers)
            if(customer.getName().equals(name)&&customer.getPassword().equals(password)){
                return true;
            }
        return false;
    }
}
