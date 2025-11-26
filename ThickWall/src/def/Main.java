package def;

import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

public class Main {
	
	public static void main(String[] args) {
		
		//Interfaz
		
		Frame mainFrame = new Frame();
		
		//Cálculo sin interfaz
		
		float r = 5f;
		float ks= 1.5f;
		
		Material steel    = new Material(0.3f,2.1e+6f,2.0e+3f);
		Tube     tube 	  = new Tube(3f,7f,90f,0f,true);
		Result   result   = new Result();
		
		//result.tension(mainFrame.a, tube.b, tube.Pa, tube.Pb, r, ks, steel.yield);
		//result.desp(tube.a, tube.b, tube.Pa, tube.Pb, r, steel.mu, steel.E,tube.axial );
		//result.def(steel.E, steel.mu,tube.axial);
		
		
		
		
		
		
	}

}
