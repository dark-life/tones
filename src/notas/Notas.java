package notas;

public class Notas {

    public static void main(String[] args) {
        
        
        double vt;
        double A = 20000000;
        String notas;
        for (int i = 0; i < 23999; i++) {
            vt =A* Math.sin(2.0 * Math.PI * (262.0*i/48000.0));
            
            System.out.println((int)vt);
        }
    }
    
}
