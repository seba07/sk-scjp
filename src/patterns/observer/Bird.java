package patterns.observer;

public class Bird implements AnimalListener {

	@Override
	public void update() {
		System.out
				.println("Update bird (observer). Animal listner notified food (subject) change!");
	}

}
