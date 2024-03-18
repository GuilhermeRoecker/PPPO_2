package file;

import java.io.File;

import javax.swing.JOptionPane;

public class ExemploFile {

    public static void main(String[] args) {
            String menu = "1 - Listar\n"
                        + "2 - Apagará todos\n\n"
                        + "3 - Sair";
    
            int op = 0;
            do {
                op = Integer.parseInt(JOptionPane.showInputDialog(menu));
    
                if(op==1) {
                    String dir = JOptionPane.showInputDialog("Path");
                    File d = new File(dir);
                    if(d.isDirectory()) {
                        File[] arqs = d.listFiles();
                        for (File f: arqs) {
                            System.out.println(f.getName()+" - "+f.length()/1024+"kb");
                        }
                    } else System.out.println("Caminho Inválido.");
                }
    
                if(op==2){  
                    String dir = JOptionPane.showInputDialog("Path");
                    File d = new File(dir);
                    File[] arqs = d.listFiles();
                    for(File f : arqs ){
                        f.delete();
                    }
                }
            }
            while(op!=3);
    }
}

