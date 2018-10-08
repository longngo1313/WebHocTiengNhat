package controller;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import dao.WordDAO;
import model.UserInfo;
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

	@RequestMapping(value = { "/", "/welcome" }, method = RequestMethod.GET)
	public String welcomePage(Model model) {
		model.addAttribute("title", "Welcome");
		model.addAttribute("message", "This is welcome page!");
		return "welcomePage";
	}

	@RequestMapping(value = "/admin", method = RequestMethod.GET)
	public String adminPage(Model model) {
		return "adminPage";
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String loginPage(Model model ) {

		return "loginPage";
	}

	@RequestMapping(value = "/logoutSuccessful", method = RequestMethod.GET)
	public String logoutSuccessfulPage(Model model) {
		model.addAttribute("title", "Logout");
		return "logoutSuccessfulPage";
	}

	@RequestMapping(value = "/userInfo", method = RequestMethod.GET)
	public String userInfo(Model model, Principal principal) {
		UserInfo principal1 = (UserInfo)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		if (principal1 instanceof UserInfo) {
			System.out.println("Data: UserInfo -------------"+ principal1.getAuthorities());
		} else {
			System.out.println("Data: Principal ------------ "+ principal1);
		}
		return "userInfoPage";
	}

	@RequestMapping(value = "/403", method = RequestMethod.GET)
	public String accessDenied(Model model, Principal principal) {

		if (principal != null) {
			model.addAttribute("message", "Hi " + principal.getName()
			+ "<br> You do not have permission to access this page!");
		} else {
			model.addAttribute("msg",
					"You do not have permission to access this page!");
		}
		return "403Page";
	}

}
