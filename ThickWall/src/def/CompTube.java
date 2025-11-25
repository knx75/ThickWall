package def;

public class CompTube extends Tube {
	float c;
	CompTube(float a, float b,float c, float Pa, float Pb, boolean axial) {
		super(a, b, Pa, Pb, axial);
		this.c = c;
	}
}
