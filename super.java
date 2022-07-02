// super keyword is used to access super class variables ( data, members or properties)
// Inheritance is mandatory 
class Addition {
	int x;

}
		
   //System.out.println(x+y);
	
	 class A extends Addition {
	  int x;
	  A() {
		  x=10;
		  System.out.println(x);
		  super.x = 20;
		  System.out.println(super.x);
	  }
	 }



  
  public class Super {
	  public static void main (String args [] ) {
		  A p = new A();
		 
		//  System.out.println(p.x+p.y);
		
	  }
  }
  
 
	
