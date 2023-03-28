package br.com.fiap.smartcities.test;

import jakarta.persistence.Persistence;

public class Teste {

	public static void main(String[] args) {
		Persistence.createEntityManagerFactory("smartcities-orm").createEntityManager();

	}

}
