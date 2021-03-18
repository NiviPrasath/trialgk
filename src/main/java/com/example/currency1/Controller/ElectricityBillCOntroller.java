package com.example.currency1.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller

public class ElectricityBillCOntroller 
{
	
	@RequestMapping(value ="/Electricity", method = RequestMethod.GET)
		public String gethomepage() 
		{
			return "ElectricityBill";
		}
	@RequestMapping(value ="/Electricity", method = RequestMethod.POST)
	public String gethomepage(@RequestParam int units,ModelMap model) 
	{
		System.out.println(units);
		double Amount,Sur_Charge,Total_Amount;
		if (units > 500)
	  	{
	  		Amount = units * 9.65;
	  		Sur_Charge = 85;  	
	  	} 
	  	else if (units >= 300)
	  	{
	  		Amount = units * 7.75;
	  		Sur_Charge = 75; 	
	  	} 
	  	else if (units >= 200)
	  	{
	  		Amount = units * 5.26;
	  		Sur_Charge = 55; 	
	  	}  
	  	else if (units >= 100)
	  	{
	  		Amount = units * 3.76;
	  		Sur_Charge = 35; 	
	  	}   	
	  	else
	  	{
		   	Amount = units * 2.25; 
		   	Sur_Charge = 25; 
		}
		Total_Amount = Amount + Sur_Charge;
		model.put("Total_Amount",Total_Amount);
		return "ElectricityBill";
		
	}
}
