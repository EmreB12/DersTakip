/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package derstakip;

import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Emre Arslann
 */
public class DersTakip {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner secim=new Scanner(System.in);
        
        ArrayList<Ogrenci> ogrenciler = new ArrayList<Ogrenci>();
        Ogrenci o1 = new Ogrenci("Emre","Arslan",171418002);
        Ogrenci o2 = new Ogrenci("Tugbanur Aybuke","Arslan",170418035);
        Ogrenci o3 = new Ogrenci("Yusuf Hayri","Ertürk",171418005);        
        Ogrenci o4 = new Ogrenci("İsmet Haktan","Kocyigit",171418011);
        Ogrenci o5 = new Ogrenci("Murat","Acar",170418049);
        o1.ders_al("Ayrik Matematik");
        o2.ders_al("Ayrik Matematik");
        o3.ders_al("Ayrik Matematik");
        o4.ders_al("Ayrik Matematik");
        o5.ders_al("Ayrik Matematik");
        o1.ders_al("Diferansiyel Denklem");
        o2.ders_al("Diferansiyel Denklem");
        o3.ders_al("Diferansiyel Denklem");
        o4.ders_al("Diferansiyel Denklem");
        o5.ders_al("Diferansiyel Denklem");
        o1.lab_ders_al("Mantık Devreleri");
        o2.lab_ders_al("Mantık Devreleri");
        o3.lab_ders_al("Mantık Devreleri");
        o4.lab_ders_al("Mantık Devreleri");
        o5.lab_ders_al("Mantık Devreleri");
        o1.lab_ders_al("Programlama 2");
        o2.lab_ders_al("Programlama 2");
        o3.lab_ders_al("Programlama 2");
        o4.lab_ders_al("Programlama 2");
        o5.lab_ders_al("Programlama 2");
        o1.lab_ders_al("Nesne Yonelimli Programlama");
        o2.lab_ders_al("Nesne Yonelimli Programlama");
        o3.lab_ders_al("Nesne Yonelimli Programlama");
        o4.lab_ders_al("Nesne Yonelimli Programlama");
        o5.lab_ders_al("Nesne Yonelimli Programlama");
        
        ogrenciler.add(o1);
        ogrenciler.add(o2);
        ogrenciler.add(o3);
        ogrenciler.add(o4);
        ogrenciler.add(o5);
        
        boolean devam=true;
        while(devam)
        {
            System.out.println("1. Derslere bak\n2. Lab Derslerine bak\n3.Ogrenci Ekle\n4.Devam durumu\n5.Cıkıs");
            int a=secim.nextInt();
            switch (a)
            {
                case 1:
                    System.out.println("Ogrenci Numarası giriniz : ");
                    int ogrenci=secim.nextInt();
                    for(Ogrenci eleman : ogrenciler){
                        if(eleman.No==ogrenci)
                        {
                            eleman.derslereBak();
                        }
                    }
                    break;
                case 2:
                    System.out.println("Ogrenci Numarası giriniz : ");
                    ogrenci=secim.nextInt();
                    for(Ogrenci eleman : ogrenciler){
                        if(eleman.No==ogrenci)
                        {
                            eleman.labderslereBak();
                        }
                    }
                    break;
                case 3:
                    secim.nextLine();
                    String ad = secim.nextLine();
                    String soyad = secim.nextLine();
                    int numara = secim.nextInt();
                    Ogrenci eklenen=new Ogrenci(ad, soyad, numara);
                    ogrenciler.add(eklenen);
                    break;
                case 4:
                    System.out.println("Ogrenci Numarası giriniz : ");
                    ogrenci=secim.nextInt();
                    for(Ogrenci eleman : ogrenciler){
                        if(eleman.No==ogrenci)
                        {
                            eleman.kac_hafta_girdi();
                        }
                    }
                    break;
                case 5:
                    devam=false;
                    break;
            }

        }        
        
        
        
   
    }
    
}
