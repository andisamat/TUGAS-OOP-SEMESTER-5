public class Main{
	

	public static void main(String[]arg){

		Akademik akad = new Akademik();
		Pegawai peg = new Pegawai();

		akad.formKRS();
		peg.cekKRS();
		akad.kirimEmail();

	}
}