package Buildings;

import Interfaces.ILocation;

public abstract class StudentFlat extends Buildings implements ILocation {

    private boolean partyFriendly;

    private String getLocation;

    public StudentFlat(int numberOfRooms, String dateOfConstruction, boolean partyFriendly) {
        super(numberOfRooms, dateOfConstruction);
        this.partyFriendly = partyFriendly;
    }

    public boolean getPartyFriendly() {
        return this.partyFriendly;
    }

    public void setPartyFriendly(boolean partyFriendly) {
        this.partyFriendly = partyFriendly;
    }

   public String StudentFlatLocation(){
        return String.format("%s the location of this.", getLocation);
   }



}


