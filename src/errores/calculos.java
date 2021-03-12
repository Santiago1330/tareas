package errores;
/*
           METODOS NÚMERICOS
    WILIAM SANTIAGO SIERRA GUEMEZ
              4B
    CALCULO DE ERRORES (ABSOLUTO, RELATIVO Y PORCENTUAL)
    INGENIERIA EN SISTEMAS COMPUTACIONALES
    */
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
        relativo=errorAbsoluto()/real;
        return relativo;
    }
    
    public double errorPorcentual(){
        porcentual=errorRelativo()*100;
        return porcentual;
    }
}
