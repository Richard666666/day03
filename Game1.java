//1TBS-one True Bracing Style-Dennis Ritche
//Allman-FreeBSD
import java.lang.String;//lang��java�ĺ����ļ��У�java������Զ�����
import java.lang.System;
import javax.swing.JFrame;





/*****************************************************/
public class Game1//�������Ҫ������ȫһ�£�public�ǿ����ø�������
{
	public static void	main(String[] args)
	{
		System.out.println("Hello,world!");
		System.out.println("welcome the world!");

		Student stu=new Student();//�����ѧ������
		stu.name="Mr Wang";
		stu.eat("CSC","dinner");
		stu.study("Tsinghua University","MBA");
		stu.playGame("home","LOL");

		Teacher tea=new Teacher();//�������ʦ����
		tea.name="Miss Zhang";
		tea.eat("CSC","dinner");
		tea.teach("Tsinghua University","MBA");
		tea.playGame("home","LOL");

		JFrame f=new JFrame();
		f.setTitle("�����С��");
		f.setSize(800,600);//��д
		f.setLocationRelativeTo(null);//��д
		f.setVisible(true);

	}
}