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
    private long Sactual;
    private long Ianual;

    public Cuenta(long Nucuenta, long Nuidentificacion, long Sactual, long Ianual) {
        this.Nucuenta = Nucuenta;
        this.Nuidentificacion = Nuidentificacion;
        this.Sactual = Sactual;
        this.Ianual = Ianual;
    }

    public long getNucuenta() {
        return Nucuenta;
    }

    public long getNuidentificacion() {
        return Nuidentificacion;
    }

    public long getSactual() {
        return Sactual;
    }

    public long getIanual() {
        return Ianual;
    }

    public void setNucuenta(long Nucuenta) {
        this.Nucuenta = Nucuenta;
    }

    public void setNuidentificacion(long Nuidentificacion) {
        this.Nuidentificacion = Nuidentificacion;
    }

    public void setSactual(long Sactual) {
        this.Sactual = Sactual;
    }

    public void setIanual(long Ianual) {
        this.Ianual = Ianual;
    }
    
    public long ActualizarSaldo() {
        long res;
        res = this.Sactual + (this.Ianual / 365);
        this.Sactual=res;
        return this.Sactual;
    }
    public long Ingresar() {
        long auxiliar;
        long ns;
        boolean au=true;
        int res1, sw;

        do {
            sw = 1;

            try {
                auxiliar = Long.parseLong(JOptionPane.showInputDialog(null, "Digite el total a ingresar"));
                
                    ns = auxiliar + this.Sactual;
                    this.Sactual = ns;

            } catch (NumberFormatException e) {
                res1 = JOptionPane.showConfirmDialog(null, "¿Desea salir?", "Salir", JOptionPane.YES_NO_OPTION);
                if (res1 == 0) {
                    au=false;
                    sw = 1;
                } else {
                    sw = 0;
                }
            }
            } while (sw == 0);
        
        return this.Sactual;

}
public long Retirar(){
        long auxiliar;
        long ns;
        int res;
        if (this.Sactual == 0) {
            JOptionPane.showMessageDialog(null, "Usted no tiene saldo");
        }
        auxiliar = Long.parseLong(JOptionPane.showInputDialog( "Digite el total que desea retirar"));
        while (auxiliar > this.Sactual) {
            auxiliar = Long.parseLong(JOptionPane.showInputDialog( "Debe tener una cantidad validad para retirar, ingrese su saldo nuevamente"));
        }
        res = JOptionPane.showConfirmDialog(null, "¿Seguro que desea retirar esta cantidad?: " + auxiliar   , "Pregunta", JOptionPane.YES_NO_OPTION);
        if (res == 0) {
            ns = this.Sactual- auxiliar;
            this.Sactual= (ns);
            

        }
        return this.Sactual;
    }

}