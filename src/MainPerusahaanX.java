
import java.util.Scanner;
public class MainPerusahaanX {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("MENU : \n1. Karyawan\n2. Software Engineer\n3. Project Manager\nMasukkan pilihan : ");
        int pilih = in.nextInt();
        System.out.print("Masukkan Masa Kerja : ");
        int masaKerja = in.nextInt();
        if(pilih==1){
            Pegawaii a = new Pegawaii(masaKerja);
            System.out.println("Gaji pegawai : Rp. "+a.getTotal());
        }
        else if(pilih==2){
            SoftwareEngineer b = new SoftwareEngineer(masaKerja);
            System.out.println("Gaji Software Engineer : Rp. "+b.getTotal());
        }
        else if(pilih==3){
            ProjectManager c = new ProjectManager(masaKerja);
            System.out.println("Gaji Project Manager : Rp. "+c.getTotal());
        }
        }   
           
    }  

