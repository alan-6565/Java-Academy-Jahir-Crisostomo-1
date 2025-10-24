package com.pluralsight;

import org.junit.jupiter.api.Test;

import static com.pluralsight.Employee.punchIn;
import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {
    @Test
    public void Employee_should_checkout(){
        Employee e1 = new Employee(101, "Alan", "HR", 25.50, 15.6);

        e1.punchOut();

        e1.punchIn();
        e1.punchOut();
    }

    @Test
    public void Employee_should_checkin(){
        Employee e1 = new Employee(101, "Alan", "HR", 25.50, 15.6);

        e1.punchIn();


        e1.punchIn();
    }



}