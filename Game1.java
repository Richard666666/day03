//1TBS-one True Bracing Style-Dennis Ritche
//Allman-FreeBSD
import java.lang.String;//lang是java的核心文件夹，java虚拟机自动加载
import java.lang.System;
import javax.swing.JFrame;





/*****************************************************/
public class Game1//类的名字要保持完全一致，public是可以拿给别人用
{
	public static void	main(String[] args)
	{
		System.out.println("Hello,world!");
		System.out.println("welcome the world!");

		Student stu=new Student();//造出了学生对象
		stu.name="Mr Wang";
		stu.eat("CSC","dinner");
		stu.study("Tsinghua University","MBA");
		stu.playGame("home","LOL");

		Teacher tea=new Teacher();//造出了老师对象
		tea.name="Miss Zhang";
		tea.eat("CSC","dinner");
		tea.teach("Tsinghua University","MBA");
		tea.playGame("home","LOL");

		JFrame f=new JFrame();
		f.setTitle("大球吃小球");
		f.setSize(800,600);//先写
		f.setLocationRelativeTo(null);//后写
		f.setVisible(true);

	}
}