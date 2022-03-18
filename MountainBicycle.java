public class MountainBicycle extends Bicycle {
    // adds one field
    public int heigth;
    // has one constructor
    public MountainBicycle(int startHeigth,int startCadence,int startGear,int startSpeed) {
        // access super class constructor
        super(startCadence,startGear,startSpeed);
        heigth=startHeigth;
    }
    // adds one method
    public void setHeigth(int newValue){
            heigth=newValue;
    }

}
