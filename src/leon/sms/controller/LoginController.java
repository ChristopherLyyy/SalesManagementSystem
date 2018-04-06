package leon.sms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import leon.sms.pojo.User;
import leon.sms.service.UserService;

/** 
* @author Leon
* @date ����ʱ�䣺2018��4��6�� ����12:45:38
* @version 1.0
* ��˵�� :
* 
*/
@Controller
@RequestMapping("")
public class LoginController
{
	@Autowired
	UserService userService;
	
	@RequestMapping("login")
	public ModelAndView listUser(@RequestParam("name")String name,  
            @RequestParam("password")String password)
	{
		//User user= new User(name,password);
		ModelAndView mav = new ModelAndView();
		/*if(userService.search(user))
		{
			mav.addObject("user", user.getName());
			mav.setViewName("home/fmain");
			return mav;
		}*/
		
		mav.setViewName("home/fmain");
		return mav;
	}
}
