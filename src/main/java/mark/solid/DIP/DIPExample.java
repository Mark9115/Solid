package mark.solid.DIP;

interface MakingNoise
{
    String makeNoise();
}

/**
* Dependency inversion principle.
* Example decreases cohesion between origin classes.
* Context Class Mammal.
*/
class Mammal
{
    MakingNoise speaker;
    public Mammal (MakingNoise sb)
    {
        this.speaker = sb;
    }
    public String makeNoise()
    {
        return this.speaker.makeNoise() ;
    }
}

class CatNoise implements MakingNoise
{
    public String makeNoise()
    {
        return "Meow" ;
    }
}
class DogNoise implements MakingNoise
{
    public String makeNoise()
    {
        return "Bark";
    }
}

public class DIPExample {
    public static void main(String[] args) {
        Mammal cat = new Mammal (new CatNoise());
        Mammal dog = new Mammal (new DogNoise());
        System.out.println("Cat says " + cat.makeNoise());
        System.out.println("Dog says " + dog.makeNoise()) ;
    }
}

