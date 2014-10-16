package parking;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

public class ParkingTest {

    private static Parking testParking;
    private static int totalSpots = 3;

    public ParkingTest() {
    }

    @BeforeClass
    public static void setUpClass() {
        System.out.println("======= TESTS =======");
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        testParking = new Parking(totalSpots);
    }

    @After
    public void tearDown() {
        testParking = null;
    }

    @Test
    public void testNewParkingViaGetter() {
        System.out.println("testNewParkingViaGetter");
        Parking emptyParking = new Parking(totalSpots);
        assertTrue(emptyParking.getAvaiableSpots() == totalSpots);
    }

    @Test
    public void testNewParkingIsEmpty() {
        Class<?> parkingClass = testParking.getClass();
        boolean empty = false;
        try {
            Field f = parkingClass.getDeclaredField("cars");
            f.setAccessible(true);
            ArrayList<Car> cars = (ArrayList<Car>) f.get(testParking);
            empty = true;
            for (Car c : cars) {
                //System.out.println( c.getModel() + " + " + c.getNum() );
                empty = false;
            }
        } catch (Exception ex) {
            fail(ex.getMessage());
        }
        assertTrue(empty);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParkCarNull() {
        System.out.println("parkCarNull");
        testParking.parkCar(null);
    }

    @Test
    public void testFullParking() {
        System.out.println("testFullParking");
        for (int i = 0; i < totalSpots; i++) {
            testParking.parkCar(new Car("Model-" + i, "Plate-" + i));
        }
        assertFalse(testParking.parkCar(new Car("Model", "Plate")));
    }

    @Test
    public void testEmptyParking() {
        System.out.println("testEmptyParking");
        for (int i = 0; i < totalSpots; i++) {
            testParking.parkCar(new Car("Model-" + i, "Plate-" + i));
        }
        for (int i = 0; i < totalSpots; i++) {
            testParking.pickupCar("Plate-" + i);
        }
        assertTrue( testParking.getAvaiableSpots() == testParking.getTotalSpots());
    }

    @Test
    public void testParkDuplicatePlate() {
        System.out.println("testParkDuplicatePlate");
        testParking.parkCar(new Car("Model-1", "Plate-1"));
        assertFalse( "Запарковали \"левую\" машину :)", testParking.parkCar(new Car("Model-1", "Plate-1")));
    }

    @Test
    public void testPickupCar() {
        String plate = "a001aaa777";
        String model = "BMW";
        Car dummy = new Car(model, plate );
        testParking.parkCar(dummy);
        Car pickedUpCar = testParking.pickupCar(plate);
        assertTrue( pickedUpCar.getModel().equals(dummy.getModel()) && pickedUpCar.getNum().equals(dummy.getNum()));
    }

}
