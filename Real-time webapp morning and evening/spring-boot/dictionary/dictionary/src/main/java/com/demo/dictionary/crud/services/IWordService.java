package com.demo.dictionary.crud.services;

import java.util.List;

import com.demo.dictionary.entities.Word;

public interface IWordService {

	public Word save(Word word);
	
	public List<Word> getAll();

	public boolean delete(int id);

	public List<Word> sort();

	Word update(Word word);
}
