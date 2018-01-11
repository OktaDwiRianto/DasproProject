import java.util.Scanner;
public class Energi {

public static void main(String args[])
{
Scanner nilai=new Scanner(System.in);

// Ep =mxgxh
// Ek = 1/2x m xv^2

int EnergiPotensial;
int Massa;
int Gravitasi;
int Ketinggian;
int EnergiKinetik;
int Kecepatanpangkatdua;
int Kecepatan;
int Pilihan;

for (String a = "YA"; a.equals("YA")||a.equals("ya"); )
{
	
System.out.println("1. Energi Potensial");
System.out.println("2. Energi Kinetik");

System.out.print("Masukan Pilihan");
Pilihan=nilai.nextInt();

if(Pilihan==1)
{
	System.out.println("Ep = m x g x h");
	System.out.print("Massa =");
	Massa=nilai.nextInt();
	System.out.print("Gravitasi =");
	Gravitasi=nilai.nextInt();
	System.out.print("Ketinggian =");
	Ketinggian=nilai.nextInt();
	EnergiPotensial=Massa * Gravitasi* Ketinggian;
	System.out.println("Energi Potensial = "+EnergiPotensial);

}
else if(Pilihan==2)
{
	System.out.println("Ek = 1/2 x m x v^2");
	System.out.print("Massa =");
	Massa=nilai.nextInt();
	System.out.print("Kecepatan^2 =");
	Kecepatan=nilai.nextInt();
	EnergiKinetik= Massa*Kecepatan*Kecepatan *1/2;
	System.out.println("Energi Kinetik = "+EnergiKinetik);
}
else System.out.println("Masukkan Pilihan Lain");
 System.out.println("");
	System.out.println("Lanjutkan ? YA/TIDAK");
	a=nilai.next();
}
}
}

