package pl.pjakt.luk;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RentalStorage {

    private List<Rental> rentalList = new ArrayList<>();

    public RentalStorage() {
        rentalList.add(new Rental(new User("1"), new Car("asd", "ad", "asd" , Standard.MEGA)));

    }

    public List<Rental> getRentalList() {
        return rentalList;
    }
}
