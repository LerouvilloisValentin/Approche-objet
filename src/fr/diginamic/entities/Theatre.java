package fr.diginamic.entities;

public class Theatre {
	String name;
	private int capacity;
	private int totalSubscribe;
	private int totalRecipe;
	private int numberCustomer;
	private double priceOnePlace;
	private int newCustomer;

	public static double subscribe(int capacity, int numberCustomer, double priceOnePlace, int newCustomer) {

		double actualRecipes = numberCustomer * priceOnePlace;
		if (capacity >= numberCustomer) {
			newCustomer += 1;
			actualRecipes += newCustomer * priceOnePlace;
		} else if (numberCustomer == capacity) {
			System.out.println("Plus de place");
		}
		return actualRecipes;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public int getTotalSubscribe() {
		return totalSubscribe;
	}

	public void setTotalSubscribe(int totalSubscribe) {
		this.totalSubscribe = totalSubscribe;
	}

	public int getTotalRecipe() {
		return totalRecipe;
	}

	public void setTotalRecipe(int totalRecipe) {
		this.totalRecipe = totalRecipe;
	}

	public int getNumberCustomer() {
		return numberCustomer;
	}

	public void setNumberCustomer(int numberCustomer) {
		this.numberCustomer = numberCustomer;
	}

	public double getPriceOnePlace() {
		return priceOnePlace;
	}

	public void setPriceOnePlace(double priceOnePlace) {
		this.priceOnePlace = priceOnePlace;
	}

	public int getNewCustomer() {
		return newCustomer;
	}

	public void setNewCustomer(int newCustomer) {
		this.newCustomer = newCustomer;
	}
}
