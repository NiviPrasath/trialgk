package com.example.currency1.Controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import java.text.DecimalFormat;
import java.util.*;


@Controller

public class CurrencyConverterController {
	@RequestMapping(value ="/Currency", method = RequestMethod.GET)
	public String gethomepage() 
	{
		return "CurrencyConverter";
	}
	@RequestMapping(value ="/Currency1", method = RequestMethod.POST)
	public String gethomepage (@RequestParam float rupees,ModelMap model) 
	{
	
	
		System.out.println("Please enter rupees:");

		float dollars = rupees / 64;

		model.put("dollars",dollars);
		return "CurrencyConverter";
	}
}