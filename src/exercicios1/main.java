package exercicios1;



public class main {

    public static void main(String[] args) {

        // Retornos

        System.out.println("Exercício retornos");

        double areaQuadrado = Quadrilatero1.area(3);
        System.out.println("Área do quadrado:" + areaQuadrado);


        double areaRetangulo = Quadrilatero1.area(5,5);
        System.out.println("Área do Retangulo:" + areaRetangulo);


        double areaTrapezio = Quadrilatero1.area(7, 8, 9);
        System.out.println("Área do Trapézio:" + areaTrapezio);
    }
}
