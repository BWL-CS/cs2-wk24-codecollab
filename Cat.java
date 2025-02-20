class Cat extends Pet {

	public Cat(String name) {
		super(name, "cat");
	}

	public void speak() {
		System.out.println("MEOW!");
	}

	public void doCrime(int damage) {
		System.out.println("The mood is ripe for committing crimes...");
		System.out.println("Your " + this.getType() + "'s criminal activity has resulted in " + damage + "% damage to your apartment.");
		System.out.println(this.getName() + " is still a little angel baby 😻😸");
	}
}
