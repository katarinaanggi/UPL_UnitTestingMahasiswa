package tugasupl.mahasiswa;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import tugasupl.checkmahasiswa.checkMahasiswa;
import tugasupl.isinformatika.isInformatika;

class MahasiswaTest {

	private Mahasiswa mhs, mhs2, mhs3, mhs4;
	
	@Test
	@DisplayName("Mahasiswa informatika.")
	void MahasiswaInformatikaTest() {
		mhs = new Mahasiswa("24060119120036", "Katarina Hantikun", "Informatika", "2019");
		checkMahasiswa cek = mock(checkMahasiswa.class);
		isInformatika II = new isInformatika();
		when(cek.isMhs()).thenReturn(true);
		
		assertEquals("Mahasiswa Informatika", II.isIF(mhs.getNIM(), cek));
	}
	
	@Test
	@DisplayName("Bukan mahasiswa informatika.")
	void BukanMahasiswaInformatikaTest() {
		mhs2 = new Mahasiswa("24070120301242", "Chiro", "Manajemen", "2020");
		checkMahasiswa cek = mock(checkMahasiswa.class);
		isInformatika II = new isInformatika();
		when(cek.isMhs()).thenReturn(false);
		
		assertEquals("Bukan Mahasiswa Informatika", II.isIF(mhs2.getNIM(), cek));
	}
	
	@Test
	@DisplayName("Informatika, tapi bukan mahasiswa.")
	void BukanMahasiswaNimBanyakTest() {
		mhs3 = new Mahasiswa("24068748070817", "Bobi", "Pertanian", "2019");
		checkMahasiswa cek = mock(checkMahasiswa.class);
		isInformatika II = new isInformatika();
		when(cek.isMhs()).thenReturn(false);
		
		assertEquals("Bukan Mahasiswa Informatika", II.isIF(mhs3.getNIM(), cek));
	}
	
	@Test
	@DisplayName("Mahasiswa, tapi bukan informatika.")
	void BukanMahasiswaNimDikitTest() {
		mhs4 = new Mahasiswa("24048748070817", "Kevin", "Teknik Mesin", "2020");
		checkMahasiswa cek = mock(checkMahasiswa.class);
		isInformatika II = new isInformatika();
		when(cek.isMhs()).thenReturn(true);
		
		assertEquals("Bukan Mahasiswa Informatika", II.isIF(mhs4.getNIM(), cek));
	}	

}
