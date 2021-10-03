
/**
 * This class holds an address of a house
 * It doesn't seem to be able to contain an apartment address since there's no way to add a letter or apartment number to the address
 * @author Meigh Colman 
 * Student Number: 300177579
 * @author Cat Wong
 * Student Number: 300166165
 */
public class Address {
    //Instance Variables

    /**
     * Street name
     */
    String street;
    /**
     * House number 
     */
    int number;
    /**
     * Postal Code
     */
    String postal;
    
    
    /**
     * Constrctor
     * @param street    The street name
     * @param number    The house number
     * @param postal    The postal code
     */
    public Address(String street, int number, String postal){
        this.street = street;
        this.number = number;
        this.postal = postal;
    }

    public String getStreet(){
        return street;
    }
    public int getNumber(){
        return number;
    }
    public String getPostal(){
        return postal; 
    }
    public boolean setStreet(String s){
        street = s;
        return true;
    }
    public boolean setNumber(int n){
        number = n;
        return true;
    }
    public boolean setPostal(String p){
        postal = p;
        return true; 
    }

    public Address copyAddress(){
        return new Address(String.valueOf(street), number, String.valueOf(postal));
    }

    public String toString(){
        return("\t\t" + number + "\n\t\t" + street + "\n\t\t" + postal);
    }
}
