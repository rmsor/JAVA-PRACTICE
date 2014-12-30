package assignment8;

import java.awt.*;

import javax.swing.*;
import javax.swing.border.Border;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PrintAddress extends JFrame implements ActionListener {
	  JFrame f1;
	  JLabel lblName,lblCity,lblStreet,lblState,lblZip;
	  JTextField txtName,txtCity,txtStreet,txtState,txtZip;
	  JButton btnSubmit;
	  JPanel p1,p2,p3;
	  FlowLayout fl;
	  public PrintAddress(){
		   f1=new JFrame("Address Form");

		   lblName=new JLabel("Name :");
		   lblCity=new JLabel("City :");
		   lblStreet=new JLabel("Street :");
		   lblState=new JLabel("State :");
		   lblZip=new JLabel("Zip :");

		   txtName=new JTextField(40);
		   txtCity=new JTextField(40);
		   txtStreet=new JTextField(40);
		   txtState=new JTextField(40);
		   txtZip=new JTextField(40);
		   btnSubmit=new JButton("Submit");
		   btnSubmit.addActionListener(this);
		   
		   fl=new FlowLayout();
		   p1=new JPanel();
		   p2=new JPanel();	
		   p3=new JPanel();
		   p1.setLayout(new GridLayout(2,3,10,10));
		   p1.add(lblName);
		   p1.add(lblCity);
		   p1.add(lblStreet);		   
		   p1.add(txtName);
		   p1.add(txtCity);
		   p1.add(txtStreet);
		   p2.setLayout(new GridLayout(2,2,10,10));
		   p2.add(lblState);
		   p2.add(lblZip);		   
		   p2.add(txtState);
		   p2.add(txtZip);
		   
		   p3.setLayout(new FlowLayout());
		   p3.add(btnSubmit);	   

		   f1.setLayout(new GridLayout(3,1,10,10));
		   f1.add(p1);
		   f1.add(p2);
		   f1.add(p3);
		   f1.setSize(500,250);
		   f1.setVisible(true);
		   f1.setResizable(false);
		   f1.setLocation(425,100);
		   f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		   
		
	}
	public void actionPerformed(ActionEvent e){
		String addressText=txtName.getText()+" \n"+txtStreet.getText()+"\n"+txtCity.getText()+", "+txtState.getText()+" "+txtZip.getText();
		System.out.println(addressText);
	}
	public static void main(String[] args) {
		PrintAddress stdForm=new PrintAddress();

	}

}
