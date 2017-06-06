package com.mytests.springboot.autoconfiguration.usemyautoconfigurationbundle2;

import com.mytests.springBoot.autoconfiguration.myAutoConfigurationBundle2.beans.Bean6;
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
public class C4_Tests {
    @Autowired
    private Environment environment;

    @Autowired(required = false)
    private Bean6 c4_bean6;

    @Test
    public void testBean4() throws Exception {
        String prop5 = environment.getProperty("myprops.prop5");
        System.out.println(prop5);
        if (c4_bean6 == null) {
            System.out.println("c4_bean6 is not available");
        }
        else{System.out.println(c4_bean6.toString());}
        if((Objects.equals(prop5, "prop5_value"))||(prop5==null)){
            System.out.println("myprops.prop5 = prop5_value or is not set, c4_bean6 is available");
            Assert.assertNotNull("if myprops.prop5 = prop5_value or not set, c4_bean6 should be available",c4_bean6 );}
        else {
            System.out.println("myprops.prop5 != prop5_value, c4_bean6 is not available");
            Assert.assertNull("if myprops.prop5 != prop5_value, c4_bean6 should not be available",c4_bean6);}
    }
}
