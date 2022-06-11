	class Parent {  
		void sleep()
		{ 
			System.out.println("sleeping...");
		}  
    }  
	class Child extends Parent {  
		void cry () 
		{
			System.out.println("crying...");
		}  
    }  
	class Inheritance {   
		public static void main(String args[]) {  
		Child c=new Child();  
		c.cry();  
		c.sleep();  
	}
  }  