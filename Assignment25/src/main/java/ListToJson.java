import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Arrays;
import java.util.List;

class ListToJsonObject {
    public static void main(String[] args) throws Exception {
        ObjectMapper om = new ObjectMapper();
        List<Car> cars = Arrays.asList(new Car("Tata", "Nano"), new Car("Bmw", "M4"));
        String carsJson = om.writeValueAsString(cars);
        System.out.println(carsJson);
    }
}
