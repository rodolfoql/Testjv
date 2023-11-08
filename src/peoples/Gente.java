package peoples;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Gente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total=0;
		int a, b;
		Scanner leer = new Scanner(System.in);
		System.out.println("Ingrese primer número: ");
		a = leer.nextInt();
		System.out.println("Ingrese segundo número: ");
		b = leer.nextInt();
		//total = a + b;
		ArrayList<Operaciones> list = new ArrayList<Operaciones>();
		Operaciones op = new Operaciones(a, b);
		Operaciones op1 = new Operaciones(3, 2);
		Operaciones op2 = new Operaciones(a*2, b*2);
		list.add(op);
		list.add(op1);
		list.add(op2);
		
		for(Operaciones o:list) {
			System.out.println(o.getSuma());
			System.out.println("------");
		}
		
		//System.out.println(op.getSuma());

	}

}
