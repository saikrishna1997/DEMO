package src.main.java.test.main;

import src.main.java.test.abc.Add;
import src.main.java.test.krishna.Subtraction;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x=10,y=20;
		
		Add obj =new Add();
		Subtraction obj1=new Subtraction();
		
		obj.add(x, y);
		obj1.sub(x, y);
	}

}
