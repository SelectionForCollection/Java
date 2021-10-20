public class p15 {
    public p15(int n){
        System.out.print(n%10 + " ");
        if(n>9) {
            new p15(n / 10);
        }
    }
}
