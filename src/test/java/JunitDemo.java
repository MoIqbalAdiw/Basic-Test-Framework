import org.junit.jupiter.api.*;
public class JunitDemo {
    Calculator calc = new Calculator();
    @BeforeAll
    public static void beforeTest() {
        System.out.println("Test Fungsi Matematika");
    }
    @Test
    @DisplayName("Assert Nilai Penjumlahan Benar")
    public void assertPenjumlahTest(){ Assertions.assertEquals(4, calc.penjumlahan(2,2));}
    @Test
    @DisplayName("Assert Nilai Pengurangan Benar")
    public void assertPengurangTest() { Assertions.assertEquals(4,calc.pengurangan(8,4));}
    @Test
    @DisplayName("Assert Nilai Perkalian Benar")
    public void assertPengaliTest() { Assertions.assertEquals(8,calc.perkalian(2,4));}
    @Test
    @DisplayName("Assert Nilai Pembagian Benar")
    public void assertPembagiTest() { Assertions.assertEquals(4,calc.pembagian(8,2));}
    @Test
    @DisplayName("Assert Nilai Pembagian Bukan 9")
    public void assertHasilBukan9() { Assertions.assertNotEquals(9,calc.pembagian(4,2));}
    @Test
    @DisplayName("Assert Bukan Null")
    public void assertBukanNull() { Assertions.assertNotNull(calc.pembagian(1,1));}
    @Test
    @DisplayName("Assert Tes Bilangan Kedua Lebih Besar")
    public void assertTrue() { Assertions.assertTrue(calc.modalTest(2,4));}
    @Test
    @DisplayName("Assert Tes Bilangan Kedua Tidak Kecil")
    public void assertFalse() { Assertions.assertFalse(calc.modalTest(5,4));}

}
