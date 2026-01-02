
class visit2{
    static int[] a={1,2,3,4,5,6,7,8,9,10};
    static int N=10;

     static void visit(int i){
        if(i>=N){
            return;
        }

        
        System.out.print(a[i]+" ");
        visit(2*i+1);
        visit(2*i+2);
     }

     public static void main(String [] args){
        visit(0);
     }

}