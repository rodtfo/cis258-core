
public class DogMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		

		DogObject dog1 = new DogObject();
		
		
		dog1.setLegs(4);
		dog1.setTail(true);
		dog1.setHair("furry");
		
		
		System.out.println("This dog has " + dog1.getLegs() + " legs");
		System.out.println("Does this dog have a tail?: " + dog1.getTail());
		System.out.println("This dog has " + dog1.getHair() + " hair");
		

	}

}

/* I don't have to use the import statement for the DogObject class because it is in the same package **/