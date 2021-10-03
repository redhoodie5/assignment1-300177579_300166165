
/**
 * This class holds the information of an employee
 * @author Meigh Colman 
 * Student Number:300177579
 * @author Cat Wong
 * Student Number: 300166165
 */
public class Employee{
    //final class variable
    final int numAddresses = 5;
    //instance variables
    /**
     * name of employee
     */
    private String name;
    /**
     * number of hours scheduled
     * per week, most likely
     */
    private int hours;
    /**
     * rate of pay
     * per hour, probably
     */
    private double rate;
    /**
     * addresses 
     * of the employee most likely but hypothetically could be addresses of the various company buildings they work at
     * for example, a scientist could write papers in a different building than they do experiments in
     */
    private Address[] addresses;

    /**
     * Constructors
     * 
     * @param name          employee's name
     * @param hours         number of hours an employee works
     * @param rate          rate of pay an employee recieves
     * @param addresses     addresses of the employee
     */
    public Employee(String name, int hours, double rate, Address[] addresses){
        this.name = name;
        this.hours = hours;
        this.rate = rate;
        this.addresses = new Address[5];
        for(int i = 0; i < 5; i++){
            if(addresses.length > (i+1)){
                this.addresses[i] = addresses[i].copyAddress();
            }
        }
    }

    public String getName(){
        return name;
    } 
    public int getHours(){
        return hours;
    }
    public double getRate(){
        return rate;
    }
    public Address[] getAddresses(){
        return addresses;
    }

    public String toString(){
        String addressString = "";
        for(int i = 0; i < addresses.length; i++){
            System.out.println("A : " + i);
            if(addresses[i] != null){
                addressString = addressString + "\n\tAddress:" + (i+1) + "\n" + addresses[i].toString();
            }
            
        }
        return ("Name :\t" + name + "\n" +
                "Hours :\t" + hours + "\n" +
                "Rate :\t" + rate + "\n" +
                "Addresses :\t" + addressString 
                );
        
    }
}