package com.mytests.springBoot.autoconfiguration.myAutoConfigurationBundle2.beans;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 6/1/2017.
 * Project: myAutoConfigurationBundle2
 * *******************************
 */
public class Bean6 {
    private final String id;

    @Override
    public String toString() {
        return id;
    }

    public Bean6(String id) {
        this.id=id;
    }
}
