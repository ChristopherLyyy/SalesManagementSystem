package leon.sms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/** 
* @author Leon
* @date ����ʱ�䣺2018��4��6�� ����3:21:04
* @version 1.0
* ��˵�� :
* 
*/
@Controller
@RequestMapping("")
public class HomeController
{
	@RequestMapping("homeTitle")
	public ModelAndView homeTitle()
	{
		ModelAndView mav = new ModelAndView();
		mav.setViewName("home/title");
		return mav;
	}
	
	@RequestMapping("homeLeft")
	public ModelAndView homeLeft()
	{
		ModelAndView mav = new ModelAndView();
		mav.setViewName("home/left");
		return mav;
	}
	
	@RequestMapping("homeMain")
	public ModelAndView homeMain()
	{
		ModelAndView mav = new ModelAndView();
		mav.setViewName("home/main");
		return mav;
	}
}
