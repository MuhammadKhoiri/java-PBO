package View;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTable;

public class Khoiri07192_GUILihatBarang {
    
    JFrame Penjual = new JFrame();
    JLabel labellihat, kode;
    JTextField nomortext;
    JTable tabelbarang = new JTable();
    JScrollPane scrolbarang = new JScrollPane(tabelbarang);
    JButton back;
    
    public Khoiri07192_GUILihatBarang(){
        Penjual.setSize(650, 500);
        Penjual.setLayout(null);
        Penjual.getContentPane().setBackground(Color.CYAN);
        Penjual.setLocationRelativeTo(null);
        Penjual.setVisible(true);
        Penjual.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        labellihat = new JLabel("LIHAT BARANG");
        labellihat.setBounds(250, 50, 200, 30);
        labellihat.setFont(new Font("Consolas", Font.BOLD, 40));
        Penjual.add(labellihat);

        scrolbarang.setBounds(30, 100, 570, 200);
        tabelbarang.setModel(Khoiri07192_AllObjCtrl.transaksiAlat.tableBarang());
        Penjual.add(scrolbarang);
        
        kode = new JLabel("Kode");
        kode.setBounds(50, 320, 100, 30);
        Penjual.add(kode);

        nomortext = new JTextField();
        nomortext.setBounds(50, 350, 100, 30);
        Penjual.add(nomortext);
        
        back = new JButton("back");
        back.setBounds(500, 400, 100, 30);
        back.setBackground(Color.RED);
        Penjual.add(back);
        
        Penjual.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Penjual.setVisible(true);
        Penjual.setLocationRelativeTo(null);
        
        tabelbarang.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int i = tabelbarang.getSelectedRow();
                nomortext.setText(Khoiri07192_AllObjCtrl.peminjam.tablePeminjam().getValueAt(i, 0).toString());
            }
        });
        
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Penjual.dispose();
                Khoiri07192_GUIPeminjam peminjam = new Khoiri07192_GUIPeminjam();
            }
        });
    }
}
