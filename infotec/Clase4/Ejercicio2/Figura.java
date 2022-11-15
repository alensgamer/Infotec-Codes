package Ejercicio2;

public class Figura {
    private int coordenada_x, coordenada_y, ancho, alto;
    private double perímetro, area;
    public int getCoordenada_x(){
        return coordenada_x;
    }
    public int getCoordenada_y(){
        return coordenada_y;
    }
    public int getAncho(){
        return ancho;
    }
    public int getAlto(){
        return alto;
    }
    public double getPerimetro(){
        return perímetro;
    }
    public double getArea(){
        return area;
    }
    public Figura(){

    }
    public void calcula_area(){
        area = (ancho)*(alto);
    }
}
