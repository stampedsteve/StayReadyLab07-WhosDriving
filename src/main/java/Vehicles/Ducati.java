package Vehicles;

import Driving.Bike;

public class Ducati extends Bike {
    int PSI = 30;
    int oldAge = 3;
    /**
     * The top speed of a mountain bike should be 28.5
     * but for every 1 PSI under the recommended tire
     * pressure the tires of the bike are, the top
     * speed should be reduced 1mph.
     *
     * @return 28.5 minus any reduction to top speed
     * Ducati loses 5mph off it's top speed per year owned
     */
    //@Override
    public Double getTopSpeed() {
        int penalty = 30 - getTirePressure() - oldAge*5;
        return 28.5 - penalty;
    }


    /**
     * transport should calculate the time it takes in
     * seconds to travel a distance base on the top
     * speed and update the tire pressure. Long trips
     * on a mountain bike will reduce its PSI, so for
     * every 30 miles traveled in a single trip, the
     * tires of the bike should reduce 1 PSI until
     * the tires register 20 PSI where no more air
     * will be lost on trips.
     *
     * @param distance - length of travel in miles
     * @return time in seconds to travel distance
     */
    //@Override
    public Integer transport(Double distance) {
        Integer time =(int) (distance / getTopSpeed());
        int pressurePenalty = (int)(distance / 30);
        if(PSI - pressurePenalty < 20){
            PSI = 20;
        }
        else{
            PSI = PSI - pressurePenalty;
        }
        return time*60*60;
    }

    /**
     * Gets the current amount of pressure in PSI
     * in the tires
     *
     * @return PSI as Integer
     */
    @Override
    public Integer getTirePressure() {
        return PSI;
    }

    /**
     * Returns the tires to the recommended PSI
     */
    @Override
    public void inflateTires() {
        PSI = 30;
    }

    /**
     * The Recommended PSI of a mountain bike is 30
     * @return recommended PSI
     */
    @Override
    public Integer recommendedTirePressure() {
        return 30;
    }
}
