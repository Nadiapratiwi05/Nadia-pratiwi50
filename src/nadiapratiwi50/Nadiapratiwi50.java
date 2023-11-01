
package nadiapratiwi50;

import java.util.Scanner;

public class Nadiapratiwi50 {

    public static void main(String[] args) {
        int variabel1, variabel2, keluaran;
        
        Scanner keyboard = new Scanner(System.in);
                            
                            //OPERATOR PENUGASAN
                            
        System.out.print("Input variabel1: ");
        variabel1 = keyboard.nextInt();
        System.out.print("Input variabel2: ");
        variabel2 = keyboard.nextInt();

        //*PENJUMLAHAN
        keluaran = variabel1 + variabel2;
        System.out.println("keluaran = " + keluaran);

        System.out.print("Input variabel1: ");
        variabel1 = keyboard.nextInt();
        System.out.print("Input variabel2: ");
        variabel2 = keyboard.nextInt();

        //*PENGURANGAN
        keluaran = variabel1 - variabel2;
        System.out.println("keluaran = " + keluaran);

         System.out.print("Input variabel1: ");
        variabel1 = keyboard.nextInt();
        System.out.print("Input variabel2: ");
        variabel2 = keyboard.nextInt();

        //*PERKALIAN
        keluaran = variabel1 * variabel2;
        System.out.println("keluaran = " + keluaran);


        System.out.print("Input variabel1: ");
        variabel1 = keyboard.nextInt();
        System.out.print("Input variabel2: ");
        variabel2 = keyboard.nextInt();

        //*PEMBAGIAN
        keluaran = variabel1 /variabel2;
        System.out.println("keluaran = " + keluaran);

        System.out.print("Input variabel1: ");
        variabel1 = keyboard.nextInt();
        System.out.print("Input variabel2: ");
        variabel2 = keyboard.nextInt();

        //*SISA BAGI (MODULUS)
        keluaran = variabel1 % variabel2;
        System.out.println("keluaran = " + keluaran);
        
                            // OPERATOR PEMBANDING

        //*Data first lebih besar dari Data second
        
        System.out.print("Masukkan Data first: ");
        float Datafirst = keyboard.nextInt();
        System.out.print("Masukkan Data second: ");
        float Datasecond = keyboard.nextInt();
        boolean hasil;
        hasil = Datafirst > Datasecond;
        System.out.println("Pernyataan = " + hasil);
        
        //*Data pertama lebih kecil dari Data kedua
       
        System.out.print("Masukkan Data pertama: ");
        float Datapertama = keyboard.nextInt();
        System.out.print("Masukkan Data kedua: ");
        float Datakedua = keyboard.nextInt();
        boolean hasilnya;
        hasilnya = Datapertama > Datakedua;
        System.out.println("Pernyataan = " + hasilnya);

        //*Data satu lebih besar sama dengan Data dua
       
        System.out.print("Masukkan Data satu: ");
        float Datasatu = keyboard.nextInt();
        System.out.print("Masukkan Data dua: ");
        float Datadua = keyboard.nextInt();
        boolean hasill;
        hasill = Datasatu >= Datadua;
        System.out.println("Pernyataan = " + hasill);

        //*Data ku lebih kecil sama dengan Data mu
       
        System.out.print("Masukkan Data ku: ");
        float Dataku = keyboard.nextInt();
        System.out.print("Masukkan Data 4: ");
        float Datamu = keyboard.nextInt();
        boolean hasilku;
        hasilku = Dataku <= Datamu;
        System.out.println("Pernyataan = " + hasilku);
        
        //*Data A sama dengan Data Z
        
        System.out.print("Masukkan Data A: ");
        float DataA = keyboard.nextInt();
        System.out.print("Masukkan Data Z: ");
        float DataZ = keyboard.nextInt();
        boolean hasildari;
        hasildari = DataA == DataZ;
        System.out.println("Pernyataan = " + hasildari);
        
        //*Data akhir tidak sama dengan Data awal
        
        System.out.print("Masukkan Data akhir: ");
        float Datakhir = keyboard.nextInt();
        System.out.print("Masukkan Data awal: ");
        float Dataawal = keyboard.nextInt();
        boolean hasilakhir;
        hasilakhir = Datakhir != Dataawal;
        System.out.println("Pernyataan = " + hasilakhir);
       
        
                            // OPERATOR BITWISE
                            
        int n , p , result;
        boolean result1;
        
        System.out.print("result n: ");
        n = keyboard.nextInt();
        System.out.print("result p: ");
        p = keyboard.nextInt();

        result = n & p;       /* 12 = 0000 1100 */
        System.out.println("n & p = " + result);

        result = n | p;       /* 61 = 0011 1101 */
        System.out.println("n | p = " + result);

        result = n ^ p;       /* 49 = 0011 0001 */
        System.out.println("n ^ p = " + result);

        result = ~n;          /*-61 = 1100 0011 */
        System.out.println("~n = " + result);

        result = n << 2;     /* 240 = 1111 0000 */
        System.out.println("n << 2 = " + result);

        result = n >> 2;     /* 215 = 1111 */
        System.out.println("a >> 2  = " + result);

        result = n >>> 2;     /* 215 = 0000 1111 */
        System.out.println("n >>> 2 = " + result);
    }
    
}
