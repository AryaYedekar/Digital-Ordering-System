import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
public class aj_mp extends JFrame
{	
	Container co;
	JTabbedPane jtp;
	public static String s1="", s2="",msg="";
	public static float tot=0;
	public aj_mp()
	{
		co=getContentPane();
		jtp=new JTabbedPane();
		jtp.add("Home",new Home());
		jtp.add("Choose",new Choose());
		jtp.add("Menu",new Menu());
		jtp.add("Bill",new Bill());
		
		Font f=new Font("Harrington",Font.BOLD,25);
		jtp.setFont(f);
		jtp.setForeground(Color.orange);
		jtp.setBackground(Color.black);
		co.add(jtp);
		setVisible(true);
		setSize(1950,950);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String args[])
	{
		aj_mp a1=new aj_mp();
	}
	

class Home extends JPanel
{
	ImageIcon img1;
	JLabel l1;
	public Home()
	{
		setLayout(null);
		img1=new ImageIcon("cafe.jpg");
		Image i=img1.getImage();
		Image nimg=i.getScaledInstance(1950,950,Image.SCALE_SMOOTH);
		img1=new ImageIcon(nimg);
		l1=new JLabel(img1);
		l1.setBounds(0,0,1950,950);
		l1.setIcon(img1);
		add(l1);

		addMouseListener(new MouseAdapter() { public void mouseClicked(MouseEvent me){jtp.setSelectedIndex(1);}});
		
	}
}
class Choose extends JPanel implements ActionListener
{
	ImageIcon img,img1,img2;
	JLabel l;
	JButton l1,l2;
	public Choose()
	{
		
		setLayout(null);
		img=new ImageIcon("choose.jpg");
		Image i=img.getImage();
		Image n1img=i.getScaledInstance(1950,950,Image.SCALE_SMOOTH);
		img=new ImageIcon(n1img);
		
		img1=new ImageIcon("have_here.jfif");
		Image i1=img1.getImage();
		Image n2img=i1.getScaledInstance(500,300,Image.SCALE_SMOOTH);
		img1=new ImageIcon(n2img);
		
		img2=new ImageIcon("takeaway.jfif");
		Image i2=img2.getImage();
		Image n3img=i2.getScaledInstance(500,300,Image.SCALE_SMOOTH);
		img2=new ImageIcon(n3img);
		
		l=new JLabel(img);    l1=new JButton("Have here",img1);   l2=new JButton("Takeaway",img2);
		l.setBounds(0,0,1950,950);   l1.setBounds(300,500,500,300);   l2.setBounds(1000,500,500,300);
		   add(l1);    add(l2);   add(l);
		
		l1.addActionListener(this);    l2.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==l1)
		{
			aj_mp.s1="Have here";
			JOptionPane.showMessageDialog(this,"Book a table ");
			jtp.setSelectedIndex(2);
			
			
		}
		if(ae.getSource()==l2)
		{
			JOptionPane.showMessageDialog(this," Extra Charge of packaging");
			aj_mp.s2="Takeaway";
			jtp.setSelectedIndex(2);
			tot=tot+50;
			msg=msg+"Packaging charge Rs.50\n";
		}
	}
	
}
class Menu extends JPanel implements ActionListener
{
	JButton b1;
	ImageIcon img;
	JLabel l,l1,l2,l3;
	JCheckBox c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,c13,c14,c15;
	Font f,f1;
		
