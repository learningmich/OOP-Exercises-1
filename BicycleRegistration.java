public class BicycleRegistration
{
  public static void main(String[] args) {
		Bicycle bike1,bike2,bike3,tagno1,tagno2;	
		String owner1,owner2,owner3, Tagnum1,Tagnum2,Tagnum3;	

		bike1= new Bicycle();
		bike1.setOwnerName("Kim Taehyung");

		bike2= new Bicycle();
		bike2.setOwnerName("Jennie");

		owner1=bike1.getOwnerName();
		owner2=bike2.getOwnerName();

		tagno1= new Bicycle();
		tagno1.setTagNo("2003-194R");

		tagno2= new Bicycle();
		tagno2.setTagNo("2004-186T");

		Tagnum1=tagno1.getTagNo();
		Tagnum2=tagno2.getTagNo();

		bike3= new Bicycle("2003-199B","Niki");
		owner3=bike3.getOwnerName();
		Tagnum3=bike3.getId();


		System.out.println("\t"+owner1+" owns a Bicycle with a tag number: "+Tagnum1);
		System.out.println("\t"+owner2+" also owns a  Bicycle with a tag number: "+Tagnum2);
		System.out.println("\nThis is the final output of LabExercise1.2\n\t"+owner3+" owns a Bicycle with a tag number: "+Tagnum3);
	}
}
