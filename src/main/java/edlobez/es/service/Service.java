/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edlobez.es.service;

import java.util.List;

/**
 *
 * @author edlobez-vbox
 */
public interface Service <T> {    
    
    List<T> getAll ();
    List<T> getOR (String... campos);
    List<T> getAND (String... campos);
    List<T> get (String campos);
    T getone (String campos);
    public T create (T type);
    public T update (T type, String... campos);
    
}
