package delivery;

class Dish implements Comparable<Dish>{
	private String name;
	private float price;
	private Restaurant r;
	
	@Override
//dishes are compared only with respect to their name	
	public int compareTo(Dish o) {
		return name.compareTo(o.name);
	}
	
	@Override 
//easier to override the method equals, so that i dont have to always use getter of name
	public boolean equals(Object obj) {
		return ((Dish) obj).getName().equals(this.name);
	}
	
	
	
	Dish (String name, float price, Restaurant r ) {
		this.name=name;
		this.price = price;
		this.r = r;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	Restaurant getRestaurant() {
	    return r;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}

	public boolean priceInRange(double min, double max) {
		return price >= min && price <= max;
	}
	
	
}
