package tugasupl.isinformatika;

import tugasupl.checkmahasiswa.checkMahasiswa;

public class isInformatika {
	
	public isInformatika() {
		
	}
	
	// Check NIM
	public String isIF(String nimMhs, checkMahasiswa cm) {
		String prodi = nimMhs.substring(0, 4);
		if(prodi.equals("2406") && cm.isMhs()) {
			return "Mahasiswa Informatika";
		}
		return "Bukan Mahasiswa Informatika";
	}
	
}
