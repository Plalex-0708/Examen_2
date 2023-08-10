
package com.mycompany.examen_2;

public class Matrix {
    
    int FILAS = 50 , COLUMNAS = 5;
    
    String Cuenta;
    String Descripcion;
    double Guillermo = 0, Tavo = 0, David = 0, Greivin = 0, Joshua = 0, Andres = 0;
    String Pago;
    double Total;
    String Moneda = "$";

    public Matrix(String Cuenta, String Descripcion, String Pago, double Total) {
        this.Cuenta = Cuenta;
        this.Descripcion = Descripcion;
        this.Pago = Pago;
        this.Total = Total;
    }

    public int getFILAS() {
        return FILAS;
    }

    public void setFILAS(int FILAS) {
        this.FILAS = FILAS;
    }

    public int getCOLUMNAS() {
        return COLUMNAS;
    }

    public void setCOLUMNAS(int COLUMNAS) {
        this.COLUMNAS = COLUMNAS;
    }

    public String getCuenta() {
        return Cuenta;
    }

    public void setCuenta(String Cuenta) {
        this.Cuenta = Cuenta;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public double getGuillermo() {
        return Guillermo;
    }

    public void setGuillermo(double Guillermo) {
        this.Guillermo = Guillermo;
    }

    public double getTavo() {
        return Tavo;
    }

    public void setTavo(double Tavo) {
        this.Tavo = Tavo;
    }

    public double getDavid() {
        return David;
    }

    public void setDavid(double David) {
        this.David = David;
    }

    public double getGreivin() {
        return Greivin;
    }

    public void setGreivin(double Greivin) {
        this.Greivin = Greivin;
    }

    public double getJoshua() {
        return Joshua;
    }

    public void setJoshua(double Joshua) {
        this.Joshua = Joshua;
    }

    public double getAndres() {
        return Andres;
    }

    public void setAndres(double Andres) {
        this.Andres = Andres;
    }

    public String getPago() {
        return Pago;
    }

    public void setPago(String Pago) {
        this.Pago = Pago;
    }

    public double getTotal() {
        return Total;
    }

    public void setTotal(double Total) {
        this.Total = Total;
    }

    public String getMoneda() {
        return Moneda;
    }

    public void setMoneda(String Moneda) {
        this.Moneda = Moneda;
    }
    
    
    Matrix arrMatrix[][] = new Matrix[FILAS][COLUMNAS];
    
    
    
    
    
    
    
}
