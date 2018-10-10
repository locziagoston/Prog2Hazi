package Autó;

import java.util.Date;

public class Autó {
    private String rendszám;
    private int MotorTeljesítmény;
    private Date gyártásDátuma;

    public Autó(String rendszám, int MotorTeljesítmény) {
        this.rendszám = rendszám;
        this.MotorTeljesítmény = MotorTeljesítmény;
        this.gyártásDátuma = new Date();
    }

    
    public String getRendszám() {
        return rendszám;
    }

    public int getMotorTeljesítmény() {
        return MotorTeljesítmény;
    }

    public Date getGyártásDátuma() {
        return gyártásDátuma;
    }

    public void setRendszám(String rendszám) {
        this.rendszám = rendszám;
    }


    @Override
    public String toString() {
        return "Aut\u00f3{" + "rendsz\u00e1m=" + rendszám + ", MotorTeljes\u00edtm\u00e9ny=" + MotorTeljesítmény + ", gy\u00e1rt\u00e1sD\u00e1tuma=" + gyártásDátuma + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj==null || !(obj instanceof Autó))
        {
            return false;
        }
        Autó a = (Autó) obj;
        return this.rendszám.equals(a.getRendszám()) && this.MotorTeljesítmény==(a.getMotorTeljesítmény());
      
    }
    
    
    
}
