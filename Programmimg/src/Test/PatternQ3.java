package Test;

public class PatternQ3 {
	    public static void main(String[] args) {

	        int space=6;
	        int star=1;
	        int line =7;
	        for(int i=0;i<line;i++){
	            for(int j=0;j<star;j++){
	                System.out.print(" *");
	            }
	            for(int k=space;k>0;k--){
	                System.out.print("  ");
	            }
	            for(int l=0;l<star;l++){
	                System.out.print(" *");
	            }
	            System.out.println();
	            if(i>2){
	                star--;
	                space+=2;
	            }else{
	                star++;
	                space-=2;
	            }
	        }
	    }
	}

/* OutPut : 
 

 *             *
 * *         * *
 * * *     * * *
 * * * * * * * *
 * * *     * * *
 * *         * *
 *             *

*/