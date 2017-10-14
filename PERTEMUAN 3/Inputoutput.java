import java.util.Scanner;

public class Inputoutput {
public static void main (String[]args){
//membuat variabel//
String data;

// mengambil data yang di buat//
Scanner scan = new Scanner(System.in);

System.out.println("Masukkan data:");
//untuk mengambil data yang dibuat//
data = scan.nextLine();

System.out.println("Data yang di masukkan adalah"+ data);
}}