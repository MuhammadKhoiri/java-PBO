package View;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class Khoiri07192_GUIPeminjam {

    JFrame peminjam = new JFrame();
    JTable tabelpembeli = new JTable();
    JScrollPane scrolpeminjam = new JScrollPane(tabelpembeli);
    JButton tambah, tambahb, hapus, back, lihatbarang, update;
    JLabel admin, labelnomor, labelnama, labelalamat;
    JTextField nomortext, namatext;

    public Khoiri07192_GUIPeminjam() {
        peminjam.setSize(650, 500);
        peminjam.setLayout(null);
        peminjam.getContentPane().setBackground(Color.CYAN);
        peminjam.setLocationRelativeTo(null);
        peminjam.setVisible(true);
        peminjam.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        admin = new JLabel("ADMIN");
        admin.setBounds(250, 50, 200, 30);
        admin.setFont(new Font("Consolas", Font.BOLD, 40));
        peminjam.add(admin);

        scrolpeminjam.setBounds(30, 100, 570, 200);
        tabelpembeli.setModel(Khoiri07192_AllObjCtrl.peminjam.tablePeminjam());
        peminjam.add(scrolpeminjam);

        labelnomor = new JLabel("Kode");
        labelnomor.setBounds(50, 320, 100, 30);
        peminjam.add(labelnomor);

        nomortext = new JTextField();
        nomortext.setBounds(50, 350, 100, 30);
        peminjam.add(nomortext);

        tambahb = new JButton("Tambah B");
        tambahb.setBounds(200, 400, 100, 30);
        tambahb.setBackground(Color.GREEN);
        peminjam.add(tambahb);
        
        lihatbarang = new JButton("Lihat B");
        lihatbarang.setBounds(200, 350, 100, 30);
        lihatbarang.setBackground(Color.GREEN);
        peminjam.add(lihatbarang);

        hapus = new JButton("hapus");
        hapus.setBounds(350, 400, 100, 30);
        hapus.setBackground(Color.GREEN);
        peminjam.add(hapus);
        
        update = new JButton("Update");
        update.setBounds(350, 350, 100, 30);
        update.setBackground(Color.GREEN);
        peminjam.add(update);
        
        back = new JButton("back");
        back.setBounds(500, 400, 100, 30);
        back.setBackground(Color.RED);
        peminjam.add(back);

        tambah = new JButton("Tambah");
        tambah.setBounds(50, 400, 100, 30);
        tambah.setBackground(Color.GREEN);
        peminjam.add(tambah);
        
        peminjam.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        peminjam.setVisible(true);
        peminjam.setLocationRelativeTo(null);

        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                peminjam.dispose();
                Khoiri07192_GUIDaftarLogin men = new Khoiri07192_GUIDaftarLogin();
            }
        });
        
        update.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                peminjam.dispose();
                Khoiri07192_GUIUpdate men = new Khoiri07192_GUIUpdate();
            }
        });
        tambah.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                peminjam.dispose();
                Khoiri07192_GUIInput khoiri07192_GUIInput = new Khoiri07192_GUIInput();
            }
        });
        hapus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                peminjam.dispose();
                String nomor = nomortext.getText();
                int index = Khoiri07192_AllObjCtrl.peminjam.cekpembeli(nomor);
                Khoiri07192_AllObjCtrl.peminjam.remove(index);
                Khoiri07192_GUIPeminjam peminjam = new Khoiri07192_GUIPeminjam();
            }
        });
        tambahb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                peminjam.dispose();
                String nomor = nomortext.getText();
                int index = Khoiri07192_AllObjCtrl.peminjam.cekpembeli(nomor);
                Khoiri07192_GUIInputBarang inputbarang = new Khoiri07192_GUIInputBarang();
            }
        });
        
        lihatbarang.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                peminjam.dispose();
                int index = 0;
                Khoiri07192_GUILihatBarang lihatbarang = new Khoiri07192_GUILihatBarang();
            }
        });
        tabelpembeli.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int i = tabelpembeli.getSelectedRow();
                nomortext.setText(Khoiri07192_AllObjCtrl.peminjam.tablePeminjam().getValueAt(i, 0).toString());
            }
        });

    }
}
