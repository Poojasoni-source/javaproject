
public class Customer {

    private int customerId;
    private String customerName;
    private String phoneNumber;

    public Customer(int customerId, String customerName, String phoneNumber) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.phoneNumber = phoneNumber;
    }
    public String getCustomerName(){
        return customerName;}

    public void displayCustomer() {
        System.out.println("Customer ID: " + customerId);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Phone Number: " + phoneNumber);
    }
    
    public static void main(String[] args) {

        Customer c1 = new Customer(101, "Pooja","9898989898");

        c1.displayCustomer();
    }
}

