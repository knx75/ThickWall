package def;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Frame extends JFrame implements ActionListener {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	JButton button;
	JTextField field1;
	JTextField field2;
	JTextField field3;
	JTextField field4;
	JTextField field5;
	JTextField field6;
	JTextField field7;
	JTextField field8;
	JTextField field9;
	JLabel labelResultOeq;
	JLabel labelResultOt;
	JLabel labelResultOr;
	JLabel labelResultU;
	JLabel labelResultEr;
	JLabel labelResultEt;
	
	float a;
	float b;
	float Pa;
	float Pb;
	float r;
	float E;
	float mu;
	float yield;
	float ks;
	boolean axial;

	Frame(){
		
		ImageIcon image = new ImageIcon("cilinderlogo.png");
		
		field1 = new JTextField();
		field1.setBounds(560,50,60,30);
		
		field2 = new JTextField();
		field2.setBounds(560,120,60,30);
		
		field3 = new JTextField();
		field3.setBounds(560,190,60,30);
		
		field4 = new JTextField();
		field4.setBounds(560,260,60,30);
		
		field5 = new JTextField();
		field5.setBounds(560,330,60,30);
		
		field6 = new JTextField();
		field6.setBounds(800,50,60,30);
		
		field7 = new JTextField();
		field7.setBounds(800,120,60,30);
		
		field8 = new JTextField();
		field8.setBounds(800,190,60,30);
		
		field9 = new JTextField();
		field9.setBounds(900,50,60,30);
		
		
		JLabel label1 = new JLabel();
		label1.setText("Cilindro de paredes gruesas");
		label1.setIcon(image);
		label1.setFont(new Font("Calibri",Font.BOLD,20));
		label1.setHorizontalTextPosition(JLabel.CENTER);
		label1.setVerticalTextPosition(JLabel.TOP);
		label1.setHorizontalAlignment(JLabel.LEFT);
		label1.setVerticalAlignment(JLabel.TOP);
		label1.setBounds(50, 50, 315, 315);
		
		JLabel label2 = new JLabel();
		label2.setText("Radio Interior a(cm): ");
		label2.setBounds(400, 50, 140, 40);
		
		JLabel label3 = new JLabel();
		label3.setText("Radio Exterior b(cm): ");
		label3.setBounds(400,120,140,40);
		
		JLabel label4 = new JLabel();
		label4.setText("Presión Interior (Kgf/cm2): ");
		label4.setBounds(400, 190, 160, 40);
		
		JLabel label5 = new JLabel();
		label5.setText("Presión Exterior (Kgf/cm2): ");
		label5.setBounds(400, 260, 165, 40);
		
		JLabel label6 = new JLabel();
		label6.setText("Radio r(cm): ");
		label6.setBounds(400, 330, 140, 40);
		
		JLabel label7 = new JLabel();
		label7.setText("Módulo Elástico E(Kgf/cm2): ");
		label7.setBounds(630, 50, 170, 40);
		
		JLabel label8 = new JLabel();
		label8.setText("Límite Fluencia (Kgf/cm2): ");
		label8.setBounds(630, 120, 170, 40);
		
		JLabel label9 = new JLabel();
		label9.setText("Módulo Poisson: ");
		label9.setBounds(630, 190, 140, 40);
		
		labelResultOeq = new JLabel();
		labelResultOeq.setText("Tensión Equivalente: ?  Kgf/cm2");
		labelResultOeq.setBounds(100, 500, 500, 40);
		
		labelResultOt = new JLabel();
		labelResultOt.setText("Tensión Tangencial: ?  Kgf/cm2");
		labelResultOt.setBounds(100, 550, 500, 40);
		
		labelResultOr = new JLabel();
		labelResultOr.setText("Tensión Radial: ?  Kgf/cm2");
		labelResultOr.setBounds(100, 600, 500, 40);
		
		labelResultU = new JLabel();
		labelResultU.setText("Desplazamiento: ?  cm/mm/um");
		labelResultU.setBounds(100, 650, 500, 40);
		
		labelResultEr = new JLabel();
		labelResultEr.setText("Deformación Radial: ?");
		labelResultEr.setBounds(100, 700, 500, 40);
		
		labelResultEt = new JLabel();
		labelResultEt.setText("Deformación tangencial: ?");
		labelResultEt.setBounds(100, 750, 500, 40);

		
	
	    button = new JButton();
		button.setBounds(400, 400, 100, 50);
		button.setText("Calcular");
		button.setFont(new Font("Calibri",Font.ITALIC,20));
		button.setFocusable(false);
		button.addActionListener(this);
		
		
		this.setVisible(true);
		this.setSize(1000, 1000);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("ThickWallCillinder");
		this.setResizable(true);
		this.getContentPane().setBackground(new Color(0xFFFFFF));
		
		this.add(button);
		
		this.add(label1);
		this.add(label2);
		this.add(label3);
		this.add(label4);
		this.add(label5);
		this.add(label6);
		this.add(label7);
		this.add(label8);
		this.add(label9);
		this.add(labelResultOeq);
		this.add(labelResultOr);
		this.add(labelResultOt);
		this.add(labelResultU);
		this.add(labelResultEr);
		this.add(labelResultEt);
		
		this.add(field1);
		this.add(field2);
		this.add(field3);
		this.add(field4);
		this.add(field5);
		this.add(field6);
		this.add(field7);
		this.add(field8);
		this.add(field9);

		
		this.setLayout(null);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button) {
			a = Float.parseFloat(field1.getText());
			System.out.println(a);
			
			b = Float.parseFloat(field2.getText());
			System.out.println(b);
			
			Pa = Float.parseFloat(field3.getText());
			System.out.println(Pa);
			
			Pb = Float.parseFloat(field4.getText());
			System.out.println(Pb);
			
			r = Float.parseFloat(field5.getText());
			System.out.println(r);
			
			E = Float.parseFloat(field6.getText());
			System.out.println(E);
			
			yield = Float.parseFloat(field7.getText());
			System.out.println(yield);
			
			mu = Float.parseFloat(field8.getText());
			System.out.println(mu);
			
			ks = Float.parseFloat(field9.getText());
			System.out.println(ks);
			
			axial = false;
			
			Result.tension(a,b,Pa,Pb,r,ks,yield);
			Result.desp(a,b,Pa,Pb,r,mu,E,axial);
			Result.def(E, mu, axial);
			labelResultOeq.setText("Tensión Equivalente: "+(Float.toString(Result.oeq))+" Kgf/cm2");
			labelResultOr.setText("Tensión Radial: "+(Float.toString(Result.or))+" Kgf/cm2");
			labelResultOt.setText("Tensión Tangencial: "+(Float.toString(Result.ot))+" Kgf/cm2");
			labelResultU.setText("Desplazamiento Radial: "+(Float.toString(Result.u))+" cm // "+(Float.toString(Result.u*1.0e+3f))+" mm // "+(Float.toString(Result.u*1.0e+6f))+" um");
			labelResultEr.setText("Deformación Radial: "+(Float.toString(Result.er)));
			labelResultEt.setText("Deformación Tangencial: "+(Float.toString(Result.et)));
			
			//labelResult.setText(Result.or);
		
		}
	}
}
