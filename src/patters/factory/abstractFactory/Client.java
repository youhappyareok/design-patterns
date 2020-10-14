package patters.factory.abstractFactory;

public class Client {
    public static void main(String[] args) {
        AbstractFactory abstractFactory = new ConcreteFactory1();
        AbstractProductA abstractProductA= abstractFactory.createProductA();
        AbstractProductB abstractFactoryProductB= abstractFactory.createProductB();
    }
}
