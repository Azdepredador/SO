/*

Copyright (c) 2017 Javier Rubio

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.



 */
package sistemaoperativo;




import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.concurrent.Executors;
import java.util.logging.Level;
import java.util.logging.Logger;




/**
 *
 * @author Dell
 */
public class Interfaz extends javax.swing.JFrame {
    
 
    int numeroProcesos=0;
    int lotesPen=0;
    int contador=0;
    int tiempo=0;
    int mostrarLotes=1;
    boolean keyP=false,keyE=false,keyC=false;
   
    
    private  ArrayList<Procesos> procesos = new ArrayList<Procesos>();
    
        /**
     * Creates new form Interfaz
     */
    public Interfaz() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ejecutarB = new javax.swing.JButton();
        registrarB = new javax.swing.JButton();
        lotesPendientes = new javax.swing.JLabel();
        contadorGlobal = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lotesEjecucionT = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        procesoEjecucion = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        procesoTerminadoL = new javax.swing.JTextArea();
        contadorL = new javax.swing.JLabel();
        lotesPendientesT = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tiempoTranscurridoL = new javax.swing.JLabel();
        tiempoRestanteL = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        numeroProcesosT = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        lotesL = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        procesosL = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistemas Operativos");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        ejecutarB.setText("Ejecutar");
        ejecutarB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ejecutarBActionPerformed(evt);
            }
        });
        ejecutarB.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ejecutarBKeyPressed(evt);
            }
        });

        registrarB.setText("Registrar");
        registrarB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarBActionPerformed(evt);
            }
        });

        lotesPendientes.setText("Numero de Lotes pendientes: ");

        contadorGlobal.setText("Contador Global: ");

        jLabel1.setText("Lote en Ejecución");

        lotesEjecucionT.setEditable(false);
        lotesEjecucionT.setColumns(20);
        lotesEjecucionT.setRows(5);
        jScrollPane1.setViewportView(lotesEjecucionT);

        jLabel4.setText("Proceso en ejecución");

        procesoEjecucion.setEditable(false);
        procesoEjecucion.setColumns(20);
        procesoEjecucion.setRows(5);
        jScrollPane2.setViewportView(procesoEjecucion);

        jLabel6.setText("Procesos Terminados");

        procesoTerminadoL.setEditable(false);
        procesoTerminadoL.setColumns(20);
        procesoTerminadoL.setRows(5);
        jScrollPane3.setViewportView(procesoTerminadoL);

        contadorL.setText("0");

        lotesPendientesT.setText("0");

        jLabel7.setText("Tiempo transcurrido:");

        jLabel8.setText("Tiempo restante:");

        tiempoTranscurridoL.setText("0");

        tiempoRestanteL.setText("0");

        jLabel10.setText("Numero de Procesos: ");

        jLabel2.setText("Lotes:");

        lotesL.setText("0");

        jLabel5.setText("Procesos:");

        procesosL.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                        .addGap(108, 108, 108))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(11, 11, 11)
                                    .addComponent(jLabel10)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(numeroProcesosT, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel1)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(ejecutarB)
                                    .addGap(18, 18, 18)
                                    .addComponent(registrarB)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lotesPendientes)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lotesPendientesT))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lotesL)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(procesosL))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(contadorGlobal)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(contadorL)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 403, Short.MAX_VALUE)
                        .addGap(35, 35, 35))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tiempoTranscurridoL))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(tiempoRestanteL)))
                        .addGap(21, 21, 21))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(numeroProcesosT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ejecutarB)
                            .addComponent(registrarB))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(procesosL)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(lotesL)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(tiempoTranscurridoL)
                            .addComponent(lotesPendientes)
                            .addComponent(contadorGlobal)
                            .addComponent(contadorL)
                            .addComponent(lotesPendientesT))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(tiempoRestanteL))
                        .addGap(5, 5, 5)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1)))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ejecutarBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ejecutarBActionPerformed
        // TODO add your handling code here:
        procesoTerminadoL.setText("");
       int numProces=numeroProcesos;
       
       
       
        lotesPen=(numProces/4);
        mostrarLotes=1;
        contador=0;
        lotesEjecucionT.setText("");
        
        if(numProces%4==0){
            
            lotesPen=lotesPen-1;
        }
        

        mostrarLotesEjecucion();
        
        
        try {
            simularContador();
            // task.isDone();
        } catch (InterruptedException ex) {
            Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }//GEN-LAST:event_ejecutarBActionPerformed

    public void mostrarLotesEjecucion(){
        lotesEjecucionT.setText("");
        for(int j=0; j<procesos.size();j++){
                   
                       lotesEjecucionT.append("ID: "+procesos.get(j).getId()+"    "+
                           "TE: "+procesos.get(j).getTiempoMaximo()+"     "
                           +"TT: "+procesos.get(j).getTiempoTranscurrido()+"\n");
                   }
    }
    

    
    @SuppressWarnings("empty-statement")
    private void registrarBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarBActionPerformed
        // TODO add your handling code here:
        procesos.clear();
        numeroProcesos=Integer.parseInt(numeroProcesosT.getText());
        int op1,op2,op,tiempoMaximo,lote;
        int id=0;
        String [] operadores= {"+","/","*","%","potencia","sqrt","-"};
        
        
        lote=numeroProcesos/4;
        
        if(numeroProcesos%4!=0){
            lote++;
        }
        
        lotesL.setText(Integer.toString(lote));
        procesosL.setText(Integer.toString(numeroProcesos));
        
        
        for(int i=0; i<numeroProcesos; i++){
            
            op1=(int) (Math.random()*25+1);
            op=(int) (Math.random()*6+0);
            op2=(int) (Math.random()*25+1);
            tiempoMaximo=(int) (Math.random()*20+1);
            
            procesos.add(new Procesos("",
                           Integer.toString(op1),
                           operadores[op],
                           Integer.toString(op2),
                           "",
                           Integer.toString(id),
                           Integer.toString(tiempoMaximo),
                           "","0"
            ));
            
        
            id++;
        }
        
        numeroProcesosT.setText("");
        
        
        
        
        
    }//GEN-LAST:event_registrarBActionPerformed

    public boolean verificaID(String id){
              for(int i=0; i<numeroProcesos;i++){
                
                if(procesos.get(i).getId().equals(id)){
                    return true;
                }
        }
              return false;
    }
    

    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void ejecutarBKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ejecutarBKeyPressed
        // TODO add your handling code here:
        switch(evt.getKeyCode()){
            case KeyEvent.VK_E:
                if(!keyP){
                    keyE=true;
                }
                
                break;
            case KeyEvent.VK_P:
                keyP=true;
                break;
            case KeyEvent.VK_C:
                keyC=true;
                synchronized (this){
                    notifyAll();
                }
                break;
            case KeyEvent.VK_I:
                break;
                
            
            
        }
        
        
        
    }//GEN-LAST:event_ejecutarBKeyPressed

    
    public void simularContador() throws InterruptedException{
        Executors.newSingleThreadExecutor().execute(new Runnable(){

            @Override
            public void run() {
                try {
                    proceso();
                    //To change body of generated methods, choose Tools | Templates.
                } catch (InterruptedException ex) {
                    Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
        });
                
    }
    
    public void proceso() throws InterruptedException{
        boolean aumenta=false;
        
        for(int i=0; i<numeroProcesos;i++) {
                        
                   if(aumenta){
                       lotesPen--;
                       mostrarLotes++;
                       aumenta=false;
                   }

                   if((i+1)%4==0){
                       
                       aumenta=true;
                       
                   }
                   
                   
                   
                   lotesPendientesT.setText(Integer.toString(lotesPen));
                   procesos.get(i).setLote(Integer.toString(mostrarLotes));
                   
                   String signo=procesos.get(i).getOperators();
                   int op1=Integer.parseInt(procesos.get(i).getOp1());
                   int op2=Integer.parseInt(procesos.get(i).getOp2());
                   int res;
                   
                   if(signo.equals("+")){
                 
                       
                       res=op1+op2;
                       System.out.println(res);
                       
                       
                   }
                   else if(signo.equals("-")){
                       res=op1-op2;
                       
                   }
                   else if(signo.equals("*")){
                       res=op1*op2;
                   }
                   else if(signo.equals("/")){
                       res=op1/op2;
                   }
                   else if(signo.equals("%")){
                       res=op1%op2;
                   }
                   else if(signo.equals("potencia")){
                       res=(int)Math.pow(op1, op2);
                   }
                   else if(signo.equals("sqrt")){
                       res= (int)Math.sqrt(op2);
                   }
                   else{
                      res=0; 
                   }
                   procesos.get(i).setResult(Integer.toString(res));
                   
                   
                   
                   
                   procesoEjecucion.setText(
                                    "Operacion: "+procesos.get(i).getOp1()+" "+procesos.get(i).getOperators()+" "+procesos.get(i).getOp2()+"\n"
                                    +"Tiempo maximo estimado: "+procesos.get(i).getTiempoMaximo()+"\n"
                                    +"id: "+procesos.get(i).getId());
                   
                   
                   tiempo=Integer.parseInt(procesos.get(i).getTiempoMaximo());
                   
                   
                   tiempoTranscurridoL.setText("0");
                   String op=procesos.get(i).getOp1()+" "+procesos.get(i).getOperators()+" "+procesos.get(i).getOp2();
                   
                   
                   int j;
                   for(j=0; j<=tiempo; j++){
                       tiempoTranscurridoL.setText(Integer.toString(j));
                       tiempoRestanteL.setText(Integer.toString(tiempo-j));
                       contador++;
                       
                       procesos.get(i).setTiempoTranscurrido(Integer.toString(tiempo-j));
                       procesos.get(i).setTiempoMaximo(Integer.toString(j));
                       
                       mostrarLotesEjecucion();
                       
                       Thread.sleep(300);
                       
                       if(keyP){
                          
                           synchronized (this){
                               wait();
                           }
                            keyP=false;
                           System.out.print("LLega");
                       }
                       else if(keyE){
                            
                           procesos.get(i).setResult("Error");
                           procesos.get(i).setTiempoTranscurrido("X");
                          mostrarLotesEjecucion();
                           
                           op="Error";
                           
                           keyE=false;
                           break;
                       }
                       
                       
                       
                       
                   }
                   
                   
                    
                   contador--;
                   contadorL.setText(Integer.toString(contador));
                   
                    
                   
                   
                   procesoTerminadoL.append(
                                    
                                    "id: "+procesos.get(i).getId()+"    "
                                    +"lote: "+procesos.get(i).getLote()+"    "
                                    +"Op: "+op+"    "
                                    +"resultado: "+procesos.get(i).getResult()+"\n"
                                    
                                    );
                   
        }
        procesoEjecucion.setText("");
        lotesEjecucionT.setText("");
        tiempoTranscurridoL.setText("");

        
    }
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel contadorGlobal;
    private javax.swing.JLabel contadorL;
    private javax.swing.JButton ejecutarB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea lotesEjecucionT;
    private javax.swing.JLabel lotesL;
    private javax.swing.JLabel lotesPendientes;
    private javax.swing.JLabel lotesPendientesT;
    private javax.swing.JTextField numeroProcesosT;
    private javax.swing.JTextArea procesoEjecucion;
    private javax.swing.JTextArea procesoTerminadoL;
    private javax.swing.JLabel procesosL;
    private javax.swing.JButton registrarB;
    private javax.swing.JLabel tiempoRestanteL;
    private javax.swing.JLabel tiempoTranscurridoL;
    // End of variables declaration//GEN-END:variables



}
