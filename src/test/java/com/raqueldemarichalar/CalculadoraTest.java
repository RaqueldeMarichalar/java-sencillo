package com.raqueldemarichalar;


import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {

    Calculadora calculadora;

    @BeforeEach

    void setUp() {
      calculadora = new Calculadora();

    }
    @ Test
        @DisplayName ("Multiplicacion")
        void testMultiplicar(){

            assertEquals(20, calculadora.multiplicar(4, 5), "Multiplicacion fallida 4*5= 20");


        }
       
    @RepeatedTest(5)
    @DisplayName("Manejo del cero")
    void testMultiplicarPorCero() {

        assertEquals(0, calculadora.multiplicar(0, 5),"Multiplicar por cero debe ser cero");
   
    }
    
    }