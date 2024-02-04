package java_basics;

public class pattern {
    public static void main(String[] args) {
        int n=4;                //This is a Global variable.
        int m=5;
        
        //Outer loop  
        for(int i=1;i<=n;i++){                         //This is a solid rectangle solution.
            //inner loop
            for(int j=1;j<=m;j++){
                //  System.out.print("*");
            }
            // System.out.println();
        }

        for(int i=1;i<=n;i++){                         //This is a holo rectangle solution.
            for(int j=1;j<=m;j++){
                if(j==1 || i==1 || j==m || i==n){
                    // System.out.print("*");
                    
                }
                else{
                    // System.out.print(" ");
                }
                
            }
            // System.out.println();
        }


        for(int i=1;i<=n;i++){                          //This is a Half Pyramid solution.
            for(int j=1;j<=i;j++){
                // System.out.print("*");
            }
            // System.out.println();
        }


        for(int i=n;i>=1;i--){                          //This is a Inverted Half Pyramid solution.
            for(int j=i;j>=1;j--){                      //first method
                // System.out.print("*");
            }
            // System.out.println();
        }


        
        for(int i=n;i>=1;i--){                          //This is also Inverted Half Pyramid solution.
            for(int j=1;j<=i;j++){                       //second method
                // System.out.print("*");
            }
            // System.out.println();
        }


        for(int i=1;i<=n;i++){                         //This is a Inverted Half Pyramid (rotated by 180 deg ) solution.
            //inner loop                               //first method
            for(int sp=n-i;sp>0;sp--){
                // System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                //  System.out.print("*");

            }
            // System.out.println();
        }


        for(int i=1;i<=n;i++){                         //This is also Inverted Half Pyramid (rotated by 180 deg ) solution.
            //inner loop                               //second method
            for(int sp=1;sp<=n-i;sp++){
                // System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                //  System.out.print("*");

            }
            // System.out.println();
        }


        for(int i=1;i<=m;i++){                          //This is a Half Pyramid with Numbers solution.
            for(int j=1;j<=i;j++){
                // System.out.print(j);
            }
            // System.out.println();
        }


        for(int i=m;i>=1;i--){                          //This is  Inverted Half Pyramid with Numbers solution.
            for(int j=1;j<=i;j++){                    
                // System.out.print(j);
            }
            // System.out.println();
        }


        int num=1;                                    //This is  a Floid's Triagle solution.
        for(int i=1;i<=m;i++){
            for(int j=1;j<=i;j++){
                // System.out.print(num + " ");
                // num++;
            }
            // System.out.println();
        }


        for(int i=1;i<=m;i++){
            for(int j=1;j<=i;j++){
                
                if(num%2==0){
                    System.out.print("0");
                }else{
                    System.out.print("1");
                }
                num++;
            }
            System.out.println();
        }
    }
}
