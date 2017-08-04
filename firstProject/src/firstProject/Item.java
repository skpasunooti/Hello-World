package firstProject;

public class Item implements Cloneable  {
private int id;
private String name;
private int price;

public Bid[] bids;

public Bid[] getBids() {
	return bids;
}
public void setBids(Bid[] bids) {
	this.bids = bids;
}
@Override
	public boolean equals(Object obj) {
	Item item2 = (Item)obj;
	Item item1 = this;
	if(item2 != null){	
	if((item1.getId()==item2.getId())&& (item1.getName().equals(item2.getName()))&& (item1.getPrice()==item2.getPrice())){
			return true;
		}
	
	}
	return false;
	
}	
@Override
	public Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}
@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Id:"+id +"\nName"+name +"\nPrice"+price;
	}
public Item() {
	// TODO Auto-generated constructor stub
}
public Item(int id, String name, int price) {
 	super();
	this.id = id;
	this.name = name;
	this.price = price;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}

}
