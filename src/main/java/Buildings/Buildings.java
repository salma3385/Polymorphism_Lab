package Buildings;

public abstract class Buildings  {
    protected Object getLocation;
    private int numberOfRooms;
    private String dateOfConstruction;
    private Object businessName;

    // Constructor

    public Buildings( int numberOfRooms, String dateOfConstruction ){
        this.numberOfRooms = numberOfRooms;
        this.dateOfConstruction = dateOfConstruction;
    }
    //Getters and Setters
    public int getNumberOfRooms(){
        return numberOfRooms;
    }
    public void setNumberOfRooms(){
        this.numberOfRooms = numberOfRooms;
    }
    public String getDateOfConstruction(){
        return dateOfConstruction;
    }
    public void setDateOfConstruction(){
        this.dateOfConstruction = dateOfConstruction;
    }


    public abstract String dateOfConstruction();
}



