package parking;

import java.util.ArrayList;
import java.util.HashMap;

public class Parking {
    private ArrayList<Car> cars;
    private final int totalSpots;
    
    public Parking(int spots) {
        if(spots < 0) {
            throw new IllegalArgumentException( "Количество парковочных мест должно быть не меньше 0." );
        }
        this.totalSpots = spots;
        this.cars = new ArrayList<>();
    }

    public boolean parkCar(Car newCar) {
        if(newCar == null) {
            throw new IllegalArgumentException("Машина не может быть null.");
        }
        if (cars.size() >= this.totalSpots) {
            return false;
        }
        for(Car c : this.cars) {
            if(newCar.getNum().equals(c.getNum())) {
                return false;
            }
        }
        this.cars.add(newCar);
        return true;
    }

    public Car pickupCar(String carPlate) {
        int i = 0;
        for (Car c : cars) {
            if (c.getNum().equals(carPlate)) {
                this.cars.remove(i);
                return c;
            }
            i++;
        }
        return null;
    }

    public int getTotalSpots() {
        return this.totalSpots;
    }

    public int getAvaiableSpots() {
        return getTotalSpots() - this.cars.size();
    }
}
