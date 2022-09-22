package Matrices;

public class Addtwomatrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int m1[][] = {{8,7,1},
                 {5,6,4},
                 {2,2,2}};
                 
   
   int m2[][] = {{2,0,1},
                 {3,1,9},
                 {3,1,2}};
                 
  
   if(m1.length != m2.length || m1[0].length != m2[0].length){
       System.out.println("Matrices orders are not same, so Addition not possible ");
       return;
   }
   
   
   int res[][] = new int[m1.length][m1[0].length];
   
   for(int i=0; i<m1.length; i++){
       for(int j=0; j<m1[0].length; j++){
           res[i][j] = m1[i][j]+m2[i][j];
          
           System.out.print(res[i][j]+" ");
       }
       System.out.println();
   }

	}

}
