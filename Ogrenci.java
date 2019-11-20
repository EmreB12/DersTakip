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
public class Ogrenci {
    String Ad,SoyAd;
    int No;
    Dersler AlınanDers;
    LabDersler AlınanLabDers;
    ArrayList ButunDersler = new ArrayList();
    
    public Ogrenci(String ad,String soyad,int no) {
        Ad=ad;
        SoyAd=soyad;
        No=no;
    }
    
    public void ders_al(){
        AlınanDers=new Dersler();
        System.out.println("Dersin ismini girinz : ");
        Scanner Ders_ismi = new Scanner(System.in);
        AlınanDers.DersinAdı=Ders_ismi.nextLine();
        ButunDersler.add(AlınanDers);
    }
    public void ders_al(String ders){
        AlınanDers=new Dersler();
        AlınanDers.DersinAdı=ders;
        ButunDersler.add(AlınanDers);
    }
    public void lab_ders_al(){
        AlınanLabDers=new LabDersler();
        System.out.println("LAB dersin ismini girinz : ");
        Scanner Lab_Ders_ismi = new Scanner(System.in);
        AlınanLabDers.DersinAdı=Lab_Ders_ismi.nextLine();
        ButunDersler.add(AlınanLabDers);
    }
    public void lab_ders_al(String labders){
        AlınanLabDers=new LabDersler();
        AlınanLabDers.DersinAdı=labders;
        ButunDersler.add(AlınanLabDers);
    }
    public void not_gir(){
        System.out.println("Not gireceğiniz dersin adını giriniz : ");
        Scanner dersadi = new Scanner(System.in);
        String girdi = dersadi.nextLine();
        for(Object Eleman : ButunDersler){
            // instanceof Dersler
            if(Eleman instanceof Dersler)
            {
                Dersler a1=new Dersler();
                a1 = (Dersler)Eleman;
                if (girdi==a1.DersinAdı)
                {
                    System.out.println("Vizeyi giriniz : ");
                    a1.Vize=dersadi.nextInt();
                    System.out.println("Finali giriniz : ");
                    a1.Final=dersadi.nextInt();
                }
            }        
        }
    }
    public void derslereBak(){
        for ( Object Deger : ButunDersler){
            if(!(Deger instanceof LabDersler)){
                Dersler a2;
                a2=(Dersler)Deger;
                System.out.println(a2.DersinAdı);
            }
        }
    }
    public void labderslereBak(){
        for ( Object Deger : ButunDersler){
            if(Deger instanceof LabDersler){
                LabDersler a2;
                a2=(LabDersler)Deger;
                System.out.println(a2.DersinAdı);
            }
        }
    }
    public void lab_not_gir(){
        System.out.println("Not gireceğiniz lab dersinin adını giriniz : ");
        Scanner labdersadi = new Scanner(System.in);
        String labgirdi=labdersadi.nextLine();
        for ( Object Deger : ButunDersler){
            if(Deger instanceof LabDersler){
                LabDersler a2;
                a2=(LabDersler)Deger;
                if(labgirdi==a2.DersinAdı){
                    System.out.println("Vizeyi giriniz : ");
                    a2.Vize=labdersadi.nextInt();
                    System.out.println("Finali giriniz : ");
                    a2.Final=labdersadi.nextInt();
                    System.out.println("Lab notunu giriniz : ");
                    for (int i=0;i<a2.Lab.length;i++){
                        System.out.println(i+1+". lab dersinin notunu giriniz");
                        a2.Lab[i]=labdersadi.nextInt();
                        
                    }  
                }  
            }
        }
    }
    public void lab_kac_hafta_girdi(){
        Scanner labdersadi = new Scanner(System.in);
        int geldigidersler=0;
        String labgirdi=labdersadi.nextLine();
        for ( Object Deger : ButunDersler){
            if(Deger instanceof LabDersler){
                LabDersler a2;
                a2=(LabDersler)Deger;
                if(labgirdi==a2.DersinAdı){
                    for(int i=0;i<a2.Lab.length;i++){
                        if(a2.Lab[i]!=0){      
                            geldigidersler+=1;
                        } 
                    }
                }
            }
        
        }
        System.out.println("Geldiği ders sayısı "+geldigidersler);
       
    }
    public void kac_hafta_girdi(){
        Scanner dersadi = new Scanner(System.in);
        int geldigidersler=0;
        System.out.println("Hangi derse bakıcaksınız:");
        String girdi=dersadi.nextLine();
        for ( Object Deger : ButunDersler){
            if(Deger instanceof Dersler){
                Dersler a3;
                a3=(Dersler)Deger;
                if(girdi==a3.DersinAdı){
                    for(int i=0;i<a3.yoklama.length;i++){
                        if(a3.yoklama[i]!=0){      
                            geldigidersler+=1;
                        } 
                    }
                }
            }
        
        }
        System.out.println("Geldiği ders sayısı "+geldigidersler);  
    }
    public void ogrenci_ekle(){
        Scanner ogrenci = new Scanner(System.in);
        System.out.println("Ögrencinin adını giriniz : ");
        Ad=ogrenci.nextLine();
        System.out.println("Öğrencinin soyadını giriniz : ");
        SoyAd=ogrenci.nextLine();
        System.out.println("Öğrencinin nosunu giriniz : ");
        No=ogrenci.nextInt();
    }
    
    
    
    
    
  }
    