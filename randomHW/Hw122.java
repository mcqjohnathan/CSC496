
public class Hw122 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a[];
        int n=9;
        int k=5;
        final int Maxsize=9;
        a = new int[Maxsize];
        int cnt = 0, c, j;   
           
        String s="";
        for (int i = 0; i < n; i++){
            a[i] = i+1;
            System.out.print(a[i]);
        }
        j = 0;
        k=k-1;
        
            
        
        for (int i= 0; i<n;i++){
            while (k>0){
                int t = a[0];
                for (int p = 1; p < n; p++)
                     a[p-1] = a[p];
                    a[n-1] = t;
                    if (a[0]==0)
                        continue;
                    else
                        k--;
                 
            }
            System.out.println(a[0]);
            s+= a[0];
            a[0]=0;
            //System.out.println(a[j]+"1"+" "+s);
            k=5;
            
        }
            for (int i = 0; i < n; i++){
            System.out.println();
            
        }
            System.out.print(s);
    }    
        }
            
            
            
                
            
        
    
        
            
        
    



