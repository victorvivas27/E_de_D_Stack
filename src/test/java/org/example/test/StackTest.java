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
}