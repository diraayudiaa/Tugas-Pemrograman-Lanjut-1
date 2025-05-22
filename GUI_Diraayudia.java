import java.awt.*;
import javax.swing.*;

public class GUI_Diraayudia extends JFrame {

    //input untuk form
    JTextField tfNama = new JTextField();
    JTextField tfTglLahir = new JTextField();
    JTextField tfNoPendaftaran = new JTextField();
    JTextField tfNoTelp = new JTextField();
    JTextArea taAlamat = new JTextArea();
    JTextField tfEmail = new JTextField();
    JButton btnSubmit = new JButton("Submit");

    //constructor
    public GUI_Diraayudia() {
        setTitle("Form Daftar Ulang Mahasiswa Baru"); 
        setSize(400, 400); // Ukuran 
        setLocationRelativeTo(null); // ini supaya posisinya ada di tengah layar
        setDefaultCloseOperation(EXIT_ON_CLOSE); // tutup aplikasi saat user klik 'X'
        setLayout(null);

        //label dan field
        addLabel("Nama Lengkap", 20);
        addField(tfNama, 20);
        addLabel("Tanggal Lahir", 60);
        addField(tfTglLahir, 60);
        addLabel("Nomor Pendaftaran", 100);
        addField(tfNoPendaftaran, 100);
        addLabel("No. Telp", 140);
        addField(tfNoTelp, 140);
        addLabel("Alamat", 180);
        taAlamat.setBounds(160, 180, 180, 40); // ukuran untuk textarea
        add(taAlamat);
        addLabel("E-mail", 230);
        addField(tfEmail, 230);

        // tombol submit
        btnSubmit.setBounds(140, 280, 100, 30);
        add(btnSubmit);

        // event listener untuk tombol submit
        btnSubmit.addActionListener(e -> handleSubmit());

        setVisible(true); 
    }

    // method untuk menambahkan label ke form
    private void addLabel(String text, int y) {
        JLabel label = new JLabel(text);
        label.setBounds(30, y, 120, 25); // Atur posisi label
        add(label);
    }

    // method untuk menambahkan field teks ke form
    private void addField(JTextField field, int y) {
        field.setBounds(160, y, 180, 25); // Atur posisi field
        add(field);
    }

    // method yang handle logic saat tombol submit diklik
    private void handleSubmit() {

        if (tfNama.getText().isEmpty() || tfTglLahir.getText().isEmpty() ||
            tfNoPendaftaran.getText().isEmpty() || tfNoTelp.getText().isEmpty() ||
            taAlamat.getText().isEmpty() || tfEmail.getText().isEmpty()) {

            // peringatan jika ada field kosong
            JOptionPane.showMessageDialog(this, "Semua kolom harus diisi!", "Peringatan", JOptionPane.WARNING_MESSAGE);
        } else {
            // konfirmasi user
            int confirm = JOptionPane.showConfirmDialog(this, "Apakah anda yakin data yang Anda isi sudah benar?", "Konfirmasi", JOptionPane.OK_CANCEL_OPTION);
            if (confirm == JOptionPane.OK_OPTION) {
                // Jika user klik OK, akan menampilkan hasil
                showResultWindow();
            }
        }
    }

    // method untuk menampilkan jendela baru berisi data yang telah diinput
    private void showResultWindow() {
        JFrame resultFrame = new JFrame("Data Mahasiswa");
        resultFrame.setSize(400, 300);
        resultFrame.setLocationRelativeTo(null);
        resultFrame.setDefaultCloseOperation(DISPOSE_ON_CLOSE); // hanya tutup jendela ini
        resultFrame.setLayout(new BorderLayout());

        // TextArea untuk menampilkan output hasil input
        JTextArea output = new JTextArea();
        output.setEditable(false); // tidak bisa diedit oleh user
        output.setText("Nama\t\t: " + tfNama.getText() +
                      "\nTanggal Lahir\t: " + tfTglLahir.getText() +
                      "\nNo. Pendaftaran\t: " + tfNoPendaftaran.getText() +
                      "\nNo. Telp\t\t: " + tfNoTelp.getText() +
                      "\nAlamat\t\t: " + taAlamat.getText() +
                      "\nEmail\t\t: " + tfEmail.getText());

        //result 
        resultFrame.add(new JScrollPane(output), BorderLayout.CENTER);
        resultFrame.setVisible(true);
    }

    // method main untuk menjalankan program
    public static void main(String[] args) {
        SwingUtilities.invokeLater(GUI_Diraayudia::new); 
    }
}
