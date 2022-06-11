package mypckg;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String home(Model model) {
		System.out.println("This is Home URL");
		model.addAttribute("name", "Monu verma And Mukul joshi");
		model.addAttribute("id", 1234);
		List<Integer> list = new ArrayList<Integer>();
		list.add(12);
		list.add(13);
		list.add(14);
		list.add(15);
		model.addAttribute("marks1",list);
	
		return "index";
	}

	@RequestMapping("/about")
	public String about() {
		System.out.println("This is about Page");
		return "about";
	}

	@RequestMapping("/help")
	public ModelAndView help() {
		System.out.println("This is help controller");
		ModelAndView mv = new ModelAndView();
		mv.addObject("name", "Rajat patidar");
		mv.addObject("roll_number", 1122);
		List<Integer> list = new ArrayList<Integer>();
		list.add(12);
		list.add(13);
		list.add(14);
		list.add(15);
		mv.addObject("marks1", list);
		mv.setViewName("help");

		return mv;
	}

//	<h1>Name is <%=name %></h1>
//	<h1>Id is <%=id %></h1>

}
