public interface MyList {
	public void Append(int x);

	public void Prepend(int x);

	public boolean InsertAfter(int w, int x);

	public boolean Remove(int x);

	public int Search(int x);

	public void Print();

	public void PrintReverse();

	public void Sort();

	public boolean IsEmpty();

	public int GetLength();
}