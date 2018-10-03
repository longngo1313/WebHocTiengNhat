package controller;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import dao.WordDAO;
import model.Word;
 
@Controller
public class MainController {
 
    @Autowired
    private WordDAO wordDAO;

    @RequestMapping(value = { "/words" }, method = RequestMethod.GET)
    public String listWordPage(Model model) {
        List<Word> list = wordDAO.getListWord();
        model.addAttribute("words", list);
        return "listWord";
    }
    
    @RequestMapping(value = "/findWords", method = RequestMethod.GET, produces = "text/plain;charset=UTF-8")
    public String getWordByHira(@RequestParam("hiragana") String hiragana, Model model) throws UnsupportedEncodingException {
    	System.out.println("INPUT --------------decode charset-8 " +  URLDecoder.decode(hiragana, "UTF-8"));
    	Word word = wordDAO.findWordByJP(hiragana);
    	System.out.println("OUTPUT -------------- " + word);
    	model.addAttribute("wordDetail", word);
        return "wordDetail";
    }
     
}
