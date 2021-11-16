interface Chair {
    void sitting();
}

class VictorianChair implements Chair {
    @Override
    public void sitting() {
        System.out.println("Вы сидите на Викторианском стуле");
    }
}

class MultifunctionalChair implements Chair {
    @Override
    public void sitting() {
        System.out.println("Вы сидите на Многофункциональном стуле");
    }
}

class MagicChair implements Chair {
    @Override
    public void sitting() {
        System.out.println("Вы сидите на Магическом стуле");
    }
}

class Client implements Chair{
    private Chair chair;
    Client(Chair chair){
        this.chair = chair;
    }

    @Override
    public void sitting() {
        this.chair.sitting();
    }
}

public class Main{
    public static void main(String[] args) {
        VictorianChair vict = new VictorianChair();
        MultifunctionalChair multi = new MultifunctionalChair();
        MagicChair magic = new MagicChair();

        new Client(vict).sitting();
        new Client(multi).sitting();
        new Client(magic).sitting();
    }
}
