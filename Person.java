public class Person{
	String name;
	String lastName;
	int age;
	
	void setName(String name){ ;//metoda ktora nikt nie zwraca, wtedy uzywa sie setterow czesto; nazwa 
		this.name = name;		// ma wskazywac co dana metoda bedzie robila, najlepiej tam samo jak pole
	}

	int getAge(){	//jak cos zwraca to stosuje sie get czesto, a nic nie ma w argumencie, bo nam zwraca
		return age; 
	}
	
	void printOutAllVariables(){
		System.out.println("Skladowe obiektu naszejklasy " + name + " " + lastName + " " + age);
	}
	
	void setNameLastNameAge(String name, String lastName, int age){//ten z nawiasu to jest ten name drugi w kolejnosci
		this.name = name; //pierwsze name sie odnosi do tego name na samej gorze pod public class
		this.lastName = lastName; //bez this - assign to itself
		this.age = age; // this oznacza, ze skladowa klasy pobiera info z tego, co przychodzi w arguencie
		// tam gdzie metoda nic nie robi musi byc this
	}
	//metoda nie musi tylko przyjmowac typow prostych, ale rowniez i caly obiekt, podczas wywolywania
	//metod musimy przekazac caly obiekt, aby miec dostep do pol danej klasy
	
	void setNameLastName(Person person){ //caly obiekt person zostal przekazany jako argument metody
		name = person.name; // jak chcemy przypisywac wartosci polom z obiektów w klasie Main1
		lastName = person.lastName;
	}
	
	Person getVariables(){
		Person person = new Person();
		person.lastName = lastName; //obiektowi person i polom last name przypiszemy wartosci bierzace
		return person;
	}
	
	
	
}