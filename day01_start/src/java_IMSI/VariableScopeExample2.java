package java_IMSI;

public class VariableScopeExample2 {

	public static void main(String[] args) {
		int v1 = 15;
		if(v1 > 10) {
			int v2;
			v2 = v1 - 10;
		}
		
		int v3 = v1 + v2 + 5;
	}

}
