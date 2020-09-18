public class Triangulo {
    public float a;
    public float b;
    public float c;
    private boolean triangulo;

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }

    public float getC() {
        return c;
    }

    public void setC(float c) {
        this.c = c;
    }

    public boolean isTriangulo() {
        return triangulo;
    }

    public void setTriangulo(boolean triangulo) {
        this.triangulo = triangulo;
    }

    public void verificador() {
        if ((a < (b + c))) {
            if (b < (a + c)) {
                if (c < (a + b)) {
                    this.setTriangulo(true);
                }
            }
        }
    }
    public void qualTriangulo(){
        if(isTriangulo() == true){
            System.out.println(this.isTriangulo());
            if(a != b && b!= c && a != c) { // escaleno
                System.out.println("1");
            }
            else if(a == b || b == c || a == c){ // isóceles
                System.out.println("2");
            }
            else if(a == b && b == c && a == c){ // Equilatero
                System.out.println("3");
            }
            else{
                System.out.println("0");
            }
        }
        else{
            System.out.println(this.isTriangulo());
        }
    }
}


