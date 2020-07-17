package Driving;

public class Teleporter implements Drivable{

    int lifespan = 80;
    Double distance = 0.0;
 

    public Double getTopSpeed() {
        
        return 3000000.0;
        //The speed of light
    }

    public Integer transport(Double distance) {
        this.distance += distance;
        lifespan -= 10;
        return lifespan;
    }
    
}