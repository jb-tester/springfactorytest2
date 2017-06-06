package com.mytests.springBoot.autoconfiguration.myAutoConfigurationBundle2.configs;

import com.mytests.springBoot.autoconfiguration.myAutoConfigurationBundle2.beans.Bean6;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 6/1/2017.
 * Project: myAutoConfigurationBundle2
 * *******************************
 */
@Configuration
@ConditionalOnProperty(name = "myprops.prop5", havingValue = "prop5_value", matchIfMissing = true)
public class C4 {
    @Bean
    public Bean6 c4_bean6() {
        return new Bean6("c4_bean6");
    }
}
