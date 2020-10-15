package condicionescompetencias;
import javax.swing.JTextArea;

public class Hilo extends Thread{
    private JTextArea area;
    private RCompartido rc;
    private Cerradura cer;
    private boolean bandera;
    
    Hilo(JTextArea area, RCompartido rc, Cerradura cer){
        this.area = area; 
        this.rc = rc;
        this.cer = cer;
        bandera = false;
    }
    public void matar(){
        bandera = true;
    }
    
    public void run(){
        
        while(true){
            if(cer.getCerradura() == false){
                cer.setCerradura(true);
                try{
                    rc.setDatoCompartido(this.getName());
                    area.append(rc.getDatoCompartido()+ "\n");
                    sleep(1000);
                    if(bandera == true){
                        this.stop();
                    }
                
                    cer.setCerradura(false);
                    sleep(500);
                }catch(Exception e){e.printStackTrace();}
            }else{
                try{
                    area.append("Esperando\n");
                    sleep(2000);
                }catch(InterruptedException e){e.printStackTrace();}
            }
        }
    }
    
}
