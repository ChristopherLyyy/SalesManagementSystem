package leon.sms.pojo;
/** 
* @author Leon
* @date ����ʱ�䣺2018��4��5�� ����3:37:20
* @version 1.0
* ��˵�� :
* 
*/
public class User
{
	private String name;
	private String keyword;
	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getKeyword()
	{
		return keyword;
	}
	public void setKeyword(String keyword)
	{
		this.keyword = keyword;
	}
	@Override
	public String toString()
	{
		return "User [name=" + name + ", keyword=" + keyword + "]";
	}
	
}
