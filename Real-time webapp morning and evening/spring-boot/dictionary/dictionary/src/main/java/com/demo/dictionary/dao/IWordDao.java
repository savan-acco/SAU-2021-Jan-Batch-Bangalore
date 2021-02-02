package com.demo.dictionary.dao;

import java.util.List;

import com.demo.dictionary.entities.Word;

public interface IWordDao {

	public Word save(Word word);

	public List<Word> getAll();

	public List<Word> sort();

	public int delete(int id);

	public Word update(Word word);
}
