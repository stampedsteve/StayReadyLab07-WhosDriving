package Vehicles;

import org.junit.Assert;
import org.junit.Test;

import Driving.Teleporter;

public class TeleporterTest {
    @Test
    public void topSpeedTest(){
        //Given
        Teleporter t = new Teleporter();
        //When
        Double expected = 3000000.0;
        Double actual = t.getTopSpeed();
        //Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void transportTest(){
        //Given
        Teleporter t = new Teleporter();
        //When
        Integer expected = 70;
        Integer actual = t.transport(20.0);
        //Then
        Assert.assertEquals(expected, actual);
    }
}