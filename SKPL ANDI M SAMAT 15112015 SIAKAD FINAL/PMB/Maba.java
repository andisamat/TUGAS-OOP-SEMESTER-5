import java.util.Scanner;
class Maba{

	String nama;
	String alamat;
	int lulusan;
	String email;
	int jurusan;
	boolean cekPendaftaran;
	boolean cekPembayaran;

	
	void daftar(){

		Scanner scan = new Scanner (System.in);
    System.out.println("SILAHKAN ISI BIODATA DIRI ANDA DENGAN BENAR");
		System.out.print("NAMA   :  ");
		nama = scan.nextLine();
		System.out.print("ALAMAT :  ");
		alamat = scan.nextLine();
		System.out.print("EMAIL  :  ");
		email = scan.nextLine();
		System.out.println("==========================");
		System.out.println("==  1. SMA IPA          ==");
		System.out.println("==  2. SMA IPS          ==");
		System.out.println("==  3. SMK TEKNIK       ==");
		System.out.println("==  4. MAN              ==");
		System.out.println("==========================");
		System.out.println("Silahkan Pilih Sesuai Dengan Jurusan Anda : ");
		lulusan = Integer.parseInt(scan.next());
		switch(lulusan){
 
 		 case 1 :{
 		 	  System.out.println("=======================");
   			System.out.println("==  1. INFORMATIKA   ==");
  			System.out.println("==  2. INDUSTRI      ==");
   			System.out.println("==  3. DKV           ==");
  			System.out.println("=======================");
   			System.out.println("Masukkan Pilihan Sesusai Dengan Keinginan Anda : ");
   			jurusan = Integer.parseInt(scan.next());
   
     		if (jurusan==1)
     		 	 System.out.println("JURUSAN YANG ANDA PILIH INFORMATIKA");
      			else if(jurusan==2)
      			System.out.println("JURUSAN YANG ANDA PILIH INDUSTRI");
      			else if(jurusan==3)
      			System.out.println("JURUSAN YANG ANDA PILIH DKV"); 
    
      		 break;
    	 }
    
  		case 2 :{   
   			System.out.println("=======================");
   			System.out.println("==  1. INFORMATIKA   ==");
  			System.out.println("==  2. INDUSTRI      ==");
   			System.out.println("==  3. DKV           ==");
  			System.out.println("=======================");
   			System.out.println("Masukkan Pilihan Sesusai Dengan Keinginan Anda : ");
   			jurusan = Integer.parseInt(scan.next());
   
     		if (jurusan==1){
     			 System.out.println("ANDA TIDAK DAPAT MEMILIH JURUSAN INFORMATIKA");
          System.exit(0);}
      			else if(jurusan==2){
      			System.out.println("JURUSAN YANG ANDA PILIH INDUSTRI");}
      			else if(jurusan==3){
      			System.out.println("ANDA TIDAK DAPAT MEMILIH JURUSAN DKV");
            System.exit(0);
           } 
    
      		 break;
    	 } 

    	 case 3 :{   
   			System.out.println("=======================");
   			System.out.println("==  1. INFORMATIKA   ==");
  			System.out.println("==  2. INDUSTRI      ==");
   			System.out.println("==  3. DKV           ==");
  			System.out.println("=======================");
   			System.out.println("Masukkan Pilihan Sesusai Dengan Keinginan Anda : ");
   			jurusan = Integer.parseInt(scan.next());
   
     		if (jurusan==1)
     			 System.out.println("JURUSAN YANG ANDA PILIH INFORMATIKA");
      			else if(jurusan==2)
      			System.out.println("JURUSAN YANG ANDA PILIH INDUSTRI");
      			else if(jurusan==3)
      			System.out.println("JURUSAN YANG ANDA PILIH DKV"); 
    
      		 break;
    	 } 

    	 case 4 :{   
   			System.out.println("=======================");
   			System.out.println("==  1. INFORMATIKA   ==");
  			System.out.println("==  2. INDUSTRI      ==");
   			System.out.println("==  3. DKV           ==");
  			System.out.println("=======================");
   			System.out.println("Masukkan Pilihan Sesusai Dengan Keinginan Anda : ");
   			jurusan = Integer.parseInt(scan.next());
   
     		if (jurusan==1){
     			 System.out.println("ANDA TIDAK DAPAT MEMILIH JURUSAN INFORMATIKA");
          System.exit(0);}
      			else if(jurusan==2){
      			System.out.println("JURUSAN YANG ANDA PILIH INDUSTRI");}
      			else if(jurusan==3){
      			System.out.println("ANDA TIDAK DAPAT MEMILIH JURUSAN DKV"); 
          System.exit(0);}
    
      		 break;
    	 } 
 		 }
			
	}
	void telahTerdaftar(){
		cekPendaftaran = true;
		if (cekPendaftaran){System.out.println("ANDA TELAH TERDAFTAR");

		}
		cekPendaftaran = false;
		if (cekPendaftaran){System.out.println("ANDA TIDAK TERDAFTAR");
		}
		
	}
	void telahMembayar(){
		cekPembayaran = true;
		if (cekPembayaran){System.out.println("MAHASISWA TELAH MEMBAYAR");

		}
		cekPembayaran = false;
		if (cekPembayaran){System.out.println("MAHASISWA BELUM MEMBAYAR");
		}
	}
	void menerimaNIM(){
		System.out.println(" CEK EMAIL ANDA UNTUK MENGETAHUI NIM DAN INFORMASI LAINNYA ");
	}
	
}