package listes;

public class TestEquals {

	public static void main(String[] args) {
		Ville ville1 =new Ville("bij",450);
		Ville ville2 =new Ville("bij",450);
		Ville ville3 = ville2;
		
		if(ville1.equals(ville2)){
			System.out.println("identique");
		}else {
			System.out.println("différent");
		}

		if(ville2==ville3){
			System.out.println("identique");
		}else {
			System.out.println("différent");
		}
	}

}
