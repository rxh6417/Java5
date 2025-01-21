/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

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
