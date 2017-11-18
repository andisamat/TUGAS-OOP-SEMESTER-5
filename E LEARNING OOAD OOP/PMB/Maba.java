import java.util.Scanner;
class Maba{

	String nama;
	String alamat;
	String lulusan;
	String email;
	String jurusan;
	boolean cekPendaftaran;
	boolean cekPembayaran;

	
	void daftar(){

		Scanner scan = new Scanner (System.in);

		System.out.print(" Masukkan Nama Lengkap :    ");
		nama = scan.nextLine();
		System.out.print(" Masukkan Alamat :  ");
		alamat = scan.nextLine();
		System.out.print(" Masukkan Lulusan :  ");
		lulusan = scan.nextLine();
		System.out.print(" Masukkan Email :  ");
		email = scan.nextLine();
		System.out.print(" Jurusan :");
		jurusan = scan.nextLine();
		cekPendaftaran = true;
		cekPembayaran = true;
		
	}
	void telahTerdaftar(){
		cekPendaftaran = true;
		if (cekPendaftaran){System.out.println(" Mahasiswa sudah terdaftar");

		}
		cekPendaftaran = false;
		if (cekPendaftaran){System.out.println(" Mahasiswa belum terdaftar");
		}
		
	}
	void telahMembayar(){
		cekPembayaran = true;
		if (cekPembayaran){System.out.println(" Mahasiswa Telah Membayar");

		}
		cekPembayaran = false;
		if (cekPembayaran){System.out.println(" Mahasiswa belum membayar");
		}
	}
	void menerimaNIM(){
		System.out.println(" Cek Email Anda Untuk Mengetahui NIM dan informasi lainnya ");
	}

	
}