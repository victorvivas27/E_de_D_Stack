package org.example.test;

import org.example.service.Producto;
import org.example.service.Stack;
import org.junit.jupiter.api.Test;

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

}