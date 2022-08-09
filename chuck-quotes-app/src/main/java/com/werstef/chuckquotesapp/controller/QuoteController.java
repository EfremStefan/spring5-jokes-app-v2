package com.werstef.chuckquotesapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.werstef.chuckquotesapp.service.QuoteService;

@Controller
public class QuoteController {

	private final QuoteService quoteService;

	public QuoteController(QuoteService quoteService) {
		this.quoteService = quoteService;
	}
	
	@RequestMapping("/")
	public String getQuote(Model model) {
		
		model.addAttribute("joke", quoteService.getQuote());
		
		return "index";
	}
}
