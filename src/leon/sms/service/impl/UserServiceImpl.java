package leon.sms.service.impl;
/** 
* @author Leon
* @date ����ʱ�䣺2018��4��5�� ����5:04:06
* @version 1.0
* ��˵�� :
* 
*/
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import leon.sms.mapper.UserMapper;
import leon.sms.pojo.User;
import leon.sms.service.UserService;

@Service
public class UserServiceImpl implements UserService
{
	@Autowired
	UserMapper userMapper;

	@Override
	public List<User> list()
	{
		return userMapper.list();
	}
	
}
