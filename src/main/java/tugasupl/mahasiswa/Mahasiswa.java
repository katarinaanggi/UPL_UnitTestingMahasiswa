package tugasupl.mahasiswa;

public class Mahasiswa {
	
	private String NIM;
	private String Nama;
	private String Prodi;
	private String Angkatan;
	
	// Konstruktor
	public Mahasiswa() {
		
	}
	
	public Mahasiswa(String NIM, String Nama, String Prodi, String Angkatan) {
		this.setNIM(NIM);
		this.setNama(Nama);
		this.setProdi(Prodi);
		this.setAngkatan(Angkatan);
	}
	
	// Setter dan Getter

	public String getNIM() {
		return NIM;
	}

	public void setNIM(String nIM) {
		NIM = nIM;
	}

	public String getNama() {
		return Nama;
	}

	public void setNama(String nama) {
		Nama = nama;
	}

	public String getProdi() {
		return Prodi;
	}

	public void setProdi(String prodi) {
		Prodi = prodi;
	}

	public String getAngkatan() {
		return Angkatan;
	}

	public void setAngkatan(String angkatan) {
		Angkatan = angkatan;
	}
}
