package com.example.rogovskih.kotlinplayground;

import com.example.rogovskih.kotlinplayground.spices.Curry;
import com.example.rogovskih.kotlinplayground.spices.Spice;
import com.example.rogovskih.kotlinplayground.spices.SpiceContainer;
import org.junit.Test;

public class SpicesTest {
    @Test
    public void test(){
        SpiceContainer container1 = new SpiceContainer(new Curry());
        System.out.println(container1.getLabel());
    }
}
