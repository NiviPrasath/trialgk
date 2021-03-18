package com.example.currency1.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class EMIController 
{
	@RequestMapping(value ="/Emi", method = RequestMethod.GET)
	public String getemipage() 
	{
		return "EMI";
	}
	
	@RequestMapping(value ="/Emi", method = RequestMethod.POST)
	public String postemipage(@RequestParam double principal,@RequestParam double rate,@RequestParam double time,ModelMap model) 
	{

		
		double rate1=rate/(12*100); 
        double time1=time*12; 
        double EMI= (principal*rate1*Math.pow(1+rate1,time1))/(Math.pow(1+rate1, time1)-1);
        model.put("EMI",EMI);
		return "EMI";
		
		
	}
	
}