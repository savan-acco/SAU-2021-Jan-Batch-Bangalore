package com.demo.dictionary.controllers;

import java.util.List;

import com.demo.dictionary.entities.Word;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.demo.dictionary.crud.services.IWordService;
//import com.demo.dictionary.entities.Word;

@RestController
@RequestMapping("word")
public class WordController {

	@Autowired
	IWordService iWordService;

	@PostMapping("/save")
	public Word save(@RequestBody Word word)
	{
		return iWordService.save(word);
	}


	//update
	@PutMapping("/update")
	public Word update(@RequestBody Word word)
	{
		return iWordService.update(word);
	}

	// sort based on creation_tm (latest item comes first)
	@GetMapping("/sort")
	public List<Word> sort()
	{
		return iWordService.sort();
	}

	@GetMapping("/getAll")
	public List<Word> getAll()
	{
		return iWordService.getAll();
	}

	@GetMapping("/delete/{id}")
	public boolean getAll(@PathVariable int id) {
		return iWordService.delete(id);
	}

}
