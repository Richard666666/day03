class Dog
{
	//dog的属性
	String name;
	//dog的行为（方法）
	void jump(String food)
	{
		System.out.println("当你给"+name+food+"的时候，它会跳起来！");

	}
	void bark(String food,String water)
	{
		System.out.println("当你给   "+name+food+"和"+water+"的时候，它会叫起来！");
	}
}
/********************************************************************************************/
class Car
{
	//car的属性
	String color;
	//car的行为（方法）
	void run(int gas)
	{
		System.out.println("有"+gas+"L汽油，可以跑得很远！");

	}
	void speedUp(String size)
	{
		System.out.println("车身"+size+",可以跑得很快");
	}
}

/********************************************************************************************/
public class Game2
{
	public static void main(String[] args)
	{
		//构造一个dog
		Dog d=new Dog();
		//对dog进行操作
		d.name="Jack";//这属性要比方法先调用，因为方法里面需要属性
		d.jump("鸡腿");
		d.bark("骨头","水");

		//构造一个小汽车
		Car c=new Car();
		//对car进行操作
		c.color="红色";
		c.run(500);
		c.speedUp("较低");
	}
}