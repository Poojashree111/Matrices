package Matrices;

public class Multiply2matrices {

	public static void main(String[] args) {
		
		int a[][]={{1,2,3},{5,4,6},{7,3,9}};    
		int b[][]={{1,7,1},{9,2,2},{3,8,3}};    
		    
		 
		int c[][]=new int[3][3];  
		    
		   
		for(int i=0;i<3;i++){    
		for(int j=0;j<3;j++){    
		c[i][j]=0;      
		for(int k=0;k<3;k++)      
		{      
		c[i][j]+=a[i][k]*b[k][j];      
		}
		System.out.print(c[i][j]+" ");  
		} 
		System.out.println(); 

	}

}
}
