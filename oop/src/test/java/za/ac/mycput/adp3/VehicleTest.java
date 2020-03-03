package za.ac.mycput.adp3;

import org.junit.Test;

import static org.junit.Assert.*;

public class VehicleTest {

    // Encapsulation ---------------------------------------------------------//

    Vehicle v = new Vehicle();
    @Test
    public void getMass() {
        v.setMass(50);
        int mass = v.getMass();
        assertEquals(mass,50);

    }
}