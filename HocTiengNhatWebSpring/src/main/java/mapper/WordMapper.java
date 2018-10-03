package mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import model.Word;

public class WordMapper  implements RowMapper<Word>{

	public static final String BASE_SQL = //
	            "Select d.WordId,d.WordSearch,d.WordCatalog,d.WordKanji,d.WordKata,d.WordMean,d.WordLocation  "//
	                    + " from Word d ";
	  
	@Override
	public Word mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		String wordId = rs.getString("WordId");
        String wordSearch = rs.getString("WordSearch");
        String wordCatalog = rs.getString("WordCatalog");
        String wordKanji = rs.getString("WordKanji");
        String wordKata = rs.getString("WordKata");
        String wordMean = rs.getString("WordMean");
        String wordLocation = rs.getString("WordLocation");

        return new Word(wordId, wordSearch, wordCatalog, wordKanji,wordKata,wordMean,wordLocation );
	}

}
