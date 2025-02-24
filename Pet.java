public class Pet {
	private String name;
	private String type;

	public Pet(String n, String t) {
		this.name = n;
		this.type = t;
	}

	public String getType() {
		return type;
	}

	public String getName() {
		return name;
	}

	public void speak() {
		System.out.println("GRR!");
	}

	public void eat(String food) {
		System.out.println(this.getName() + " devoured the " + food);
	}
	
}