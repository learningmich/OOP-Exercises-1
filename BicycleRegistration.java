public class BicycleRegistration
{
	public static void main(String[] args){
		Bicycle bike1,bike2;
		String owner1, owner2;

		bike1 = new Bicycle();
		bike1.setOwnerName("Becky G.");

		bike2 = new Bicycle();
		bike2.setOwnerName("Cardi B.");

		owner1 = bike1.getOwnerName();
		owner2 = bike2.getOwnerName();

		System.out.println(owner1 + " owns a bicycle.");
		System.out.println(owner2 + " also owns a bicycle.");
	}
}
