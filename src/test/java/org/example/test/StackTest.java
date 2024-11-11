package org.example.test;

import org.example.service.Stack;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {

    @Test
    public void seCreaLaPila(){
        //Arrange
        Stack stack = new Stack();
        //Atc & Assert
        assertNotNull(stack);
    }
    @Test
    public  void  seCreaUnaPilaYSeVerificaQueEstaVacia(){
        //Arrange
        Stack stack = new Stack();
        //Act
        boolean resultado =stack.isEmpty();
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
}