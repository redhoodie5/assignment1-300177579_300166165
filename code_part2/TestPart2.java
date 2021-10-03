
/**
 * testing for the classes Employee and Address
 * to test the classes, please run this program
 * 
 * @author Meigh Colman
 * Student Number: 300177579
 * @author Cat Wong
 * Student Number: 300166165
 */
public class TestPart2 {
    public static void main(String[] args) {
        System.out.println("The example to be run in part 2:");
        Employee employee = part2Example();
        System.out.println(employee.toString());
        String o1 = employee.getName();
        System.out.println("o1 = " + o1);
        System.out.println("size of array" + employee.getAddresses().length);
        System.out.println("args class : " + args.getClass() + "\targs length : " + args.length);
    }

    
    /**
     * 
     * @return
     */
    static public Employee part2Example(){
        Address address0 = new Address("Queen",48, "K1P1N2");
        Address address1 = new Address("King Edward", 800, "K1N6N5");
        Address[] addresses = {address0, address1};
        Employee employee = new Employee("Falcao", 40, 15.50,addresses);
        return employee;
    }
}
