package com.crudproje.demo.entities;

import jakarta.persistence.*;

@Entity
@Table(name = Cagri)
public class Cagri {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "calisan_id", nullable = false)
    private int calisan_id;

    @Column(name = "musteri_id", nullable = false)
    private int musteri_id;

    @Column(name = "baslangic_zamani", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date baslangic_zamani;

    @Column(name = "bitis_zamani")
    @Temporal(TemporalType.TIMESTAMP)
    private Date bitis_zamani;

    @Column(name = "cagri_sonuc_id")
    private Integer cagri_sonuc_id;

    // Boş constructor
    public Cagri()
    {

    }

    //parametreli constructor
    public Cagri(int id, int calisan_id, int musteri_id, Date baslangic_zamani, Date bitis_zamani, Integer cagri_sonuc_id) {
        this.id = id;
        this.calisan_id = calisan_id;
        this.musteri_id = musteri_id;
        this.baslangic_zamani = baslangic_zamani;
        this.bitis_zamani = bitis_zamani;
        this.cagri_sonuc_id = cagri_sonuc_id;
    }

    // Getter ve setter metotları
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCalisan_id() {
        return calisan_id;
    }

    public void setCalisan_id(int calisan_id) {
        this.calisan_id = calisan_id;
    }

    public int getMusteri_id() {
        return musteri_id;
    }

    public void setMusteri_id(int musteri_id) {
        this.musteri_id = musteri_id;
    }

    public Date getBaslangic_zamani() {
        return baslangic_zamani;
    }

    public void setBaslangic_zamani(Date baslangic_zamani) {
        this.baslangic_zamani = baslangic_zamani;
    }

    public Date getBitis_zamani() {
        return bitis_zamani;
    }

    public void setBitis_zamani(Date bitis_zamani) {
        this.bitis_zamani = bitis_zamani;
    }

    public Integer getCagri_sonuc_id() {
        return cagri_sonuc_id;
    }

    public void setCagri_sonuc_id(Integer cagri_sonuc_id) {
        this.cagri_sonuc_id = cagri_sonuc_id;
    }

    @Override
    public String toString() {
        return "Cagri{" +
                "id=" + id +
                ", calisan_id=" + calisan_id +
                ", musteri_id=" + musteri_id +
                ", baslangic_zamani=" + baslangic_zamani +
                ", bitis_zamani=" + bitis_zamani +
                ", cagri_sonuc_id=" + cagri_sonuc_id +
                '}';
    }

}
