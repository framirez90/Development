package org.certificatic.spring.core.practica10.beanpostprocessors.bpp;

import org.certificatic.spring.core.practica10.beanpostprocessors.bean.api.IWorker;
import org.certificatic.spring.core.practica10.beanpostprocessors.bean.proxy.WorkerProxy;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;

import lombok.Getter;

public class BeanPostProcessor4 implements BeanPostProcessor, Ordered {

	private @Getter int order = 4;

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {

		System.out.println("[Bean Post Process Before Initialization " + this.getOrder() + "]");

		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {

		System.out.println("[Bean Post Process After Initialization " + this.getOrder() + "]");

		if (bean instanceof IWorker) {
			IWorker w = (IWorker) bean;

			WorkerProxy wp = new WorkerProxy();

			wp.setOriginalWorker(w);

			System.out.println("[BPP] Worker name: " + wp.getName());
			System.out.println("[BPP] Worker age: " + wp.getAge());

			bean = wp;
		}

		return bean;
	}

}