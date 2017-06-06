package com.mytests.springboot.autoconfiguration.usemyautoconfigurationbundle2;

import com.mytests.springBoot.autoconfiguration.myAutoConfigurationBundle2.beans.Bean4;
import com.mytests.springBoot.autoconfiguration.myAutoConfigurationBundle2.beans.Bean5;
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
public class C3_Tests {
    @Autowired
    private Environment environment;

    @Autowired(required = false)
    private Bean5 c3_bean5;

    @Test
    public void testBean4() throws Exception {
        String prop4 = environment.getProperty("myprops.prop4");
        System.out.println(prop4);
        if (c3_bean5 == null) {
            System.out.println("c3_bean5 is not available");
        }
        else{System.out.println(c3_bean5.toString());}
        if(Objects.equals(prop4, "100")){
            System.out.println("myprops.prop4 = 100, c3_bean5 is available");
            Assert.assertNotNull("if myprops.prop4 = 100, c3_bean5 should be available",c3_bean5 );}
        else {
            System.out.println("myprops.prop4 != 100, c3_bean5 is not available");
            Assert.assertNull("if myprops.prop4 != 100, c3_bean5 should not be available",c3_bean5);}
    }
}
