/*
 * NAMA  : Fiona Avila Putri
 * NIM   : 10119013
 * KELAS : IF1 2019/2020 (PBO1)
 */



package if1.pkg10119013.latihan6.kambingstatic;

/**
 *
 * @author Fiona Avila
 */

public class KambingStatic{
    
    //NAMA_KAMBING sebagai konstanta
    public static final String NAMA_KAMBING = "MIDUN";
    
    public static void main(String[] args){
        Mamalia.jumlahKambing = 485000;
        System.out.println(NAMA_KAMBING + " memiliki kambing sebanyak " + 
                            Mamalia.jumlahKambing);
    }
}
