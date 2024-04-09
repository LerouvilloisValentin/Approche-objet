package entites2;

public class Personne {

	public String name;
	public String firstName;
	public AdressePostale adresse;

	public Personne(String firstName, String name, AdressePostale adresse) {
		this.name = name;
		this.firstName = firstName;
		this.adresse = adresse;
	}

	public String getAdresse() {
		return name;
	}
	public void displayName() {

		System.out.println(this.name + " " + this.firstName.toUpperCase());
	}


	public void setName(String name) {
		this.name = name;
	}

	public void setAdresse(AdressePostale adresse) {
		this.adresse = adresse;
	}

//	public void displayModifiedName(String name) {
//		modifiedName();
//	}

}
