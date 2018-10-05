package com.example.demo;

 import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.omg.stub.java.rmi._Remote_Stub;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.repositories.UserRepository;
import com.example.demo.to.User;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment=WebEnvironment.RANDOM_PORT)
public class UserControllerTests {
	
	@LocalServerPort
	private int port;
	TestRestTemplate restTemplate = new TestRestTemplate();

	HttpHeaders headers = new HttpHeaders();
	
@Test
	public void contextLoads() {
		System.out.println("--------------Hi this is first test--------------");
		HttpEntity<String> entity = new HttpEntity<String>(null, headers);

		ResponseEntity<String> response = restTemplate.exchange(
				createURLWithPort("//users"),
				HttpMethod.GET, entity, String.class);

		System.out.println("--------------Response status---------"+response.getStatusCode());
	//	String expected = "{id:Course1,name:Spring,description:10 Steps}";

//		JSONAssert.assertEquals(expected, response.getBody(), false);
	} 
	
/*	
	@Test
	public void convert_json_response_to_java_obj() {

	    RestTemplate restTemplate = new RestTemplate();
	    ResponseEntity<User> response = restTemplate
	            .getForEntity(
	                    "http://localhost:8080/users1",
	                    User.class);

	    System.out.println("----------------Yes-------------------");
	}
*/

	private String createURLWithPort(String uri) {
		return "http://127.0.0.1:" + port + uri;
	}

}
