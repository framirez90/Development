package org.certificatic.spring.core.practica2.test.bean;

import org.certificatic.spring.core.practica2.bean.HolaMundo;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class HolaMundoSpringTest3 {

	private static ApplicationContext factory;

	// Instanciar ApplicationContext Antes de ejecutar la clase de test
	@BeforeClass
	public static void beforeClass() {
		factory = new ClassPathXmlApplicationContext("spring/practica2/beans.xml");
	}

	@Test
	public void holaMundoSpringTest2() {
		log.info("holaMundoSpringTest2 -------------------------");

		HolaMundo holaMundo = (HolaMundo) factory.getBean("holaMundoBean");
		HolaMundo holaMundo2 = (HolaMundo) factory.getBean("holaMundoBean");
		HolaMundo holaMundo3 = (HolaMundo) factory.getBean("holaMundoBean");
		HolaMundo holaMundo4 = (HolaMundo) factory.getBean("holaMundoBean2");

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
