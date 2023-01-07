public class Bicycle
{
	private String id;
	public String ownerName;

	public Bicycle(){
		ownerName = "Unknown";
	}
	public String getOwnerName(){
		return ownerName;
	}
	public void setOwnerName(String name){
		ownerName = name;
	}
	public Bicycle(String tagNo){
		id = tagNo;
	}
}
