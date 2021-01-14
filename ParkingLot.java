
public class ParkingLot{
  private int numCars;
  public static final int MAX_CARS = 2500;

  public ParkingLot(){
    numCars=0;
  }

  public ParkingLot(int initNumCars){
    numCars=initNumCars;
  }

  public int getNumCars()
  {
    return numCars;
  }

  public void setNumCars(int theNumCars)
  {
    if(theNumCars<=MAX_CARS&&theNumCars>0)
    numCars = theNumCars;
  }
  
  public String toString(){
    return "Number of cars is " + numCars;

  }

  public boolean equals(Object other){
    ParkingLot p = (ParkingLot)other;
    return (p.getNumCars() == this.numCars);
  }
}
