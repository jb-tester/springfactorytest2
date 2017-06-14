package com.mytests.springboot.autoconfiguration.usemyautoconfigurationbundle2;

import com.mytests.springBoot.autoconfiguration.myAutoConfigurationBundle2.beans.Bean7;
import com.mytests.springBoot.autoconfiguration.myAutoConfigurationBundle2.beans.Bean8;
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
public class C5_Tests {

    @Autowired
    private Environment environment;

    @Autowired(required = false)
    private Bean8 bean8;

    @Test
    public void testBean7() throws Exception {
        System.out.println(environment.getProperty("myprops2.prop1"));
        System.out.println(environment.getProperty("myprops2.prop2"));
        System.out.println(environment.getProperty("myprops2.prop3"));
        System.out.println(bean8 == null ? "bean8 is not available" : bean8.toString());
        Assert.assertNotNull("bean8 is not available",bean8);
    }
}
