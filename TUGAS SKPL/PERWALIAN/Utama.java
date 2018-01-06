public class Utama{
	

	public static void main(String[]arg){

		Login Log = new Login();
		Akademik akad = new Akademik();
		Pegawai peg = new Pegawai();

		Log.formLogin();
		akad.formKRS();
		peg.cekKRS();
		akad.kirimEmail();

	}
}