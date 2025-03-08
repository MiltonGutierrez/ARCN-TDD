### Escuela Colombiana de Ingeniería

### ARCN - Arquitectura centrada en el negocio.

#  Taller TDD

Aplicar la metodología de Desarrollo Guiado por Pruebas (TDD) mediante la implementación del ejercicio clásico FizzBuzz en Java dentro de GitHub Codespaces.

## Empezando

Estas instrucciones te permitirán obtener una copia del proyecto y ejecutarlo en tu máquina local para propósitos de desarrollo y pruebas.

### Prerequisitos

- Java 21 preferiblemente.
- Maven 3.x
- Acceso a una terminal.

### Instalando

Pasos para configurar el entorno de desarrollo:

1. Clona el repositorio del proyecto:

   ```bash
   git clone https://github.com/MiltonGutierrez/ARCN-TDD
   cd ARCN-TDD
   ```
2. Compila el proyecto.

    ```bash
    mvn clean install
    ```

## Desarrollo del laboratorio.

Se creo el proyecto con el siguiente comando maven:
   ```bash
       mvn archetype:generate "-DgroupId=edu.escuelaing.arcn" "-DartifactId=tdd" "-DarchetypeArtifactId=maven-archetype-quickstart" "-DinteractiveMode=false"
   ```

Resultando en la siguiente estructura del proyecto:

    📂 src
    ├── 📂 main
    │   ├── 📂 java
    │   │   ├── 📂 edu
    │   │   │   ├── 📂 escuelaing
    │   │   │   │   ├── 📂 arcn
    │   │   │   │   │   ├── 📄 FizzBuzz.java
    ├── 📂 test
    │   ├── 📂 java
    │   │   ├── 📂 edu
    │   │   │   ├── 📂 escuelaing
    │   │   │   │   ├── 📂 arcn
    │   │   │   │   │   ├── 📄 FizzBuzzTest.java


### Clase FizzBuzzTest.java

Se implementaron las pruebas indicadas en la clase FizzBuzzTest resultando en:

   ```java
      class FizzBuzzTest {

            @Test
            void testFizzBuzzReturnsNumber() {
                assertEquals("1", FizzBuzz.fizzbuzz(1));
            }

            @Test
            void testFizzBuzzMultiplo3() {
                assertEquals("Fizz", FizzBuzz.fizzbuzz(3));
            }

            @Test
            void testFizzBuzzMultiplo5() {
                assertEquals("Buzz", FizzBuzz.fizzbuzz(5));
            }

            @Test
            void testFizzBuzzMultiplo3y5() {
                assertEquals("FizzBuzz", FizzBuzz.fizzbuzz(15));
            }
        }
   ```

### Clase FizzBuzz.java

La implementación resultando (sin refactor) resultó en:

   ```java
        public class FizzBuzz{
            public static String fizzbuzz(int n) {
                StringBuilder fizzBuzzResult = new StringBuilder();
                if(n % 3 == 0){
                    fizzBuzzResult.append("Fizz");
                }
                if(n % 5 == 0){
                    fizzBuzzResult.append("Buzz");
                }
                return fizzBuzzResult.isEmpty() ? String.valueOf(n) : fizzBuzzResult.toString();
                
            }
        }
   ```

### Ejecución de pruebas

Al momento de ejecutar `mvn test` se prueba que la implementanción se realizó correctamente.

![alt text](image.png)

