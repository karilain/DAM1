/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entornos;

public class Bombones {
//atributos de mis bombones  

    protected String tipoChoco;
    private static String[] tiposChocos = {"blanco", "negro", "con leche"};
    protected String marca;
    protected static String[] marcas = {"Lindt", "Nestle", "Ferrero Rocher", "Hans Sloane", "Milka"};
    protected String forma;
    protected static String[] formas = {"redonda", "ovalada", "cuadrada", "corazon", "rectangular"};
    protected String rellenoSabor;
    protected static String[] rellenosSabores = {"trufa", "almendras", "avellanas", "caramelo", "cafe", "licor", "fresa", "menta", "naranja", "chocolate Blanco", "chocolate negro", "chocolate con leche"};
    protected String rellenoTextura;
    protected static String[] rellenosTexturas = {"cremosa", "untuosa", "crujiente", "gelatinosa", "pastosa", "aireada"};
    protected String cobertura;
    protected static String[] coberturas = {"chocolate negro", "chocolate Blanco", "chocolate con leche"};
    protected String azucar;
    protected static String[] azucares = {"sin azucar", "con azucar", "0% azucar"};
    protected static int numBombones;

//constructores de mis bombones
    public Bombones() {
        tipoChoco = getAleatorioTipoChoco();
        marca = getAleatorioMarca();
        forma = getAleatorioForma();
        rellenoSabor = getAleatorioRellenoSabor();
        rellenoTextura = getAleatorioRellenoTextura();
        cobertura = getAleatorioCobertura();
        azucar = getAleatorioAzucar();
        numBombones = getAleatorioNumBombon();
    }

//metodos GET es el que muestra
    private static String getAleatorioTipoChoco() {
        int aleatorio = (int) (Math.random() * 3);
        String tipoChoco = tiposChocos[aleatorio];
        return tipoChoco;
    }
    private static String getAleatorioMarca() {
        int aleatorio = (int) (Math.random() * 5);
        String marca = marcas[aleatorio];
        return marca;
    }
    private static String getAleatorioForma() {
        int aleatorio = (int) (Math.random() * 5);
        String forma = formas[aleatorio];
        return forma;
    }
    private static String getAleatorioRellenoSabor() {
        int aleatorio = (int) (Math.random() * 12);
        String rellenoSabor = rellenosSabores[aleatorio];
        return rellenoSabor;
    }
    private static String getAleatorioRellenoTextura() {
        int aleatorio = (int) (Math.random() * 6);
        String rellenoTextura = rellenosTexturas[aleatorio];
        return rellenoTextura;
    }
    private static String getAleatorioCobertura() {
        int aleatorio = (int) (Math.random() * 3);
        String cobertura = coberturas[aleatorio];
        return cobertura;
    }
    private static String getAleatorioAzucar() {
        int aleatorio = (int) (Math.random() * 3);
        String azucar = azucares[aleatorio];
        return azucar;
    }
    private static int getAleatorioNumBombon() {
        int aleatorio = (int) (Math.random() * 31);
        return numBombones;
    }

//solo muestra informacion en caso de que queramos consulta la info
    public String getTipoChoco() {
        return tipoChoco;
    }
    public String getMarca() { 
        return marca;
    }
    public String getForma() { 
        return forma;
    }
    public String getRellenoSabor() {
        return rellenoSabor;
    }
    public String getRellenoTextura() {
        return rellenoTextura;
    }
    public String getCobertura() {
        return cobertura;
    }
    public String getAzucar() {
        return azucar;
    }
    public int getNumBombones() {
        return numBombones;
    }
    
    
    
    public void getMostrarInfo() {
        
        if (marca == "Ferrero Rocher") {
            System.out.println("Su bombón elegido:");
            System.out.println("Adornado con trozos de avellana");
            System.out.println("Cobertura de " + coberturas[2]);
            System.out.println("Relleno de cocholate con avellana");
            System.out.println("Su relleno tiene una textura " + rellenosTexturas[1]);
            System.out.println("Tiene forma de " + formas[1]);
            System.out.println("Su marca es " + marcas[2]);
        }else{
            System.out.println("Su bombón elegido:");
            System.out.println("Adornado con chocolate " + tipoChoco);
            System.out.println("Cobertura de " + cobertura);
            System.out.println("Relleno de " + rellenoSabor);
            System.out.println("Su relleno tiene una textura " + rellenoTextura);
            System.out.println("Tiene forma de " + forma);
            System.out.println("Su marca es " + marca);
        if (rellenoSabor == "caramelo") {
            System.out.println("Es " + azucares[1]);
        }
        }

    }
//metodos SET es el que cambia los datos

    
    
    
    
    
    
}
