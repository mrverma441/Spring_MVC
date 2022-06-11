package mypckg;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import mypckg1.User;
import myservicepckg.UserService;
@Controller
public class ContactController {
	@Autowired
	private UserService userService;
	@RequestMapping("/contact")
	public String showForm()
	{
		return "contact";
	}
//	@RequestMapping(path="/processform",method=RequestMethod.POST)
//	public String handleForm(@RequestParam("email")
//	       String user_email,@RequestParam("userName")
//	       String user_name,@RequestParam("pass")String user_password,Model model)
//	{
////		String parameter = request.getParameter("email");
////		String parameter2 = request.getParameter("userName");
////		String parameter3 = request.getParameter("pass");
////		
////		System.out.println("User email is "+parameter);
////		System.out.println("User name is "+parameter2);
////		System.out.println("User password is "+parameter3);
//		
////		System.out.println("User email is "+user_email);
////		System.out.println("user name is "+user_name);
////		System.out.println("User password is "+user_password);
//		
//		
//		User user=new User();
//		user.setEmail(user_email);
//		user.setUserName(user_name);
//		user.setPass(user_password);
//		System.out.println(user);
////		model.addAttribute("name", user_name);
////		model.addAttribute("email", user_email);
////		model.addAttribute("pass", user_password);
//////		
//		model.addAttribute("user", user);
//		return "success";
//	}

	@ModelAttribute
	public void commonDataForModel(Model m)
	{
		m.addAttribute("Header","Learn how to code");
		m.addAttribute("Desc","Home for programmers");
	}
	
	@RequestMapping(path="/processform",method=RequestMethod.POST)
	public String handleForm(@ModelAttribute User user,Model model)
	      
	{
		System.out.println(user);
		this.userService.createUser(user);
       // model.addAttribute("user", user);
		return "success";
	}

	
}
