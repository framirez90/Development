package org.certificatic.spring.core.practica10.beanpostprocessors.bean.proxy;

import org.certificatic.spring.core.practica10.beanpostprocessors.bean.api.IWorker;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class WorkerProxy implements IWorker {

	private @Getter @Setter String name;
	private @Getter @Setter int age;

	private IWorker originalWorker;

	public WorkerProxy() {
		System.out.println("[WorkerProxy] Constructing worker proxy.");
	}

	public void setOriginalWorker(IWorker originalWorker) {
		this.originalWorker = originalWorker;

		this.setAge(originalWorker.getAge());
		this.setName(originalWorker.getName());
	}

	@Override
	public void init() {
		System.out.println("[WorkerProxy] Initializing worker proxy.");
	}

	@Override
	public void showInfo() {
		System.out.println("[WorkerProxy] in action.");
		originalWorker.showInfo();
	}

	@Override
	public void destroy() {
		System.out.println("[WorkerProxy] Destroying worker proxy.");
	}

}
