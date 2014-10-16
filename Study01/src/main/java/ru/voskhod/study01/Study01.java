/* Parking simulator
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */

package ru.voskhod.study01;

import java.util.LinkedList;
import java.util.List;
import parking.Car;
import parking.Parking;

public class Study01 {
    public static void main(String[] args) {
//        List<Integer> l = new LinkedList<>();
        Parking ramenkiParking = new Parking(3);
        Car bmw = new Car("BMW", "k001kk777");
//        ramenkiParking.parkCar(new Car("1", "2"));
        ramenkiParking.parkCar(bmw);
    }
    public long sum( int a, int b ) {
        return a + b;
    }
}
