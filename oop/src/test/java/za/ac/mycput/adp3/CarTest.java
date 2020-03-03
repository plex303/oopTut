package za.ac.mycput.adp3;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CarTest {
    Car c = new Car();

    // Inheritance -----------------------------------------------------------//

    @Test
    public void testInheritance() {
       String grade = c.calcGrade(45);

        assertEquals(grade,"fail");
    }

    // Polymorphism-----------------------------------------------------------//

    @Test
    public void testPoly() {
        String a =c.poly("test poly");
        assertEquals(a,"test poly");
    }




    // Composition -----------------------------------------------------------//
        private Vehicle veh;
    @Before
    public void setUp() throws Exception {
        veh = new Vehicle();
    }

    @Test
    public void testComposition() {

        String result = veh.vehType("Truck");

        assertEquals(result,"Truck");

    }


}