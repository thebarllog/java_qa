package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTests {

    @Test
    public void distance(){

        Point tp1 = new Point(2, 3);
        Point tp2 = new Point(6, 7);

        Assert.assertEquals(tp1.distance(tp2),6.0);

    }
}
