/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class Bank {
    int saldoSaya;
    int total;
    public Bank(int saldo){
        saldoSaya = saldo;
    }
    
    void getSaldo(){
        System.out.println("Selamat datang di Bank BNN");
        System.out.println("Saldo saat ini : Rp." + saldoSaya);
          
        
    }
    void simpanUang(int Simpan){
        saldoSaya+= Simpan;
       
        System.out.println("Simpan uang : " + Simpan);
        System.out.println("Saldo saat ini : "+"Rp." + saldoSaya);
    }
    void ambilUang(int ambil){
        if(ambil < saldoSaya){
            saldoSaya -= ambil;
        System.out.println("Ambil uang : " + ambil);
        System.out.println("saldo saat ini : "+"Rp." +saldoSaya);
    }
}
}
    

