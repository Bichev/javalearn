package skillport.javasix.cloneandreference;

public class CloneName implements Cloneable {
	private String firstName;
	private String lastName;
	public boolean completeName;
	
	public CloneName (String a, String b) {
		this.firstName = a;
		this.lastName = b;
		this.completeName = true;
	}
	
	protected Object clone(){
		try {
			CloneName c = (CloneName) super.clone();
			c.firstName = this.firstName;
			c.lastName = this.lastName;
			c.completeName = this.completeName;
			return c;
		} catch (CloneNotSupportedException e) {
			return "";
		}
	}
	
	public boolean equals (CloneName c) {
		return (c.firstName.equals(this.firstName) && 
				c.lastName.equals(this.lastName) &&
				c.completeName == this.completeName);
	}

}
