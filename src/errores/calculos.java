package errores;

public class calculos {
    private double real,aproximado;
    double absoluto,relativo,porcentual;
    
    public calculos(double real, double aproximado){
        this.real=real;
        this.aproximado=aproximado;
    }

    public double errorAbsoluto(){
        absoluto=Math.abs(real-aproximado);
        return absoluto;
    }
    
    public double errorRelativo(){
        relativo=Math.abs((real-aproximado)/real);
        return relativo;
    }
    
    public double errorPorcentual(){
        porcentual=Math.abs((real-aproximado)/real)*100;
        return porcentual;
    }
}
