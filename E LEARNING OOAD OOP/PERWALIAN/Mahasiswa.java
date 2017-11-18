import java.util.Scanner;
class Mahasiswa{
	String mataKuliah;
	String jumlahSKS;
	boolean cekKRS;

	void pilihMatakuliah(){

		Scanner input = new Scanner(System.in);

		System.out.print(" Mata Kuliah  : ");
		mataKuliah = input.nextLine();
		System.out.print(" jumlah SKS : ");
		jumlahSKS = input.nextLine();
		cekKRS = true;
		

	}
	void krs(){
		cekKRS = true;
		if(cekKRS){
		System.out.println(" Dosen Menyetujui KRS");}
		cekKRS = false;
		if(cekKRS){
		System.out.println(" Dosen Tidak Setuju");}
	}
	void cekEmail(){

		System.out.println(" Jadwal Perkuliahan Sudah Di Kirim ke Email Mahasiswa");
		
	}


}