package com.namegenerator.au2021rest;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/operations")
public class FullNameController {
	
	

	
	@GetMapping
	public String articles(@RequestParam(value="page") int page,@RequestParam(value="limit") int limit)
	{
		return "page number is "+page+" limit set is "+limit;
	}
	
	//made use of 'default'
	@GetMapping("/defaultuse")
	public String articlesWithDefault(@RequestParam(value="page" ,defaultValue="1") int page,@RequestParam(value="limit" ,defaultValue="7") int limit)
	{
		return "page number is "+page+" limit set is "+limit;
	}
	
	// made use of 'required'
	@GetMapping("/requireduse")
	public String articlesWithRequired(@RequestParam(value="page") int page,@RequestParam(value="limit",defaultValue ="4" ,required=false) String limit)
	{
		return "page number is "+page+" limit set is "+limit;
	}
	
	
	//concatenate
	@GetMapping("/concatenate/{string1}/{string2}")
	public String generate(@PathVariable("string1") String string1,@PathVariable("string2") String string2)
	{
		return string1+string2;
	}
	
	//checking addition
	@GetMapping("/addition/{num1}/{num2}/{num3}")
	public String generateAddition(@PathVariable("num1") int num1,@PathVariable("num2") int num2,@PathVariable("num3") int num3)
	{
		if(num1+num2==num3)
			return "addition of first 2 numbers is equal to third";
		else
			return "addition of first 2 numbers is not equal to third";
	}
	
	
	//splitting
	@GetMapping("/splitting/{string1}/{string2}")
	public String splitting(@PathVariable("string1") String string1,@PathVariable("string2") String string2)
	{
		return string1.split(string2)[0];
	}

	//checking substring
	@GetMapping("/substringcheck/{string1}/{string2}")
	public String substringCheck(@PathVariable("string1") String string1,@PathVariable("string2") String string2)
	{
		if(string1.indexOf(string2) != -1)
			return string2 + " is substring of "+ string1;
		else
			return "No substring";
	}
}
