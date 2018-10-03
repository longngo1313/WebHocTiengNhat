package model;

public class Word {
	
	private String wordId;
    private String wordJP;
    private String wordCatalog;
    private String wordKanji;
    private String wordKata;
    private String wordVN;
    private String wordLocation;
    
    
	public Word(String wordId2, String wordJP, String wordCatalog, String wordKanji, String wordKata, String wordVN,
			String wordLocation) {
		super();
		this.wordId = wordId2;
		this.wordJP = wordJP;
		this.wordCatalog = wordCatalog;
		this.wordKanji = wordKanji;
		this.wordKata = wordKata;
		this.wordVN = wordVN;
		this.wordLocation = wordLocation;
	}


	public Word() {
		
	}


	public String getWordId() {
		return wordId;
	}


	public void setWordId(String wordId) {
		this.wordId = wordId;
	}


	public String getWordJP() {
		return wordJP;
	}


	public void setWordJP(String wordJP) {
		this.wordJP = wordJP;
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


	public String getWordVN() {
		return wordVN;
	}


	public void setWordVN(String wordVN) {
		this.wordVN = wordVN;
	}


	public String getWordLocation() {
		return wordLocation;
	}


	public void setWordLocation(String wordLocation) {
		this.wordLocation = wordLocation;
	}

}
