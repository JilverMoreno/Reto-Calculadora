/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.retocalculadora;

import javax.swing.JOptionPane;

/**
 *integrantes : miguel ibañez, daniel restrepo, jilver moreno
 * @author jmore
 */
public class Calculadora {

    public Calculadora() {

    }

    //iniciar el programa
    public void IniciarPrograma() {

        String menu = """
                          Bienvenidos a la calculadora
                      
                              Seleccione una Opcion
                      
                      1.Realizar una operacion
                      2.salir
                      
                      """;

        int optionMenu = 0;
        do {
            optionMenu = Integer.parseInt(JOptionPane.showInputDialog(menu));
            if (optionMenu == 1) {
                MenuCalculadora();
            } else if (optionMenu == 2) {
                break;
            } else {
                JOptionPane.showConfirmDialog(null, "La opcion " + optionMenu + " no es valida");
            }
        } while (optionMenu > 2);

    }

    //opciones calculadora
    public void MenuCalculadora() {
        String menu = """
                              Por favor 
                        Selecciona una operacion
                      
                      1.Suma
                      2.Resta
                      3.Multiplicacion
                      4.Division
                      5.Potencia
                      6.Raiz cuadrada
                      7.Salir
                      
                      """;

        int optionMenu = 0;
        optionMenu = Integer.parseInt(JOptionPane.showInputDialog(menu));
        do {

            

            if (optionMenu > 0 && optionMenu < 7) {
                try{
                switch (optionMenu) {
                    case 1:
                        JOptionPane.showMessageDialog(null, Suma());
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null, Resta());
                        break;
                    case 3:
                        JOptionPane.showMessageDialog(null, Multiplicacion());
                        break;
                    case 4:
                        JOptionPane.showMessageDialog(null, Division());
                        break;
                    case 5:
                        JOptionPane.showMessageDialog(null, Potencia());
                        break;
                    case 6:
                        JOptionPane.showMessageDialog(null, RaizCuadrada());
                        break;
                }
                }catch(NumberFormatException ex){
                    JOptionPane.showMessageDialog(null,"ingrese un valor correcto");
                }

            } else if (optionMenu >= 7) {
                JOptionPane.showMessageDialog(null, " se termino el programa");
            }
        } while (optionMenu != 7);
    }

    public double Suma() {
        double resultado = 0;
        double numero1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primer numero"));
        double numero2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el segundo numero"));
        resultado = numero1 + numero2;
        return resultado;
    }

    public double Resta() {
        double resultado = 0;
        double numero1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primer numero"));
        double numero2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el segundo numero"));
        resultado = numero1 - numero2;
        return resultado;
    }

    public double Multiplicacion() {
        double resultado = 0;
        double numero1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primer numero"));
        double numero2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el segundo numero"));
        resultado = numero1 * numero2;
        return resultado;
    }

    public double Division() {
        double resultado = 0;
        double numero1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primer numero"));
        double numero2;
        do {
            numero2 = Double.parseDouble(JOptionPane.showInputDialog("ingrese el segundo numero"));
            if (numero2 == 0) {
                JOptionPane.showMessageDialog(null, "no es posible realizare la operacion porque el divisor es igual a cero");
            }
        } while (numero2 == 0);
        resultado = numero1 / numero2;
        return resultado;
    }

    public double Potencia() {
        double resultado = 0;
        double numero1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primer numero"));
        double numero2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el segundo numero"));
        resultado = Math.pow(numero1, numero2);
        return resultado;
    }

    public double RaizCuadrada() {
        double resultado = 0;
        double numero1;
        do {
            numero1 = Double.parseDouble(JOptionPane.showInputDialog("ingrese un numero"));
            if (numero1 < 0) {
                JOptionPane.showMessageDialog(null, "ingrese un numero positivo");
            }
        } while (numero1 < 0);
        resultado = (double) Math.sqrt(numero1);
        return (double) resultado;
    }

}
