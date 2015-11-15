package com.emprendevs.easyparking.restservice;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.emprendevs.easyparking.model.User;
import com.emprendevs.easyparking.model.repository.UserRepository;

@RestController
public class UserController {
	
	@Autowired
	UserRepository userRepo;
	
	@RequestMapping("/user/login")
	public void login(@RequestParam(value="username") String username,
    		@RequestParam(value="password") String password) throws BadLoginException {
		
		User userAgain = userRepo.findByUsernameAndPassword(username, password);
		
	    if (userAgain == null) {
	    	BadLoginException badLogin = new BadLoginException();
		    throw badLogin;
	    }
	}
	
	@ExceptionHandler(BadLoginException.class)
	public void handleBadLogin(HttpServletResponse response) throws IOException {
	    response.sendError(HttpStatus.FORBIDDEN.value());
	}

}
