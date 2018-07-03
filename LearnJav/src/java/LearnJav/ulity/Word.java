/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package LearnJav.ulity;

/**
 *
 * @author meep
 */
public class Word {
    private String wordId;
    private String wordSearch;
    private String wordCatalog;
    private String wordKanji;
private String wordKata;
private String wordMean;
private String wordLocation;

    public Word() {
    }

    public Word(String wordId, String wordSearch, String wordCatalog, String wordKanji, String wordKata, String wordMean, String wordLocation) {
        this.wordId = wordId;
        this.wordSearch = wordSearch;
        this.wordCatalog = wordCatalog;
        this.wordKanji = wordKanji;
        this.wordKata = wordKata;
        this.wordMean = wordMean;
        this.wordLocation = wordLocation;
    }

    public String getWordId() {
        return wordId;
    }

    public void setWordId(String wordId) {
        this.wordId = wordId;
    }

    public String getWordSearch() {
        return wordSearch;
    }

    public void setWordSearch(String wordSearch) {
        this.wordSearch = wordSearch;
    }

    public String getWordCatalog() {
        return wordCatalog;
    }

    public void setWordCatalog(String wordCatalog) {
        this.wordCatalog = wordCatalog;
    }

    public String getWordKanji() {
        return wordKanji;
    }

    public void setWordKanji(String wordKanji) {
        this.wordKanji = wordKanji;
    }

    public String getWordKata() {
        return wordKata;
    }

    public void setWordKata(String wordKata) {
        this.wordKata = wordKata;
    }

    public String getWordMean() {
        return wordMean;
    }

    public void setWordMean(String wordMean) {
        this.wordMean = wordMean;
    }

    public String getWordLocation() {
        return wordLocation;
    }

    public void setWordLocation(String wordLocation) {
        this.wordLocation = wordLocation;
    }

   
  
}
