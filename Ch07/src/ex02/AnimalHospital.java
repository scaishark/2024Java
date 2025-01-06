package ex02;

public class AnimalHospital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnimalHospital hospital = new AnimalHospital();
		
		Dog dog = new Dog(100);		
		hospital.CheckPatient(dog);
		
		Cat cat = new Cat(100);
		hospital.CheckPatient(cat);
	}
	
	void CheckPatient(Dog dog) {
		if(dog.IsHealthy())
			System.out.println("건강합니다.");
		else 
			System.out.println("아픕니다.");
	}

	void CheckPatient(Cat cat) {
		if(cat.IsHealthy())
			System.out.println("건강합니다.");
		else 
			System.out.println("아픕니다.");
	}

}
