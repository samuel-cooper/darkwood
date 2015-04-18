public class Dummy {
	String name;
	int level;
	double hp;
	double atk;
	double ac;
	double exp;
	
	String getName() {
		return name;
	}
	
	double getHP() {
		return hp;
	}
	
	void setHP(double a) {
		hp = a;
	}
	
	double getATK() {
		return atk;
	}
	
	void setATK(double a) {
		atk = a;
	}
	
	double getAC() {
		return ac;
	}
	
	void setAC(double a) {
		ac = a;
	}

	double getEXP() {
		return exp;
	}
	
	void addEXP(double a) {
		exp += a;
	}
	
	void setLVL(int a) {
		level = a;
	}
}