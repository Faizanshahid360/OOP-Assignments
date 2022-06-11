// giving value during object creation
class Addition  {
    int x,y;
	
	   Addition(int a , int b) 
	  { 
	  // we can also assign value in this constructor like x=40; or y=20;
	     x=a;
		  y=b;
		  }
}
    public class Constructor {
	  public static void main (String args [] ) {
	    Addition P = new Addition (30,20); // or we can simple use Addition();
		Addition Q = new Addition  (40,50);
		System.out.println(P.x + P.y);
		System.out.println(Q.x + Q.y);
	  }
	}