public class Main{
	

	public static void main(String[]arg){

		Maba maba = new Maba();
		maba.daftar();

		Akademik akad = new Akademik();
		akad.cekPendaftaran();
		

		Keuangan keu = new Keuangan();
		keu.cekPembayaran();
		akad.kirimEmail();

	}
}