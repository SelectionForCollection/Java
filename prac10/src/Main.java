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
        System.out.println("Вы сидите на Мультифункциональном стуле");
    }
}

class MagicChair implements Chair {
    @Override
    public void sitting() {
        System.out.println("Вы сидите на Магический стуле");
    }
}

interface ChairFactory {
    Chair createChair();
}

class VictorianChairFactory implements ChairFactory{
    @Override
    public Chair createChair() {
        return new VictorianChair();
    }
}

class MultifunctionalChairFactory implements ChairFactory{
    @Override
    public Chair createChair() {
        return new MultifunctionalChair();
    }
}

class MagicChairFactory implements ChairFactory{
    @Override
    public Chair createChair() {
        return new MagicChair();
    }
}

class Client {
    private ChairFactory factory;
    private Chair chair;

    Client(ChairFactory factory){
        this.factory = factory;
        this.chair = factory.createChair();
    }
    public void Sit() {
        this.chair.sitting();
    }
}

public class Main {
    public static void main(String[] args) {
        new Client(new VictorianChairFactory()).Sit();
        new Client(new MultifunctionalChairFactory()).Sit();
        new Client(new MagicChairFactory()).Sit();
    }
}
