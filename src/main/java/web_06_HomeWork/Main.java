package web_06_HomeWork;

public class Main{
	public static void main(String[] args){
		User user = new User("Bob");
		Persister persister = new Persister(user);
		persister.report();
		persister.save();
	}
}
