package be.pxl.java.InnerClasses.opdracht1;

import java.util.ArrayList;

public class Gearbox {
    private int maxGears;
    private boolean clutchsln;
    private ArrayList<Gear> gears = new ArrayList<>();

    public Gearbox(int maxGears) {
        this.maxGears = maxGears;
        for(int i = 0; i<maxGears; i++){
            gears.add(new Gear(i+1));
        }
    }

    public void operateClutch(boolean clutch){
        clutchsln = clutch;
    }

    private class Gear {
        private int gearNumber;
        private double ratio;

        public Gear(int gearNumber) {
            this.gearNumber = gearNumber;

        }

        public double driveSpeed(int revs){
            return ratio * revs;
        }


    }

    public void addGear(Gear gear){
        gears.add(gear);
    }
}
