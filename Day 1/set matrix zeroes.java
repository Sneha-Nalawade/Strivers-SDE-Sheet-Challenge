import java.io.*;
import java.util.* ;

public class Solution {
    public static void setZeros(int matrix[][]) {
        int n=matrix.length;
        int m=matrix[0].length;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(matrix[i][j]==0)
                {
                    matrix[i][j]=-1;
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(matrix[i][j]==-1)
                {
                    matrix[i][j]=0;
                    for(int k=0;k<m;k++)
                    {
                        if(matrix[i][k]!=-1)
                         matrix[i][k]=0;
                    }
                    for(int k=0;k<n;k++)
                    {
                        if(matrix[k][j]!=-1)
                         matrix[k][j]=0;
                    }
                }
            }
        }
    }

}
