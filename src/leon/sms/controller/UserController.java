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
public class UserController
{
	@Autowired
	UserService userService;
	
	@RequestMapping("login")
	public ModelAndView loginUser(@RequestParam("name")String name,  
            @RequestParam("password")String password)
	{
		User user= new User(name,password);
		ModelAndView mav = new ModelAndView();
		if(userService.search(user))
		{
			mav.addObject("user", user);
			mav.setViewName("home/fmain");
			return mav;
		}
		
		mav.setViewName("user/loginFailure");
		return mav;
	}
	
	@RequestMapping("registe")
	public ModelAndView registeUser(@RequestParam("name")String name,  
            @RequestParam("password")String passWord,@RequestParam("identity")String identity)
	{
		boolean isAdmin = false;
		if("manager".equals(identity))
		{
			isAdmin=true;
		}
		User user= new User(name,passWord,isAdmin);
		ModelAndView mav = new ModelAndView();
		
		if(userService.addUser(user))
		{
			System.out.println("ע��ɹ�");
		}
		else
		{
			System.out.println("ע��ʧ��");
		}
		mav.setViewName("user/loginFailure");
		return mav;
	}
}
