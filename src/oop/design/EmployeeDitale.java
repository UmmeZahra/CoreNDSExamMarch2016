package oop.design;

/**
 * Created by Syeda on 4/9/2016.
 */
public abstract class EmployeeDitale  {


    String shift = "shift_1";

    // unimplemented method/abstract methods
    public abstract double calPerformance();

    public abstract void fullTime();

    public abstract void partTime();

    // implemented methods/non-abstract methods
    public void email(String email) {
    }

    public void contactNo(long number) {
    }

    public void getClearance() {
        System.out
                .println("All Employees Must Obtain Background Check Clearance");
    }

}
