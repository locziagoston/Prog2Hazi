/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ital;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Pig
 */
public class Dolgozat extends SzeszesItal{

    public Dolgozat(double alkoholTartalom, String név, String kiszerelés, int ár) {
        super(alkoholTartalom, név, kiszerelés, ár);
    }
    
    public static void main(String[] args) {
        List<Ital> It = new ArrayList();
    }
}
