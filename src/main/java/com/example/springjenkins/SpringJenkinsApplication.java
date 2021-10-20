package com.example.springjenkins;

//import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class SpringJenkinsApplication {
	
	public static Logger logger=LoggerFactory.getLogger(SpringJenkinsApplication.class);
	
	@GetMapping("/user")
	public String getinto(Model model)
	{
		model.addAttribute("message","Welcome to CitiBank");
		logger.info("Application Started in a moment..");
		return "welcome1";
		
	}

	public static void main(String[] args) {
		logger.info("Application executed..");
		SpringApplication.run(SpringJenkinsApplication.class, args);
	}

}
