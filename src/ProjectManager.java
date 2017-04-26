public class ProjectManager extends Pegawaii{
    double total;
    private final double tunjangan=6000000.0;
    private final double bonuspm = 450000.0;
    private final double apresiasi = 700000.0;
    
    public ProjectManager(int masaKerja){
        super(masaKerja);
        super.getBonus();
        super.getTotal();
    }
    public double getTotal(){
        if(masaKerja <= 5){
            return gajiPegawai+tunjangan+bonuspm;
        }
        else if(masaKerja > 5 && masaKerja < 10){
            return gajiPegawai+getBonus()+tunjangan+bonuspm;
        }
        else{
            return gajiPegawai+getBonus()+tunjangan+bonuspm+apresiasi;
        }
    }    
}