package mark.solid.ISP;

interface IEat {
    void eat();
}

interface ISharpenClaws {
    void sharpenClaws();
}

class Cat implements IEat, ISharpenClaws {
    public void eat() {
        System.out.println("Cat is eating");
    }

    public void sharpenClaws() {
        System.out.println("Cat is sharpening the claws");
    }
}
// Dog needs only one(IEat) interface implementation.
class Dog implements IEat {
    public void eat() {
        System.out.println("Dog is eating");
    }
}

public class ISP_correct_version {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        cat.eat();
        cat.sharpenClaws();
        dog.eat();
    }
}
