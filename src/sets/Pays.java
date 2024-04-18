package sets;

public class Pays {

	private String name;
	private int nbHab;
	private int pibHab;

	public Pays(String name, int nbHab, int pibHab) {
		super();
		this.name = name;
		this.nbHab = nbHab;
		this.pibHab = pibHab;
	}

	@Override
	public String toString() {
		return "Pays [name=" + name + ", nbHab=" + nbHab + ", pibHab=" + pibHab + "]";
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the nbHab
	 */
	public int getNbHab() {
		return nbHab;
	}

	/**
	 * @return the pibHab
	 */
	public int getPibHab() {
		return pibHab;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param nbHab the nbHab to set
	 */
	public void setNbHab(int nbHab) {
		this.nbHab = nbHab;
	}

	/**
	 * @param pibHab the pibHab to set
	 */
	public void setPibHab(int pibHab) {
		this.pibHab = pibHab;
	}

}
