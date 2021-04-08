import java.util.*;

public class DoublyLinkedList {

	public static void main(String[] args) {
		LinkedList<Integer> l = new LinkedList<Integer>();
		Scanner sc = new Scanner(System.in);
		int x, n;
		do {
			System.out.println("Enter the choice ");
			System.out.println("1 Insert in Front");
			System.out.println("2 Insert in end");
			System.out.println("3 Delete from front");
			System.out.println("4 Delete from last");
			System.out.println("5 Display");
			System.out.print("0 Exit  ");
			x = sc.nextInt();
			switch (x) {
			case 1:
				System.out.print("Enter the element  ");
				n = sc.nextInt();
				l.addFirst(n);
				break;
			case 2:
				System.out.print("Enter the element  ");
				n = sc.nextInt();
				l.addLast(n);
				break;
			case 3:
				l.removeFirst();
				break;
			case 4:
				l.removeLast();
				break;
			case 5:
				for (Integer i : l)
					System.out.print(i + " ");
				System.out.println();
				break;
			}
		} while (x != 0);
		sc.close();
	}
}
