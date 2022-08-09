package com.werstef.chuckquotesapp.service;

import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class QuoteServiceImpl implements QuoteService {
	
	@Override
	public String getQuote() {
		ChuckNorrisQuotes chuckNorrisQuotes = new ChuckNorrisQuotes();
		return chuckNorrisQuotes.getRandomQuote();
	}

}
