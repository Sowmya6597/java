
class GenericsDemo<T> {
	
	    // An object of type T is declared 
	    T obj; 
	    GenericsDemo(T obj) {  this.obj = obj;  }  // constructor 
	    public T getObject()  { return this.obj; } 
	} 
	   
	// Driver class to test above 
	class Main 
	{ 
	    public static void main (String[] args) 
	    { 
	        // instance of Integer type 
	    	GenericsDemo<Integer> iObj = new GenericsDemo<Integer>(15); 
	        System.out.println(iObj.getObject()); 
	   
	        // instance of String type 
	        GenericsDemo<String> sObj = 
	                          new GenericsDemo<String>("GeeksForGeeks"); 
	        System.out.println(sObj.getObject()); 
	    } 
	}


