
/**
 * Programa para averiguar el perimetro y area de un Triangulo.
 * 
 * @author (Leonardo Sotelo) 
 * @version (Agosto 13 de 2017)
 */
public class TrianguloSotelo
{
    double ladoA;
    double ladoB;
    double ladoC;
    double perimetro;
    double area;

        public TrianguloSotelo (double primer, double segundo, double tercer)
    {
        ladoA=primer;
        ladoB=segundo;
        ladoC=tercer;
        perimetro();
        area();
    }

       public double area()
    {
        double PrimeraOper = (ladoA + ladoB + ladoC)*(1)/(2);
        double SegundaOper =Math.sqrt(PrimeraOper*(PrimeraOper-ladoA)*(PrimeraOper-ladoB)*(PrimeraOper-ladoC));
        area = SegundaOper;
        return area;
    }
        public double perimetro()
    {
        perimetro = ladoA + ladoB + ladoC;
        return perimetro;
    }
     
}