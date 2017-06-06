package com.mytests.springboot.autoconfiguration.usemyautoconfigurationbundle2;

import com.mytests.springBoot.autoconfiguration.myAutoConfigurationBundle2.beans.Bean4;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Objects;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 6/1/2017.
 * Project: use-myautoconfigurationbundle2
 * *******************************
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class C2_Tests {

    @Autowired
    private Environment environment;

    @Autowired(required = false)
    private Bean4 c2_bean4;

    @Test
    public void testBean4() throws Exception {
        String prop3 = environment.getProperty("myprops.prop3");
        System.out.println(prop3);
        if (c2_bean4 == null) {
            System.out.println("c2_bean4 not available");
        }
        else{System.out.println( c2_bean4.toString());}
        if(Objects.equals(prop3, "true")){
            System.out.println("myprops.prop3 = true, c2_bean4 is available");
            Assert.assertNotNull("if myprops.prop3 = true, c2_bean4 should be available",c2_bean4 );}
        else {
            System.out.println("myprops.prop3 != true, c2_bean4 is not available");
            Assert.assertNull("if myprops.prop3 = false, c2_bean4 should not be available",c2_bean4);}
    }
}
