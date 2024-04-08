
package peluqueria.canina.Igu;
import javax.swing.JDialog;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import peluqueria.canina.logica.ControladoraLogica;
import peluqueria.canina.logica.Mascota;

public class MostrarDatos extends javax.swing.JFrame {

    ControladoraLogica control=control= new ControladoraLogica();
    int num_cliente;
    public MostrarDatos() {
        
        
      
        initComponents();
      
    }

  

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaModel = new javax.swing.JTable();
        txtEliminar = new javax.swing.JButton();
        txtEditar = new javax.swing.JButton();
        edit = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jTextField1.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jTextField1.setText("MOSTRAR DATOS");

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tablaModel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaModel);

        txtEliminar.setText("Eliminar");
        txtEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEliminarActionPerformed(evt);
            }
        });

        txtEditar.setText("Editar");
        txtEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEditarActionPerformed(evt);
            }
        });

        edit.setText("Datos de mascota:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 687, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                        .addComponent(txtEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(edit)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(777, Short.MAX_VALUE)
                    .addComponent(txtEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(19, 19, 19)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(txtEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(edit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(32, 32, 32)
                    .addComponent(txtEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(355, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(314, 314, 314)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 19, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
    
        cargarTabla();
        
        
        
    }//GEN-LAST:event_formWindowOpened

    private void txtEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEliminarActionPerformed
    if(tablaModel.getRowCount()>0){
        if(tablaModel.getSelectedRow()!=-1){
            //UBICAR ID D EMASCOTA PARA ELIMINAR
            int num_cliente = Integer.parseInt(String.valueOf(tablaModel.getValueAt(tablaModel.getSelectedRow(),0))) ;
     
               // BORRAR MASCOTA 
            control.borrarMascota(num_cliente);
        
            //MOSTRAR MENSAJE
            mostrarmensaje("Mascota eliminada","Info","Borrado de Mascota");
        cargarTabla();
        }
        else {
        mostrarmensaje("No selecciono ninguna mascota","Error","Error al eliminar");}
    }
    else{
    mostrarmensaje("No hay nada para eliminar","Error","Error al eliminar");
    }      
    }//GEN-LAST:event_txtEliminarActionPerformed

    private void txtEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEditarActionPerformed
      //Controlo que la tabla no este vaci
   if(tablaModel.getRowCount()>0){
       //controlo qe se haya seleccionado una mascota
     if(tablaModel.getSelectedRow()!=-1){
            //UBICAR ID D EMASCOTA PARA ELIMINAR
            int num_cliente = Integer.parseInt(String.valueOf(tablaModel.getValueAt(tablaModel.getSelectedRow(),0))) ;
        ModificarDatos pantalla=new ModificarDatos(num_cliente);
        pantalla.setVisible(true);
        pantalla.setLocationRelativeTo(null);
        this.dispose();
        }
   }
    
         else {
        mostrarmensaje("No selecciono ninguna mascota","Error","Error al eliminar");}
    
        
    }//GEN-LAST:event_txtEditarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel edit;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tablaModel;
    private javax.swing.JButton txtEditar;
    private javax.swing.JButton txtEliminar;
    // End of variables declaration//GEN-END:variables

    private void cargarTabla() {
       //definir el modelo que tenga la tabla
        DefaultTableModel tabla= new DefaultTableModel(){
       //que fila y columnas no sean editables
        @Override
        public boolean isCellEditable(int row, int column){
        return false;
        }
        };
        
        //establecemos los nombres de las columnas
        String titulos[]={"Num","Nombre","Color","Raza","Alergico","At. Especial","Dueño","Cel"};
        tabla.setColumnIdentifiers(titulos);
        //carga de los datos 
        List<Mascota> listaMascota= control.mostrarMascota();
        //recorrer lista y mostrar cada uno de los elementos
        if(listaMascota !=null){
        for(Mascota masco:listaMascota){
            Object[] objeto = {masco.getNum_cliente(),masco.getNombre(), masco.getColor(),masco.getRaza(),masco.getAlergico(),masco.getAtencion(),masco.getUnDuenio().getNombre(),masco.getUnDuenio().getCelDuenio()};
        tabla.addRow(objeto);
        }
        }
        tablaModel.setModel(tabla);
    }

   public void mostrarmensaje(String mensaje, String tipo, String titulo) {
    int messageType = JOptionPane.PLAIN_MESSAGE; // Tipo de mensaje predeterminado
    
    if(tipo.equals("Info")){
        messageType = JOptionPane.INFORMATION_MESSAGE;
    } else if (tipo.equals("Error")){
        messageType = JOptionPane.ERROR_MESSAGE;
    }

    JOptionPane.showMessageDialog(null, mensaje, titulo, messageType);
}

    private void cargardatos(int num_cliente) {
        Mascota masco = control.traerMascota(num_cliente);
    }
        
}
        

    

   

