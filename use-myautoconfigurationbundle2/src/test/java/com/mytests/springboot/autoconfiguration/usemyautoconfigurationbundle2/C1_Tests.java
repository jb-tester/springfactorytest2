package com.mytests.springboot.autoconfiguration.usemyautoconfigurationbundle2;

import com.mytests.springBoot.autoconfiguration.myAutoConfigurationBundle2.beans.Bean1;
import com.mytests.springBoot.autoconfiguration.myAutoConfigurationBundle2.beans.Bean2;
import com.mytests.springBoot.autoconfiguration.myAutoConfigurationBundle2.beans.Bean3;
import com.mytests.springBoot.autoconfiguration.myAutoConfigurationBundle2.configs.C1;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class C1_Tests {

	@Autowired
	private Environment environment;

	@Autowired(required = false)
	@Qualifier("c1_bean1_on_myprops.prop1")
	private Bean1 c1_bean1_on_myprops_prop1; // from top-level config, conditional on myprops.prop1 presence

	@Autowired(required = false)
	@Qualifier("c1_inner_bean2")
	private Bean2 c1_inner_bean2; // from @Configuration-annotated inner config with no extra @Conditional annotations

	@Autowired(required = false)
	@Qualifier("c1_inner2_bean2")
	private Bean2 c1_inner2_bean2; // from inner config with no extra @Conditional annotations and no @Configuration annotation

	@Qualifier("c1_inner3_bean2")
	@Autowired(required = false)
	private Bean2 c1_inner3_bean2; // from @Configuration-annotated inner config conditional on myprops.prop2 also presence
	@Autowired(required = false)
	private Bean3  c1_inner3_bean3; // from @Configuration-annotated inner config conditional on myprops.prop2 also presence

	@Qualifier("c1_inner4_bean2")
	@Autowired(required = false)
	private Bean2 c1_inner4_bean2;// from inner config conditional on myprops.prop2 also presence and without @Configuration annotation

	@Test
	public void testC1() {
		String prop1 = environment.getProperty("myprops.prop1");
		if(prop1!=null){
		Assert.assertNotNull("if myprops.prop1 is set, bean c1_bean1_on_myprops.prop1 should be available",c1_bean1_on_myprops_prop1 );}
		else {Assert.assertNull("if myprops.prop1 is not set, bean c1_bean1_on_myprops.prop1 should not be available",c1_bean1_on_myprops_prop1);}
	}

	@Test
	public void testC1_Inner() throws Exception {
		String prop1 = environment.getProperty("myprops.prop1");
		if(prop1!=null){
		Assert.assertNotNull("if myprops.prop1 is set, bean c1_inner_bean2 should be available",c1_inner_bean2 );}
		else{Assert.assertNull("if myprops.prop1 is not set, bean c1_inner_bean2 should not be available",c1_inner_bean2);}
	}

	@Test
	public void testC1_Inner2() throws Exception {
		String prop1 = environment.getProperty("myprops.prop1");
		if(prop1!=null){
			Assert.assertNotNull("if myprops.prop1 is set, bean c1_inner2_bean2 should be available",c1_inner2_bean2 );}
		else{Assert.assertNull("if myprops.prop1 is not set, bean c1_inner2_bean2 should not be available",c1_inner2_bean2);}
	}

	@Test
	public void testC1_Inner3() throws Exception {
		String prop1 = environment.getProperty("myprops.prop1");
		String prop2 = environment.getProperty("myprops.prop2");
		System.out.println("properties required for C1_Inner3 beans: "+prop1+", "+prop2);
		if((prop1!=null)&&(prop2!=null)){
			Assert.assertNotNull("if myprops.prop1 and myprops.prop2 are set, bean c1_inner3_bean2 should be available",c1_inner3_bean2 );
		    Assert.assertNotNull(c1_inner3_bean3 );
			System.out.println("beans from C1_Inner3 are available");
		}
		else{Assert.assertNull("if myprops.prop1 and myprops.prop2 are not set, bean c1_inner3_bean2 should not be available",c1_inner3_bean2);
		Assert.assertNull(c1_inner3_bean3);
			System.out.println("beans from C1_Inner3 are not available");}
	}
	@Test
	public void testC1_Inner4() throws Exception {
		String prop1 = environment.getProperty("myprops.prop1");
		String prop2 = environment.getProperty("myprops.prop2");
		System.out.println("properties required for C1_Inner4 beans: "+prop1+", "+prop2);
		if((prop1!=null)&&(prop2!=null)){
			System.out.println("beans from C1_Inner4 are available");
			Assert.assertNotNull("if myprops.prop1 and myprops.prop2 are set, bean c1_inner4_bean2 should be available",c1_inner4_bean2 );}
		else{
			System.out.println("beans from C1_Inner4 are not available");
			Assert.assertNull("if myprops.prop1 and myprops.prop2 are not set, bean c1_inner4_bean2 should not be available",c1_inner4_bean2);}
	}
}
