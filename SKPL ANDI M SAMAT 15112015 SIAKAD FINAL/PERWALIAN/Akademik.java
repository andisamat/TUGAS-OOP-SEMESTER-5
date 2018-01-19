class Akademik{
	String nik;
	String nama;
	void formKRS(){
		Mahasiswa mhs = new Mahasiswa();
		mhs.pilihMatakuliah();
	
	}
	void kirimEmail(){
		Mahasiswa ma = new Mahasiswa();
		ma.cekEmail();
	}
}