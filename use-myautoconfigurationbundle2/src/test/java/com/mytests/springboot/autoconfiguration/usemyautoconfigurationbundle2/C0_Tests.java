package com.mytests.springboot.autoconfiguration.usemyautoconfigurationbundle2;

import com.mytests.springBoot.autoconfiguration.myAutoConfigurationBundle2.beans.Bean0;
import com.mytests.springBoot.autoconfiguration.myAutoConfigurationBundle2.beans.Bean8;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
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
public class C0_Tests {

    @Qualifier("bean00") @Autowired private Bean0 bean00;

    @Qualifier("bean01") @Autowired private Bean0 bean01;

    @Qualifier("bean02") @Autowired private Bean0 bean02;

    @Test
    public void testBean7() throws Exception {

        System.out.println(bean00 == null ? "bean00 is not available" : bean00.toString());
        Assert.assertNotNull("bean00 is not available",bean00);
        System.out.println(bean01 == null ? "bean01 is not available" : bean01.toString());
        Assert.assertNotNull("bean01 is not available",bean01);
        System.out.println(bean02 == null ? "bean02 is not available" : bean02.toString());
        Assert.assertNotNull("bean02 is not available",bean02);
    }
}
