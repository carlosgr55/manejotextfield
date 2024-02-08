package Clases;

public class TrianguloRectangulo {
    private int base;
    private int altura;

    public TrianguloRectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public double area(){
        return base * altura / 2.0;
    }
    public double perimetro(){
        return base + altura + hipotenusa();
    }
    private double hipotenusa(){
        return Math.sqrt(base*base + altura*altura);
    }
    
    public TrianguloRectangulo() {
        this.base = 1;
        this.altura = 1;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "TrianguloRectangulo{" + "base=" + base + ", altura=" + altura + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + this.base;
        hash = 89 * hash + this.altura;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final TrianguloRectangulo other = (TrianguloRectangulo) obj;
        if (this.base != other.base) {
            return false;
        }
        return this.altura == other.altura;
    }
    
    
    
}
