package com.mytests.springBoot.autoconfiguration.myAutoConfigurationBundle2.configs;

import com.mytests.springBoot.autoconfiguration.myAutoConfigurationBundle2.beans.Bean0;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 6/14/2017.
 * Project: springfactorytest2
 * *******************************
 */
@Configuration
public class C0 {

    @Bean(name = "bean00")
    public Bean0 bean00() {
        return new Bean0("bean0 from C0");
    }

    @Configuration
    static class C0_Inner1{
        @Bean(name = "bean01")
        public Bean0 bean00() {
            return new Bean0("bean0 from C0_Inner1");
        }

        @Configuration
        static class C0_Inner2{
            @Bean(name = "bean02")
            public Bean0 bean00() {
                return new Bean0("bean0 from C0_Inner2");
            }
        }
    }
}
