package pckg1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

@Controller
public class FileUploadController {
	@RequestMapping("/fileform")
	public String showuploadForm()
	{
		return "Fileform";
	}

	@RequestMapping(path="/uploadimage",method=RequestMethod.POST)
	public String fileupload(@RequestParam("profile")CommonsMultipartFile file,HttpSession s,Model m) throws IOException
	{
		System.out.println("File upload handler");
		System.out.println(file.getSize());
		System.out.println(file.getContentType());
		System.out.println(file.getName());
		System.out.println(file.getOriginalFilename());
		System.out.println(file.getStorageDescription());
		byte[] data = file.getBytes();
		//we have to save this file to server...
		String realPath = s.getServletContext().getRealPath("/")+file.getOriginalFilename();
		System.out.println(realPath);
		FileOutputStream fileOutputStream=new FileOutputStream(realPath);
	    fileOutputStream.write(data);
	    fileOutputStream.close();
	    System.out.println("File uploaded successfully");
	    m.addAttribute("msg", "uploaded successfully");
	    m.addAttribute("filename", file.getOriginalFilename());
		return "filesuccess";
	}
}
