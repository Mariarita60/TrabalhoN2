package Trabalho;

public abstract class FiguraGeometrica {

    private double perimetro;
    private double Area;

    public abstract double CalcularPerimetro();

    public abstract double CalcularArea();

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public double getArea() {
        return Area;
    }

    public void setArea(double Area) {
        this.Area = Area;
    }

}
