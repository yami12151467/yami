/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dodolan.pulsa;

import java.util.Scanner;

/**
 *
 * @author sholjun
 */
public class DodolanPulsa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        tablepulsa entityObjk =new tablepulsa();
        QuerySidik tambah = new QuerySidik();
        Scanner input=new Scanner(System.in);
        String nama,nohp,jwb;
        long id;
        
        System.out.println("SELAMAT DATANG DI DODOLAN PULSA");
        System.out.println("moggo isi bio data dulu :");
        System.out.print("Nama Lengkap :");nama = input.nextLine();
        System.out.print("Nomor hp :");nohp=input.nextLine();
        entityObjk.setNama(nama);
        entityObjk.setNohp(nohp);
        tambah.Add(entityObjk);
        
        System.out.println("Apakah data anda ingin dilihat kan ? jawab ya/no");jwb=input.nextLine();
        if(jwb.equals("ya")){
        tambah.Show();
        }
        
        System.out.println("Apakah data anda ingin di rubah kan ? jawab lanjut/tidak");jwb=input.nextLine();
        if(jwb.equals("lanjut")){
            System.out.print("Nama :");nama = input.nextLine();
            System.out.print("No HP :");nohp = input.nextLine();
            System.out.print("ID :");id=input.nextLong();
            tambah.update(id,nama,nohp);
            tambah.Show();
        }
        
        System.out.println("Apakah data anda ingin di hapus kan ? jawab lanjut/tidak");jwb=input.nextLine();
        if(jwb.equals("lanjut")){
            
        }
        
    }
    
}
