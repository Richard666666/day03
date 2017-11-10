public class Teacher extends Person//类的命名首字母大写，Teacher是儿子（子类），Person是父亲（父类）
{
	//老师的属性；定义变量，自变量是什么类型（申请内存）
	String Title;
	//老师的行为,写成方法；
	void teach(String place,String course)
	{
		System.out.println(name+"attend to"+course+"at"+place);
	}
}