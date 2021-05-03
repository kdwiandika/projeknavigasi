import java.util.Scanner;

public class main {
public static void main(String[] args)
{

String pilihST;
int pilihIN;
Scanner scan = new Scanner(System.in);

 System.out.println("");
 System.out.println("\n =================================");
 System.out.println("\n\tAplikasi Navigasi");
 System.out.println("\n =================================");
 System.out.println("Untuk Wilayah Malang dan Sekitarnya ");
 System.out.println("Pilih asal kecamatan anda : ");
 System.out.println("1. Sukun");
 System.out.println("2. Lowokwaru");
 System.out.println("3. Klojen");
 pilihIN = scan.nextInt();

 if (pilihIN == 1)
 {
      System.out.println("Wilayah Sukun");
      System.out.println("Pilih opsi : ");
      System.out.println("1. Rumah Sakit");
      System.out.println("2. Kantor Polisi");
      System.out.println("3. SPBU");
      pilihIN = scan.nextInt();

      if (pilihIN == 1)
      {
          System.out.println("1. RST Dr. Soepraoen -> JL. S. Supriyadi, No. 22 (Disertai gambar map)");
          System.out.println("2. dan lain lain");
      }
 }

 else if (pilihIN == 2)
 {
     System.out.println("Wilayah Lowokwaru");
     System.out.println("Pilih opsi : ");
     System.out.println("1. Rumah Sakit");
     System.out.println("2. Kantor Polisi");
     System.out.println("3. Kantor Pos");
     System.out.println("4. Pasar");
     System.out.println("5. Hotel");

     
     pilihIN = scan.nextInt();

      if (pilihIN == 1)
      {
          System.out.println("1.  (Disertai gambar map)");
          System.out.println("2. dan lain lain");
      }else if (pilihIN == 2)
      {
          System.out.println("1.  (Disertai gambar map)");
          System.out.println("2. dan lain lain");
      }else if (pilihIN == 3)
      {
          System.out.println("1.  (Disertai gambar map)");
          System.out.println("2. dan lain lain");
      }else if (pilihIN == 4)
      {
          System.out.println("1. Pasar Tawangmangu -> Jl. Tawangmangu No. 8 (Disertai gambar map)");
          System.out.println("2. dan lain lain");
      }else if (pilihIN == 5)
      {
          System.out.println("1. Hotel Santika Premiere Malang -> Jl. Letjen Sutoyo, No. 79 (Disertai gambar map)");
          System.out.println("2. dan lain lain");
      }
  
     
 }
 else if(pilihIN == 3)
 {
     System.out.println("Wilayah Klojen");
     System.out.println("Pilih opsi : ");
     System.out.println("1. Rumah Sakit");
     System.out.println("2. Kantor Polisi");
     System.out.println("3. Kantor Pos");
 }

}

}
