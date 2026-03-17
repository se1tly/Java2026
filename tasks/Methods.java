class Animal {
    void speak() {
        System.out.println("звук");
    }
}

class Dog extends Animal {
    //переопределение
    @Override
    void speak() {
        System.out.println("гав");
    }

    //перегрузка  
    void speak(String sound) {
        System.out.println("гав" + sound);
    }
}

public class Methods {
    static void main() {
    }
}
