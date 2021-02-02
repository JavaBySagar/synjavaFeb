package old;
class Lab1Support implements Runnable{
	@Override
	public void run() {
		System.out.println("HelloWorld from Lab1Support Thread...");
	}
}
public class Lab1 {
	public static void main(String[] args) {
		Thread t1 = new Thread( new Lab1Support());
		t1.start();
	}
}
---------------------------
package old;
interface Lab2Support{
	public int add(int i, int j);
	}
class Lab2SupportImpl implements Lab2Support
{
@Override
public int add(int i, int j) {
	System.out.println(" in add with " + i + ",  " + j);
	return i+j;
}
}

public class Lab2 {
public static void main(String[] args) {
Lab2Support impl = new Lab2SupportImpl();
System.out.println("sum of 10, 033 is " + impl.add(10, 33));
}
}

-------------------
