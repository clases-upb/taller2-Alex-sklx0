/*
 * Este es el segundo taller de lógica de programación. En este taller deben comenzar a prácticar hacer las validaciones
 * de los datos que va a recibir la función usando los condicionales if. 
 * 
 * Como en el anterior, tenga en cuenta la siguiente rúbrica para cada ejercicio la cual, 
 * se basa en los mandamientos del programador. El taller es una herramienta para comenzar a preparar la evaluación 
 * donde los descuentos si van a ser tenidos en cuenta. 
 * Con este taller, usted irá aprendiendo a aplicar buenas prácticas en la programación.
 * 
 * La siguiente rúbrica se descuenta en cada ejercicio y es acumulativa:
 * Descuento por quemar valores en el código y no usar constantes: -0.5
 * Descuento por no implementar control de errores con trycatch: -0.8
 * Descuento por no escribir el código ordenado, identado: -0.4
 * 
 * RÉTESE, PÓNGASE A PRUEBA!!!
 * 
 */
package taller2;

public class App {

    public static void main(String[] args) {
        try {

            System.out.println(Calcular_saldo(2000000, 500000, 1000000));
            System.out.println(Calcular_saldo(1500000, 500000, 1000000));
            System.out.println(Calcular_tip(100));
            System.out.println(Calcular_tip(-50));
            System.out.println(Obtener_puntos(3, 2, 1));
            System.out.println(Obtener_puntos(-1, 2, 1));
            System.out.println(Calcular_definitiva(4, 4, 4, 4, 4, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f));
            System.out.println(Calcular_definitiva(4, 4, 4, 4, 4, 0.3f, 0.3f, 0.3f, 0.1f, 0.3f));
            System.out.println(Calcular_para_ganar(3, 3, 3, 3, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f));
            System.out.println(Calcular_para_ganar(3, 3, 3, 3, 0.3f, 0.3f, 0.3f, 0.1f, 0.3f));
            System.out.println(Calcular_salario(40, 10, 5, 20000));
            System.out.println(Calcular_salario(200, 50, 30, -150.0f));
            System.out.println(Calcular_area_triangulo(10, 5));
            System.out.println(Calcular_area_triangulo(-10, 5));
            System.out.println(Calcular_perimetro_cuadrado(5));
            System.out.println(Calcular_perimetro_cuadrado(-5));
            System.out.println(Calcular_volumen_cilindro(5, 10));
            System.out.println(Calcular_volumen_cilindro(5, -10));
            System.out.println(Calcular_area_circulo(5));
            System.out.println(Calcular_area_circulo(-5));

        } catch (Exception e) {
            System.out.println(e);
        }

    }


    /*
     * 1. Diseñe un algoritmo e implemente la función Calcular_saldo que reciba
     * tres enteros: la base de dinero en la taquilla, el total de recaudos y
     * el total de retiros, y retorne un entero que represente el saldo final
     * en la taquilla.
     * 
     * Valide que la base sea igual a 2.000.000. Si no es así, retorne -1.
     * 
     * saldo_taquilla = base + total recaudos - total_retiros
     * Si hay algún error, retorne -1.
     */
    public static int Calcular_saldo(int base_dinero_taq, int total_recaud, int total_retiros) {
        try {
            int saldo_final_taq = 0;
            final int base_minima = 2000000;

            if (base_dinero_taq != base_minima) {
                return -1;
            }
            saldo_final_taq = base_dinero_taq + total_recaud - total_retiros;

            return saldo_final_taq;
        } catch (Exception e) {
            return -1;
        }
    }

    /*
     * 2. Diseñe un algoritmo e implemente la función Calcular_tip que reciba
     * un float representando el valor del consumo de un cliente, y devuelva
     * un string que contenga el valor de la propina (10%), el impuesto al
     * consumo (8%) y el valor total a pagar.
     * 
     * MUY IMPORTANTE:
     * 
     * El formato del string debe ser: valor comida: $### - valor propina $### -
     * valor impoconsumo $### - total a pagar $###.
     * 
     * Si hay algún error, retorne "Error en la función Calcular_tip".
     * 
     * Ademas de esto, primero valide que el valor del consumo sea mayor a 0. Si no
     * es así, retorne "Error calculando consumo".
     * 
     */
    public static String Calcular_tip(float consumo_cliente) {
        try {
            String resultado;
            final double propina = 0.10, impuesto_consumo = 0.08;

            if (consumo_cliente < 0) {
                return "Error calculando consumo";
            }

            resultado = "valor comida: $" + consumo_cliente + " - valor propina $" + consumo_cliente * propina + " - valor impoconsumo $" + consumo_cliente * impuesto_consumo + " - total a pagar $" + (consumo_cliente + (consumo_cliente * propina) + (consumo_cliente * impuesto_consumo));
            return resultado;

        } catch (Exception e) {
            return "Error en la función Calcular_tip";
        }

    }

