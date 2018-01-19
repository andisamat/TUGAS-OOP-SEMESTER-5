import java.util.Scanner;
class Mahasiswa{
	int mataKuliah;
	int amataKuliah;
	String nama;
	String npm;
	boolean cekMatakuliah;
	
	void login(){
		Scanner input = new Scanner(System.in);
		System.out.print(" Nama          : ");
		nama = input.nextLine();
		System.out.print(" NPM           : ");
		npm = input.nextLine();
	}

	void pilihMatakuliah(){

		Scanner input = new Scanner(System.in);

		System.out.println("=====================================");
		System.out.println("==  1. Bahasa Inggris Nilai A      ==");
		System.out.println("==  2. Kalkulus       Nilai D      ==");
		System.out.println("==  3. RPL            Nilai B      ==");
		System.out.println("==  4. Web 1          KOSONG       ==");
		System.out.println("=====================================");
		System.out.println("Masukkan Mata Kuliah Pilihan Anda : ");
		mataKuliah = Integer.parseInt(input.next());
			   
    		if (mataKuliah==1){
      			System.out.println("TIDAK DAPAT MENGULANG MATA KULIAH INI");
      			new Mahasiswa().pilihMatakuliah();}
      			else if(mataKuliah==2){
      			System.out.println("ANDA DAPAT MEMILIH MATA KULIAH INI");}
      			else if(mataKuliah==3){
      			System.out.println("TIDAK DAPAT MENGULANG MATA KULIAH INI");
      			new Mahasiswa().pilihMatakuliah();}
      			else if(mataKuliah==4){
      			System.out.println("ANDA DAPAT MEMILIH MATA KULIAH INI");}

		System.out.println("=========================================");
		System.out.println("==  1. Inteligensi Buatan Nilai A      ==");
		System.out.println("==  2. OOAD               Nilai D      ==");
		System.out.println("==  3. IMK                Nilai B      ==");
		System.out.println("==  4. OOP                KOSONG       ==");
		System.out.println("=========================================");
		System.out.println("Masukkan Mata Kuliah Pilihan Anda : ");
		amataKuliah = Integer.parseInt(input.next());
      		if (amataKuliah==1){
      			System.out.println("TIDAK DAPAT MENGULANG MATA KULIAH INI");
      			new Mahasiswa().pilihMatakuliah();}
      			else if(amataKuliah==2){
      			System.out.println("ANDA DAPAT MEMILIH MATA KULIAH INI");}
      			else if(amataKuliah==3){
      			System.out.println("TIDAK DAPAT MENGULANG MATA KULIAH INI");
      			new Mahasiswa().pilihMatakuliah();}
      			else if(amataKuliah==4){
      			System.out.println("ANDA DAPAT MEMILIH MATA KULIAH INI");}
		}

	void krs (){
		cekMatakuliah = true;
		if(cekMatakuliah){
		System.out.println(" Dosen Menyetujui KRS");}
		cekMatakuliah = false;
		if(cekMatakuliah){
		System.out.println(" Dosen Tidak Setuju");}
	}
	void cekEmail(){

		System.out.println(" Jadwal Perkuliahan Sudah Di Kirim ke Email Mahasiswa");
		
	}


}