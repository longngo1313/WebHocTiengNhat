/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LearnJav.model;

import LearnJav.ulity.Word;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Resource;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import javax.sql.DataSource;

/**
 *
 * @author meep
 */
@Stateless
@LocalBean
public class wordDAO {

    @Resource(name = "java:app/jdbc/SonyJap")
    private DataSource ds;

    public void addWord(Word word) {
        String sql = "INSERT INTO word VALUES ('" + word.getWordId()+ "','" + word.getWordSearch()+ "','" + word.getWordCatalog()+ "','" + word.getWordKanji()+ "','" + word.getWordKata()+"','" + word.getWordMean()+"','"  + word.getWordLocation()+ "')";
        executeModifyQuery(sql);

    }

    public void editWord(Word word) {
        String sql = "UPDATE word SET WordSearch='" + word.getWordSearch()+ "',WordCatalog='" + word.getWordCatalog()+ "',WordMean='" + word.getWordMean()+ "',WordLocation='" + word.getWordLocation()+ "',WordKanji='" + word.getWordKanji()+ "',WordKata='" + word.getWordKata()+ "'WHERE WordId='" + word.getWordId()+ "'";
        executeModifyQuery(sql);
    }

    public void deleteWord(Word word) {
        String sql = "DELETE FROM word WHERE WordId='" + word.getWordId()+ "'";
        executeModifyQuery(sql);
    }

    public Word searchWord(String wordSearch) {
        Word word = new Word();
        String sql = "SELECT * FROM word WHERE WordSearch like N'"+ wordSearch+ "' or WordMean like N'"+ wordSearch+ "'or WordKanji like N'"+ wordSearch+ "'";
        System.out.println(sql);
        ResultSet rs = executeFetchQuery(sql);
        try {
            if (rs.next()) {
                word.setWordId(rs.getString("WordId"));
                word.setWordSearch(rs.getString("WordSearch"));
                word.setWordCatalog(rs.getString("WordCatalog"));
                word.setWordKanji(rs.getString("WordKanji"));
                word.setWordKata(rs.getString("WordKata"));
                word.setWordMean(rs.getString("WordMean"));
                word.setWordLocation(rs.getString("WordLocation"));
            }

        } catch (Exception e) {
            System.err.println("GS" + e.getMessage());
        }
        return word;

    }

    public List<Word> getAllWord() {
        
        List<Word> listWor = new ArrayList<>();
        String sql ="SELECT * FROM WORD ";
        ResultSet rs= executeFetchQuery(sql);
        try {
            
          while (rs.next()) {
                Word word = new Word();
                word.setWordId(rs.getString("WordId"));
                word.setWordSearch(rs.getString("WordSearch"));
                word.setWordCatalog(rs.getString("WordCatalog"));
                word.setWordKanji(rs.getString("WordKanji"));
                word.setWordKata(rs.getString("WordKata"));
                word.setWordMean(rs.getString("WordMean"));
                word.setWordLocation(rs.getString("WordLocation"));
                listWor.add(word);
            }
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        
        return listWor;
    }

    public void executeModifyQuery(String sql) {
        try {
            Connection conn = ds.getConnection();
            conn.createStatement().execute(sql);
            conn.close();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    public ResultSet executeFetchQuery(String sql) {
        ResultSet rs = null;
        try {
            Connection conn = ds.getConnection();
            rs = conn.createStatement().executeQuery(sql);
            conn.close();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return rs;
    }

}