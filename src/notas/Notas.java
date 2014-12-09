package notas;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Notas {

    public static void main(String[] args) {
        
        
        double vt;
        double A = 20000000;
        String notas = "";
        for (int i = 0; i < 23999; i++) {
            vt =A* Math.sin(2.0 * Math.PI * (466.0*i/48000.0));
            if(i == 23998){
                notas += "" +(int)vt;
            }else{
                notas +=  (int)vt + ", ";
            }
            
            
        }
        System.out.println(notas);
        
        
        
        try{
            File file = new File("C:\\Users\\alumno\\Desktop\\la#");
            if(file.createNewFile()){
                System.out.println("Se ha creado!");
            }else{
                System.out.println("Ya existe, manco");
            }
            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(notas);
            bw.close();
            
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    
}
