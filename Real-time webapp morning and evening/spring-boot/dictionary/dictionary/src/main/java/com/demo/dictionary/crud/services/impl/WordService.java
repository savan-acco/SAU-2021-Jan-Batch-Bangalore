package com.demo.dictionary.crud.services.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dictionary.crud.services.IWordService;
import com.demo.dictionary.dao.IWordDao;
import com.demo.dictionary.entities.Word;

@Service
public class WordService implements IWordService {

	@Autowired
	IWordDao iWordDao;

	@Override
	public Word save(Word word) {
		if (null != word) {
			word.setCreationTm(new Date());
			word.setLastModifiedTm(new Date());
			return iWordDao.save(word);
		}
		return null;
	}

	@Override
	public List<Word> getAll() {
		return iWordDao.getAll();
	}

	@Override
	public boolean delete(int id) {
		int rowsAffected = iWordDao.delete(id);
		if (rowsAffected == 1) {
			return true;
		}
		return false;
	}

	@Override
	public List<Word> sort() {
		return iWordDao.sort();
	}

	@Override
	public Word update(Word word) {
		if (null != word) {
			///word.setCreationTm(new Date());
			word.setLastModifiedTm(new Date());
			return iWordDao.update(word);
		}
		return null;
	}

}
