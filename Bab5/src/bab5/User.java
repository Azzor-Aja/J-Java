/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bab5;

/**
 *
 * @author M.RAZOR
 */
public class User {

    private String nama;
    private String pasword;
    private int level;
    public User() {
        nama = "Ahmad";
        pasword = "amd123";
        level = 3;
    }
    
    public User(String n, String p) {
        this.nama = n;
        this.pasword= p;
        level = 2;
    }
    
    public User(String n, String p, int lv) {
        this.nama = n;
        this.pasword= p;
        this.level = lv;
    }
    
    public String getNama() {
        return this.nama;
    }
    
    public String getPasword() {
        return this.pasword;
    }
    
    public int getLevel() {
        return this.level;
    }
    
    public String getHakAkses(){
        if( getLevel() == 1){
        return "SUPER ADMIN";
        }
        else if (getLevel() == 2){
        return "ADMIN";
        }
        else{
        return "USER BIASA";
        }
    }
    
    public void infoUser() {
        System.out.println("User id : "+this.nama);
        System.out.println("Pasword : "+this.pasword);
        System.out.printf("Level %s dan Hak Akses%s...\n\n"
        ,this.level,this.getHakAkses());
    }

    
}
