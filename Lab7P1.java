import java.awt.event.*;
import java.awt.*;
	class Lab7P1{
		public static void main(String...args){
			final int[] a = {1};
			Button b = new Button("Click");
			b.setSize(20,40);
			Frame f = new Frame();
			FlowLayout fl = new FlowLayout();
			f.setLayout(fl);
			
			TextField tf = new TextField(20);
			Label l = new Label();
			l.setPreferredSize(new Dimension(100,200));
			f.setSize(400,400);
			f.add(tf);
			f.add(b);
			f.add(l);
			b.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent ae){
					System.out.println(tf.getText());
					l.setText(tf.getText()+"-"+a[0]);
					a[0]++;	
				}
			
			}
			);
			f.addWindowListener(new WindowAdapter(){
				public void windowClosing(WindowEvent we){
					f.dispose();
				}
			}	
			);
			f.setVisible(true);
        }
			
		}	
	