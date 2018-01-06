import java.util.Scanner;
class Mahasiswa{
	String mataKuliah;
	String jumlahSKS;
	String amataKuliah;
	String ajumlahSKS;
	String nama;
	String npm;
	boolean cekKRS;

	void login(){
		Scanner input = new Scanner(System.in);
		System.out.print(" Nama          : ");
		nama = input.nextLine();
		System.out.print(" NPM           : ");
		npm = input.nextLine();
	}

	void pilihMatakuliah(){

		Scanner input = new Scanner(System.in);

		System.out.print(" Mata Kuliah  : ");
		mataKuliah = input.nextLine();		
		System.out.print(" Jumlah SKS   : ");
		jumlahSKS = input.nextLine();
		System.out.print(" Mata Kuliah   : ");
		amataKuliah = input.nextLine();
		System.out.print(" Jumlah SKS    : ");
		ajumlahSKS = input.nextLine();		
				
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