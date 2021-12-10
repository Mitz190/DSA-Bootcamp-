/*
Q 
* * * * *
* * * * *
* * * * *
* * * * *
* * * * *
* * * * *
*/
public class Rectangle{
    public static void main(String args[]){
        int i,j;
        for(i = 1; i <= 6; i++)
		{
			for(j = 1; j <= 5; j++)
			{
				System.out.print("* "); 
			}
			System.out.print("\n"); 
		}	
    }
}

/*
* 
* *       
* * *     
* * * *   
* * * * * 
*/
public class Righttriangle{
    public static void main(String args[]){
        int i,j;
        for(i = 1; i < 6; i++)
		{
			for(j = 1; j <=i ; j++)
			{
				System.out.print("* "); 
			}
			System.out.print("\n"); 
		}	
    }
}

/*
 *****
 ****
 ***
 **
 *
*/
public class Upsidedowntriangle{
    public static void main(String args[]){
        for (int i=0; i<5; i++)
        {
            for (int j=5; j>i; j--)
            {    
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}

/*
    1
    1 2
    1 2 3
    1 2 3 4
    1 2 3 4 5
*/
public class Numbers{
    public static void main(String args[]){
        for (int i=1; i<=5; i++)
        {
            for (int j=1; j<i; j++)
            {    
                System.out.print(j);
            }
            System.out.println(i);
        }
    }
}

/*
    *****
    ****
    ***
    **
    *
*/
public class pattern{
    public static void main(String args[]){
        for (int i=1; i<=5; i++)
        {
            for (int j=1; j<=5-i+1; j++)
            {    
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}


