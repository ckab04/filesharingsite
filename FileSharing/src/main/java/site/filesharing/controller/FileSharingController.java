package site.filesharing.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FileSharingController {
	
	@GetMapping("/")
 public String home()
 {
	 
	 return "home";
 }
}
