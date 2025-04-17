package EMS;

import EMS.Employee;
public class EmoloyeeManage {
    
    public static void main(String[] args) {
        
        Employee e1 = new Employee(1, "Ravi",3600);
        Employee e2 = new Employee(1, "Raj",3600);
        Employee e3 = new Employee(1, "Ranki",3600);

        e1.displayDetails();
        e2.displayDetails();
        e3.displayDetails();
    }
}
