
package enhancedforloop;


public class StringArrayPrinter {

    
    public static void main(String[] args) {
        // TODO code application logic here
        
        String[] cities = {"Karachi","Delhi","Colombo","Dhaka"};
    	int i=1;
    	//Use Of Enhanced For Loop
    	for (String s:cities)
    	{
    		System.out.println("City "+i+" :"+s);
    		System.out.println("String Length :"+s.length());
    		++i;
    	}
    }
    
}
