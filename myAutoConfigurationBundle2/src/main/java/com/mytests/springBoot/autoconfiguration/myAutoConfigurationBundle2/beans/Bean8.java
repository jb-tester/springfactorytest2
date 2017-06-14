package com.mytests.springBoot.autoconfiguration.myAutoConfigurationBundle2.beans;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 6/14/2017.
 * Project: springfactorytest2
 * *******************************
 */
public class Bean8 {
    private final String id;

    @Override
    public String toString() {
        return id;
    }

    public Bean8(String id) {
        this.id=id;
    }
}
