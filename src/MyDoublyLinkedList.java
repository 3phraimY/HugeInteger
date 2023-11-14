
public class MyDoublyLinkedList<T> {
	public MyDoubleNode<T> Head;
	public MyDoubleNode<T> Tail;
	public int Size;
	
	public MyDoublyLinkedList() {
		this.Head = null;
		this.Tail = null;
		this.Size = 0;
	}
	
	//insert after
	public void InsertAfter(MyDoubleNode<T> cNode, T tar) {
		MyDoubleNode<T> nNode = cNode.NextNode;
		MyDoubleNode<T> newNode = new MyDoubleNode<T>(tar);
		cNode.NextNode = newNode;
		newNode.NextNode = nNode;
		newNode.PreviousNode = cNode;
		if (nNode != null) {
			nNode.PreviousNode = newNode;
		}
		this.Size++;
	}
	
	
	//remove after
	public void RemoveAfter(MyDoubleNode<T> node) {
		if (node.NextNode == null) {
			return;
		}
		MyDoubleNode<T> cNode = node.NextNode;
		MyDoubleNode<T> nNode = cNode.NextNode;
		//delete cNode
		cNode.NextNode = null;
		cNode.PreviousNode = null;
		
		node.NextNode = nNode;
		nNode.PreviousNode = node;
		this.Size--;
	}
	
	
	//search
	public MyDoubleNode<T> Search(T tar){
		MyDoubleNode<T> current = this.Head;
		while(current != null) {
			if (current.Data.equals(tar)) {
				return current;
			}
			current = current.NextNode;
		}
		return null;
	}
	
	public void Append(T tar) {
		MyDoubleNode<T> node = new MyDoubleNode<T>(tar);
		//when there is no node there
		if (this.Head == null) {
			this.Head = node;
			this.Tail = node;
		}
		this.Tail.NextNode = node;
		node.PreviousNode = this.Tail;
		this.Tail = node;
		this.Size++;
	}

	public void Prepend(T tar) {
		MyDoubleNode<T> node = new MyDoubleNode<T>(tar);
		if (this.Head == null) {
			this.Head = node;
			this.Tail = node;
		}
		MyDoubleNode<T> headNode = this.Head;
		this.Head = node;
		node.NextNode = headNode;
		headNode.PreviousNode = node;
		this.Size++;
	}
}