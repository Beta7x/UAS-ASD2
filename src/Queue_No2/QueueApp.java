package Queue_No2;


public class QueueApp {

	public static void main(String[] args) {
		Queue antrian = new Queue(10);
		System.out.println("Soal No 2 (queue)" + "\n" +
							"===========================" + "\n");
		antrian.enqueue(126);
		antrian.display();
		antrian.space();
		antrian.enqueue(60);
		antrian.display();
		antrian.space();
		System.out.println("nilai yang paling depan = " + antrian.peek());
		antrian.space();
		System.out.println("Nama saya adalah Widies Ade Priyanto");
		antrian.space();
		antrian.space();
		antrian.enqueue(70);
		antrian.display();
		antrian.space();
		System.out.println("yang diambil dari antrian = " + antrian.dequeue());
		antrian.space();
		antrian.display();
		antrian.space();
		System.out.println("nilai yang paling depan = " + antrian.peek());
		System.out.println();
		antrian.address();
	}

}
