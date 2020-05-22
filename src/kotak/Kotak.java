/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kotak;
import java.util.Stack;//import library stack
/**
 *
 * @author Lola
 */
public class Kotak {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Stack kosong = new Stack();//deklarasi objek stack kosong
        Stack penuh = new Stack();//deklarasi objek stack penuh
        for(int i = 1; i <= 5; i++)//perulangan for
        {
            kosong.push("kotak " + i);//proses memasukkan data pada stack
        }
        System.out.println("SEBELUM DIISI" + "\nJumlah kotak kosong : " + 
                            kosong.size() + "\nJumlah kotak penuh : " + 
                            penuh.size() + "\nTumpukkan kotak kosong : ");
                            //menampilkan jumlah kotak kosong
                            
        for(int i = 1; i <= 5; i++)//perulangan for
        {
            System.out.println(kosong.peek());
            penuh.push(kosong.pop());//proses pengeluaran data pada stack
        }
        System.out.println("\nSETELAH DIISI" + "\nJumlah kotak kosong : " + 
                            kosong.size() + "\nJumlah kotak penuh : " + 
                            penuh.size() + "\nTumpukkan kotak kosong : ");
                            //menampilkan jumlah kotak kosong penuh dan kotak yg
                            //telah diisi
        for(int i = 4; i >= 0; i--)
        {
           System.out.println(penuh.elementAt(i)); 
        }
    }
    
}
