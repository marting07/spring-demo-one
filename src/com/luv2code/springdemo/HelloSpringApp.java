/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author marting
 */
public class HelloSpringApp {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context
            = new ClassPathXmlApplicationContext("applicationContext.xml");
        Coach theCoach = context.getBean("myCoach", Coach.class);
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());
        context.close();
    }
}