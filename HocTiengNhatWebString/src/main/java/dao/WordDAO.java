package dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import mapper.WordMapper;
import model.Word;

@Repository
@Transactional
public class WordDAO extends JdbcDaoSupport  {
	
	@Autowired
	public WordDAO(DataSource dataSource) {
		this.setDataSource(dataSource);
	}

	private int getCountWord() {
		String sql = "Select Count(w.dept_id) from Word w";

		Integer value = this.getJdbcTemplate().queryForObject(sql, Integer.class);
		
		if (value == null) {
			return 0;
		}
		return value;
	}

	public Word findWordByJP(String wordJp) {
		
		String sql = WordMapper.BASE_SQL //
				+ " where d.WordSearch = ?";

		Object[] params = new Object[] { wordJp };

		WordMapper mapper = new WordMapper();

		List<Word> list = this.getJdbcTemplate().query(sql, params, mapper);
		
		if(list == null || list.isEmpty()) {
			return null;
		}
		
		return list.get(0);
	}

	public List<Word> getListWord() {
		
		String sql = WordMapper.BASE_SQL;

		Object[] params = new Object[] {};
		WordMapper mapper = new WordMapper();

		List<Word> list = this.getJdbcTemplate().query(sql, params, mapper);
		
		return list;
	}

}
