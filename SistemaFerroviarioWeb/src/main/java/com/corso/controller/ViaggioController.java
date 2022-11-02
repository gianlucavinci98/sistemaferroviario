package com.corso.controller;

import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.corso.services.StazioneService;
import com.corso.services.TrenoService;
import com.corso.services.ViaggioService;
import corso.model.Stazione;
import corso.model.Treno;
import corso.model.Viaggio;


@Controller
@RequestMapping("/home/viaggio")
public class ViaggioController {

	@GetMapping("/allViaggi")
	public String allViaggi(Model m){
		ViaggioService v= new ViaggioService();
		List<Viaggio> lista= v.getAllViaggi();
		m.addAttribute("dimensione", lista.size());
		m.addAttribute("lista",lista);
		return "/viaggio";
	}
	
	@GetMapping("/formAddViaggio")
	public String formAddViaggio(Model m)
	{
		TrenoService ts = new TrenoService();
		StazioneService ss = new StazioneService();
		List<Treno> listaTreni = ts.getAll();
		List<Stazione> listaStazioni = ss.getAll();
		m.addAttribute("listaTreni", listaTreni);
		m.addAttribute("listaStazioni", listaStazioni);
		//m.addAttribute("viaggio", new Viaggio());
		return "formAddViaggio";
	}
	
	@GetMapping("/addViaggio")
	public String addViaggio(@RequestParam Integer idpartenza)
	{
		System.out.print(idpartenza);
		
//		ViaggioService vService = new ViaggioService();
//		vService.add(viaggio);
		
		return "formAddViaggio";
	}
	
	
}
