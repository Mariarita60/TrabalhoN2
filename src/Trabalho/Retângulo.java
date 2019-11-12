/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trabalho;


public abstract class Retângulo extends FiguraGeometrica{
    
    private double Altura;
    private double Base;
    
    @Override
    public double CalcularArea(){
        super.setPerimetro(Base + Altura + Base + Altura);
        return super.getPerimetro();
    }
    
    
    @Override
  public double CalcularPerimetro(){
      super.setArea(Base + Altura);
      return super.getArea();
    
}
   
}
