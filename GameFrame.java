import javax.swing.JFrame;
import java.awt.*;



public class  GameFrame extends JFrame
{
	/*************************************************************/
	//�Զ����һ������
	void customize()
	{
		setSize(800,600);
		setLocationRelativeTo(null);
		setResizable(false);
		setTitle("�����С��");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	//�ڶ�������
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
