import javax.swing.JFrame;
import java.awt.*;



public class  GameFrame extends JFrame
{
	/*************************************************************/
	//自定义第一个方法
	void customize()
	{
		setSize(800,600);
		setLocationRelativeTo(null);
		setResizable(false);
		setTitle("大球吃小球");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	//第二个方法
	public void paint(Graphics g)
	{
		super.paint(g);
		g.setColor(Color.PINK);
		g.fillOval(100,200,80,80);
		g.drawOval(100,300,50,50);
		g.drawRect(300,300,50,50);
		g.fillRect(500,400,100,200);
		g.drawLine(50,50,500,600);
		g.setFont(new Font("Arail",Font.BOLD,52));
		g.drawString("Hello,world",400,300);


		Image image = Toolkit.getDefaultToolkit().getImage("baidu.png");
		g.drawImage(image, 200, 200, null);

	
	}
	/**********************************************************/
	public static void main(String[] args) 
	{
		GameFrame game=new GameFrame();
		game.customize();
		game.setVisible(true);


	
	}
}