    /*
     * 3. Diseñe un algoritmo e implemente la función Obtener_puntos que reciba
     * tres enteros representando el número de partidos ganados, perdidos y
     * empatados de un equipo de fútbol, y devuelva un entero que represente
     * los puntos totales del equipo. La puntuación sigue los lineamientos
     * de la FIFA: 3 puntos por partido ganado, 1 punto por partido empatado y
     * 0 puntos por partido perdido. Si hay algún error, retorne -1.
     * 
     * Valide ademas que los partidos ganados, perdidos y empatados sean mayores o
     * iguales a 0. Si no es así, retorne -1.
     * 
     */
    public static int Obtener_puntos(int part_ganados, int part_perdidos, int part_empatados) {

        try {
            int puntos_totales = 0;
            final int puntos_ganar = 3, puntos_perder = 0, puntos_empatar = 1;

            if (part_empatados < 0 || part_perdidos < 0 || part_ganados < 0) {
                return -1;
            }

            puntos_totales = part_ganados * puntos_ganar + part_perdidos * puntos_perder + part_empatados * puntos_empatar;
            return puntos_totales;

        } catch (Exception e) {
            return -1;
        }

    }

    /*
     * 4. Diseñe un algoritmo e implemente la función Calcular_definitiva que
     * reciba cinco floats representando las notas (entre 0 y 5) y cinco floats
     * representando los porcentajes (que entre todos deberán sumar 1 y cada uno
     * estar entre 0 y 1),
     * y devuelva un float que represente la nota definitiva. Si algo está mal
     * con los porcentajes o con las notas, retorne -1.
     */
    public static float Calcular_definitiva(float nota1, float nota2, float nota3, float nota4, float nota5, float porcentaje1, float porcentaje2, float porcentaje3, float porcentaje4, float porcentaje5) {
        try {
            float nota_definitiva = 0;
            final int notaMin = 0, notaMax = 5, porcentajeMin = 0, porcentajeMax = 1, puntaje_suma = 1;

            if (notaMin > nota1 || nota1 > notaMax || notaMin > nota2 || nota2 > notaMax || notaMin > nota3 || nota3 > notaMax || notaMin > nota4 || nota4 > notaMax || notaMin > nota5 || nota5 > notaMax) {
                return -1;
            }

            if (porcentajeMin > porcentaje1 || porcentaje1 > porcentajeMax || porcentajeMin > porcentaje2 || porcentaje2 > porcentajeMax || porcentajeMin > porcentaje3 || porcentaje3 > porcentajeMax || porcentajeMin > porcentaje4 || porcentaje4 > porcentajeMax || porcentajeMin > porcentaje5 || porcentaje5 > porcentajeMax || ((porcentaje1 + porcentaje2 + porcentaje3 + porcentaje4 + porcentaje5) != puntaje_suma)) {
                return -1;
            }

            nota_definitiva = (nota1 * porcentaje1 + nota2 * porcentaje2 + nota3 * porcentaje3 + nota4 * porcentaje4 + nota5 * porcentaje5);
            return nota_definitiva;

        } catch (Exception e) {
            return -1;
        }
    }


    /*
     * 5. Diseñe un algoritmo e implemente la función Calcular_para_ganar que
     * reciba cinco floats representando los porcentajes de una materia (que
     * deberán sumar 1 y estar entre 0 y 1) y cuatro floats representando las
     * primeras notas (entre 0 y 5), y devuelva un float que represente la
     * nota que deberá sacar para ganar si el puntaje mínimo es 3. Si algo
     * está mal con los porcentajes o con las notas, retorne -1.
     */
    public static float Calcular_para_ganar(float nota1, float nota2, float nota3, float nota4, float porc_materia1, float porc_materia2, float porc_materia3, float porc_materia4, float porc_materia5) {

        try {
            float nota_para_ganar = 0;
            final int notaMin = 0, notaMax = 5, porcentajeMin = 0, porcentajeMax = 1, puntajeMin = 3;

            if (porcentajeMin > porc_materia1 || porc_materia1 > porcentajeMax || porcentajeMin > porc_materia2 || porc_materia2 > porcentajeMax || porcentajeMin > porc_materia3 || porc_materia3 > porcentajeMax || porcentajeMin > porc_materia4 || porc_materia4 > porcentajeMax || porcentajeMin > porc_materia5 || porc_materia5 > porcentajeMax || (porc_materia1 + porc_materia2 + porc_materia3 + porc_materia4 + porc_materia5) != 1) {
                return -1;
            }

            if (notaMin > nota1 || nota1 > notaMax || notaMin > nota2 || nota2 > notaMax || notaMin > nota3 || nota3 > notaMax || notaMin > nota4 || nota4 > notaMax) {
                return -1;
            }

            nota_para_ganar = (puntajeMin - (nota1 * porc_materia1 + nota2 * porc_materia2 + nota3 * porc_materia3 + nota4 * porc_materia4)) / porc_materia5;

            return nota_para_ganar;
        } catch (Exception e) {
            return -1;
        }

    }

