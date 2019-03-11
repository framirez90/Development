package org.certificatic.spring.core.practica19.javaconfig.bean;

import lombok.Setter;

public class DummyRepository {

	private @Setter String connectionString;

	public DummyRepository() {
	}

	public DummyRepository(String connectionString) {
		this.connectionString = connectionString;
	}

	public String getData() {
		System.out.println("repository: connected to: " + connectionString);
		return "my data";
	}

}
