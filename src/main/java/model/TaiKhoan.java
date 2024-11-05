/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ADMIN
 */
public class TaiKhoan {
    private String tenĐN;
    private String MK;

    public TaiKhoan() {
    }

    public TaiKhoan(String tenĐN, String MK) {
        this.tenĐN = tenĐN;
        this.MK = MK;
    }

    public String getTenĐN() {
        return tenĐN;
    }

    public void setTenĐN(String tenĐN) {
        this.tenĐN = tenĐN;
    }

    public String getMK() {
        return MK;
    }

    public void setMK(String MK) {
        this.MK = MK;
    }

    @Override
    public String toString() {
        return "TaiKhoan{" + "ten\u0110N=" + tenĐN + ", MK=" + MK + '}';
    }   
}
