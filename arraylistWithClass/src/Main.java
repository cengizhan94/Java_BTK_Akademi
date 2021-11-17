import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	ArrayList<Customer> customers = new ArrayList<Customer>();
    Customer CengizHan = new Customer(1 , "Cengiz Han", "Uyar");
            customers.add(CengizHan);
            Customer Pervin = new Customer(1,"Pervin","Oflaz");
            customers.add(Pervin);
        customers.add(new Customer(2,"Zeynep ","Uyar"));//<Bu kod Tavsiye Edilmez...
    //customers.remove(CengizHan);<< Üstteki kod yazılırsa bu işlem gerçekleşmez

        for(Customer customer : customers){
            System.out.println(customer.firstName);
        }
    }
}
