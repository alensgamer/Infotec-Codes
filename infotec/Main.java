public class Main {
    public static void main(String[] args) {
        Clase1 obj = new Clase1(500, 19, true, "Pc_generico", 0);
    
        obj.mostrar();
        
        Clase2 obj2 = new Clase2(obj.mostrar());

    }
    
}
