/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase;
import Excepciones.*;
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
    

    public Cuenta(long Nucuenta, long Nuidentificacion, double Sactual) throws NopuedeSerCero, NoNegativo {
        if(Nuidentificacion == 0){
            throw new NopuedeSerCero("el numero de identificacion no puede ser cero");
        }
        if(Nuidentificacion < 0){
            throw new NopuedeSerCero("el numero de identificacion no puede ser negativo");
        }
         
        if(Nucuenta < 0){
            throw new NoNegativo("El número de cuenta no debe ser negativo");
        }
        
        if(Nucuenta == 0){
              throw new NoNegativo("El número de cuenta no debe ser cero");
            }
            if(Sactual < 0){
            throw new NoNegativo("el saldo no puede ser negativo");
        }
   
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

    public void setNucuenta(long Nucuenta) throws NoNegativo {
        if(Nucuenta < 0){
            throw new NoNegativo("El número de cuenta no debe ser negativo");
        }
        
        if(Nucuenta == 0){
              throw new NoNegativo("El número de cuenta no debe ser cero");
        }
        this.Nucuenta = Nucuenta;
    }

    public void setNuidentificacion(long Nuidentificacion) throws NopuedeSerCero {
        if(Nuidentificacion == 0){
            throw new NopuedeSerCero("el numero de identificacion no puede ser cero");
        }
        if(Nuidentificacion < 0){
            throw new NopuedeSerCero("el numero de identificacion no puede ser negativo");
        }
        
        this.Nuidentificacion = Nuidentificacion;
    }

    public void setSactual(double Sactual) throws NoNegativo {
       if(Sactual < 0){
            throw new NoNegativo("el saldo no puede ser negativo");
        }
        this.Sactual = Sactual;
    }
    
    

    

    
    
    public void ActualizarSaldo(double ianual) throws NoNegativo {
        double aux,res;
        aux= this.getSactual()*(ianual/365);
        res = this.getSactual() + aux;
        this.setSactual(res);
    }
    public void Ingresar(double ingreso) throws NoNegativo {
        double auxiliar;
        auxiliar=this.getSactual()+ingreso;
        this.setSactual(auxiliar);
        
}
public void Retirar(double egreso) throws NoNegativo{
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