	public Menu()
	{
		setLayout(null);
		img=new ImageIcon("menu2.png");
		Image i=img.getImage();
		Image n1img=i.getScaledInstance(1950,950,Image.SCALE_SMOOTH);
		img=new ImageIcon(n1img);
		l=new JLabel(img);   l.setBounds(0,0,1950,950); 

		f=new Font("Papyrus",Font.BOLD,30);
		f1=new Font("Papyrus",Font.BOLD,15);
		
		b1=new JButton("Order");
		b1.setFont(f1); b1.setBounds(900,870,150,50); b1.setForeground(Color.orange); b1.setBackground(Color.black); 
		b1.addActionListener(this); add(b1);
		
		l1=new JLabel("Coffee");
		l1.setFont(f);  l1.setBounds(480,205,520,205);  add(l1);
		
		l2=new JLabel("  Regular         ");	
		l2.setFont(f1);   l2.setBounds(600,250,650,250);   add(l2);

		l3=new JLabel("Add ONE's");
		l3.setFont(f);  l3.setBounds(1320,420,480,190);  add(l3);

		c1=new JCheckBox("Cappuccino-----------------------------------------------------215");
		c2=new JCheckBox("Americano------------------------------------------------------200");
		c3=new JCheckBox("Flat White-------------------------------------------------------275");
		c4=new JCheckBox("Caffe Latte------------------------------------------------------215");
		c5=new JCheckBox("Macchiato-------------------------------------------------------275");
		c6=new JCheckBox("Cold Brew-------------------------------------------------------205");
		c7=new JCheckBox("Frappe------------------------------------------------------------300");
		c8=new JCheckBox("Iced-coffee-------------------------------------------------------175");
		c9=new JCheckBox("Frappuccino-----------------------------------------------------300");
		c10=new JCheckBox("Mazagran------------------------------------------------------175");
		c11=new JCheckBox("Esspresso shot-----------------------------55");
		c12=new JCheckBox("Caramel syrup------------------------------45");
		c13=new JCheckBox("Soy/Almond Milk--------------------------50");
		c14=new JCheckBox("Sugar free-------------------------------------65");
		c15=new JCheckBox("Whipped cream-----------------------------65");

		c1.setBounds(200,400,480,40);
		c2.setBounds(200,450,480,40);
		c3.setBounds(200,500,480,40);
		c4.setBounds(200,550,480,40);
		c5.setBounds(200,600,480,40);
		c6.setBounds(200,650,480,40);
		c7.setBounds(200,700,480,40);
		c8.setBounds(1200,300,480,40);
		c9.setBounds(1200,350,480,40);
		c10.setBounds(1200,400,480,40);
		c11.setBounds(1230,580,350,30);
		c12.setBounds(1230,620,350,30);
		c13.setBounds(1230,660,350,30);
		c14.setBounds(1230,700,350,30);
		c15.setBounds(1230,740,350,30);
	   
		c1.setFont(f1);
		c2.setFont(f1);
		c3.setFont(f1);
		c4.setFont(f1);
		c5.setFont(f1);
		c6.setFont(f1);
		c7.setFont(f1);
		c8.setFont(f1);
		c9.setFont(f1);
		c10.setFont(f1);
		c11.setFont(f1);
		c12.setFont(f1);
		c13.setFont(f1);
		c14.setFont(f1);
		c15.setFont(f1);

		add(c1);
		add(c2);
		add(c3);
		add(c4);
		add(c5);
		add(c6);
		add(c7);
		add(c8);
		add(c9);
		add(c10);
		add(c11);
		add(c12);
		add(c13);
		add(c14);
		add(c15);
	
	add(l);		
	}
	public void actionPerformed(ActionEvent ae)
	{

		if(c1.isSelected())
		{
			tot=tot+215;
			msg=msg+"Cappuccino Rs.215\n";
		}
		if(c2.isSelected())
		{
			tot=tot+200;
			msg=msg+"Americano Rs.200\n";
		}
		if(c3.isSelected())
		{
			tot=tot+275;
			msg=msg+"Flat White Rs.275\n";
		}
		if(c4.isSelected())
		{
			tot=tot+215;
			msg=msg+"Latte Rs.215\n";
		}
		if(c5.isSelected())
		{
			tot=tot+275;
			msg=msg+"Macchiato Rs.275\n";
		}
		if(c6.isSelected())
		{
			tot=tot+205;
			msg=msg+"Cold Brew Rs.205\n";
		}
		if(c7.isSelected())
		{
			tot=tot+300;
			msg=msg+"Frappe Rs.300\n";
		}
		if(c8.isSelected())
		{
			tot=tot+175;
			msg=msg+"Iced Coffee Rs.175\n";
		}
		if(c9.isSelected())
		{
			tot=tot+300;
			msg=msg+"Frappuccino Rs.300\n";
		}
		if(c10.isSelected())
		{
			tot=tot+175;
			msg=msg+"Mazagran Rs.175\n";
		}
		if(c11.isSelected())
		{
			tot=tot+55;
			msg=msg+"Esspresso shot Rs.55\n";
		}
		if(c12.isSelected())
		{
			tot=tot+45;
			msg=msg+"Caramel syrup Rs.45\n";
		}
		if(c13.isSelected())
		{
			tot=tot+50;
			msg=msg+"Soy/Almond Milk Rs.50\n";
		}
		if(c14.isSelected())
		{
			tot=tot+65;
			msg=msg+"Sugar free Rs.65\n";
		}
		if(c15.isSelected())
		{
			tot=tot+50;
			msg=msg+"Wipped creame Rs.50\n";
		}
		JOptionPane.showMessageDialog(this,msg+"Total:"+tot);
		jtp.setSelectedIndex(3);
	}
}
class Bill extends JPanel implements ActionListener
{
	ImageIcon img1;
	JLabel l,l1,l2;
	JComboBox jb1;
	JTextField tf1;
	JTextArea ja1;
	JButton b1;
	public Bill()
	{
		setLayout(null);
		img1=new ImageIcon("bill3.jpg");
		Image i=img1.getImage();
		Image nimg=i.getScaledInstance(1950,950,Image.SCALE_SMOOTH);
		img1=new ImageIcon(nimg);
		l=new JLabel(img1);
		l.setBounds(0,0,1950,950);
		l2=new JLabel();
		ja1=new JTextArea();
		
		
		Font fo1=new Font("Consolas",Font.BOLD,20);
		l1=new JLabel("Table No");
		tf1=new JTextField(3);
		b1=new JButton("Get Bill");
		b1.setFont(fo1); b1.setBounds(900,870,150,50); b1.setForeground(Color.orange); b1.setBackground(Color.black); 
		b1.addActionListener(this); add(b1);
		
		l1.setBounds(850,150,100,60); l1.setFont(fo1);
		tf1.setBounds(950,150,100,50);
		add(l1);    add(tf1); add(ja1); add(l2); add(l); 
	} 
		public void actionPerformed(ActionEvent ae)
		{

		try
		{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			Connection co=DriverManager.getConnection("jdbc:odbc:Arya");
			
			int tblno=Integer.parseInt(tf1.getText());
			
			PreparedStatement ps=co.prepareStatement("insert into ajp_tbl values(?)");
			
			Font fo2=new Font("Consolas",Font.BOLD,28);
			ja1.setFont(fo2); 
			l2.setFont(fo2);
			//ja1.setForeground(Color.b);  
			ja1.setOpaque(false);
			ja1.setText("Table no:" + tblno + "\n" + msg );
			l2.setText("\nTotal:" + tot);
			ja1.setBounds(880,320,700,550);
			l2.setBounds(880,600,200,100);
			
			ps.setInt(1,tblno);
			ps.executeUpdate();
			ps.close();
			 co.close();
		}
		catch(Exception e)
		{
			System.out.println(""+e);
}
}
}
}
