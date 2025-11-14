import java.awt.event.*;
import java.awt.*;
	class Lab7P2 implements ActionListener{
		Frame f = new Frame();
		TextField tf = new TextField(20);
		Button b = new Button("Click");
		Label l=new Label();
		int a =1;
		Lab7P2(){
			final int[] a = {1};
			b.setSize(20,40);
			FlowLayout fl = new FlowLayout();
			f.setLayout(fl);
			l.setPreferredSize(new Dimension(100,200));
			f.setSize(400,400);
			f.add(tf);
			f.add(b);
			f.add(l);
			f.setVisible(true);
			b.addActionListener(this);
			f.addWindowListener(new WindowAdapter(){
			  public void windowClosing(WindowEvent we){
				f.dispose();
			  }

			});
		}
			public void actionPerformed(ActionEvent ae){
				System.out.println(tf.getText());
				l.setText(tf.getText()+"-"+a);
				a++;	
			}
		public static void main(String...args){
			Lab7P2 p = new Lab7P2();
		}
	}


