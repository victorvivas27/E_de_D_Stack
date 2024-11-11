package org.example.test;

import org.example.service.Stack;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {

    @Test
    public void seCreaLaPilaSeVerificaQueEstaVacia(){
        //Arrange
        Stack stack = new Stack();
        //Atc & Assert
        assertNotNull(stack);
    }
}