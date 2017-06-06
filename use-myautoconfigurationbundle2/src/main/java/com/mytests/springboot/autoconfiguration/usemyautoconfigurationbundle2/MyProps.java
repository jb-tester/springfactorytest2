package com.mytests.springboot.autoconfiguration.usemyautoconfigurationbundle2;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 6/1/2017.
 * Project: use-myautoconfigurationbundle2
 * *******************************
 */
@Component
@ConfigurationProperties(prefix = "myprops")
public class MyProps {
    String prop1;
    String prop2;
    boolean prop3;
    int prop4;
    String prop5;

    public String getProp1() {
        return prop1;
    }

    public void setProp1(String prop1) {
        this.prop1 = prop1;
    }

    public String getProp2() {
        return prop2;
    }

    public void setProp2(String prop2) {
        this.prop2 = prop2;
    }

    public boolean isProp3() {
        return prop3;
    }

    public void setProp3(boolean prop3) {
        this.prop3 = prop3;
    }

    public int getProp4() {
        return prop4;
    }

    public void setProp4(int prop4) {
        this.prop4 = prop4;
    }

    public String getProp5() {
        return prop5;
    }

    public void setProp5(String prop5) {
        this.prop5 = prop5;
    }
}
