public class Bicycle { // superclass
    // has a three fields
    public int cadence;
    public int gear;
    public int speed;
    // has a one constructor
    public Bicycle(int startCadence,int startGear,int startSpeed){
        gear=startGear;
        cadence=startCadence;
        speed=startSpeed;
    }
    // has a four methods
    public void setCadence(int newValue){
        cadence=newValue;
    }
    public void  setGear(int newValue){
        gear=newValue;
    }
    public void applyBrake(int decrement){
        speed-=decrement;
    }
    public void speedUp(int increment){
        speed+=increment;
    }

}
