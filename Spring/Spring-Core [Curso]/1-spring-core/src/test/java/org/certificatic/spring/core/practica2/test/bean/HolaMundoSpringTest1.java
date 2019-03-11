package org.certificatic.spring.core.practica2.test.bean;

import org.certificatic.spring.core.practica2.bean.HolaMundo;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import lombok.extern.slf4j.Slf4j;

@SuppressWarnings("deprecation")
@Slf4j
public class HolaMundoSpringTest1 {

	@Test
	public void holaMundoNoSpringTest() {
		log.info("holaMundoNoSpringTest -------------------------");

		String ruta = "spring/practica2/beans.xml";

		// Implementar IoC con BeanFactory
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource(ruta));
		
		HolaMundo holaMundo = (HolaMundo) factory.getBean("holaMundoBean");
		HolaMundo holaMundo2 = (HolaMundo) factory.getBean("holaMundoBean");
		HolaMundo holaMundo3 = (HolaMundo) factory.getBean("holaMundoBean");

		log.info("holaMundo: {}", holaMundo);
		
		holaMundo.setMensaje("lola");
		
		log.info("holaMundo3: {}", holaMundo3);

		Assert.assertNotNull(holaMundo);
		Assert.assertNotNull(holaMundo.getMensaje());
		
		Assert.assertSame(holaMundo, holaMundo2);
		Assert.assertSame(holaMundo2, holaMundo3);
		Assert.assertSame(holaMundo, holaMundo3);

	}
}
