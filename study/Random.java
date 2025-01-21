/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.


Learn how to Get random values and organize them
Learn how to use Ternary operator 
Learn how to use command line arguments ( means input something when you execute the code)

Example: To run this below code in git bash. you have to do 
javac Random.java
java Random 244  
-(here 244 considered command line arguments)




*******************************************************************************/

public class Random
{
	public static void main(String[] args) {
	    int numberofRandoms = (args.length > 0 ) ? Integer.parseInt(args[0]):24;
	    double sum = 0;
	    double min = 1.0;
	    double max = 0.0;
	    for(int i = 0; i < numberofRandoms; i++){
	        double random = Math.random();
	        if(random < min) min = random;
	        if(random > max) max = random;
	        sum += random;
	        System.out.println(random);
	    }
	        
	        System.out.println("Statistics"
	                           +"\n Ppulation: "+ numberofRandoms
	                           +"\n Minimum: "+ min
	                           +"\n Average: "+ (sum/numberofRandoms)
	                           +"\n Maximum: "+ max);
	}
}
