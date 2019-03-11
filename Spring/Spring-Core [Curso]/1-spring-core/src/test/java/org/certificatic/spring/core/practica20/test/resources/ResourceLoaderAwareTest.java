package org.certificatic.spring.core.practica20.test.resources;

import javax.inject.Inject;

import org.certificatic.spring.core.practica20.resources.bean.BeanResourceLoaderAware;
import org.certificatic.spring.core.practica20.test.resources.utils.ResourcesTestUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.core.io.Resource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.slf4j.Slf4j;

@Slf4j
// Implementar run with spring-test
@RunWith(SpringJUnit4ClassRunner.class)
// cargar context configuration
@ContextConfiguration(locations = ResourceLoaderAwareTest.location)
public class ResourceLoaderAwareTest {

	public static final String location = "classpath:/spring/practica20/resources-application-context.xml";

	// Inyectar
	@Inject
	private BeanResourceLoaderAware beanResourceLoaderAware;

	@Test
	public void loadTextFileResourceLoaderAwareTest() {

		log.info("loadTextFileResourceLoaderAwareTest -------------------");

		// loadTextFile
		Resource resource = beanResourceLoaderAware.getResourceLoader().getResource(
				"file:c:/certificatic-resources/my-text-file.txt");

		// loadTextFile from resource
		ResourcesTestUtils.loadTextFile(resource);
	}

	@Test
	public void loadPropertiesResourceLoaderAwareTest() {

		log.info("loadPropertiesResourceLoaderAwareTest -------------------");

		// loadPropertiesFile
		Resource resource = beanResourceLoaderAware.getResourceLoader().getResource(
				"spring/practica20/my-properties.properties");

		// loadPropertiesFile from resource
		ResourcesTestUtils.loadPropertiesFile(resource);
	}

	@Test
	public void loadUrlFileResourceLoaderAwareTest() {

		log.info("loadUrlFileResourceLoaderAwareTest -------------------");

		// loadURLFile
		Resource resource = beanResourceLoaderAware.getResourceLoader().getResource(
				"http://spring.io/");

		// loadURLFile from resource
		ResourcesTestUtils.loadURLFile(resource);
	}

	@Test
	public void loadAndCopyImageResourceLoaderAwareTest() {

		log.info("loadAndCopyImageResourceLoaderAwareTest -------------------");

		// loadAndCopyImage
		Resource resource = beanResourceLoaderAware.getResourceLoader().getResource(
				"file:src/main/resources/spring/practica20/logo.png");

		// loadAndCopyImage from resource
		ResourcesTestUtils.loadAndCopyImage(resource,
				"src/main/resources/spring/practica20/copy-resource-loader-aware/");
	}
}
