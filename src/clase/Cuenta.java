/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase;

import javax.swing.JOptionPane;

/**
 *
 * @author william
 * 
 */
public class Cuenta {
    
     private long Nucuenta;
    private long Nuidentificacion;
    private double Sactual;
    

    public Cuenta(long Nucuenta, long Nuidentificacion, double Sactual) {
        this.Nucuenta = Nucuenta;
        this.Nuidentificacion = Nuidentificacion;
        this.Sactual = Sactual;
       
    }
    
    public Cuenta(long Nucuenta, long Nuidentificacion) {
        this.Nucuenta = Nucuenta;
        this.Nuidentificacion = Nuidentificacion;
        this.Sactual = 0;
       
    }


    public long getNucuenta() {
        return Nucuenta;
    }

    public long getNuidentificacion() {
        return Nuidentificacion;
    }

    public double getSactual() {
        return Sactual;
    }

    public void setNucuenta(long Nucuenta) {
        this.Nucuenta = Nucuenta;
    }

    public void setNuidentificacion(long Nuidentificacion) {
        this.Nuidentificacion = Nuidentificacion;
    }

    public void setSactual(double Sactual) {
        this.Sactual = Sactual;
    }
    
    

    

    
    
    public void ActualizarSaldo(double ianual) {
        double aux,res;
        aux= this.getSactual()*(ianual/365);
        res = this.getSactual() + aux;
        this.setSactual(res);
    }
    public void Ingresar(double ingreso) {
        double auxiliar;
        auxiliar=this.getSactual()+ingreso;
        this.setSactual(auxiliar);
        
}
public void Retirar(double egreso){
        double auxi;
        auxi= this.getSactual()- egreso;
        this.setSactual(auxi);
       
}public String mostrar(){
       String aux;
       aux = "No. de la cuenta: "+this.getNucuenta()+"\n"
           + "No. de Identificación: "+this.getNuidentificacion()+"\n"
           + "Saldo Actual: "+this.getSactual();
        return aux;
              
     
   }
public String renovar(){
      String auxi;
      auxi =""+this.getSactual();
      return auxi;
    }
  
}

