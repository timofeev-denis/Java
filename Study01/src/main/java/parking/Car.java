package parking;

public class Car {
    private String model;
    private String plate;

    public Car(String model, String plate) {
        if(model == null) {
            throw new IllegalArgumentException( "Модель автомобиля не может быть пустым" );
        }
        if(model.isEmpty()) {
            throw new IllegalArgumentException( "Модель автомобиля не может быть пустым" );
        }
        if(plate == null) {
            throw new IllegalArgumentException( "Номер автомобиля не может быть пустым" );
        }
        if(plate.isEmpty()) {
            throw new IllegalArgumentException( "Номер автомобиля не может быть пустым" );
        }
        
        this.model = model;
        this.plate = plate;
    }
    
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getNum() {
        return plate;
    }

    public void setNum(String num) {
        this.plate = num;
    }
    
    
}
