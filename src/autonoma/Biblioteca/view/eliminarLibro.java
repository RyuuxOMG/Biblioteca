
package autonoma.Biblioteca.view;

import javax.swing.ImageIcon;
import autonoma.Biblioteca.models.Biblioteca;
import autonoma.Biblioteca.models.Libro;
import autonoma.Biblioteca.view.PaginaP;
import javax.swing.JOptionPane;


public class eliminarLibro extends javax.swing.JDialog {
    // Variables privadas para almacenar la referencia a la biblioteca y la página principal.
private Biblioteca bibliotecas;
private PaginaP Pagina;

// Constructor de la clase eliminarLibro
public eliminarLibro(java.awt.Frame parent, boolean modal, Biblioteca bibliotecas, PaginaP Pagina) {
    // Llama al constructor de la clase padre (JDialog) y define si la ventana será modal.
    super(parent, modal);

    // Asigna las referencias de la biblioteca y la página principal.
    this.bibliotecas = bibliotecas;
    this.Pagina = Pagina;

    // Inicializa los componentes de la interfaz gráfica.
    initComponents();

    // Centra la ventana en la pantalla.
    this.setLocationRelativeTo(null);

    try {
        // Intenta establecer un ícono para la ventana con una imagen específica.
        this.setIconImage(new ImageIcon(getClass().getResource("/autonoma/Biblioteca/images/Biblioteca.png")).getImage());
    } catch (Exception e) {
        // Si hay un error al cargar la imagen, el programa sigue sin mostrar error.
    }
}

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        EliminanrLibro = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnRegresar = new javax.swing.JButton();
        txtID = new java.awt.TextField();
        jLabel3 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(214, 219, 223));

        jPanel3.setBackground(new java.awt.Color(214, 219, 223));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autonoma/Biblioteca/images/EliminarLibro.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addContainerGap(10, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(10, 10, 10))
        );

        EliminanrLibro.setFont(new java.awt.Font("Dubai Medium", 1, 48)); // NOI18N
        EliminanrLibro.setText("ELIMINAR LIBRO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(EliminanrLibro)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(EliminanrLibro)))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(133, 146, 158));

        btnRegresar.setBackground(new java.awt.Color(214, 219, 223));
        btnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autonoma/Biblioteca/images/RegresarF.png"))); // NOI18N
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        txtID.setFont(new java.awt.Font("Dubai Medium", 0, 12)); // NOI18N
        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dubai Medium", 1, 18)); // NOI18N
        jLabel3.setText("ID DEL LIBRO:");

        btnEliminar.setFont(new java.awt.Font("Dubai Medium", 0, 14)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(293, 293, 293))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnRegresar))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(312, 312, 312)
                        .addComponent(btnEliminar)))
                .addContainerGap(184, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jLabel3)
                .addGap(26, 26, 26)
                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(btnEliminar)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        dispose ();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
// Obtener el texto ingresado en el campo de ID
String input = txtID.getText();

// Verificar si el campo está vacío
if (input.isEmpty()) {
    JOptionPane.showMessageDialog(this, "Ingrese un ID", "Error", JOptionPane.WARNING_MESSAGE);
    return; // Sale del método si no se ingresó nada
}

Long value;
try {
    // Intentar convertir el texto en un número entero largo (Long)
    value = Long.parseLong(input);
} catch (NumberFormatException e) {
    // Si el usuario ingresa algo que no es un número, mostrar un mensaje de error
    JOptionPane.showMessageDialog(this, "ID no valido, intentelo nuevamente con numeros", "Error", JOptionPane.ERROR_MESSAGE);
    return; // Sale del método si la conversión falla
}

// Buscar el libro en la biblioteca con el ID ingresado
Libro encontrado = bibliotecas.buscarLibro(value);

if (encontrado != null) { // Si el libro existe
    // Intentar eliminar el libro
    if (bibliotecas.eliminarLibro(value)) {
        // Si se eliminó correctamente, mostrar mensaje de éxito
        JOptionPane.showMessageDialog(this, "Libro eliminado exitosamente.");

        // Actualizar la tabla de libros en la ventana principal
        Pagina.llenarTablaLibros();

        // Cerrar la ventana de eliminación
        dispose();
    } else {
        // Si hubo un error al eliminar, mostrar mensaje de error
        JOptionPane.showMessageDialog(this, "Error al eliminar.", "Error", JOptionPane.ERROR_MESSAGE);
    }
} else {
    // Si el libro no se encontró, mostrar mensaje de advertencia
    JOptionPane.showMessageDialog(this, "Libro no encontrado.", "Error", JOptionPane.WARNING_MESSAGE);
}

    }//GEN-LAST:event_btnEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel EliminanrLibro;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private java.awt.TextField txtID;
    // End of variables declaration//GEN-END:variables
}
