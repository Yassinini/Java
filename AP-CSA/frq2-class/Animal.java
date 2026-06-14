// Animal is the superclass. Dog extends Animal.
//
// Animal:
// 1. Instance variable: name (String)
// 2. Constructor: takes name
// 3. speak() — returns "..."
// 4. toString() — returns "Animal[name=NAME]"
//
// Dog extends Animal:
// 1. Instance variable: breed (String)
// 2. Constructor: takes name and breed, calls super
// 3. speak() — overrides, returns "Woof!"
// 4. toString() — returns "Dog[name=NAME, breed=BREED]"

public class Animal {
    // your code here
    private String name;
    
    public Animal(String name){
      this.name = name;
    }
    public String speak(){
      return "...";
    }
    public String toString(){
      return "Animal[ name= " +name;
    }
    public String getName(){
      return name;
    }
}

class Dog extends Animal {
    // your code here
    private String breed;

    public Dog (String name, String breed){
      super(name);
      this.breed = breed;
    }
    @Override 
    public String speak(){
      return "Woof";
    }
    @Override
    public String toString(){
      return "Animal[ name= " + getName() +  " , breed= " + breed;
    }

    public static void main(String[] args) {
        Animal a = new Animal("Cat");
        System.out.println(a.speak());    // ...
        System.out.println(a);            // Animal[name=Cat]

        Dog d = new Dog("Rex", "Husky");
        System.out.println(d.speak());    // Woof!
        System.out.println(d);            // Dog[name=Rex, breed=Husky]

        Animal poly = new Dog("Buddy", "Poodle");
        System.out.println(poly.speak()); // Woof! (polymorphism)
    }
}
