package pboif2.pkg10119065.latihan34.kalkulator;

/**
 *
 * @author Fachriansyah PC
 */
public class Calculate {
    
    double var1,var2;
    public Calculate(Double angka1, Double angka2)
    {
        var1 = angka1;
        var2 = angka2;
        System.out.println("\nHasil Pertambahan : "+ tambahBilangan());
        System.out.println("Hasil Pengurangan : "+ kurangBilangan());
        System.out.println("Hasil Perkalian : "+ kaliBilangan());
        System.out.println("Hasil Pembagian : "+ bagiBilangan());
        System.out.println("Hasil Sisa : "+ sisaBilangan());
    }
    
    public Double tambahBilangan()
    {
        return var1 + var2;
    }
    public Double kurangBilangan()
    {
        return var1 - var2;
    }
    public Double kaliBilangan()
    {
        return var1 * var2;
    }
    public Double bagiBilangan()
    {
        return var1 / var2;
    }
    public Double sisaBilangan()
    {
        return var1 % var2;
    }
}
