/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Final.update;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Abhishek jangid
 */
public class UserPanel implements ActionListener{
       JFrame jf;
       JLabel jl1,jl2,jl3;
        JTextField jt1,jt2;
        JButton jb;
        JComboBox cb;
    public UserPanel(){
      jf=new JFrame("TicTacToe Game by Abhishek");
      jf.setSize(600,400);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       jf.setLayout(null);
       
       jl1=new JLabel("Enter Player One:(x)");
       jl1.setBounds(100, 100, 150, 30);
      jf.add(jl1);
      
      jt1=new JTextField();
      jt1.setBounds(230, 100, 120, 30);
      jf.add(jt1);
        
        
        
        jl2=new JLabel("Enter Player One:(0) ");
        jl2.setBounds(100, 150, 150, 30);
        jf.add(jl2);
        
        jl3=new JLabel("Select Series :");
        jl3.setBounds(100, 190, 150, 30);
        jf.add(jl3);
        
         String[] series={"3", "5", "7", "9"};
         cb=new JComboBox(series);
         cb.setBounds(230, 190, 120, 30);
         jf.add(cb);
         
        jt2=new JTextField();
        jt2.setBounds(230, 150, 120, 30);
        jf.add(jt2);
        
        jb=new JButton("Start Game");
        jb.setBounds(230, 250, 100, 30);
        jb.addActionListener(this);
        jf.add(jb);
        jf.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()==jb){
           String Player1=jt1.getText();
           String Player2=jt2.getText();
           String series=(String)cb.getSelectedItem();
           
           Gamepanel gp=new Gamepanel(Player1, Player2,Integer.parseInt(series));
           gp.openGamePanel();
           jf.setVisible(false);
       }
        
    }
}
