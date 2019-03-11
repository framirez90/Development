package org.certificatic.spring.core.practica2.test.bean;

import org.certificatic.spring.core.practica2.bean.HolaMundo;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class HolaMundoSpringTest2 {


	@Test
	public void holaMundoSpringTest2() {
		log.info("holaMundoSpringTest2 -------------------------");
		
		String ruta = "spring/practica2/beans.xml";
		
		// Implementar IoC con ApplicationContext
		ApplicationContext context = new ClassPathXmlApplicationContext(ruta);
		
		HolaMundo holaMundo = (HolaMundo) context.getBean("holaMundoBean");
		HolaMundo holaMundo2 = (HolaMundo) context.getBean("holaMundoBean");
		HolaMundo holaMundo3 = (HolaMundo) context.getBean("holaMundoBean");
		HolaMundo holaMundo4 = (HolaMundo) context.getBean("holaMundoBean2");

		log.info("holaMundo: {}", holaMundo);
		
		holaMundo.setMensaje("lola");
		
		log.info("holaMundo3: {}", holaMundo3);

		Assert.assertNotNull(holaMundo);
		Assert.assertNotNull(holaMundo.getMensaje());
		Assert.assertNotNull(holaMundo4);
		Assert.assertNotNull(holaMundo4.getMensaje());
		
		Assert.assertSame(holaMundo, holaMundo2);
		Assert.assertSame(holaMundo2, holaMundo3);
		Assert.assertSame(holaMundo, holaMundo3);
		Assert.assertNotSame(holaMundo, holaMundo4);

	}
	

}
