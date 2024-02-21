/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vainaweb.plainpractices.ebookcap6;

/**
 *
 * @author logistica
 */
public class FailSoftArray {

   

        private int a[]; // referência ao array private int errval; // valor a ser retornado se get() falhar public int length; // length é pública
/* Constrói o array dados seu tamanho e o valor a ser retornado se get() falhar. */

        public FailSoftArray(int size, int errv) {
            a = new int[size];
            errval = errv;
            length = size;
        }

    }
