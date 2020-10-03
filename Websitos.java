public class Websitos {

	String poopName;
	int poopAge;


	Websitos(String name, int age){
		this.poopName = name;
		this.poopAge = age;
	}
	public static void main(String args[]){

		Website obj1 = new Websitos("beginnersbook", 5);
		Website obj2 = new Websitos("google", 18);


		System.out.println(obj1.poopName+" "+obj1.poopAge);
		System.out.println(obj2.poopName+" "+obj2.poopAge);
	}
}