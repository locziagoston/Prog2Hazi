/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hallgato
 */
public class URLcímException extends Exception{
    private int hibakód;

    public URLcímException(int hibakód, String message) {
        super(message);
        this.hibakód = hibakód;
    }

    public int getHibakód() {
        return hibakód;
    }
    
    
    
}
