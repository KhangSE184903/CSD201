/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e03_arraystack;

/**
 *
 * @author PC
 */
public interface StackADT {
    public void clear();
    public boolean isEmpty();
    public void push(Object obj);
    public Object pop();
    public Object top();
}