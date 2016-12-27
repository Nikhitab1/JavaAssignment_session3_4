
  public class StudResult {
	    int RegNo;
        String Studname;
        double marks;
        
    public  StudResult() {
		// TODO Auto-generated constructor stub
		
		RegNo=123;                          //Using the constructor and calling display method and displaying the results.
		Studname="NIKHIA";
		marks=560;
		System.out.println("Student details");
		 display();
		
	}
     
   

	public StudResult(int r,String s, double m){
    	 this.RegNo=r;    //Using the parameterised constructor and calling the display method
    	 this.Studname=s;
    	 this.marks=m;
    	 System.out.println("Student details");
    	 display();
    	 
    	 
     }
  
	 private void display() {
			// TODO Auto-generated method stub
		 if(marks>=400){
			 System.out.println("Result of sudent is passed"); //If the marks are above 400 then the result is pass and the details are printed
			System.out.println("Name:"+ Studname +"\n"+ "RegNo:" + RegNo+"\n"+ "Marks:" + marks);
		 }else
		 {
			 System.out.println("Result of student is failed"); //If the marks are less than 400  then the result is fail and the details are printed
			 System.out.println("Name:"+ Studname +"\n"+ "RegNo:" + RegNo+"\n"+ "Marks:" + marks);
			 
		 }
	 
	 }
	 
    	
    	
       public static void main(String[] args) {
    	   
    	   StudResult st = new StudResult();   //Default constructor
    	   StudResult st1 = new StudResult(495,"Ashwini",350); //Parametrsed construcot with initialization
    	   StudResult st2 = new StudResult(345, "vijaya", 676); //Parametrsed construcot with initialization  
    	   
    	  
		
	}
      
      
}
