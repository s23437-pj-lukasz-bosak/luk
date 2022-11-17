package pl.pjakt.luk;

public class Car {
    private String carName;

    private String carModel;
    private String vinNumber;
    private Standard standard;


    public Car(String carName, String carModel, String vinNumber, Standard standard) {
        this.carName = carName;
        this.carModel = carModel;
        this.vinNumber = vinNumber;
        this.standard = standard;
    }


    public String getCarName() {
        return carName;
    }

    public String getCarModel() {
        return carModel;
    }

    public String getVinNumber() {
        return vinNumber;
    }

    public Standard getStandard() {
        return standard;
    }

    @Override
    public String toString() {
        return "Car{" +
                " carName='" + carName + '\'' +
                ", carModel='" + carModel + '\'' +
                ", vinNumber='" + vinNumber + '\'' +
                ", standard=" + standard +
                '}';
    }
}
