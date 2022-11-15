

public class Clase1 {
    //atributos
    private int num_teclado;
    private float puresa_teclado;
    private boolean is_available;
    private String nombre;
    private double idn;
    
    //metodo constructor
    public Clase1(int _num_teclado, float _puresa_teclado, boolean _is_variable, String _nombre, double _idn){
        num_teclado = _num_teclado;
        puresa_teclado = _puresa_teclado;
        is_available = _is_variable;
        nombre = _nombre;
        idn = _idn;
    }
    
    public void mostrar(){
        System.out.println("Datos: \n"+ num_teclado +"\n"+ puresa_teclado+"\n" + is_available+"\n" + nombre+"\n" + idn+"\n");
    }
}