package com.mytests.springBoot.autoconfiguration.myAutoConfigurationBundle2.configs;

import com.mytests.springBoot.autoconfiguration.myAutoConfigurationBundle2.beans.Bean10;
import com.mytests.springBoot.autoconfiguration.myAutoConfigurationBundle2.beans.Bean7;
import com.mytests.springBoot.autoconfiguration.myAutoConfigurationBundle2.beans.Bean9;
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
@ConditionalOnClass(name = {"utils.C6Class1","utils.C6Class2"})
@ConditionalOnProperty(prefix = "myprops2.", name = "prop1")
public class C6 {

    @Bean
    public Bean7 bean7() {
        return new Bean7("bean7_from_C6: present if classes utils.C6Class1, utils.C6Class2 and property myprops2.prop1 is defined");
    }

    @Configuration
    @ConditionalOnProperty(prefix = "myprops2", value = "prop2")
    @ConditionalOnClass(name = "utils.C6Class3")
    public static class C6_Inner1{

        @Bean
        public Bean9 bean9() {
            return new Bean9("bean9_from_C6: present if classes utils.C6Class1, utils.C6Class2, utils.C6Class3 and properties myprops2.prop1, myprops2.prop2 are defined");
        }

        @Configuration
        @ConditionalOnProperty(prefix = "myprops2", name = "prop3", havingValue = "prop3")
        public static class C6_Inner2{

            @Bean
            public Bean10 bean10() {
                return new Bean10("bean10_from_C6: present if classes utils.C6Class1, utils.C6Class2, utils.C6Class3 and properties myprops2.prop1, myprops2.prop2, myprops2.prop3 are defined and later one has value 'prop3'");
            }
        }
    }

}
