package com.mytests.springBoot.autoconfiguration.myAutoConfigurationBundle2.beans;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 6/1/2017.
 * Project: myAutoConfigurationBundle2
 * *******************************
 */
public class Bean3 {
    private final String id;

    public Bean3(String id) {
        this.id=id;
    }

    @Override
    public String toString() {
        return id;
    }
}
