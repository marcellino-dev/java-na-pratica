public class Operadores {
    public static void main(String[] args) {

        // ARITMÉTICOS
        int a = 17;
        int b = 5;
        System.out.println("--- Aritméticos ---");
        System.out.println("a + b = " + (a + b));   // 22
        System.out.println("a - b = " + (a - b));   // 12
        System.out.println("a * b = " + (a * b));   // 85
        System.out.println("a / b = " + (a / b));   // 3 (divisão inteira)
        System.out.println("a % b = " + (a % b));   // 2 (resto)
        System.out.println("a / (double) b = " + (a / (double) b)); // 3.4

        // ATRIBUIÇÃO COMPOSTA
        System.out.println("--- Atribuição composta ---");
        int x = 10;
        x += 5;  System.out.println("x += 5  -> " + x); // 15
        x -= 3;  System.out.println("x -= 3  -> " + x); // 12
        x *= 2;  System.out.println("x *= 2  -> " + x); // 24
        x /= 4;  System.out.println("x /= 4  -> " + x); // 6
        x %= 4;  System.out.println("x %= 4  -> " + x); // 2

        // INCREMENTO E DECREMENTO
        System.out.println("--- Incremento/Decremento ---");
        int i = 5;
        System.out.println("i++ -> " + (i++)); // imprime 5, depois i vira 6
        System.out.println("i   -> " + i);     // 6
        System.out.println("++i -> " + (++i)); // i vira 7, depois imprime 7
        System.out.println("i-- -> " + (i--)); // imprime 7, depois i vira 6
        System.out.println("--i -> " + (--i)); // i vira 5, depois imprime 5

        // RELACIONAIS (retornam boolean)
        System.out.println("--- Relacionais ---");
        int idade = 18;
        System.out.println("idade == 18 -> " + (idade == 18)); // true
        System.out.println("idade != 18 -> " + (idade != 18)); // false
        System.out.println("idade > 20  -> " + (idade > 20));  // false
        System.out.println("idade < 20  -> " + (idade < 20));  // true
        System.out.println("idade >= 18 -> " + (idade >= 18)); // true
        System.out.println("idade <= 17 -> " + (idade <= 17)); // false

        //5. LÓGICOS
        System.out.println("--- Lógicos ---");
        boolean maiorDeIdade = idade >= 18;
        boolean temCarteira = false;
        System.out.println("maior E carteira -> " + (maiorDeIdade && temCarteira)); // false
        System.out.println("maior OU carteira -> " + (maiorDeIdade || temCarteira)); // true
        System.out.println("NÃO carteira -> " + (!temCarteira));                     // true

        // Curto-circuito: se o lado esquerdo já decide, o direito nem é avaliado
        int zero = 0;
        boolean seguro = (zero != 0) && (10 / zero > 1); // não dá erro
        System.out.println("curto-circuito -> " + seguro); // false

        // TERNÁRIO
        System.out.println("--- Ternário ---");
        int nota = 7;
        String resultado = (nota >= 6) ? "Aprovado" : "Reprovado";
        System.out.println("nota " + nota + " -> " + resultado);

        // CONCATENAÇÃO DE STRING
        System.out.println("--- Concatenação ---");
        System.out.println("1 + 2 = " + 1 + 2);   // "1 + 2 = 12"
        System.out.println("1 + 2 = " + (1 + 2)); // "1 + 2 = 3"

        //  PRECEDÊNCIA
        System.out.println("--- Precedência ---");
        System.out.println("2 + 3 * 4 = " + (2 + 3 * 4));     // 14
        System.out.println("(2 + 3) * 4 = " + ((2 + 3) * 4)); // 20

        //  COMPARANDO STRINGS
        System.out.println("--- Strings ---");
        String s1 = new String("java");
        String s2 = new String("java");
        System.out.println("s1 == s2      -> " + (s1 == s2));      // false (compara referência)
        System.out.println("s1.equals(s2) -> " + s1.equals(s2));   // true (compara conteúdo)

        // BITWISE (só para conhecer)
        System.out.println("--- Bitwise ---");
        System.out.println("5 & 3  = " + (5 & 3));   // 1
        System.out.println("5 | 3  = " + (5 | 3));   // 7
        System.out.println("5 ^ 3  = " + (5 ^ 3));   // 6
        System.out.println("5 << 1 = " + (5 << 1));  // 10
        System.out.println("5 >> 1 = " + (5 >> 1));  // 2
    }
}