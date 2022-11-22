package Location;

import Buildings.Buildings;

import java.util.ArrayList;

public class London {

    private String name;
    private String name1;


    private ArrayList<Buildings> buildings;

    public London(String name, String name1) {
        this.name = name;
        this.name1 = name1;
        this.buildings = new ArrayList<>();
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName1(){
        return name1;}

    public void setName1(String name){
        this.name1 = name1;
    }

    public ArrayList<Buildings> getBuildings() {
        return buildings;
    }

    public void setBuildings(ArrayList<Buildings> buildings) {
        this.buildings = buildings;
    }

    public int countBuildings(){
        return this.buildings.size();
    }

    public void addBuildings(Buildings buildings){
        this.buildings.add(buildings);
    }
}
