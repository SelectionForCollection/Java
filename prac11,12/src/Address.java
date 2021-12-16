public class Address {
    private String country;
    private String region;
    private String town;
    private String street;
    private String home;
    private String corp;
    private String flat;
    private String separator;
    private String arr[];

    Address(String line) {
        for(int i = 0; i<line.length(); i++){
            if(line.charAt(i) == ' ') {
                this.separator = line.charAt(i-1) + " ";
            }
        }
        this.arr = line.split("[;!/]");//this.separator);
        this.country = arr[0];
        this.region  = arr[1];
        this.town = arr[2];
        this.street = arr[3];
        this.home = arr[4];
        this.corp = arr[5];
        this.flat = arr[6];
    }
    public void out() {
        System.out.println(this.country);
        System.out.println(this.region);
        System.out.println(this.town);
        System.out.println(this.street);
        System.out.println(this.home);
        System.out.println(this.corp);
        System.out.println(this.flat);
    }
}