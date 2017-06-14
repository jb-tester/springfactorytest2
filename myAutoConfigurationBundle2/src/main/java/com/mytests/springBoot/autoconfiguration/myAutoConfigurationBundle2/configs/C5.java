package com.mytests.springBoot.autoconfiguration.myAutoConfigurationBundle2.configs;

import com.mytests.springBoot.autoconfiguration.myAutoConfigurationBundle2.beans.Bean7;
import com.mytests.springBoot.autoconfiguration.myAutoConfigurationBundle2.beans.Bean8;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 6/14/2017.
 * Project: springfactorytest2
 * *******************************
 */
@Configuration
@ConditionalOnProperty(name = {"myprops2.prop1","myprops2.prop2","myprops2.prop3"})
public class C5 {

    @Bean
    public Bean8 bean8() {
        return new Bean8("bean8_from_C5: present if properties myprops2.prop1, myprops2.props2 and myprops2.props3 are defined");
    }


}
