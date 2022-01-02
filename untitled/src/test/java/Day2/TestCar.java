package Day2;

public class TestCar {
    public static void main(String[] args) {
        Car BWM = new Car();

        BWM.setDoor("4");
        BWM.setLicense("ABC");
        BWM.setEngine("abc");
        BWM.setSeat("4");
        BWM.setWheel("4");

        BWM.getDoor();
        BWM.getLicense();
        BWM.getEngine();
        BWM.getSeat();
        BWM.getWheel();
    }
}

