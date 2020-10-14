package patters.single;

import patters.single.SingleObject;

public class SingletonPatternDemo {
    public static void main(String[] args) {
        SingleObject singleObject = SingleObject.getInstance();
        
        singleObject.showMessage();
    }
}
