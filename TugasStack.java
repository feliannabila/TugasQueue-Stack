/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
import java.util.Stack;

/**
 *
 * @author Felian
 */
public class TugasStack {
  public static void main(String[] args) {
        Stack kotor = new Stack(); //deklarasi objek stack kotor
        Stack bersih = new Stack(); //deklarasi objek stack bersih
        for (int i = 1; i <= 10; i++)
        {
            kotor.push("Pakaian " + i); //proses memasukkan data pada stack
        }
        System.out.println("SEBELUM DICUCI" + 
                "\nJumlah Pakaian Kotor : " + kotor.size() + 
                "\nJumlah Pakaian Bersih : " + bersih.size() + 
                "\nTumpukan Pakaian Kotor :"); //menampilkan jumlah pakaian kotor

        for (int i = 1; i <= 10; i++)
        {
            System.out.println(kotor.peek());
            bersih.push(kotor.pop()); //proses pengeluaran data pada stack
        }
        System.out.println("\nSETELAH DICUCI" + 
                "\nJumlah Pakaian Kotor : " + kotor.size() + 
                "\nJumlah Pakaian Bersih : " + bersih.size() + 
                "\nTumpukan Pakaian Bersih :");//menampilkan jumlah pakaian bersih
        for (int i = 9; i >= 0; i--)
        {
            System.out.println(bersih.elementAt(i));
        }
    }
}

