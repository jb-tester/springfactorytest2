package com.mytests.springBoot.autoconfiguration.myAutoConfigurationBundle2.configs;

import com.mytests.springBoot.autoconfiguration.myAutoConfigurationBundle2.beans.Bean5;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 6/1/2017.
 * Project: myAutoConfigurationBundle2
 * *******************************
 */
@ConditionalOnProperty(name = "myprops.prop4", havingValue="100")
public class C3 {
    @Bean(name="c3_bean5")
    public Bean5 bean5() {
        return new Bean5();
    }
}
