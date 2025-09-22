# 🌡 Conversor de Temperatura em Java

## Descrição
Este projeto implementa um **conversor de temperatura em Java**, capaz de converter valores informados em **graus Celsius** para:  

- **Fahrenheit (°F)**  
- **Kelvin (K)**  

O usuário informa a temperatura em Celsius e o programa retorna os valores equivalentes nas outras escalas.

---

## Funcionalidades

- Entrada de temperatura em **Celsius** pelo usuário;
- Conversão para **Fahrenheit**;
- Conversão para **Kelvin**;
- Saída formatada no console.

---

## Código Principal

```java
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura em graus Celsius: ");
        double celsius = scanner.nextDouble();

        double fahrenheit = 9.0 / 5.0 * celsius + 32.0;
        double kelvin = celsius + 273.15;

        System.out.println("Temperatura em Fahrenheit: " + fahrenheit);
        System.out.println("Temperatura em Kelvin: " + kelvin);

        scanner.close();
    }

}
````

---

## Requisitos

* Java JDK 11 ou superior;
* IDE ou editor de texto (IntelliJ, Eclipse, VS Code, etc.);
* Conhecimentos básicos de terminal ou console para execução.

---

## Execução

1. Abra o terminal ou console;
2. Navegue até a pasta do arquivo `Main.java`;
3. Compile o programa:

```bash
javac Main.java
```

4. Execute o programa:

```bash
java Main
```

5. Insira o valor da temperatura em Celsius quando solicitado.

---

## Exemplo de Uso

```text
Digite a temperatura em graus Celsius: 25
Temperatura em Fahrenheit: 77.0
Temperatura em Kelvin: 298.15
```

```text
Digite a temperatura em graus Celsius: 0
Temperatura em Fahrenheit: 32.0
Temperatura em Kelvin: 273.15
```

---

## Contribuição

Este projeto pode ser expandido com:

* Conversão reversa (Fahrenheit → Celsius e Kelvin → Celsius);
* Conversão para outras escalas, como Rankine ou Réaumur;
* Interface gráfica simples com Swing ou JavaFX;
* Validação de entrada para aceitar apenas valores numéricos;
* Loop contínuo para converter várias temperaturas sem reiniciar o programa.

---

## Licença

Uso acadêmico.
