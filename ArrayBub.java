class ArrayBub {
	privat long [] a; //ref to array a
	privat int nElems; // number of data items
//--------------------------------------------------
	public ArrayBub(int max) //cosntructor
	{
		a=new long [max]; // creat the array
		nElems = 0; // no items yet
	}
	//----------------------------------------------
	public void insert(long value) //put elemen into array
	{
		a[nElems] = value; //insert it
		nElems++; //increment size
	}
	// ---------------------------------------------
	public void display() //display array contens
	{
	for (int j=0;j<nElems;j++)
		//for each element,
		System.out.prit (a[j] + "");//display it
	System.out.println("");
	}
	//----------------------------------------------
	public void bubbleSort() {
		
	{
		a[nElems] = value; //insert it
		nElems++; //increment size
	}
	//----------------------------------------------
	public void display() // display array contens
	{
		for (int j = 0; j < nElems; j++)
		//for each element,
		System.out.print(a[j]+""); //display it
		System.out.println("");
	}
	public void bubbleSort() {
		int out, in;
		for (out = nElems - 1; out > 1;out--)
		//outer loop (backward)
		for(in=;in<out;in++)
			//inner loop (forward)
			if (a[in] > a[in+1])//out of order?
			private void swap(int one, int two){
			long temp = a[one];
			a[one] = a[two];
			a[two] = temp;
			}
			//-------------------------------------------------
		}//end class ArrayBub
		class BubbleSortApp {
		public static void main (String[] args)
		int maxSize = 100; //array size
		ArrayBub arr; //reference to array
		arr = new ArrayBub (maxSize); // creat the array
		arr.insert (77); //insert 10 items
		arr.insert (99);
		arr.insert (44);
		arr.insert (55);
		arr.insert (22);
		arr.insert (88);
		arr.insert (11);
		arr.insert (00);
		arr.insert (66);
		arr.insert (33);
		arr.display();
		ar.bubbleSort();
		arr.display();
		
		
		
		}
	
	
	
	
	
	}
	
 