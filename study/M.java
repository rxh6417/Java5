// Online Java Compiler
// Use this editor to write, compile and run your Java code online

public class M {
    public static void main(String[] args) {
        System.out.printf("%30sTimes Table 12\n\n"," ");
        
        System.out.print("     ");
        for(int x = 0; x <= 12; x++){
            System.out.printf("%4d ",x);
        }
        
        System.out.print("\n     ");
        for(int x = 0; x <= 12; x++){
            System.out.print("---- ");
        }
        
        for(int y = 0; y <= 12; y++){
            System.out.printf("\n%2d | ",y);
            for(int x = 0; x<=12; x++){
                System.out.printf("%4d ",x*y);
                
            }
            
        }
        
        
    }
}