    /*
     * 6. Diseñe un algoritmo e implemente la función Calcular_salario que
     * reciba cuatro enteros: cantidad de horas normales laboradas, cantidad
     * de horas extras diurnas laboradas, cantidad de horas extras nocturnas
     * laboradas, y el valor de la hora normal como un float. La función debe
     * retornar un float con el salario total. Las horas extras diurnas tienen
     * un recargo adicional del 15% sobre la hora normal, y las horas extras
     * nocturnas tienen un recargo adicional del 35% sobre la hora normal.
     * 
     * Valide que el valor de la hora normal sea mayor a 0. Si no es así, retorne
     * -1.
     * 
     * Si hay algún error, retorne -1.
     */
    public static float Calcular_salario(int horas_norm_labor, int horas_extra_diurnas, int horas_extra_nocturnas, float valor_hora_normal) {

        try {
            float salario_total = 0, valor_real_diurnas = 0, valor_real_nocturnas = 0;
            final double recargo_diurnas = 0.15, recargo_nocturnas = 0.35;
            if (valor_hora_normal <= 0) {
                return -1;
            }

            valor_real_diurnas = (float) (valor_hora_normal * recargo_diurnas);
            valor_real_nocturnas = (float) (valor_hora_normal * recargo_nocturnas);

            salario_total = (horas_norm_labor * valor_hora_normal)
                    + (horas_extra_diurnas * valor_real_diurnas)
                    + (horas_extra_nocturnas * valor_real_nocturnas);
            return salario_total;

        } catch (Exception e) {
            return -1;
        }

    }

    /*
     * 7. Diseñe un algoritmo e implemente la función Calcular_area_triangulo
     * que reciba dos floats representando la base y la altura de un triángulo
     * rectángulo, y devuelva un float que represente el área del triángulo.
     * 
     * Valide que la base y la altura sean mayores a 0. Si no es así, retorne -1.
     * 
     * La fórmula del área es: área = 1/2 * base * altura.
     * 
     * Si hay algún error, retorne -1.
     */
    public static float Calcular_area_triangulo(float base_triangulo, float altura_triangulo) {
        try {
            float area_triangulo = 0;
            final double constante_area = 0.5;

            if (base_triangulo < 0 || altura_triangulo < 0) {
                return -1;
            }

            area_triangulo = (float) (constante_area * base_triangulo * altura_triangulo);

            return area_triangulo;
        } catch (Exception e) {
            return -1;
        }
    }

    /*
     * 8. Diseñe un algoritmo e implemente la función Calcular_perimetro_cuadrado
     * que reciba un float representando el lado de un cuadrado, y devuelva un
     * float que represente el perímetro del cuadrado.
     * 
     * Valide que el lado sea mayor a 0. Si no es así, retorne -1.
     * 
     * La fórmula del perímetro es: perímetro = lado * 4.
     * 
     * Si hay algún error, retorne -1.
     */
    public static float Calcular_perimetro_cuadrado(float lado_cuadrado) {
        try {
            float perimetro_cuadrado = 0;
            final int const_perimetro = 4;

            if (lado_cuadrado < 0) {
                return -1;
            }
            perimetro_cuadrado = lado_cuadrado * const_perimetro;
            return perimetro_cuadrado;

        } catch (Exception e) {
            return -1;
        }

    }

    /*
     * 9. Diseñe un algoritmo e implemente la función Calcular_volumen_cilindro
     * que reciba dos floats representando el radio de la base y la altura de
     * un cilindro, y devuelva un float que represente el volumen del cilindro.
     * 
     * Valide que el radio y la altura sean mayores a 0. Si no es así, retorne -1.
     * 
     * La fórmula del volumen es: V = pi * radio^2 * altura, usando pi con
     * precisión de 7 decimales (3.1415927).
     * 
     * Si hay algún error, retorne -1.
     */
    public static float Calcular_volumen_cilindro(float radio_base, float altura_cilindro) {
        try {
            float volumen_cilindro = 0;
            final float pi = (float) 3.1415927, potencia = (float) 2;

            if (radio_base < 0 || altura_cilindro < 0) {
                return -1;
            }

            volumen_cilindro = (float) (pi * Math.pow(radio_base, potencia) * altura_cilindro);

            return volumen_cilindro;

        } catch (Exception e) {
            return -1;
        }
    }

    /*
     * 10. Diseñe un algoritmo e implemente la función Calcular_area_circulo
     * que reciba un float representando el radio de un círculo, y devuelva un
     * float que represente el área del círculo.
     * 
     * Valide que el radio sea mayor a 0. Si no es así, retorne -1.
     * 
     * La fórmula del área es: área = pi * radio^2, usando pi con precisión
     * de 7 decimales (3.1415927).
     * 
     * Si hay algún error, retorne -1.
     */
    public static float Calcular_area_circulo(float radio_circulo) {
        try {
            float area_circulo = 0;
            final float pi = (float) 3.141592, potencia = (float) 2;
            if (radio_circulo < 0) {
                return -1;
            }

            area_circulo = (float) (pi * Math.pow(radio_circulo, potencia));
            return area_circulo;

        } catch (Exception e) {
            return -1;
        }

    }

}
