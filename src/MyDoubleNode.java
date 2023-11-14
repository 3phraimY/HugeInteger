public class MyDoubleNode<T> {
	public T Data;
	public MyDoubleNode<T> NextNode;
	public MyDoubleNode<T> PreviousNode;
	
	public MyDoubleNode() {
		NextNode = null;
		PreviousNode = null;
	}
	
	public MyDoubleNode(T data){
		this.Data = data;
		this.NextNode = null;
		this.PreviousNode = null;
	}

}