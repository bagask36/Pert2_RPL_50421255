package pert2_rpl_50421255;

public class Mahasiswa extends Student {
    
    public Mahasiswa() {
        super();
    }
    
    @Override
    public String toString() {
        return "Nama = " + getName() + "\n" +
               " NPM = " + getNpm() + "\n" +
               "Kelas = " + getClassNumber() + "\n" +
               "Tahun Lahir = " + getBirthYear() + "\n" +
               "Umur = " + calculateAge() + "\n" +
               "Alamat = " + getAlamat();
    }
}
