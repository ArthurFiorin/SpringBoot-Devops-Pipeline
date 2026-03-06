package com.devops.api;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles; // <-- Importe isto

@SpringBootTest
@ActiveProfiles("test") // <-- Adicione isto!
class ApiApplicationTests {

	@Test
	void contextLoads() {
	}
}
