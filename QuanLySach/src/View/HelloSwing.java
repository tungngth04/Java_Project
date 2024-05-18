/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.trungtamjava.javSwing;

import javax.swing.JFrame;

/**
 *
 * @author DELL 5625
 */
public class HelloSwing {
    public HelloSwing()
    {
        JFrame famer = new JFrame("Hello");
         famer.setSize(400, 400);
         famer.setVisible(true);
    }
    public static void main(String[] args) {
        new HelloSwing();
    }
}
