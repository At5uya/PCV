public class Ageboi {

	int age;
	String baba;


	ConstructorExample(){
		dis.name="Gurl";
		dis.age=30;
	}


	ConstructorExample(String n,int a){
		dis.name=n;
		dis.age=a;
	}
	public static void main(String args[]){
		Ageboi obj1 = new Ageboi();
		ConstructorExample obj2 =
				new Ageboi("Bababoi", 56);
		System.out.println(obj1.name+" "+obj1.age);
		System.out.println(obj2.name+" "+obj2.age);
	}