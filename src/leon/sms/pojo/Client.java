package leon.sms.pojo;
/** 
* @author Leon
* @date ����ʱ�䣺2018��4��7�� ����12:14:58
* @version 1.0
* ��˵�� :
* 
*/
public class Client
{
	private String name;
	private String phoneNumber;
	private int projectsNum;//��ɵĶ�����
	public Client()
	{
		super();
	}
	
	public Client(String name, String phoneNumber, int projectsNum)
	{
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.projectsNum = projectsNum;
	}
	@Override
	public String toString()
	{
		return "Client [name=" + name + ", phoneNumber=" + phoneNumber + ", projectsNum=" + projectsNum + "]";
	}

	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getPhoneNumber()
	{
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber)
	{
		this.phoneNumber = phoneNumber;
	}
	public int getProjectsNum()
	{
		return projectsNum;
	}
	public void setProjectsNum(int projectsNum)
	{
		this.projectsNum = projectsNum;
	}
}
