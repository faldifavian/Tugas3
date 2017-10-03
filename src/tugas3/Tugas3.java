/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas3;

/**
 *
 * @author faldi
 */
class Mahasiswa {

    private String nama;
    private String nim;
    private double uas, uts, quiz;
    private char index;
    private String keterangan;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public double getUas() {
        return uas;
    }

    public void setUas(double uas) {
        this.uas = uas;
    }

    public double getUts() {
        return uts;
    }

    public void setUts(double uts) {
        this.uts = uts;
    }

    public double getQuiz() {
        return quiz;
    }

    public void setQuiz(double quiz) {
        this.quiz = quiz;
    }

    public char getIndex() {
        return index;
    }

    public void setIndex(char index) {
        this.index = index;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    public double getNilaiAkhir(double quiz, double uts, double uas) {
        return quiz * 0.2 + uts * 0.3 + uas * 0.5;
    }
    
    public void getIndex(double nilaiAkhir) {
        if (nilaiAkhir <= 45) {
            index = 'E';
            keterangan = "Sangat Kurang";
        } else if (nilaiAkhir <= 56) {
            index = 'D';
            keterangan = "Kurang";
        } else if (nilaiAkhir <= 68) {
            index = 'C';
            keterangan = "Cukup";
        } else if (nilaiAkhir <= 80) {
            index = 'B';
            keterangan = "Baik";
        } else if (nilaiAkhir <= 100) {
            index = 'A';
            keterangan = "Sangat Baik";
        }

        System.out.println("\nIndex = " + index);
        System.out.println("Keterangan = " + keterangan);
    }

}

public class Tugas3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.setNama("Rizki Adam Kurniawan");
        mhs1.setNim("7.51.15.036.");
        mhs1.setQuiz(75);
        mhs1.setUts(45);
        mhs1.setUas(34);

        for (int i = 1; i <= 4; i++) {
            System.out.println("Nama ke " + i + "\t\t = "+mhs1.getNama());
        }
        
        for (int i=8;i>=1;i--){
            System.out.println("NIM ke "+i+"\t\t = "+mhs1.getNim()+i);
        }
        
        System.out.println("\nQUIZ \t = "+mhs1.getQuiz());
        System.out.println("UTS \t = "+mhs1.getUts());
        System.out.println("UAS \t = "+mhs1.getUas());
       double nilaiAkhir = mhs1.getNilaiAkhir(mhs1.getQuiz(),mhs1.getUts(), mhs1.getUas());
       
       mhs1.getIndex(nilaiAkhir);

    }

}
