package com.demo.dictionary.dao.impl;

import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import com.demo.dictionary.dao.IWordDao;
import com.demo.dictionary.entities.Word;

@Repository
public class WordDaoImpl implements IWordDao {

	@Autowired
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	
	private static Logger logger = LoggerFactory.getLogger(WordDaoImpl.class);

	@Override
	public Word save(Word word) {
		final KeyHolder holder = new GeneratedKeyHolder();
		String sql = "INSERT INTO WORDS ( WORD , MEANING , PART_OF_SPEECH , EXAMPLE , CREATION_TM , LAST_MODIFIED_TM ) "
				+ " VALUES ( :WORD , :MEANING , :PART_OF_SPEECH , :EXAMPLE , :CREATION_TM , :LAST_MODIFIED_TM )";

		MapSqlParameterSource srcMap = new MapSqlParameterSource();
		srcMap.addValue("WORD", word.getWord());
		srcMap.addValue("MEANING", word.getMeaning());
		srcMap.addValue("PART_OF_SPEECH", word.getPartOfSpeech());
		srcMap.addValue("EXAMPLE", word.getExample());
		srcMap.addValue("CREATION_TM", word.getCreationTm());
		srcMap.addValue("LAST_MODIFIED_TM", word.getLastModifiedTm());

		namedParameterJdbcTemplate.update(sql, srcMap, holder, new String[] { "ID" });
		word.setId(holder.getKey().intValue());
		return word;
	}

	@Override
	public List<Word> getAll() {
		String sql = " SELECT * FROM WORDS ";
		return namedParameterJdbcTemplate.query(sql, (resultSet, rowNum) -> {
			Word word = new Word();
			word.setId(resultSet.getInt("ID"));
			word.setCreationTm(resultSet.getDate("CREATION_TM"));
			word.setExample(resultSet.getString("EXAMPLE"));
			word.setLastModifiedTm(resultSet.getDate("LAST_MODIFIED_TM"));
			word.setMeaning(resultSet.getString("MEANING"));
			word.setPartOfSpeech(resultSet.getString("PART_OF_SPEECH"));
			word.setWord(resultSet.getString("WORD"));
			return word;
		});
	}




	@Override
	public int delete(int id) {
		MapSqlParameterSource srcMap = new MapSqlParameterSource();
		srcMap.addValue("ID", id);
		return namedParameterJdbcTemplate.update("DELETE FROM WORDS WHERE ID =:ID", srcMap);
	}

	//update
	@Override
	public Word update(Word word) {

		//System.out.println("Working");

		//works
		MapSqlParameterSource srcMap = new MapSqlParameterSource();
		int id= word.getId();
		String wordChange=word.getWord();
		String meaningChange=word.getMeaning();
		String partofspeechChange=word.getPartOfSpeech();
		String exampleChange=word.getExample();
		Date creationtmChange=word.getCreationTm();
		Date lastmodifiedchangeChange=word.getLastModifiedTm();

		srcMap.addValue("ID", id);
		srcMap.addValue("WORD", wordChange);
		srcMap.addValue("MEANING", meaningChange);
		srcMap.addValue("PART_OF_SPEECH",partofspeechChange );
		srcMap.addValue("EXAMPLE",exampleChange );
		srcMap.addValue("CREATION_TM", creationtmChange);
		srcMap.addValue("LAST_MODIFIED_TM", lastmodifiedchangeChange);

		namedParameterJdbcTemplate.update("UPDATE WORDS SET WORD =:WORD,MEANING =:MEANING," +
				"PART_OF_SPEECH =:PART_OF_SPEECH,EXAMPLE =:EXAMPLE,LAST_MODIFIED_TM =:LAST_MODIFIED_TM " +
				"  WHERE ID =:ID", srcMap);

		return word;

	}


	// sort based on creation_tm (latest item comes first)
	@Override
	public List<Word> sort() {
		String sql = " SELECT * FROM WORDS ORDER BY CREATION_TM DESC";
		return namedParameterJdbcTemplate.query(sql, (resultSet, rowNum) -> {
			Word word = new Word();
			word.setId(resultSet.getInt("ID"));
			word.setCreationTm(resultSet.getDate("CREATION_TM"));
			word.setExample(resultSet.getString("EXAMPLE"));
			word.setLastModifiedTm(resultSet.getDate("LAST_MODIFIED_TM"));
			word.setMeaning(resultSet.getString("MEANING"));
			word.setPartOfSpeech(resultSet.getString("PART_OF_SPEECH"));
			word.setWord(resultSet.getString("WORD"));
			return word;
		});
	}


}
