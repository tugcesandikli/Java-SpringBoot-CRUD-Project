package com.crudproje.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "musteri")
public class Musteri {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "musteri_adi")
    private String musteri_adi;

    @Column(name = "sehir_id")
    private int sehir_id;

    @Column(name = "musteri_adres")
    private String musteri_adres;

    @Column(name = "sonraki_cagri_tarihi")
    @Temporal(TemporalType.DATE)
    private Date sonraki_cagri_tarihi;

    @Column(name = "eklenme_zamani")
    @Temporal(TemporalType.TIMESTAMP)
    private Date eklenme_zamani;

    // Boş constructor
    public Musteri() {
    }

    // Parametreli constructor
    public Musteri(String musteri_adi, int sehir_id, String musteri_adres, Date sonraki_cagri_tarihi, Date eklenme_zamani) {
        this.musteri_adi = musteri_adi;
        this.sehir_id = sehir_id;
        this.musteri_adres = musteri_adres;
        this.sonraki_cagri_tarihi = sonraki_cagri_tarihi;
        this.eklenme_zamani = eklenme_zamani;
    }

    // Getter ve setter metotları
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMusteri_adi() {
        return musteri_adi;
    }

    public void setMusteri_adi(String musteri_adi) {
        this.musteri_adi = musteri_adi;
    }

    public int getSehir_id() {
        return sehir_id;
    }

    public void setSehir_id(int sehir_id) {
        this.sehir_id = sehir_id;
    }

    public String getMusteri_adres() {
        return musteri_adres;
    }

    public void setMusteri_adres(String musteri_adres) {
        this.musteri_adres = musteri_adres;
    }

    public Date getSonraki_cagri_tarihi() {
        return sonraki_cagri_tarihi;
    }

    public void setSonraki_cagri_tarihi(Date sonraki_cagri_tarihi) {
        this.sonraki_cagri_tarihi = sonraki_cagri_tarihi;
    }

    public Date getEklenme_zamani() {
        return eklenme_zamani;
    }

    public void setEklenme_zamani(Date eklenme_zamani) {
        this.eklenme_zamani = eklenme_zamani;
    }

    @Override
    public String toString() {
        return "Musteri{" +
                "id=" + id +
                ", musteri_adi='" + musteri_adi + '\'' +
                ", sehir_id=" + sehir_id +
                ", musteri_adres='" + musteri_adres + '\'' +
                ", sonraki_cagri_tarihi=" + sonraki_cagri_tarihi +
                ", eklenme_zamani=" + eklenme_zamani +
                '}';
    }

}

