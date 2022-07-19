public class calculaFormas {
    public static void main(String[] args) {
        System.out.println("Exercício retornos");

        double areaQuadrado = formasGeometricasComReturn.area(3);
        System.out.println("Área do quadrado:" + areaQuadrado);

        double areaRetangulo = formasGeometricasComReturn.area(5,5);
        System.out.println("Área do retângulo:" + areaRetangulo);

        double areaTrapezio = formasGeometricasComReturn.area(7,8,9);
        System.out.println("Área do trapézio:" + areaTrapezio);

    }
}
