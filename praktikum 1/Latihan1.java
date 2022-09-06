import java.util.Scanner;
    public class Latihan1
    {
        public static void main (String[] args)
        {
        Scanner beli = new Scanner(System.in);
        int harga, banyaknya, bayar, diskon, total;
        System.out.print("Harga Produk per item: ");
        harga = beli.nextInt();

        System.out.print("Jumlah Pembelian Produk : ");
        banyaknya = beli.nextInt();

        bayar = harga * banyaknya;
        diskon = bayar * 15/100;
        System.out.println("Diskon 15% : " +diskon);
    
        total = bayar - diskon;
        System.out.println("Total Biaya Pembelian Sudah Dipotong Diskonnya Menjadi : " + total);
    }
    }



/*public class praktikum {
    public static void main(String[] args) { 

        int Harga = Integer.parseInt(args[0]);
        int Hasil = nilai1 + nilai2;
        System.out.println("Hasil " +nilai1+ " + " +nilai2+ " = " + hasil);
        } 
}*/