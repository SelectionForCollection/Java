public class PhoneNumber {
    private StringBuilder four;
    private StringBuilder lastThree;
    private StringBuilder firstThree;
    private StringBuilder code;

    PhoneNumber(String line) {
        StringBuilder lineBuilder = new StringBuilder(line);
        lineBuilder.reverse();
        this.four = new StringBuilder(lineBuilder.substring(0, 4)).reverse();
        this.lastThree = new StringBuilder(lineBuilder.substring(4, 7)).reverse();
        this.firstThree = new StringBuilder(lineBuilder.substring(7, 10)).reverse();
        this.code = new StringBuilder(lineBuilder.substring(10, lineBuilder.length())).reverse();
    }

    public void format() {
        if(code.charAt(0) == '+'){
            System.out.println("" + code + firstThree + "-" + lastThree + "-" + four);
        }else{
            System.out.println("+" + code + firstThree + "-" + lastThree + "-" + four);

        }
    }
}