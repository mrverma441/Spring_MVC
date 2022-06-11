package pckg1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;
@Controller
public class SearchController {
	
	
	@RequestMapping("/user/{userId}")
	public String getUserDetails(@PathVariable("userId")int userId)
	{
		System.out.println(userId);
		return "home";
	}
	@RequestMapping("/home")
	public String home()
	{
		
		System.out.println("This is my home view");
		String str=null;
		System.out.println(str.length());
		return "home";
		
	}
	@RequestMapping("/search")
	public RedirectView search(@RequestParam("querybox")String query)
	{
		String url="https://www.google.com/search?q="+query;
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(url);
		return redirectView;
	}
	@ExceptionHandler(NullPointerException.class)
	public String exceptionHandlerNull(Model m)
	{
		m.addAttribute("msg", "Null pointer Exception has occured");
		return "null_page";
	}
	@ExceptionHandler(NumberFormatException.class)
	public String exceptionHandlerNumberFormat(Model m)
	{
		m.addAttribute("msg", "Number Format Exception has occured");

		return "null_page";
	}
	
	@ExceptionHandler(Exception.class)
	public String GenericException(Model m)
	{
		m.addAttribute("msg", "Some exception has occured");
		return "null_page";
	}

}
