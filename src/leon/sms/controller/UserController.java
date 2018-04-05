package leon.sms.controller;

import java.util.List;

/** 
* @author Leon
* @date ����ʱ�䣺2018��4��5�� ����4:00:38
* @version 1.0
* ��˵�� :
* 
*/
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import leon.sms.pojo.User;
import leon.sms.service.UserService;

@Controller
@RequestMapping("")
public class UserController
{
	@Autowired
	UserService userService;

	@RequestMapping("listusers")
	public ModelAndView listUser()
	{
		ModelAndView mav = new ModelAndView();
		List<User> users = userService.list();

		
		// ����ת������
		mav.addObject("users", users);
		// ����jsp·��
		mav.setViewName("showUsers");
		return mav;
	}
}
