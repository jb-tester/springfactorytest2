package com.mytests.springboot.autoconfiguration.usemyautoconfigurationbundle2;

import com.mytests.springBoot.autoconfiguration.myAutoConfigurationBundle2.beans.Bean7;
import com.mytests.springBoot.autoconfiguration.myAutoConfigurationBundle2.beans.Bean9;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 6/14/2017.
 * Project: springfactorytest2
 * *******************************
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class C6_Tests {

    @Autowired
    private Environment environment;

    @Autowired(required = false)
    private Bean7 bean7;

    @Autowired(required = false)
    private Bean9 bean9;


    @Test
    public void testBean7() throws Exception {
        System.out.println(environment.getProperty("myprops2.prop1"));
        System.out.println(bean7 == null ? "bean7 is not available" : bean7.toString());
        Assert.assertNotNull("bean7 is not available",bean7);
    }

    @Test
    public void testBean9() throws Exception {
        System.out.println(environment.getProperty("myprops2.prop1"));
        System.out.println(environment.getProperty("myprops2.prop2"));
        System.out.println(bean9 == null ? "bean9 is not available" : bean9.toString());
        Assert.assertNotNull("bean9 is not available",bean9);
    }
}
