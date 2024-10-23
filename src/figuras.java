public abstract class figuras {


    public abstract void cal_Area();
    public abstract void cal_Perimetro();

}

class rectangulo extends figuras{
    double base;
    double altura;

    public rectangulo() {
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
    public void cal_Area() {
        double area;
        area = (base+altura)*2;
        System.out.println("El area del rectangulo es: " + area);
    }

    @Override
    public void cal_Perimetro() {
        double perimetro;

        perimetro = base*altura;

        System.out.println("El perimetro del rectangulo es:" + perimetro);

    }
}

class triangulo extends figuras{
    double base;
    double altura;

    double lad1;
    double lad2;
    double lad3;

    public triangulo() {
    }

    public triangulo(double lad1, double lad2, double lad3) {
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

    public double getLad1() {
        return lad1;
    }

    public void setLad1(double lad1) {
        this.lad1 = lad1;
    }

    public double getLad2() {
        return lad2;
    }

    public void setLad2(double lad2) {
        this.lad2 = lad2;
    }

    public double getLad3() {
        return lad3;
    }

    public void setLad3(double lad3) {
        this.lad3 = lad3;
    }

    @Override
    public void cal_Area() {
        double area;

        area = base*Math.pow(2, altura);

        System.out.println("\nEl area del triangulo es: " + area);

    }

    @Override
    public void cal_Perimetro() {

        double perimetro = lad1+lad2+lad3;

        System.out.println("\nEl perimetro del circulo es: " + perimetro);

    }
}

class circulo extends figuras{
    double base;
    double altura;

    double radio;

    public circulo() {
    }

    public circulo(double radio) {
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
    public void cal_Area() {

        double area = Math.PI * Math.pow(2, radio);

        System.out.println("El area del circulo es: " + area);

    }

    @Override
    public void cal_Perimetro() {

        double perimetro = Math.PI * (2 * radio);

        System.out.println("El perimetro del circulo es: " + perimetro);

    }
}