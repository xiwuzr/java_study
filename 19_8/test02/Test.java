package test02;

class Animal {


    public void talk(Sound sound) {
        System.out.println("animal:" + "无声");
    }

    public void talk(DogSound sound) {
        System.out.println("animal:" + "汪汪汪");
    }
}

class Dog extends Animal {

    public void talk(Sound sound) {
        System.out.println("dog:" + "无声");
    }

    public void talk(DogSound sound) {
        System.out.println("dog:" + "汪汪汪");
    }
}

class Sound {
}

class DogSound extends Sound{

}

public class Test {

    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal dog = new Dog();
        Sound sound = new Sound();
        Sound dogSound = new DogSound();
        animal.talk(sound);//"animal:" + "无声"
        animal.talk(dogSound);//"animal:" + "汪汪汪"
        dog.talk(sound);//"dog:" + "无声"
        dog.talk(dogSound);//"dog:" + "汪汪汪"

    }
}

