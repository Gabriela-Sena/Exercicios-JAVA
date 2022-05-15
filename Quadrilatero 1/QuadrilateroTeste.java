public class QuadrilateroTeste {
    public static void imprimirArea(Quadrilatero quad){
        System.out.println("Classe: " + quad.getClass() +
             " | area: " + quad.calcularArea());
    }
    public static void main(String[] args) {
        Quadrilatero[] quad = new Quadrilatero[5];
        quad[0] = new Quadrado(3);
        quad[1] = new Retangulo(2, 3);
        quad[2] = new Paralelogramo(3, 4);
        quad[3] = new Trapezio(3, 2, 2);
        quad[4] = new Losango(4, 3);

        for(Quadrilatero q : quad)
            imprimirArea(q);

        // Quadrado quadrado = new Quadrado(3);
        // Retangulo retangulo = new Retangulo(2, 3);
        // Paralelogramo paralelogramo = new Paralelogramo(3, 4);
        // Trapezio trapezio = new Trapezio(3, 2, 2);
        // Losango losango = new Losango(4, 3);

        // imprimirArea(quadrado);
        // imprimirArea(retangulo);
        // imprimirArea(paralelogramo);
        // imprimirArea(trapezio);
        // imprimirArea(losango);

    }
}
