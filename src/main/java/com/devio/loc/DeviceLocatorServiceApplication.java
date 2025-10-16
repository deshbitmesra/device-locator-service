package com.devio.loc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("device")
public class DeviceLocatorServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeviceLocatorServiceApplication.class, args);
	}

	@GetMapping
	public String getDevice(){
		return "Generic Device";
	}

}
