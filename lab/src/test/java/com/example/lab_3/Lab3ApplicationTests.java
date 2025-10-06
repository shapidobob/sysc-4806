package com.example.lab_3;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.web.server.test.client.TestRestTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.server.test.LocalServerPort;
import org.springframework.boot.web.server.test.client.TestRestTemplate;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class SmokeTest {

	@Autowired
	private AddressBookController controller;

	@Test
	void contextLoads() throws Exception {
		assertThat(controller).isNotNull();
	}
}