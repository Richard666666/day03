import javax.swing.JFrame;
import java.awt.*;
/******************************************************/
public class  Chess extends JFrame
{

	void customize()
	{
		setSize(600,640);
		setResizable(false);
		setLocationRelativeTo(null);
		setTitle("五指棋");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
/***********************************************************/
		public void paint(Graphics g)
	{
		
		int n;
		int m;
		int i;
		int j;
		super.paint(g);
		
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, 600, 620);
	
		g.setColor(Color.BLACK);

		for(n=40;n<=600;n=n+40)
		{
			g.drawLine(20, n, 580, n);//横线
			//g.fillRect(2*n-20, 2*n-40, 40, 40);
		}
		

		for(m=20;m<600;m=m+40)
		{
			g.drawLine(m, 40, m, 600);//竖线
			//g.fillRect(m, 40+2*m,40,40);
		}
		g.fillOval(135, 155, 10, 10);
		g.fillOval(455, 155, 10, 10);

		g.fillOval(135, 475, 10, 10);
		g.fillOval(455, 475, 10, 10);

		g.fillOval(295, 315, 10, 10);

		for(j=0;j<7;j++)
		{
			for(i=40;i<320;i=i+40)
			{
				g.fillRect(40*j*2+20, 2*i-40, 40, 40);
				
				g.fillRect(40*(j+1)*2-20, 2*i, 40, 40);
				//g.fillRect(100, 2*i-40, 40, 40);

			}
			
		}
		




	
	}
 /*******************************************************/
	public static void main(String[] args) 
	{
		Chess c=new Chess();
		c.customize();
		c.setVisible(true);
	}
}
