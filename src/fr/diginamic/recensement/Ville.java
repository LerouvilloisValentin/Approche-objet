package fr.diginamic.recensement;

public class Ville {
	int codeRegion;
	String name;
	String codeDepartment;
	int codeCommune;
	String nameCommune;
	int popTot;

	public Ville(int codeRegion, String name, String codeDepartment, int codeCommune, String nameCommune, int popTot) {
		super();
		this.codeRegion = codeRegion;
		this.name = name;
		this.codeDepartment = codeDepartment;
		this.codeCommune = codeCommune;
		this.nameCommune = nameCommune;
		this.popTot = popTot;
	}

	public Ville(int codeRegion, String name) {
		this.codeRegion = codeRegion;
		this.name = name;
	}

	@Override
	public String toString() {
		return "codeRegion=" + codeRegion + ", name=" + name + ", codeDepartment=" + codeDepartment + ", codeCommune="
				+ codeCommune + ", nameCommune=" + nameCommune + ", popTot=" + popTot;
	}

	public int getCodeRegion() {
		return codeRegion;
	}

	public void setCodeRegion(int codeRegion) {
		this.codeRegion = codeRegion;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static String getCodeDepartment(Ville ville) {
		return ville.codeDepartment;
	}

	public void setCodeDepartment(String codeDepartment) {
		this.codeDepartment = codeDepartment;
	}

	public int getCodeCommune() {
		return codeCommune;
	}

	public void setCodeCommune(int codeCommune) {
		this.codeCommune = codeCommune;
	}

	public String getNameCommune() {
		return nameCommune;
	}

	public void setNameCommune(String nameCommune) {
		this.nameCommune = nameCommune;
	}

	public static int getPopTot(Ville ville) {
		return ville.popTot;
	}

	public void setPopTot(int popTot) {
		this.popTot = popTot;
	}

	public char[] length() {
		// TODO Auto-generated method stub
		return null;
	}

}
