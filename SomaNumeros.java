public class SomaNumeros { // pode ser usada em qualquer lugar, por ser publico
    public static void main(String[] args) { // pode ser acessada por outras clases, porém por ser static nao pode chamar outra classe.
        int i = 0; // Define uma variavel de número inteiro I como 0
        while(i < 1000){ // Enquanto I for menor que 100, faça:
            i++; // soma i = i + 1
            System.out.println(i); // Printa o I na tela.
        }
    }
}