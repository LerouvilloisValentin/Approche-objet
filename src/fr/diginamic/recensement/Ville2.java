package fr.diginamic.recensement;

public class Ville2 {
	int codeRegion;
	String nameDepartement;
	String name;
	String codeDepartment;
	int codeCommune;
	String nameCommune;
	int popTot;

	public Ville2(int codeRegion, String name, String codeDepartment, int codeCommune, String nameCommune, int popTot,
			String nameDepartement) {
		super();
		this.codeRegion = codeRegion;
		this.name = name;
		this.codeDepartment = codeDepartment;
		this.codeCommune = codeCommune;
		this.nameCommune = nameCommune;
		this.popTot = popTot;
		this.nameDepartement = nameDepartement;
	}


	public Ville2(String nameDepartement, int popTop) {
		this.nameDepartement = nameDepartement;
		this.popTot = popTop;
	}

	public Ville2(String codeDepartment, String nameDepartement, int popTop) {
		this.nameDepartement = nameDepartement;
		this.popTot = popTop;
		this.codeDepartment = codeDepartment;
	}


	@Override
	public String toString() {
		return "Department=" + nameDepartement + ", pop=" + popTot;
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

	public static String getCodeDepartment(Ville2 ville) {
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

	public int getPopTot() {
		return popTot;
	}

	public void setPopTot(int popTot) {
		this.popTot = popTot;
	}

	public char[] length() {
		// TODO Auto-generated method stub
		return null;
	}

}
