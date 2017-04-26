public class SoftwareEngineer extends Pegawaii{
    double total;
    private final double tunjangan = 5500000.0;
    private final double bonusSE = 300000.0;
    
    public SoftwareEngineer(int masaKerja ){
        super(masaKerja);
        super.getBonus();
        super.getTotal();
    }
    public double getTotal(){
        if(masaKerja < 5){
            return gajiPegawai+tunjangan+bonusSE;
        }
        else{
            return gajiPegawai+getBonus()+tunjangan+bonusSE;
        }
    }    
}   

