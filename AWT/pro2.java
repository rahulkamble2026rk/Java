import java.awt.*;
import java.awt.event.*;
 
// we have to define our Mydialog class , Dialog is similar as the frame ,
// there is no default construnctor present in the Dialog so we have to pass the paramter to the MyDialog class ka construnctor as the paramter  
// 1st paramter is frame object for which the Dialog will work and Modal
class MyDialog extends Dialog        
{  
    MyFrame2 ref; 
    Button btn1;
    Button btn2;
    MyDialog(MyFrame2 temp)
    {
        super(temp,false);  
        ref=temp;
        this.setSize(400,400);
        this.setBackground(Color.white);
        this.setTitle("This is Dialog");
        this.setLocationRelativeTo(ref);  
        this.setLayout(null);  // this is the one of the most important during the adding component on the container 
        
         
        btn1=new Button("Yes");
        btn1.setBounds(20,250,70,50);
        btn1.setBackground(Color.white);
        btn1.setForeground(Color.black); 
        this.add(btn1); 
        
        btn2=new Button("No");
        btn2.setBounds(300,250,70,50);
        btn2.setBackground(Color.white);
        btn2.setForeground(Color.black); 
         
        MyDialog dl=this;
        MouseAdapter obj=new MouseAdapter()
        {
             public void mouseClicked(MouseEvent e)
             {  
                dl.dispose();
                 ref.dispose();
             }
        }; 
         
        
         MouseAdapter obj2=new MouseAdapter()
        {
             public void mouseClicked(MouseEvent e)
             {  
                dl.dispose();
             }
        };
        
         btn1.addMouseListener(obj);   
         btn2.addMouseListener(obj2);  
        this.add(btn1); 
        this.add(btn2); 
        this.setVisible(true);
    }
}
class MyFrame2 extends Frame {
    Panel pnl2;
    Button btn2;
    Label lbl2;
    Checkbox chk1, chk2, chk3, chk4;
    Checkbox rdb1, rdb2, rdb3,rdb4; 
    Choice chc; 
    List lst;//this is used for multiple choices 
    TextField txtf;
    TextArea txta;  
    MenuBar mnb;
    
    MyFrame2()  
    {
        Font f = new Font("Arial", Font.BOLD, 15);
        setSize(1000, 800);
        setTitle("pro2");
        setLocationRelativeTo(null);
        setLayout(null);
        setBackground(Color.red);

        pnl2 = new Panel();
        pnl2.setBounds(10, 200, 900, 400);
        pnl2.setBackground(Color.YELLOW);
        pnl2.setLayout(null);

        btn2 = new Button("Hello");
        btn2.setBounds(10, 50, 80, 40);
        btn2.setBackground(Color.blue);
        btn2.setForeground(Color.BLACK);

        lbl2 = new Label("Hello Rahul, Good Evening :-> this is Label");
        lbl2.setBounds(100, 40, 370, 40);
        lbl2.setFont(f);
        lbl2.setBackground(Color.pink);
        lbl2.setForeground(Color.CYAN);

        chk1 = getCheckbox("1st year", 50, 100, f);
        chk2 = getCheckbox("2nd year", 50, 160, f);
        chk3 = getCheckbox("3rd year", 50, 220, f);
        chk4 = getCheckbox("4th year", 50, 280, f);

        CheckboxGroup cg = new CheckboxGroup();
        rdb1 = getRadiobox("Virat", cg, false, 170, 100, f);
        rdb2 = getRadiobox("Rohit", cg, false, 170, 160, f);
        rdb3 = getRadiobox("M.S.Dhoni", cg, false, 170, 220, f);
        rdb4= getRadiobox("Sachin", cg, false, 170, 280, f); 
        
        
        chc=new Choice();
        chc.setBounds(280,100 , 90, 40);
        chc.setFont(f); 
        chc.add("C"); 
        chc.add("Cpp");  
        chc.add("Java");  
        chc.add("ADS"); 
        chc.setBackground(Color.WHITE);
        chc.setForeground(Color.BLACK); 
         
        
        lst=new List(5,true);
        lst.setBounds(400,100 , 90, 90);
        lst.setFont(f); 
        lst.add("C"); 
        lst.add("Cpp");  
        lst.add("Java");  
        lst.add("ADS");  
        lst.add("Python"); 
        lst.setBackground(Color.WHITE);
        lst.setForeground(Color.BLACK);  
         
        
        txtf=new TextField();
        txtf.setBounds(520,100,100, 40);
        txtf.setFont(f); 
        txtf.setBackground(Color.WHITE);
        txtf.setForeground(Color.BLACK);
         
        
        txta=new TextArea();
        txta.setBounds(670,100,150, 90);
        txta.setFont(f); 
        txta.setBackground(Color.WHITE);
        txta.setForeground(Color.BLACK); 
         
         
        mnb=new MenuBar();  
         
        Menu filename=new Menu("FILE");
        Menu viewname=new Menu("VIEW");
        Menu newmenu=new Menu("NEW"); 
        
        mnb.add(filename); 
        mnb.add(viewname); 
        mnb.add(newmenu);
        
        
        
        MyFrame2 ref=this;
        WindowAdapter obj = new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                  
                new MyDialog(ref);
            }
        };

        this.addWindowListener(obj);
        pnl2.add(lbl2);
        pnl2.add(btn2);
        pnl2.add(chk1);
        pnl2.add(chk2);
        pnl2.add(chk3);
        pnl2.add(chk4);
        pnl2.add(rdb1); 
        pnl2.add(rdb2); 
        pnl2.add(rdb3);  
        pnl2.add(rdb4);  
        pnl2.add(chc); 
        pnl2.add(lst);
        pnl2.add(txtf); 
        pnl2.add(txta);
        this.add(pnl2); 
        this.setMenuBar(mnb);
        setVisible(true);
    }

    Checkbox getCheckbox(String name, int x, int y, Font f) {
        Checkbox temp = new Checkbox(name);
        temp.setBounds(x, y, 90, 40);
        temp.setFont(f);
        temp.setBackground(Color.WHITE);
        temp.setForeground(Color.BLACK);
        return temp;
    }

    Checkbox getRadiobox(String name, CheckboxGroup group, boolean state, int x, int y, Font f) {
        Checkbox temp = new Checkbox(name, group, state);
        temp.setBounds(x, y, 90, 40);
        temp.setFont(f);
        temp.setBackground(Color.WHITE);
        temp.setForeground(Color.BLACK);
        return temp;
    }
}

public class pro2 {
    public static void main(String args[]) {
        MyFrame2 obj = new MyFrame2(); 
       
    }
}
