class Dog
{
	//dog������
	String name;
	//dog����Ϊ��������
	void jump(String food)
	{
		System.out.println("�����"+name+food+"��ʱ��������������");

	}
	void bark(String food,String water)
	{
		System.out.println("�����   "+name+food+"��"+water+"��ʱ�������������");
	}
}
/********************************************************************************************/
class Car
{
	//car������
	String color;
	//car����Ϊ��������
	void run(int gas)
	{
		System.out.println("��"+gas+"L���ͣ������ܵú�Զ��");

	}
	void speedUp(String size)
	{
		System.out.println("����"+size+",�����ܵúܿ�");
	}
}

/********************************************************************************************/
public class Game2
{
	public static void main(String[] args)
	{
		//����һ��dog
		Dog d=new Dog();
		//��dog���в���
		d.name="Jack";//������Ҫ�ȷ����ȵ��ã���Ϊ����������Ҫ����
		d.jump("����");
		d.bark("��ͷ","ˮ");

		//����һ��С����
		Car c=new Car();
		//��car���в���
		c.color="��ɫ";
		c.run(500);
		c.speedUp("�ϵ�");
	}
}