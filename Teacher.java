public class Teacher extends Person//�����������ĸ��д��Teacher�Ƕ��ӣ����ࣩ��Person�Ǹ��ף����ࣩ
{
	//��ʦ�����ԣ�����������Ա�����ʲô���ͣ������ڴ棩
	String Title;
	//��ʦ����Ϊ,д�ɷ�����
	void teach(String place,String course)
	{
		System.out.println(name+"attend to"+course+"at"+place);
	}
}