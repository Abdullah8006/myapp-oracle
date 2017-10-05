package com.appster.abdullah.util.Generics;

public class MountainVehicle implements Vehicle {

    private String name;

    public MountainVehicle(String name, int chasisNumber) {
        super();
        this.name = name;
        this.chasisNumber = chasisNumber;
    }

    private int chasisNumber;

    @Override
    public int getChasis() {
        return this.chasisNumber;
    }

    @Override
    public String getName() {
        return this.name;
    }

}
