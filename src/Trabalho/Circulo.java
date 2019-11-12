
package Trabalho;


public abstract class Circulo extends FiguraGeometrica{
    
    private double Raio;
    
    
    @Override
    
    public double CalcularPerimetro(){
        super.setPerimetro((2*3.14)* Raio);
        return super.getArea();
        
    }
    @Override

    public double CalcularArea(){
        super.setArea((Raio*Raio)*3.14);
    }
    
    public double getRaio(){
        return Raio;
    }
    
    public void setRaio(){
        this.Raio = Raio;
        
        
    }
        
    }

