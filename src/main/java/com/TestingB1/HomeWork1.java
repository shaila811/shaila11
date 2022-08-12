package com.TestingB1;

public class HomeWork1 {

	public void one () {
		
	}
	
	public void two() {
		int x=11;
		System.out.println(x);
	}
	
	public static boolean three(){
    boolean r= true;
    boolean a= false;
    return a;
	}
	
    public void four(int a) {
	
}
    public void five (String s,String h) {
    	
    }
    
   public void six (String s, int x) {
	   
   }
   
   public void seven(String s, int x,boolean y) {
	   
   }
   
   public int eight(int x,int z) {
	return (x+z);   
   }
   
   public static boolean nine(String s, String h ) {
   boolean b = s.equals(h);   
   return b;   
   }

   public static void ten() {
		int a=1;
		while(a<=10) {
		System.out.println(a);
		a++;
		}
	}
	
	public static  String eleven(String s, int a) {
		String newone ="";
		for(int i=0; i<a; i++) {
			newone=newone+s;
		}
		return newone;
			
		}

	public static void main(String[] args) {
		HomeWork1.three();
		System.out.println(	HomeWork1.three());
		
HomeWork1.nine("Shaila", "Shikha");
System.out.println(HomeWork1.nine("Shaila", "Shikha"));
HomeWork1.ten();
HomeWork1.eleven("Shaila", 3);
System.out.println(HomeWork1.eleven("Shaila  ", 3));

	}

}
