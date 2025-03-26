import java.util.ArrayList;
import java.util.List;

public class ExampleMain {
    public static void main(String[] args) {
        List<Car> example = new ArrayList<>();

        Car car1 = new Car("Volvo", 2021);
        Car car2 = new Car("Toyota", 2014);
        Car car3 = new Car("BMW", 2023);

        example.add(car1);
        example.add(car2);
        example.add(car3);

        System.out.println(example);

        for (Car i : example){
            System.out.println(i);
        }
    }
};