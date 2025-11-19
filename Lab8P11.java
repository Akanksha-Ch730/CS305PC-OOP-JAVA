import java.awt.*;
import java.awt.event.*;

class Lab8P11 extends Frame implements ActionListener {
        Label l;
    
    Lab8P11() {
        super("Demonstration of MenuBar");
        
        
        MenuBar mb = new MenuBar();
        BorderLayout bl=new BorderLayout();
        setLayout(bl);
       // setLayout(new FlowLayout());
        setMenuBar(mb);

        l=new Label();
        l.setFont(new Font("Arial", Font.BOLD,40));
        l.setAlignment(Label.CENTER);
        l.setBounds(100,200,200,56);
        add(l,bl.CENTER);

       

        String[] menus = {"File", "Edit", "Help"};
        String[][] mi = {
            {"Open", "Save", "Close"},
            {"Cut", "Copy", "Paste"},
            {"About", "Update", "License"}
        };
        
        int x = 0; 
        for (String s : menus) { 
            Menu m = new Menu(s);
            
            
            for (int i = 0; i < 3 ; i++) { 
                MenuItem mni = new MenuItem(mi[x][i]);
                
                
                mni.addActionListener(this); 
                m.add(mni);
              
            }
            
           
            mb.add(m); 
            
            x++; 
        }

        
        setSize(250, 400);
        setVisible(true);

        
        addWindowListener(
            new WindowAdapter() {
                public void windowClosing(WindowEvent we) {
                    dispose();
                }
            }
        );
    }
    
    public void actionPerformed(ActionEvent ae) {
        String mstr = ae.getActionCommand();
        System.out.println("Menu Item Selected: " + mstr); 
        
        if (mstr.equals("Close")) {
            System.exit(0);
        }else{
          l.setText(mstr);
        }
        
    }
    
    public static void main(String[] args) {
        new Lab8P11();
    }
}