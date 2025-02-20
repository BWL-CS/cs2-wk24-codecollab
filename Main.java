import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {

      // SECTION #1: Look at Pet.java
		Pet p = new Pet("Hamtaro", "hamster");
		System.out.println("You created a pet " + p.getType());
		p.speak();

		System.out.println("––––––––––");

      // SECTION #2: Look at Dog.java
		Pet d = new Dog("Bruiser");
		System.out.println("You created a pet " + d.getType());
		d.speak();
		d.eat("steak");

		System.out.println("––––––––––");

      // SECTION #3: Look at Cat.java
		Cat c = new Cat("Mr. Chonk");
		System.out.println("You created a pet " + c.getType());
		c.speak();
		c.doCrime(80);

      System.out.println("––––––––––");

      // SECTION #4: Creating & storing multiple objects
		ArrayList<Pet> petList = new ArrayList<Pet>();
		petList.add(new Pet("Sneaky", "ferret"));
		petList.add(new Cat("Minnie"));
		petList.add(new Cat("Luna"));
		petList.add(new Dog("Zeus"));

      System.out.println("Oops, went crazy at the shelter... I adopted: ");
		for (Pet pet : petList) {
			System.out.println(pet.getName() + " the " + pet.getType());
		}

	}

}