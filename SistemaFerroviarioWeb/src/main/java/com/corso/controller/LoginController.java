package com.corso.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.corso.services.LoginService;

import corso.model.Utente;

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
			return "redirect:/";
		}
		if(u.getPsw().equals(utente.getPsw())) {
			session.setAttribute("utente", utente);
			session.setMaxInactiveInterval(30);
			return "/home";
		}else {
			return "redirect:/";
			
		}
		
		
	}
	
	@GetMapping("/logout")
	public String logout(HttpSession session,Model m) {
		session.invalidate();
		return "redirect:/loginPage";
	}
	
	

}
