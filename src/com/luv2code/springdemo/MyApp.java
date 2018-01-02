/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.luv2code.springdemo;

/**
 *
 * @author marting
 */
public class MyApp {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Coach theCoach = new TrackCoach();
        System.out.println(theCoach.getDailyWorkout());
    }
}
