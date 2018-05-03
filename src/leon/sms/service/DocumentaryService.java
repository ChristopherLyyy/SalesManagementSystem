package leon.sms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import leon.sms.mapper.GoodsMapper;
import leon.sms.pojo.Goods;
import leon.sms.pojo.Project;

/** 
* @author Leon
* @date ����ʱ�䣺2018��5��3�� ����4:27:46
* @version 1.0
* ��˵�� :
* 
*/
@Service
public class DocumentaryService
{
	@Autowired
	GoodsMapper goodsMapper;
	
	public void changeGoodsNum(Project project)
	{
		Goods goods = goodsMapper.get(project.getGoodsName());
		
		if(project.getState().equals("�ѷ���"))
		{
			System.out.println("���������");
			goods.setNumber(goods.getNumber()-project.getGoodsNumber());
			goodsMapper.update(goods);
		}
		if(project.getState().equals("��ȡ��"))
		{
			System.out.println("����������");
			goods.setNumber(goods.getNumber()+project.getGoodsNumber());
			goodsMapper.update(goods);
		}
	}
	
}
