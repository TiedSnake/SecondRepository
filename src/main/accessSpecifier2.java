/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author m-w-n
 */
public class accessSpecifier2
{
    public static void main(String[] args)
    {
        //private
        System.out.println("Private Access Specifier");
        privateAccessSpecifier obj = new privateAccessSpecifier();
        
        //trying to access private method of another class
        //obj.display();
    }
}
