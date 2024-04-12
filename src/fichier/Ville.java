package fichier;

import java.util.ArrayList;
import java.util.List;

public class Ville implements Comparable<Ville> {
	String name;
	String codeDepartment;
	String nameRegion;
	int popTot;

	public Ville(String name, String codeDepartment, String nameRegion, int popTot) {
		this.name = name;
		this.codeDepartment = codeDepartment;
		this.nameRegion = nameRegion;
		this.popTot = popTot;
	}

	public int compareTo(Ville autre) {
		if(autre.getPopTot() < this.popTot) {
			return 1;
		} else if (autre.getPopTot()> this.popTot) {
			return -1;
		}
		return 0;
//		return this.name.compareTo(listeOrderAZ.getName());
	}
	
	@Override
//	public String toString() {
//		return "Ville [name=" + name + ", codeDepartment=" + codeDepartment + ", nameRegion=" + nameRegion + ", popTot="
//				+ popTot + "]";
//	}
	public String toString() {
	    return name + ";" + codeDepartment + ";" + nameRegion + ";" + popTot;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCodeDepartment() {
		return codeDepartment;
	}

	public void setCodeDepartment(String codeDepartment) {
		this.codeDepartment = codeDepartment;
	}

	public String getNameRegion() {
		return nameRegion;
	}

	public void setNameRegion(String nameRegion) {
		this.nameRegion = nameRegion;
	}

	public int getPopTot() {
		return popTot;
	}

	public void setPopTot(int popTot) {
		this.popTot = popTot;
	}
}
