package kr.ac.kookmin.pet;

public class Pet {
	private String name;
	private int age; // in year
	private double weight; //in pounds
	
        // �������̵�
	public String toString() {
		return ("Name: " + name + " Age: " + age + " years"
				+ "\nWeight: " + weight + " pounds");
	}
	
	public Pet(String initialName, int initialAge, double initialWeight) {
		 // �����Ͻÿ�.
	}
        // �����ε�
	public Pet(String initialName) {
		name = initialName;
		age = 0;
		weight = 0;
	}
	
	public Pet( int initialAge) {
		name = "No name yet.";
		weight = 0;
		if (initialAge < 0) {
			System.out.println("Error: Negative age.");
			System.exit(0);
		} else
			age = initialAge;
	}
	public Pet() {
		name = "No name yet.";
		age = 0;
		weight = 0;
	}
	public void set(String newName, int newAge, double newWeight) {
		 // ���� �Ͻÿ�.
	}
	
	public void setAge( int newAge) {
               // �����Ͻÿ�.
	}
	
	public void setWeight( double newWeight) {
	      // �����Ͻÿ�.
       }
	
	public String getName() {
		return name;
		// �����Ͻÿ�.
	}
	
	public int getAge() {
		return age;
		// �����Ͻÿ�.
	}
	
	public double getWeight() {
		return age;
		// �����Ͻÿ�.
	}

}