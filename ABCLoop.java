
public class ABCLoop {

	public static void main(String[] args) {
	int character;    
	int space;        
	space=2;       
	character=97;	
	for(int row=1;row<=3;row++)          
	{
		int j;            		
		for(j=space;j>=1;j--)    
		{
			System.out.print(" ");
		}
		for(j = character ; j < character + row ; j++)    
		{
			System.out.print((char)j);   
		}
		for(int k=j-2;k>=character;k--)    
		{
			System.out.print((char)k);     
		}
		space--;     
		System.out.print("\n");  
	}
	space=1;    
	for(int row=2;row>=1;row--)        
	{   
		int j;           
		for(j=space;j>=1;j--)          
		{
			System.out.print(" ");
		}
		for(j = character ; j < character + row ; j++)        
		{
			System.out.print((char)j);       
		}
			for(int k=j-2;k>=character;k--)     
		{
			System.out.print((char)k);     
		}
		space++;     
		System.out.print("\n");    
	}
}
}