package leon.sms.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import leon.sms.pojo.Project;
import leon.sms.pojo.User;
import leon.sms.service.ProjectService;

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
	@Autowired
	ProjectService projectService;
	
	@RequestMapping("homeTitle")
	public ModelAndView homeTitle()
	{
		ModelAndView mav = new ModelAndView();
		mav.setViewName("top");
		return mav;
	}
	
	@RequestMapping("homeLeft")
	public ModelAndView homeLeft(HttpSession httpSession)
	{
		ModelAndView mav = new ModelAndView();
		
		User user = (User) httpSession.getAttribute("user");
		if(user.isAdmin())//���۾���
		{
			System.out.println("���������۾���");
			mav.setViewName("home/adminLeft");
		}
		else//��ͨԱ��
		{
			System.out.println("����������Ա��");
			mav.setViewName("home/staffLeft");
		}
		return mav;
	}
	
	@RequestMapping("homeMain")
	public ModelAndView homeMain()
	{
		ModelAndView mav = new ModelAndView();
		mav.setViewName("home/mainFrame/culture");
		return mav;
	}
	
	@RequestMapping("staffDocumentary")
	public ModelAndView staffDocumentary(HttpSession httpSession)
	{
		ModelAndView mav = new ModelAndView();
		mav.setViewName("home/mainFrame/staffDocumentary");
		
		User user = (User) httpSession.getAttribute("user");
		List<Project> list = projectService.searchByName(user.getName());
		mav.addObject("list", list);
		return mav;
	}
	
	@RequestMapping("instructions")
	public ModelAndView instructions()
	{
		ModelAndView mav = new ModelAndView();
		mav.setViewName("home/mainFrame/instructions");
		return mav;
	}
	
	@RequestMapping("analysis")
	public ModelAndView analysis()
	{
		ModelAndView mav = new ModelAndView();
		mav.setViewName("home/mainFrame/analysis");
		return mav;
	}
	
	@RequestMapping("adminDocumentary")
	public ModelAndView adminDocumentary()
	{
		ModelAndView mav = new ModelAndView();
		mav.setViewName("home/mainFrame/adminDocumentary");
		return mav;
	}
	
	@RequestMapping("clientQuery")
	public ModelAndView clientQuery()
	{
		ModelAndView mav = new ModelAndView();
		mav.setViewName("home/mainFrame/clientQuery");
		return mav;
	}
}
