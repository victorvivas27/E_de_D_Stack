package org.example.test;

import org.example.service.Producto;
import org.example.service.Stack;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {

    @Test
    public void seCreaLaPila() {
        //Arrange
        Stack stack = new Stack();
        //Atc & Assert
        assertNotNull(stack);
    }

    @Test
    public void seCreaUnaPilaYSeVerificaQueEstaVacia() {
        //Arrange
        Stack stack = new Stack();
        //Act
        boolean resultado = stack.isEmpty();
        //Assert
        assertTrue(resultado);
    }

    @Test
    public void nuevaPilaSeVerificaElTamañoDebeDevolverCero() {
        // Arrange
        Stack stack = new Stack();

        // Act
        int tamaño = stack.size();

        // Assert
        assertEquals(0, tamaño, "El tamaño de una pila nueva debería ser cero");
    }

    @Test
    public void seApilaUnElementoYSeVerificaQueEstaNoEstaVaciaYDevuelvaFalse() {
        // Arrange
        Producto pera = new Producto("Pera");

        Stack stack = new Stack();
        stack.push(pera);

        // Act
        boolean resultado = stack.isEmpty();

        // Assert
        assertFalse(resultado);
    }

    @Test
    public void seApilaDosElementoYSeVerificaElTamañoDebeDevolverDos() {
        // Arrange
        Producto naranja = new Producto("Naranja");
        Producto pera = new Producto("Pera");

        Stack stack = new Stack();
        stack.push(naranja);
        stack.push(pera);

        // Act
        int tamaño = stack.size();

        // Assert
        assertEquals(2, tamaño, "El tamaño de la pila debería ser 2");
        System.out.println("Tamaño de la pila: " + stack.size());
    }

    @Test
    public void seApilanDosElementoYSeDesapiilaYSeVerificaQueEstaEstaVaciaYDevuelvaTrue() {
        // Arrange
        Producto pera = new Producto("Pera");
        Producto naranja = new Producto("Naranja");


        Stack stack = new Stack();
        stack.push(pera);
        stack.push(naranja);
        System.out.println("Pila tamaño: " + stack.size());

        // Act
        stack.pop();
        stack.pop();
        System.out.println("Pila tamaño: " + stack.size());
        boolean resultado = stack.isEmpty();

        // Assert
        assertTrue(resultado);
    }

    @Test
    public void seApilaDosElementoYSeDesapilaUnoSeVerificaSiEstaVaciaLaPilaDebeDevolverFalse() {
        // Arrange
        Producto pera = new Producto("Pera");
        Producto naranja = new Producto("Naranja");
        Stack stack = new Stack();
        stack.push(pera);
        stack.push(naranja);

        // Act
        stack.pop();
        boolean resultado = stack.isEmpty();

        // Assert
        assertFalse(resultado);
    }
    @Test
    public void seApilaDosElementosYSeExtraeElUltimoElementoApilado() {
        // Arrange
        Producto pera = new Producto("Pera");
        Producto naranja = new Producto("Naranja");
        Stack<Producto> stack = new Stack<>();
        stack.push(naranja);
        stack.push(pera);

        // Act
        Producto resultado = stack.pop();

        // Assert
        assertEquals(pera, resultado, "El último elemento apilado debería ser 'pera'");
    }
    @Test
    public void seApilaDosElementosYDebeImprimirLaListaDeLaPila() {
        // Arrange
        Producto pera = new Producto("Pera");
        Producto naranja = new Producto("Naranja");
        Stack<Producto> stack = new Stack<>();
        stack.push(naranja);
        stack.push(pera);

        // Capturar la salida de System.out
        ByteArrayOutputStream salidaConsola = new ByteArrayOutputStream();
        System.setOut(new PrintStream(salidaConsola));


        // Act
        stack.printStack();

        // Assert
        assertEquals("Pera -> Naranja\n", salidaConsola.toString(), "La salida de la pila debería ser 'Pera -> Naranja'");
        
    }


}