package assignment8;

import java.awt.*;

import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.border.Border;

public class ConvertUnits extends JFrame implements ActionListener {
	  JFrame f1;
	  JLabel lblMile,lblKilometer,lblPound,lblKilogram,lblGallon,lblLiter,lblFarenheit,lblCentigrade;
	  JTextField txtMile,txtCity,txtKilometer,txtPound,txtKilogram,txtGallon,txtLiter,txtFarenheit,txtCentigrate;
	  JButton btnMile,btnPound,btnGallon,btnFarenheit;
	  JPanel p1;
	  FlowLayout fl;
	  public ConvertUnits(){
		   f1=new JFrame("Metric Conversion Assistant");

		   lblMile=new JLabel("Mile :");
		   lblKilometer=new JLabel("Kilometer :");
		   lblPound=new JLabel("Pound :");
		   lblKilogram=new JLabel("Kilogram :");
		   lblGallon=new JLabel("Gallon :");
		   lblLiter=new JLabel("Liter :");
		   lblFarenheit=new JLabel("Farenheit :");
		   lblCentigrade=new JLabel("Centigrade :");
		   
		   txtMile=new JTextField(40);
		   txtKilometer=new JTextField(40);
		   txtPound=new JTextField(40);
		   txtKilogram=new JTextField(40);
		   txtGallon=new JTextField(40);
		   txtLiter=new JTextField(40);
		   txtFarenheit=new JTextField(40);
		   txtCentigrate=new JTextField(40);
		   
		   btnMile=new JButton("ConvertToKilometer");
		   btnMile.addActionListener(this);
		   btnPound=new JButton("ConvertToKilogram");
		   btnPound.addActionListener(this);
		   btnGallon=new JButton("ConvertToLiter");
		   btnGallon.addActionListener(this);
		   btnFarenheit=new JButton("ConvertToCelcius");
		   btnFarenheit.addActionListener(this);
		   
		   p1=new JPanel();
		   Border padding = BorderFactory.createEmptyBorder(20, 20, 20, 20);
		   p1.setBorder(padding);
		   p1.setLayout(new GridLayout(4,5,10,20));
		   p1.add(lblMile);
		   p1.add(txtMile);
		   p1.add(btnMile);
		   p1.add(lblKilometer);
		   p1.add(txtKilometer);
		   p1.add(lblPound);
		   p1.add(txtPound);
		   p1.add(btnPound);
		   p1.add(lblKilogram);
		   p1.add(txtKilogram);
		   p1.add(lblGallon);
		   p1.add(lblGallon);
		   p1.add(txtGallon);
		   p1.add(btnGallon);
		   p1.add(lblLiter);
		   p1.add(txtLiter);
		   p1.add(lblFarenheit);
		   p1.add(txtFarenheit);
		   p1.add(btnFarenheit);
		   p1.add(lblCentigrade);
		   p1.add(txtCentigrate);
		   		   
		   f1.setLayout(new GridLayout(1,1));
		   f1.add(p1);
		   f1.setSize(600,250);
		   f1.setVisible(true);
		   f1.setResizable(false);
		   f1.setLocation(225,100);
		   f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		   
		
	}
	public void actionPerformed(ActionEvent e){
		JButton bttnPressed =(JButton)e.getSource();
		String convertStr=bttnPressed.getText();
		if(convertStr.equals("ConvertToKilometer")){
			String km=String.valueOf(Double.valueOf(txtMile.getText())*1.60934);
			txtKilometer.setText(km);
		}else if(convertStr.equals("ConvertToKilogram")){
			String pound=String.valueOf(Double.valueOf(txtPound.getText())*0.453592);
			txtKilogram.setText(pound);
		}else if(convertStr.equals("ConvertToLiter")){
			String liter=String.valueOf(Double.valueOf(txtGallon.getText())*3.78541);
			txtLiter.setText(liter);
		}else if(convertStr.equals("ConvertToCelcius")){
			double faren=Double.valueOf(txtFarenheit.getText());
			double cel=((faren-32)*5)/9;
			String celcius=String.valueOf(cel);
			txtCentigrate.setText(celcius);
		}
		
	}
	
	public static void main(String[] args) {
		ConvertUnits stdForm=new ConvertUnits();

	}

}
