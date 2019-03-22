package br.com.leotf.venda.services;

import org.springframework.security.core.context.SecurityContextHolder;

import br.com.leotf.venda.security.UserSS;

public class UserService {
	
	public static UserSS authenticated() {
	try { 
		
		return (UserSS) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
	}

	catch (Exception e) {
		return null;
		
		
	}
	
}
}