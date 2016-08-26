package hardware.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SecondController {
	@RequestMapping("/")
	public String home()
	{
		System.out.println("i'm in home");
		return "home";
	}
		@RequestMapping("/log")
		public String log()
		{
			System.out.println("i'm in log");
			return "log";
		
	}
		@RequestMapping("/signup")
		public String signup()
		{
			System.out.println("i'm in signup");
			return "signup";
			}
		@RequestMapping("/register")
		public String register()
		{
			System.out.println("tq for registering");
			return "register";
		}
		@RequestMapping("/success")
		public String success()
		{
			System.out.println("in success");
			return "success";
		}
		
		

}
