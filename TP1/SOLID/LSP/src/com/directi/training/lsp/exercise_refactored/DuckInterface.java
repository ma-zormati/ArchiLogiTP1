package com.directi.training.lsp.exercise_refactored;

public interface DuckInterface {
    
    public class DuckException extends Exception{
        public void duckExcep (String msg){
            throw new RuntimeException(msg);
        }
    }
    
    public void swim() throws DuckException;
    public void quack() throws DuckException;
}
