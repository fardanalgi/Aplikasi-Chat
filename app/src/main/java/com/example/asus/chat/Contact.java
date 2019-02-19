package com.example.asus.chat;

public class Contact {

    private String nama;
    private String phone;
    private int photo;


    public Contact() {
    }

    public Contact(String nama, String phone, int photo) {
        this.nama = nama;
        this.phone = phone;
        this.photo = photo;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }
}
