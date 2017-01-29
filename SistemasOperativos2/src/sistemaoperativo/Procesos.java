/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaoperativo;

/**
 *
 * @author Dell
 */
public class Procesos {
    
    private String name;
    private String op1;
    private String operators;
    private String op2;
    private String result;
    private String id;
    private String tiempoMaximo;
    private String lote;
    private String tiempoTranscurrido;

    public Procesos(String name, String op1, String operators, String op2, String result, String id, String tiempoMaximo, String lote, String tiempoTranscurrido) {
        this.name = name;
        this.op1 = op1;
        this.operators = operators;
        this.op2 = op2;
        this.result = result;
        this.id = id;
        this.tiempoMaximo = tiempoMaximo;
        this.lote = lote;
        this.tiempoTranscurrido = tiempoTranscurrido;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOp1() {
        return op1;
    }

    public void setOp1(String op1) {
        this.op1 = op1;
    }

    public String getOperators() {
        return operators;
    }

    public void setOperators(String operators) {
        this.operators = operators;
    }

    public String getOp2() {
        return op2;
    }

    public void setOp2(String op2) {
        this.op2 = op2;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTiempoMaximo() {
        return tiempoMaximo;
    }

    public void setTiempoMaximo(String tiempoMaximo) {
        this.tiempoMaximo = tiempoMaximo;
    }

    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }

    public String getTiempoTranscurrido() {
        return tiempoTranscurrido;
    }

    public void setTiempoTranscurrido(String tiempoTranscurrido) {
        this.tiempoTranscurrido = tiempoTranscurrido;
    }

   

    
    
    
}
