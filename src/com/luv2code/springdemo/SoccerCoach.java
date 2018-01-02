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
public class SoccerCoach implements Coach {
    private FortuneService fortuneService;

    public SoccerCoach() {
        System.out.println("Soccer constructor: inside no-arg constructor");
    }

    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("Soccer setter method: setFortuneService");
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Run 10k and practice base technics";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
