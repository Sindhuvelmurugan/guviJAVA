public class MULTIPLICATIONTABLE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
	System.out.print("Enter number:");        
	int n=s.nextInt();  
       for(int i = 1; i<= 10; i++) 
       {
       System.out.println(n+" * "+i+" = "+n*i);
   }
    }
