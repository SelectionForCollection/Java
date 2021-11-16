interface ComplexAbstractFactory {
    Complex createComplex();
    Complex CreateComplex(int real, int image);
}

public class Complex {
    private int real;
    private int image;

    Complex(){};
    Complex(int real, int image) {
        this.real = real;
        this.image = image;
    }


}

class ConcreteFactory implements ComplexAbstractFactory{
    public Complex createComplex() {
        return new Complex();
    }

    public Complex CreateComplex(int real, int image) {
        return new Complex(real,image);
    }
}