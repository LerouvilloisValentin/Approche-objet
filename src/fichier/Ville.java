package fichier;

public class Ville {
	String name;
	String codeDepartment;
	String nameRegion;
	int popTot;
	
	
	public Ville(String name, String codeDepartment, String nameRegion, int popTot){
		this.name = name;
		this.codeDepartment =codeDepartment;
		this.nameRegion= nameRegion;
		this.popTot= popTot;
	}


	@Override
//	public String toString() {
//		return "Ville [name=" + name + ", codeDepartment=" + codeDepartment + ", nameRegion=" + nameRegion + ", popTot="
//				+ popTot + "]";
//	}
	public String toString() {
	    return name + ";" + codeDepartment + ";" + nameRegion + ";" + popTot;
	}
}
