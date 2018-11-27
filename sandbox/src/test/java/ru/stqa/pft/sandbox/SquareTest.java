package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;


public class SquareTest {

    @Test
    public void TestArea(){
        Square s = new Square(5);
        Assert.assertEquals(s.area(), 25.0);
    }
}
