public class Driver {

	public static void main(String[] args) {
		HugeInteger num1 = new HugeInteger("1234" , '+');
		HugeInteger num2 = new HugeInteger("1256" , '+');
		HugeInteger num3 = num1.plus(num2);
		MyDoublyLinkedList<HugeInteger> unsorted = new MyDoublyLinkedList<HugeInteger>();
		unsorted.Append(num1);
		unsorted.Prepend(num2);
		unsorted.Append(num3);		

	}

}