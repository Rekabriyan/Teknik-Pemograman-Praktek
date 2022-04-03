/*
Nama    : Reka Briyan Cahya Heryana
Kelas   : D4-1A Teknik Informatika
Program : DataTypes
 */
package data.type;

import java.util.Scanner; //header library scanner
public class DataType {

    public static void main(String[] args) {
        int inputAngka; //variabel untuk memasukkan maksimal angka
        int i; //kondisi awal perulangan
        
        //untuk scanner baru
        Scanner input = new Scanner(System.in);
        
        //untuk membuat jumlah angka memjadi inputan
        inputAngka = input.nextInt();
   
        //membuat array baru untuk menampung angka sesuai inputan maksimal
        String[] x = new String[inputAngka];         
        
        //perulangan untuk mengisi angka 
        for(i = 0; i < inputAngka; i++){
            x[i] = input.next();
        }
        
        //perulangan untuk menampilkan output yang diinginkan
        for(i = 0; i < inputAngka ; i++){
            try{    
                long perubahan = Long.parseLong(x[i]);
                System.out.println(perubahan + " can be fitted in:");
                if ((perubahan > -9223372036854775808L)&&(perubahan < 9223372036854775807L)){
                        System.out.println("Long");
                        if ((perubahan > -2147483648)&&(perubahan < 2147483647)){
                        System.out.println("Int");
                        if((perubahan > -32768)&&(perubahan < 32767)){
                        System.out.println("short");
                    }
                  }
                }
            } catch(NumberFormatException e){
              System.out.println(x[i] + " can't be fitten anywhere");
                        }
            }
        }
    }

