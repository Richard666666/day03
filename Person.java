public class Person  //将公共的提取出来
{
	String name;
	int age;

	void eat(String place,String food)//写上void表示没有因变量
	{
		System.out.println(name+"eat"+food+"in"+place);
	}
	
	void playGame(String place,String gameName)
	{
		System.out.println(name+"play"+gameName+"in"+place);
	}


}
