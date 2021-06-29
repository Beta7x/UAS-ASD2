package Stack_No1;


public class StackApp {

	public static void main(String[] args) {
		Stack tumpukan = new Stack(10);
		System.out.println("Soal no 1 Stack : " + "\n");
		tumpukan.push(126);
		tumpukan.baca();
		tumpukan.space();
		tumpukan.push(30);
		tumpukan.baca();
		tumpukan.space();
		System.out.println("nilai teratas = " + tumpukan.peek());
		tumpukan.space();
		System.out.println("Nama saya adalah Widies Ade Priyanto");
		tumpukan.space();
		System.out.println("nilai yang dihapus = " + tumpukan.pop());
		tumpukan.space();
		tumpukan.baca();
		tumpukan.space();
		tumpukan.space();
		tumpukan.push(40);
		tumpukan.baca();
		tumpukan.space();
		tumpukan.push(50);
		tumpukan.baca();
		tumpukan.space();
		tumpukan.address();

	}

}
