public class Pegawaii{
    protected double gajiPegawai=2500000.0,bonus=250000.0;
    int masaKerja;
    
    public Pegawaii(int masaKerja) {
        this.masaKerja=masaKerja;
    }
    
    public double getBonus(){
        if (masaKerja < 5){
            return 0;
        }
        else{
            return bonus;
        }
    }
    public double getTotal(){
       return gajiPegawai+getBonus();
    }
}