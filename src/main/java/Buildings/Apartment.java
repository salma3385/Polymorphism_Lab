package Buildings;

public class Apartment extends Buildings {

    private int numberOfLevels;

    public Apartment(int numberOfRooms, String dateOfConstruction, int numberOfLevels) {
        super(numberOfRooms, dateOfConstruction);
        this.numberOfLevels = numberOfLevels;

    }

    public int getNumberOfLevels() {
        return (this.numberOfLevels);
    }


    @Override
    public String dateOfConstruction() {
        return "07/11/2008";

    }
}
