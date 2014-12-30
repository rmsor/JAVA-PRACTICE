package assignment8;

import java.awt.*;

import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.border.Border;

public class StringUtility extends JFrame implements ActionListener {
	  JFrame f1;
	  JLabel lblInput,lblOutput;
	  JTextField txtInput,txtOutput;
	  JButton btnCountLetters,btnReverseLetters,btnRemoveDuplicate;
	  JPanel p1,p2;
	  FlowLayout fl;
	  public StringUtility(){
		   f1=new JFrame("String Utility");

		   lblInput=new JLabel("Input :");
		   lblOutput=new JLabel("Output :");
		   
		   txtInput=new JTextField(40);
		   txtOutput=new JTextField(40);
		   
		   btnCountLetters=new JButton("Count Letters");
		   btnCountLetters.addActionListener(this);
		   btnReverseLetters=new JButton("Reverse Letters");
		   btnReverseLetters.addActionListener(this);
		   btnRemoveDuplicate=new JButton("Remove Duplicates");
		   btnRemoveDuplicate.addActionListener(this);
		   
		   p1=new JPanel();
		   Border padding = BorderFactory.createEmptyBorder(20, 20, 20, 20);
		   p1.setBorder(padding);
		   p1.setLayout(new GridLayout(3,1,10,20));
		   p1.add(btnCountLetters);
		   p1.add(btnReverseLetters);
		   p1.add(btnRemoveDuplicate);
		   
		   p2=new JPanel();
		   Border padding1 = BorderFactory.createEmptyBorder(20, 20, 20, 20);
		   p2.setBorder(padding1);
		   p2.setLayout(new GridLayout(4,1,3,3));	
		   p2.add(lblInput);
		   p2.add(txtInput);
		   p2.add(lblOutput);
		   p2.add(txtOutput);
		   
		   f1.setLayout(new GridLayout(1,2));
		   f1.add(p1);
		   f1.add(p2);
		   f1.setSize(600,250);
		   f1.setVisible(true);
		   f1.setResizable(false);
		   f1.setLocation(225,100);
		   f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		   
		
	}
	public void actionPerformed(ActionEvent e){
		JButton bttnPressed =(JButton)e.getSource();
		String convertStr=bttnPressed.getText();
		if(convertStr.equals("Count Letters")){
			String length=String.valueOf(txtInput.getText().length());
			txtOutput.setText(length);
		}else if(convertStr.equals("Reverse Letters")){
			int length=txtInput.getText().length();
			String reverse="";
			 for ( int i = length - 1 ; i >= 0 ; i-- )
		         reverse = reverse + txtInput.getText().charAt(i);
			txtOutput.setText(reverse);
		}else if(convertStr.equals("Remove Duplicates")){
			txtOutput.setText(removeMultipleOccurrence(txtInput.getText()));
		}		
	}
	
	public static void main(String[] args) {
		StringUtility stdForm=new StringUtility();

	}
	public static String removeMultipleOccurrence(final String input) {
	    final StringBuilder result = new StringBuilder();
	    for (int i = 0; i < input.length(); i++) {
	        String currentChar = input.substring(i, i + 1);
	        if (result.indexOf(currentChar) < 0) //if not contained
	            result.append(currentChar);
	    }
	    String retStr=String.valueOf(result);
	    return retStr;
	}

}
