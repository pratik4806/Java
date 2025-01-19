
class Animal {

    int age = 10;
    String color = "black";

    void eat() {
        System.out.println("i am eating");
    }

    public static void main(String[] args) {
        //System.out.println("hello");

        Animal buzo = new Animal();

        System.out.println("Age : " + buzo.age);
        System.out.println("Color : " + buzo.color);

        buzo.eat();
    }
}
