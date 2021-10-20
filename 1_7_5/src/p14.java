public class p14 {
    public p14(int n){
        if(n>0){
            new p14(n/10);
            System.out.print(n%10 + " ");
        }
    }
}
