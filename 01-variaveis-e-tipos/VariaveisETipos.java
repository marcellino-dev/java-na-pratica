public class VariaveisETipos {
    public static void main(String[] args) {

//Tipo	 Tamanho	 Uso
//byte	 8 bits	 -128 a 127
//short	 16 bits	 -32.768 a 32.767
//int	 32 bits	 inteiro padrão (~±2,1 bilhões)
//long	 64 bits	 inteiros grandes (sufixo L)
//float	 32 bits	 decimal (sufixo f)
//double	64 bits	 decimal padrão
//char	 16 bits	 um caractere, aspas simples
//boolean		 true ou false


        // Inteiros
        byte idadeCurta = 25;
        short ano = 2026;
        int populacao = 215_000_000;      // _ ajuda a ler números grandes
        long distancia = 9_460_730_472_580L; // L no final

        // Decimais
        float preco = 19.90f;             // f no final
        double pi = 3.141592653589793;

        // Outros
        char letra = 'J';
        boolean ativo = true;
        String nome = "Marcell";

        // var: o compilador infere o tipo (só em variáveis locais)
        var contador = 10;                // int

        // final: constante, não pode ser reatribuída
        final double IMPOSTO = 0.15;

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idadeCurta);
        System.out.println("Ano: " + ano);
        System.out.println("População: " + populacao);
        System.out.println("Distância: " + distancia);
        System.out.println("Preço: " + preco);
        System.out.println("Pi: " + pi);
        System.out.println("Letra: " + letra);
        System.out.println("Ativo: " + ativo);
        System.out.println("Contador: " + contador);
        System.out.println("Imposto: " + IMPOSTO);

        // Conversão automática (widening): menor -> maior
        int inteiro = 100;
        double comoDouble = inteiro;
        System.out.println("int para double: " + comoDouble);

        // Conversão manual (casting): maior -> menor, pode perder dados
        double decimal = 9.99;
        int truncado = (int) decimal;     // vira 9, não arredonda
        System.out.println("double para int: " + truncado);

        // Divisão de inteiros descarta a parte decimal
        System.out.println("7 / 2 = " + (7 / 2));      // 3
        System.out.println("7 / 2.0 = " + (7 / 2.0));  // 3.5

        // Overflow: estourar o limite do tipo
        byte b = 127;
        b++;
        System.out.println("byte 127 + 1 = " + b);      // -128
    }
}


//
//Tipo	 Tamanho	 Uso
//byte	 8 bits	 -128 a 127
//short	 16 bits	 -32.768 a 32.767
//int	 32 bits	 inteiro padrão (~±2,1 bilhões)
//long	 64 bits	 inteiros grandes (sufixo L)
//float	 32 bits	 decimal (sufixo f)
//double	64 bits	 decimal padrão
//char	 16 bits	 um caractere, aspas simples
//boolean		 true ou false

