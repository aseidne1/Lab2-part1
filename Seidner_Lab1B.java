import java.util.Scanner;

class Seidner_Lab1B
{
   public static void main(String[] args)
   {
   Scanner scan = new Scanner(System.in);

   int[][] data = new int[5][5];
      int n = data.length;

   System.out.println("Input 25 numbers for data array");
    for(int i=0; i<data.length; i++)
   { for(int j=0; j<data[i].length;j++){
   data[i][j] = j;
   data[i][j] =  scan.nextInt();
     System.out.println( data[i][j] + "   ");
   data[i][j] = scan.nextInt();

   }

   }
   LongestPositiveSeries(data,n);

   }

    static void LongestPositiveSeries(int a[][], int n) 
    { 
         
        int  maxLen = 0, currLen = 0; 
      
        for (int k = 0; k < n; k++)  
        { for (int p = 0; p < n; p++){
            if (a[k][p] > 0) 
            { 
                currLen++; 
                if (currLen == 1);  
      
            } 
            else
            { 
                if (currLen > maxLen)  
                { 
                    maxLen = currLen; 
   
                } 
                currLen = 0; 
            } }
        } 
      
        if (maxLen > 0)  
        { 
            System.out.print( "Length of positive integers: " + maxLen + "\n") ;  
            for( int i = 0; i< a.length; i++)
{for(int j = 0; j< a[i].length; j++){
System.out.println( a[i][j]);
}}
    
        } 
        else
           System.out.println("No positive sequence detected.") ; 
       //    for( int i = 0; i< a.length; i++)
//{for(int j = 0; j< a[i].length; j++){
//System.out.println( a[i][j]);
}}
          


