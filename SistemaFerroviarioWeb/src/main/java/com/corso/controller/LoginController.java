package com.corso.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

import com.corso.services.LoginService;


import corso.DAOs.UtenteDAO;
import corso.model.Utente;
import corso.spring.Beans;

@Controller
public class LoginController {
	
	@GetMapping("/loginPage")
	public String getLoginPage(Model m) {
		m.addAttribute("user", new Utente());
		return "/loginPage";
	}
	
	@GetMapping("/login")
	public String home(@ModelAttribute Utente u,Model m,HttpSession session) {
		LoginService service = new LoginService();
		Utente utente = service.getUser(u.getUsername());
		
		
		if(utente==null) {
			return "redirect:/loginPage";
		}
		if(u.getPsw().equals(utente.getPsw())) {
			session.setAttribute("utente", utente);
			session.setMaxInactiveInterval(30);
			return "/home";
		}else {
			return "redirect:/loginPage";
			
		}
		
		
	}
	
	@GetMapping("/logout")
	public String logout(HttpSession session,Model m) {
		session.invalidate();
		return "redirect:/loginPage";
	}
	
	@GetMapping("/register")
	public String registra(
			@RequestParam String username, 
			@RequestParam String psw, Model m) {
		
		   m.addAttribute("emp",new Utente());
		   BeanFactory factory = new AnnotationConfigApplicationContext(Beans.class);
		   UtenteDAO dao = factory.getBean("utenteDAO", UtenteDAO.class); 
		   
		   dao.add(username,psw);
		   return "register"; 
		
	}
	

}
