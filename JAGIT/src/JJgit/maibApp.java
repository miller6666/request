package JJgit;

public class maibApp {

	public static void main(String[] args) {
		//�ժ��s�W
		System.out.println("join us");
		Math math = new Math();
		System.out.println(math.add(10,8));
	}
 
}
class Math{
	int add(int a, int b) {
		return a+b;
	}
}
