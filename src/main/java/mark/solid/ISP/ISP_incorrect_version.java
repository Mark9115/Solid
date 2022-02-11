package mark.solid.ISP;

interface IMammal {
    void eat();
    void sharpenClaws();
}

class CatIMammal implements IMammal {
    @Override
    public void eat() {
        System.out.println("Cat is eating");
    }

    @Override
    public void sharpenClaws() {
        System.out.println("Cat is sharpening the claws");
    }
}

class DogIMammal implements IMammal {
    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }
    // You should add sharpenClaws() to class Dog, but it is pointless!
    @Override
    public void sharpenClaws() {
        System.out.println("Dog is sharpening the claws");
    }
}

public class ISP_incorrect_version {
    public static void main(String[] args) {
        CatIMammal cat = new CatIMammal();
        DogIMammal dog = new DogIMammal();
        cat.eat();
        cat.sharpenClaws();
        dog.eat();
        dog.sharpenClaws(); // incorrect!
    }
}
