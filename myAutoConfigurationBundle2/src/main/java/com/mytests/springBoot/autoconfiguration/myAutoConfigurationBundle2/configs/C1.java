package com.mytests.springBoot.autoconfiguration.myAutoConfigurationBundle2.configs;

import com.mytests.springBoot.autoconfiguration.myAutoConfigurationBundle2.beans.Bean1;
import com.mytests.springBoot.autoconfiguration.myAutoConfigurationBundle2.beans.Bean2;
import com.mytests.springBoot.autoconfiguration.myAutoConfigurationBundle2.beans.Bean3;
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
@ConditionalOnProperty(name = "myprops.prop1")
public class C1 {
    @Bean(name = "c1_bean1_on_myprops.prop1")
    public Bean1 bean1() {
        return new Bean1();
    }
    @Configuration
    static class C1_Inner1 {

        @Bean(name = "c1_inner_bean2")
        public Bean2 bean2() {
            return new Bean2("c1_inner_bean2");
        }
    }

    static class C1_Inner2 {

        @Bean(name = "c1_inner2_bean2")
        public Bean2 bean2() {
            return new Bean2("c1_inner2_bean2");
        }
    }

    @Configuration
    @ConditionalOnProperty("myprops.prop2")
    static class C1_Inner3 {

        @Bean(name = "c1_inner3_bean2")
        public Bean2 bean2() {
            return new Bean2("c1_inner3_bean2");
        }

        @Bean
        public Bean3 bean3() {
            return new Bean3("c1_inner3_bean4");
        }
    }

    @ConditionalOnProperty("myprops.prop2")
    static class C1_Inner4 {

        @Bean(name = "c1_inner4_bean2")
        public Bean2 bean2() {
            return new Bean2("c1_inner4_bean2");
        }
    }
}
