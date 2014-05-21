
public class Model {
	
	View v;
	
	public Model() {
		v = new View();
	}
	
	void schreibeGross(String s) {
		v.updateWert(s.toUpperCase());
	}

}
