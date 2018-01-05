public abstract Class Nadyron extends Mahasiswa {//[]abztract class
	protected String getNama(){
	return super.getNama();
	}
	
	public void printNAma(){
		System.out.println(getNama());
	}	

	public static void main (String[] args) {

		Nadyron ron = new Nadyron();
		ron.printNama();
	}
	
}