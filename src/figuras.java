public abstract class figuras {


    public abstract void cal_Area(double base, double altura);
    public abstract void cal_Perimetro(double base, double altura);

}

class rectangulo extends figuras{
    double base;
    double altura;

    public rectangulo() {
    }

    public rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public void cal_Area(double base, double altura) {
        double area;
        area = (base+altura)*2;
        System.out.println(area);
    }

    @Override
    public void cal_Perimetro(double base, double altura) {
        double perimetro;

        perimetro = base*altura;
        System.out.println(perimetro);

    }
}

class triangulo extends figuras{
    double base;
    double altura;

    int lad1;
    int lad2;
    int lad3;

    public triangulo() {
    }

    public triangulo(double base, double altura, int lad1, int lad2, int lad3) {
        this.base = base;
        this.altura = altura;
        this.lad1 = lad1;
        this.lad2 = lad2;
        this.lad3 = lad3;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getLad1() {
        return lad1;
    }

    public void setLad1(int lad1) {
        this.lad1 = lad1;
    }

    public int getLad2() {
        return lad2;
    }

    public void setLad2(int lad2) {
        this.lad2 = lad2;
    }

    public int getLad3() {
        return lad3;
    }

    public void setLad3(int lad3) {
        this.lad3 = lad3;
    }

    @Override
    public void cal_Area(double base, double altura) {
        double area;

        area = base*Math.pow(2, altura);

    }

    @Override
    public void cal_Perimetro(double base, double altura) {

        double perimetro = lad1+lad2+lad3;

    }
}

class circulo extends figuras{
    double base;
    double altura;

    double radio;

    public circulo() {
    }

    public circulo(double base, double altura, double radio) {
        this.base = base;
        this.altura = altura;
        this.radio = radio;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public void cal_Area(double base, double altura) {

        double area = Math.PI * Math.pow(2, radio);

    }

    @Override
    public void cal_Perimetro(double base, double altura) {
        double perimetro = Math.PI * (2 * radio);
    }
}