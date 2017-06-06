package com.mytests.springBoot.autoconfiguration.myAutoConfigurationBundle2.beans;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 6/1/2017.
 * Project: myAutoConfigurationBundle2
 * *******************************
 */
public class Bean2 {
    @Override
    public String toString() {
        return  id ;
    }

    private final String id;

    public Bean2(String id) {
        this.id = id;
    }
}
