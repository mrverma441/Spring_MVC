package mypckg;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class ReController {
//	@RequestMapping("/one")
//	public String one()
//	{
//		System.out.println("This is first-handler");
//		return "redirect:/two";
//	}
//	@RequestMapping("/one")
//	public RedirectView one()
//	{
//		System.out.println("This is first-handler");
//		RedirectView redirectView = new RedirectView();
//		redirectView.setUrl("https://www.google.com");
//		return redirectView;
//	}
	@RequestMapping
	public String one(HttpServletResponse response) throws IOException
	{
		response.sendRedirect("");
		return "";
	}
	@RequestMapping("/two")
	public String two()
	{
		System.out.println("This is second handler");
		return "contact";
	}

}
