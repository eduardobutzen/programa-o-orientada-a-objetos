## 📌 Exceções em Java

Em Java, **exceções** são eventos que ocorrem durante a execução do programa e interrompem o fluxo normal. Para evitar que o programa pare, usamos **try, catch e finally**.

---

## 🔹 Principais exceções já existentes

### 1. ArithmeticException
Ocorre quando há erro em operações matemáticas (ex: divisão por zero).

Exemplo:
```
int resultado = 10 / 0;
```

---

### 2. InputMismatchException
Ocorre quando o tipo digitado não corresponde ao esperado.

Exemplo:
```
Usuário digita "abc" quando o programa espera um número.
```
---

### 3. ArrayIndexOutOfBoundsException
Acontece ao acessar uma posição inválida de um array.

Exemplo:
```
int[] v = {1, 2, 3};
System.out.println(v[5]);
```

---

### 4. NumberFormatException
Ocorre ao converter uma String inválida para número.

Exemplo:
```
Double.parseDouble("abc");
```
---

### 5. NullPointerException
Ocorre ao tentar usar uma variável que está null.

Exemplo:
```
String nome = null;
nome.length();
```
---

### 6. StringIndexOutOfBoundsException
Ocorre ao acessar índice inválido de uma String.

Exemplo:
```
String s = "Oi";
System.out.println(s.charAt(5));
```

---

### 7. ClassCastException
Ocorre ao tentar converter tipos incompatíveis.

Exemplo:
```
Object x = "texto";
Integer y = (Integer) x;
```

---

## 🔹 Estrutura de tratamento

```
try {
    // código que pode gerar erro
} catch (TipoDaExcecao e) {
    // tratamento do erro
} finally {
    // executa sempre (opcional)
}
```

---

## 🔹 Testando duas exceções

```
public class TesteExcecoes {
    public static void main(String[] args) {

        // ArithmeticException
        try {
            int resultado = 10 / 0;
            System.out.println(resultado);
        } catch (ArithmeticException e) {
            System.out.println("Erro: divisão por zero.");
        }

        // NumberFormatException
        try {
            double numero = Double.parseDouble("abc");
            System.out.println(numero);
        } catch (NumberFormatException e) {
            System.out.println("Erro: valor inválido.");
        }
    }
}
```

---
