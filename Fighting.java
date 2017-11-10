import javax.swing.JFrame;
import java.awt.*;
import javax.swing.border.LineBorder;



/******************************************************/
public class  Fighting extends JFrame
{

	void customize()
	{
		setSize(800,600);
		setResizable(false);
		setLocationRelativeTo(null);
		setTitle("Android robot  VS  Minions");
		setDefaultCloseOperation(EXIT_ON_CLOSE);//关窗口退出应用程序


	}
 /*******************************************************/
public void paint(Graphics g)//画图的方法
	{
		super.paint(g);
		g.setColor(Color.WHITE);
		g.fillRect(0,0,800,600);
		//画头部
		g.setColor(Color.GREEN);
		g.fillOval(100,100,160,160);
		//画眼睛
		g.setColor(Color.WHITE);
		g.fillOval(140,130,10,10);
		g.fillOval(200,130,10,10);
		//画脖子
		g.setColor(Color.WHITE);
		g.fillRect(100,160,160,100);
		//画身体
		g.setColor(Color.GREEN);
		g.fillRect(100,170,160,160);
		g.fillOval(210,130,10,10);
		//画腿腿
		g.setColor(Color.GREEN);
		g.fillRect(125,330,35,60);
		g.fillRect(205,330,35,60);
		//画手手
		g.fillRect(65,180,30,100);//左手
		g.fillRect(265,180,30,100);//右手
		//画头发
		
		g.drawLine(110, 100, 140, 130);
		

		
		g.drawLine(200, 150, 250, 100);
		
		//修正曲线
		g.fillOval(65,165,30,30);//左手上
		g.fillOval(65,265,30,30);//左手下

		g.fillOval(265,165,30,30);//右手上
		g.fillOval(265,265,30,30);//右手下
		

		g.setColor(Color.GREEN);
		g.fillOval(125,375,35,35);//左脚
		g.fillOval(205,375,35,35);//右脚

		g.setColor(Color.WHITE);
		g.fillRect(100,295,35,35);
		g.fillRect(225,295,35,35);

		g.setColor(Color.GREEN);
		g.fillOval(100,267,65,65);
		g.fillOval(195,267,65,65);
	






	}

/*******************************************************/


	public static void main(String[] args) 
	{
		Fighting f=new Fighting();
		f.customize();
		f.setVisible(true);

		
	}
}
