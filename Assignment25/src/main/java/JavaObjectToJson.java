import com.fasterxml.jackson.databind.ObjectMapper;

public class JavaObjectToJson {
    public static void main(String[] args) {
        try {
            ObjectMapper om = new ObjectMapper();
            Car car = new Car("nano", "tata");
            String jsonString = om.writeValueAsString(car);
            System.out.println(jsonString);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
class Car {
    private String brand, model;
    Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }
    public String getBrand() { 
        return brand; 
    }
    public String getModel() { 
        return model; 
    }
}
