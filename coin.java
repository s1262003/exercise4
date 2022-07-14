import java.util.Random;
 
public class Coin {
    public static void main(String[] args){
        System.out.println("Tossing a coin...");
		Random rand=new Random();
        int pos=0;
		int nag=0;
		for(int a=1;a<4;a++)
        {
            int i= rand.nextInt(2);
            System.out.print("round");
			System.out.print(a);
			System.out.print(":");
            if(i==0){
                System.out.println(" tails");
                nag ++;
			}
            else{
                System.out.println(" heads");
               pos ++;
			}
        
		}
		System.out.println("heads: "+pos+", "+"tails: "+nag);
    }
}