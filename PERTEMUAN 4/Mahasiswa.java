public class Mahasiswa{
	public static void main(String[]args){
	System.out.println("int adalah method utama");

	Mahasiswa detectiv = new Mahasiswa();
	detectiv.printNama();
	System.out.println(detectiv.hitungUmur());
	}

public void printNama(){
	System.out.println("Detectiv");
}

public int hitungUmur(){
	int tahun_lahir = 1983 ;
	int tahun_skrng = 2017;

	int umur;
	umur = tahun_skrng-tahun_lahir;
	return(umur);
}
}