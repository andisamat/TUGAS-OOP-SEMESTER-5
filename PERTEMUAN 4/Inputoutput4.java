import java.util.Scanner;

public class Inputoutput4 {
public static void main (String[]args){

// mengambil data yang di buat//
Scanner input = new Scanner(System.in);
//membuat variabel//
String nama;
char jenisKelamin;
int tinggiBadan;
boolean menikah;

System.out.print("Masukkan nama:");
//untuk input data string//
nama = input.nextLine();

System.out.print("Masukkan jenis kelamin:");
//untuk input data char//
jenisKelamin = input.next().charAt(0);

System.out.print("Masukkan tinggi badan:");
//untuk input data int//
tinggiBadan = input.nextInt();

System.out.print("Masukkan status menikah:");
//untuk input data boolean//
menikah = input.nextBoolean();

//untuk menampilkan  data string yang sudah di input//
System.out.println("Nama : "+ nama);
//untuk menampilkan  data char yang sudah di input//
System.out.println("Jenis Kelamin : "+ jenisKelamin);
//untuk menampilkan  data int yang sudah di input//
System.out.println("Tinggi BAdan : "+ tinggiBadan);
//untuk menampilkan  data boolean yang sudah di input//
System.out.println("Menikah : "+ menikah);

}}