package View;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.*;

public class Khoiri07192_GUIDaftarLogin {
    JFrame logReg = new JFrame();
    JLabel top, daftarr, kode, nama, notelp, umur, password, loginadmin;
    JTextField textkodeDaftar, textnamaDaftar, textnotelpDaftar, textumurDaftar, textpasswordDaftar, textkodelogin, textpasswordlogin;
    JLabel kodeLogin, passwordLogin;
    JButton daftar, masuk, keluar;
    public Khoiri07192_GUIDaftarLogin(){
    logReg.setSize(700, 600);
    logReg.setLayout(null);
    logReg.setVisible(true);
    logReg.getContentPane().setBackground(Color.cyan);
    top = new JLabel("Rental Alat Outdoor");
    top.setBounds(180, 10, 600, 50);
    top.setFont(new Font("Times New Roman",Font.BOLD,40));
    logReg.add(top);
    
    loginadmin = new JLabel("Login Admin");
    loginadmin.setBounds(180, 350, 300, 100);
    loginadmin.setFont(new Font("Times New Roman",Font.BOLD,30));
    logReg.add(loginadmin);
    
    daftarr = new JLabel("Daftar Admin");
    daftarr.setBounds(150, 50, 300, 100);
    daftarr.setFont(new Font("Times New Roman",Font.BOLD,30));
    logReg.add(daftarr);
    
    kode = new JLabel("Kode Admin");
    kode.setBounds(100, 100, 300, 100);
    kode.setFont(new Font("Times New Roman",Font.BOLD,20));
    logReg.add(kode);
    
    textkodeDaftar = new JTextField();
    textkodeDaftar.setBounds(220, 140, 150, 30);
    logReg.add(textkodeDaftar);
    
    nama = new JLabel("Nama Admin");
    nama.setBounds(100, 135, 300, 100);
    nama.setFont(new Font("Times New Roman",Font.BOLD,20));
    logReg.add(nama);
    
    textnamaDaftar = new JTextField();
    textnamaDaftar.setBounds(220, 175, 150, 30);
    logReg.add(textnamaDaftar);
    
    notelp = new JLabel("No Telepon");
    notelp.setBounds(100, 170, 300, 100);
    notelp.setFont(new Font("Times New Roman",Font.BOLD,20));
    logReg.add(notelp);
    
    textnotelpDaftar = new JTextField();
    textnotelpDaftar.setBounds(220, 210, 150, 30);
    logReg.add(textnotelpDaftar);
    
    umur = new JLabel("Umur Admin");
    umur.setBounds(100, 205, 300, 100);
    umur.setFont(new Font("Times New Roman",Font.BOLD,20));
    logReg.add(umur);
    
    textumurDaftar = new JTextField();
    textumurDaftar.setBounds(220, 245, 150, 30);
    logReg.add(textumurDaftar);
    
    password = new JLabel("Password");
    password.setBounds(100, 240, 300, 100);
    password.setFont(new Font("Times New Roman",Font.BOLD,20));
    logReg.add(password);
    
    textpasswordDaftar = new JTextField();
    textpasswordDaftar.setBounds(220, 280, 150, 30);
    logReg.add(textpasswordDaftar);
    
    kodeLogin = new JLabel("Kode Admin");
    kodeLogin.setBounds(100, 400, 300, 50);
    kodeLogin.setFont(new Font("Times New Roman",Font.BOLD,20));
    logReg.add(kodeLogin);
        
    textkodelogin = new JTextField();
    textkodelogin.setBounds(100, 450, 150, 30);
    logReg.add(textkodelogin);
    
    passwordLogin = new JLabel("Password");
    passwordLogin.setBounds(280, 400, 300, 50);
    passwordLogin.setFont(new Font("Times New Roman",Font.BOLD,20));
    logReg.add(passwordLogin);
        
    textpasswordlogin = new JTextField();
    textpasswordlogin.setBounds(280, 450, 150, 30);
    logReg.add(textpasswordlogin);
    
    daftar = new JButton("Daftar");
    daftar.setBounds(380, 140, 100, 30);
    daftar.setBackground(Color.GREEN);
    logReg.add(daftar);
    
    keluar = new JButton("Keluar");
    keluar.setBounds(380, 170, 100, 30);
    keluar.setBackground(Color.RED);
    logReg.add(keluar);
    
    masuk = new JButton("Masuk");
    masuk.setBounds(450, 450, 100, 30);
    masuk.setBackground(Color.GREEN);
    logReg.add(masuk);
    
    logReg.setLocationRelativeTo(null);
    logReg.setVisible(true);
    logReg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    daftar.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae){
                try{
                    String kode = textkodeDaftar.getText();                   
                    String nama = textnamaDaftar.getText();
                    String notelp = textnotelpDaftar.getText();
                    String umur = textumurDaftar.getText();
                    String pass = textpasswordDaftar.getText();
                    Khoiri07192_AllObjCtrl.admin.insert(kode, nama, notelp, umur, pass);
                    JOptionPane.showMessageDialog(null,"Registrasi Sukses","information",JOptionPane.INFORMATION_MESSAGE);
                    kosong();
                    
                }catch(Exception exception){
                    JOptionPane.showMessageDialog(null,"Format Penulisan Salah","Pendaftaran Gagal",JOptionPane.INFORMATION_MESSAGE);
                }
                }
            });
    masuk.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae){
                
                    try{
                        Khoiri07192_AllObjCtrl.admin.AdminEntity();
                        Khoiri07192_AllObjCtrl.admin.login(textkodelogin.getText(), textpasswordlogin.getText());
                        String nama = Khoiri07192_AllObjCtrl.admin.AdminEntity().getNama();
                        JOptionPane.showMessageDialog(null,"selamat datang "+nama,"information",JOptionPane.INFORMATION_MESSAGE);
                        Khoiri07192_GUIPeminjam peminjam = new Khoiri07192_GUIPeminjam();
                        logReg.dispose();
                    }catch(Exception exception){
                        JOptionPane.showMessageDialog(null,"Kode atau password salah","information",JOptionPane.INFORMATION_MESSAGE);
                        kosong();
                        
                    }
            }
        });
    
     keluar.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae){
                
                        logReg.dispose();     
            }
        });
    }
    void kosong(){
        textkodeDaftar.setText(null);
        textnamaDaftar.setText(null);
        textnotelpDaftar.setText(null);
        textumurDaftar.setText(null);
        textpasswordDaftar.setText(null);
        
    }
}
