package com.mytests.springboot.autoconfiguration.usemyautoconfigurationbundle2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;

@SpringBootApplication//(exclude = {C0.class, C5.class})
//@SpringBootApplication(excludeName = {"com.mytests.springBoot.autoconfiguration.myAutoConfigurationBundle2.configs.C0","com.mytests.springBoot.autoconfiguration.myAutoConfigurationBundle2.configs.C5"})
@EnableConfigurationProperties
public class UseMyautoconfigurationbundle2Application implements CommandLineRunner{

	@Autowired private ApplicationContext ctx;

	public static void main(String[] args) {
		SpringApplication.run(UseMyautoconfigurationbundle2Application.class, args);
	}

	@Override
	public void run(String... strings) throws Exception {
		String[] beans = ctx.getBeanDefinitionNames();
		System.out.println("**************************************************************************");
		for (String _bean : beans) {
			System.out.println(_bean);
		}
		System.out.println("**************************************************************************");
	}
}
