import java.util.Scanner;

public class Saper {
	public static void main(String[] args) {
		int w, k=0;
		int[][] plansza = { //
				//1	2	3  4  5  6  7  8  9
				{ 0, 1, 0, 1, 0, 0, 0, 0, 1}, //1
				{ 0, 1, 1, 1, 0, 0, 0, 0, 0 }, //2
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0 }, //3
				{ 0, 1, 0, 0, 0, 0, 0, 0, 1 }, //4
				{ 0, 1, 0, 0, 0, 0, 0, 1, 0 }, //5
				{ 1, 0, 0, 0, 0, 0, 0, 0, 1 }, //6
				{ 0, 0, 0, 1, 0, 1, 0, 0, 0 },//7
		};//
		//kolumna
		System.out.println(plansza[0].length-1);
		//wiersz
		System.out.println(plansza.length-1);
		Scanner sc = new Scanner(System.in);
		System.out.println("Podaj wiersz: ");
		w = sc.nextInt();
		System.out.println("Podaj kolumne: ");
		k = sc.nextInt();
		
		int iloscBomb = policzBomby(plansza, w-1, k-1);
		System.out.println(iloscBomb);
	}

	private static int policzBomby(int[][] plansza, int wiersz, int kolumna) {

		//ok
		if(wiersz==0 && kolumna==0){
			return plansza[wiersz + 1][kolumna] + plansza[wiersz][kolumna+1] + plansza[wiersz + 1][kolumna+1];
		}
		//ok
		if(wiersz== plansza.length-1 && kolumna==0){
			return plansza[wiersz - 1][kolumna] + plansza[wiersz][kolumna+1] + plansza[wiersz - 1][kolumna+1];
		}
		//ok
		if(wiersz==0 && kolumna == plansza[0].length-1){
			return plansza[wiersz + 1][kolumna-1] + plansza[wiersz][kolumna-1] + plansza[wiersz + 1][kolumna];
		}
		//ok
		if(wiersz == plansza.length-1 && kolumna == plansza[0].length-1){
			return plansza[wiersz - 1][kolumna] + plansza[wiersz][kolumna-1] + plansza[wiersz - 1][kolumna-1];
		}
		//ok
		if(wiersz!=0 && wiersz!=plansza.length-1 && kolumna==0){
			return plansza[wiersz - 1][kolumna] + plansza[wiersz + 1][kolumna] + plansza[wiersz][kolumna + 1]
					+ plansza[wiersz - 1][kolumna + 1] + plansza[wiersz + 1][kolumna + 1];
		}
		//ok
		if(wiersz!=0 && wiersz!=plansza.length-1 && kolumna==plansza[0].length-1){
			return plansza[wiersz - 1][kolumna] + plansza[wiersz + 1][kolumna] + plansza[wiersz][kolumna - 1]
					+ plansza[wiersz - 1][kolumna - 1] + plansza[wiersz + 1][kolumna - 1];
		}
		if(wiersz==0 && kolumna != plansza[0].length-1 && kolumna!=0){
			return plansza[wiersz][kolumna-1] + plansza[wiersz][kolumna+1] + plansza[wiersz+1][kolumna + 1]
					+ plansza[wiersz + 1][kolumna - 1] + plansza[wiersz + 1][kolumna];
		}
		if(wiersz==plansza.length-1 && kolumna != plansza[0].length-1 && kolumna!=0){
			return plansza[wiersz][kolumna-1] + plansza[wiersz][kolumna+1] + plansza[wiersz-1][kolumna + 1]
					+ plansza[wiersz - 1][kolumna - 1] + plansza[wiersz - 1][kolumna];
		}
		return plansza[wiersz - 1][kolumna] + plansza[wiersz + 1][kolumna] + plansza[wiersz][kolumna - 1]
				+ plansza[wiersz][kolumna + 1] + plansza[wiersz - 1][kolumna - 1] + plansza[wiersz - 1][kolumna + 1]
				+ plansza[wiersz + 1][kolumna - 1] + plansza[wiersz + 1][kolumna + 1];
	}
}
