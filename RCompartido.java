/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicionescompetencias;

public class RCompartido {
    private String datoCompartido;
    Cerradura cer;
    RCompartido(){
        datoCompartido="";
        cer = new Cerradura();
    }
    public String getDatoCompartido() {
        return datoCompartido;
    }
    public void setDatoCompartido(String datoCompartido) {
        this.datoCompartido = datoCompartido;
    }

}
