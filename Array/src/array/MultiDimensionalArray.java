
package array;

public class MultiDimensionalArray 
{
    public static void main(String args[])
    {
        final int MAX_STUDENT=5,MAX_SUBJECT=3;
        int[][] marks=new int[MAX_STUDENT][MAX_SUBJECT];
        for(int i=0;i<MAX_STUDENT;i++)
        {
            for(int j=0;j<MAX_SUBJECT;j++)
            {
                marks[i][j]=(int)(Math.random()*100);
            }
        }
        for(int j=0;j<MAX_SUBJECT;j++)
        {
            System.out.println('\t'+"Subject"+ j +'\t');
        }
        System.out.println();
        for(int i=0;i<MAX_STUDENT;i++)
        {
            System.out.println("Student"+(i+1)+'\t');
            for(int j=0;j<MAX_SUBJECT;j++)
            {
                System.out.println("\t" + marks[i][j] + "\t");
            }
            System.out.println();
        }
    }
    
}
