/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Felian
 */
public class TugasQueue {
    public static void main(String[] args) {
        //menamakan interface queue menggunakan object linked list
        Queue<String> agensipopkorsel = new LinkedList<>();
        
        //menambahkan data ke list queue (Enqueue)
        agensipopkorsel.add("SM Entertaintment");
        agensipopkorsel.add("Bighit Entertaintment");
        agensipopkorsel.add("JYP Entertaintment");
        agensipopkorsel.add("YG Entertaintment");
        
        //menampilkan output hasil list
        System.out.println("Agensi Besar  : "+agensipopkorsel);
        
         //menghapus data queue menggunakan operasi dequeue
        String nama = agensipopkorsel.remove();
        System.out.println("Menghapus Antrian : "+nama+"| Antrian Baru : "+agensipopkorsel);
        
        //menghapus element dengan method poll()
        nama = agensipopkorsel.poll();
        System.out.println("Menghapus Antrian : "+nama+"| Antrian Baru : "+agensipopkorsel);
        
    }
}

