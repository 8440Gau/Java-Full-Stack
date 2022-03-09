package variablescope;

public class Variablescopeof {
final int a=10;
	public static void main(String[] args) {
	Variablescopeof variablescopeof = new Variablescopeof();
	variablescopeof.display();
}
public void display() {
	final int a=15;
	//System.out.println(this.a);
	Runnable r = new Runnable() {
		
		int a=20;

		@Override
		public void run() {
			
			// TODO Auto-generated method stub
			System.out.println(this.a);
		}
		
	};
    r.run();
}

}
