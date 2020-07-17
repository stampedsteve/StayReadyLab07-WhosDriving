package Vehicles;

import Driving.Car;

public class I8 extends Car {
    int distance = 0;
    int ndistance = 0;
    int value = 150000;
    /**
     * A I8 loses $20,000 of value per 5k miles
     *
     * @return true if an oil change is needed
     */
    @Override
    public Boolean needsOilChange() {
        if(ndistance >= 50000){
            return true;
        }
        return false;
    }

    /**
     * This method should reset any flags set
     * from when an oil change was needed. It
     * should also indicate that another 50,000
     * miles may be traveled before another oil
     * change is needed.
     */
    @Override
    public void changeOil() {
        ndistance = 0;
    }

    /**
     * the check engine light should be on whenever
     * something is wrong with the car. This class
     * simply turns on the light when an oil change
     * is needed.
     * @return true if anything is wrong with the car
     */
    @Override
    public Boolean checkEngineLight() {
        if(needsOilChange() == true){
            return true;
        }
        return false;
    }

    /**
     * This method should return the total distance
     * traveled by the car. This number can never
     * decrease, so every time it is called the newest
     * value returned should be equal to or higher
     * than all previous values.
     * @return total distance as a Double
     */
    @Override
    public Double getDistanceTraveled() {
        return distance + 0.0;
    }

    /**
     * Should return the top speed for a Civic (70 MPH)
     * @return 70.0
     */
    
    public Double getTopSpeed() {
        return 70.0;
    }

    public Double getValue(){
        return value - ((getDistanceTraveled()/5000) * 20000);
    }

    /**
     * transport should calculate the time it takes in
     * seconds to travel a distance base on the top
     * speed and update the amount of miles traveled.
     *
     * @param distance - length of travel in miles
     * @return time in seconds to travel distance
     */
    //@Override
    public Integer transport(Double distance) {
        this.distance += distance;
        ndistance += distance;
        Integer time = (int) (distance / getTopSpeed());

        return time *60 * 60;
    }
}
