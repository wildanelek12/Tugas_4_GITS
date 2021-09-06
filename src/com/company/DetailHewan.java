package com.company;

public class DetailHewan extends Hewan {

    String nama [] = {"Kalkun","Ayam","Kambing","Ikan","Sapi"};
    String jumlah;


    @Override
    public void pilihanHewan (){
        System.out.println("Nama Hewan : "+nama[0]+" \n Jumhlah : 10");
    }

    public void pilihanHewan (int index,String jumlah){
        this.jumlah = jumlah;
        System.out.println("Nama Hewan : "+nama[index]+" \n Jumhlah : " + getJumlah());
    }

    public String getJumlah() {
        return jumlah;
    }
}
