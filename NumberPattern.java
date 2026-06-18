public class NumberPattern{

    public static void pattern(int n){
        
        int num=1;
        int rval=1;
        for(int rows=1;rows<=n;rows++){
            int cval=rval;
            for(int cols=1;cols<=num;cols++){
                System.out.print(cval);
                cval+=1;
                
            }
            rval=cval;
            num++;
          
            System.out.println();
        }
    }
    public static void main(String[] args) {
       int n=5;
       pattern(n);
    }
}