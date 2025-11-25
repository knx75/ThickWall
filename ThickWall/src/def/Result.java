package def;

public class Result {
	
	float or;
	float ot;
	float oz;
	
	public void tension(float a, float b, float Pa, float Pb, float r, float ks, float yield) {
		
		float l = ((Pa * a * a) - (Pb * b * b))/(b*b-a*a);
		this.oz = l;
		float n = (Pa - Pb)/(b*b-a*a);
		float m = (a*a*b*b)/(r*r);
		float or = l - m*n;
		this.or = or;
		float ot = l + m*n;
		this.ot = ot;
		float oeq = (float) (0.7071f * (Math.sqrt((or-ot)*(or-ot)+or*or+ot*ot)));
		
		System.out.println("----------------------------------");
		System.out.println("Tensiones en r = "+r);
		System.out.println("Tensión radial: "+or+" Kgf/cm^2");
		System.out.println("Tensión tangencial: "+ot+" Kgf/cm^2");
		System.out.println("Tensión equivalente Von Mises: "+oeq+" Kgf/cm^2");
		System.out.println("Límite de fluencia con K.S. : "+(yield/ks)+" Kgf/cm2");
		
		if(oeq >= (yield/ks)) {
			System.out.println("La tensión sobrepasa el límite de fluencia");
		}
		else {
			System.out.println("Dentro del límite elástico");
		}
		System.out.println("----------------------------------");
	}
	
	public void desp(float a, float b, float Pa, float Pb, float r, float mu, float E,boolean axial) {
		
		float m = ((1+mu)/E)*((a*a*b*b)/(r))*((Pa-Pb)/(b*b-a*a));
		
		if (axial==true) {
			System.out.println("Axial: true");
			float l1 = ((1-2*mu)/E)*((Pa*a*a-Pb*b*b)/(b*b-a*a))*r;
			float z1 = l1+m;
			System.out.println("Desplazamiento en r("+r+"): "+z1+" cm. // "+z1*(1.0e+3f)+" mm. // "+z1*(1.0e+6f)+" um.");
			System.out.println("----------------------------------");
		}
		else {
			float l = ((1-mu)/E)*((Pa*a*a-Pb*b*b)/(b*b-a*a))*r;
			float z = l+m;
			System.out.println("Desplazamiento en r("+r+"): "+z+" cm. // "+z*(1.0e+3f)+" mm. // "+z*(1.0e+6f)+" um.");
			System.out.println("----------------------------------");
		}
	}
	public void def(float E, float mu,boolean axial) {
		if(axial == true) {
			System.out.println("Axial: true");
			float er1 = (1/E)*(or-mu*(ot-oz));
			float et1 = (1/E)*(ot-mu*(or+oz));
			System.out.println("Deformacion radial: "+er1);
			System.out.println("Deformacion tangencial: "+et1);
			System.out.println("----------------------------------");
		}
		else {
			float er = (1/E)*(or-mu*ot);
			float et = (1/E)*(ot-mu*or);
			System.out.println("Deformacion radial: "+er);
			System.out.println("Deformacion tangencial: "+et);
			System.out.println("----------------------------------");
		}
	}
}
