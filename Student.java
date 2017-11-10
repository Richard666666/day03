public class Student extends Person//类的命名首字母大写
{
	//学生的属性；定义变量，自变量是什么类型（申请内存）
	String id;
	//学生的行为,写成方法；
	void study(String place,String course)
	{
		System.out.println(name+"attend to"+course+"at"+place);
	}
}