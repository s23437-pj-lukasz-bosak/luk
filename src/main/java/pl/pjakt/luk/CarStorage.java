package pl.pjakt.luk;


import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarStorage {

    private List<Car> carList = new ArrayList<>();


    public CarStorage() {
        carList.add(new Car("Vw", "passat", "12312312" , Standard.PREMIUM));


    }

    public List<Car> getCarList() {
        return carList;
    }
}
