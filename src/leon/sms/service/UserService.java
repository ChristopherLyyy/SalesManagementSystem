package leon.sms.service;

/** 
* @author Leon
* @date ����ʱ�䣺2018��4��5�� ����3:54:51
* @version 1.0
* ��˵�� :
* 
*/
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import leon.sms.mapper.UserMapper;
import leon.sms.pojo.User;

@Service
public class UserService
{
	@Autowired
	UserMapper userMapper;

	public User search(User user)
	{
		List<User> list = userMapper.list();
		for (int i = 0; i < list.size(); i++)
		{
			if (list.get(i).equals(user))
			{
				user = userMapper.get(user.getName());
				return user;
			}
		}
		return null;
	}

	public boolean addUser(User user)
	{
		if (userMapper.get(user.getName()) == null)
		{
			//System.out.println("hello");
			userMapper.add(user);
			return true;
		}
		return false;
	}
}
