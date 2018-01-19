public class Main{
	

	public static void main(String[]arg){

		Login Log = new Login();
		Akademik aka = new Akademik();
		Pegawai peg = new Pegawai();

		Log.formLogin();
		aka.formKRS();
		peg.cekKRS();
		aka.kirimEmail();

	}
}