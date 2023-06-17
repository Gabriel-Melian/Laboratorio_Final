package Vistas;

import com.jtattoo.plaf.hifi.HiFiLookAndFeel;
import com.jtattoo.plaf.mcwin.McWinLookAndFeel;
import com.jtattoo.plaf.noire.NoireLookAndFeel;
import com.jtattoo.plaf.texture.TextureLookAndFeel;

import java.awt.Image;
import java.awt.Toolkit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author jesim
 */
public class Menu extends javax.swing.JFrame {

    public Menu() {
        initComponents();
        this.setTitle("Gestión de Tareas");
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        
        
Image UNIVERSIDAD = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/UNIVERSIDAD.png"));
this.setIconImage(UNIVERSIDAD);

// Carga la imagen original del archivo
ImageIcon iconoSalidaOriginal = new ImageIcon(getClass().getResource("/imagenes/EXIT.png"));
Image imagenSalidaOriginal = iconoSalidaOriginal.getImage();
// Define el nuevo tamaño deseado
int anchoNuevo = 30;
int altoNuevo = 30;
// Redimensiona la imagen
Image imagenSalidaRedimensionada = imagenSalidaOriginal.getScaledInstance(anchoNuevo, altoNuevo, Image.SCALE_SMOOTH);
// Crea un nuevo ImageIcon con la imagen redimensionada
ImageIcon iconoSalidaRedimensionada = new ImageIcon(imagenSalidaRedimensionada);
// Crea el JMenuItem para la opción de salida y establece el ícono redimensionado
JMenuItem itemSalida = new JMenuItem("Salir", iconoSalidaRedimensionada);
// Agrega un ActionListener al JMenuItem para manejar la acción de salida
itemSalida.addActionListener(e -> {
    dispose();
});
// Agrega el JMenuItem al menú jmSalir
jmSalir.add(itemSalida);

// Carga la imagen del archivo
ImageIcon iconoCrearProyecto = new ImageIcon(getClass().getResource("/imagenes/PROYECTO1.png"));
Image imagenCrearProyecto = iconoCrearProyecto.getImage();
// Define el nuevo tamaño deseado
int anchoNuevo1 = 30;
int altoNuevo1 = 30;
// Redimensiona la imagen
Image imagenCrearProyectoRedimensionada = imagenCrearProyecto.getScaledInstance(anchoNuevo1, altoNuevo1, Image.SCALE_SMOOTH);
// Crea un nuevo ImageIcon con la imagen redimensionada
ImageIcon iconoCrearProyectoRedimensionada = new ImageIcon(imagenCrearProyectoRedimensionada);
// Crea el JMenuItem para la opción "Crear Proyecto" y establece el ícono redimensionado
JMenuItem itemCrearProyecto = new JMenuItem("Crear Proyecto", iconoCrearProyectoRedimensionada);
itemCrearProyecto.addActionListener(e -> {
    jdEscritorio.repaint();
    ViewProyectos viewProyectos = new ViewProyectos();
    jdEscritorio.add(viewProyectos);
    viewProyectos.setVisible(true);
});
// Agrega el JMenuItem al menú jMenu1
jMenu1.add(itemCrearProyecto);

// Carga la imagen del archivo
ImageIcon iconoConsultarProyecto = new ImageIcon(getClass().getResource("/imagenes/CONSULTAR_PROYECTO.png"));
Image imagenConsultarProyecto = iconoConsultarProyecto.getImage();
// Define el nuevo tamaño deseado
int anchoNuevo2 = 30;
int altoNuevo2 = 30;
// Redimensiona la imagen
Image imagenConsultarProyectoRedimensionada = imagenConsultarProyecto.getScaledInstance(anchoNuevo2, altoNuevo2, Image.SCALE_SMOOTH);
// Crea un nuevo ImageIcon con la imagen redimensionada
ImageIcon iconoConsultarProyectoRedimensionada = new ImageIcon(imagenConsultarProyectoRedimensionada);
// Crea el JMenuItem para la opción "Consultar Proyecto" y establece el ícono redimensionado
JMenuItem itemConsultarProyecto = new JMenuItem("Consultar Proyecto", iconoConsultarProyectoRedimensionada);
itemConsultarProyecto.addActionListener(e -> {
    jdEscritorio.repaint();
    ViewConsultarProyectos viewConsultarProyectos = new ViewConsultarProyectos();
    jdEscritorio.add(viewConsultarProyectos);
    viewConsultarProyectos.setVisible(true);
});
// Agrega el JMenuItem al menú jMenu1
jMenu1.add(itemConsultarProyecto);


// Carga la imagen del archivo
ImageIcon iconoConsultarTareas = new ImageIcon(getClass().getResource("/imagenes/lista-de-tareas.png"));
Image imagenConsultarTareas = iconoConsultarTareas.getImage();
// Define el nuevo tamaño deseado
int anchoNuevo3 = 30;
int altoNuevo3 = 30;
// Redimensiona la imagen
Image imagenConsultarTareasRedimensionada = imagenConsultarTareas.getScaledInstance(anchoNuevo3, altoNuevo3, Image.SCALE_SMOOTH);
// Crea un nuevo ImageIcon con la imagen redimensionada
ImageIcon iconoConsultarTareasRedimensionada = new ImageIcon(imagenConsultarTareasRedimensionada);
// Crea el JMenuItem para la opción "Consultar Tareas por Proyecto" y establece el ícono redimensionado
JMenuItem itemConsultarTareas = new JMenuItem("Consultar Tareas por Proyecto", iconoConsultarTareasRedimensionada);
// Agrega el JMenuItem al menú jMenu1
jMenu1.add(itemConsultarTareas);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jdEscritorio = new javax.swing.JDesktopPane();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jmSalir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 153));

        jdEscritorio.setBackground(new java.awt.Color(91, 174, 180));

        jLabel17.setForeground(new java.awt.Color(255, 153, 0));
        jLabel17.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gabriel\\Documents\\NetBeansProjects\\Laboratorio_Final-main\\src\\imagenes\\UNIVERSIDAD.png")); // NOI18N

        jLabel18.setBackground(new java.awt.Color(0, 0, 0));
        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel18.setText("Trabajo Final: Gestión de Tareas.");

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 153, 0));
        jLabel19.setText("Grupo 7");

        jLabel20.setBackground(new java.awt.Color(0, 0, 0));
        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel20.setText("Integrantes:");

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel21.setText("Melian, Gabriel.");

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel22.setText("Moll Montiveros,Jesica.");

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel23.setText("Mercau Yañez, Lucas.");

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel24.setText("Mansilla, Dario Gustavo.");

        jdEscritorio.setLayer(jLabel17, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdEscritorio.setLayer(jLabel18, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdEscritorio.setLayer(jLabel19, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdEscritorio.setLayer(jLabel20, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdEscritorio.setLayer(jLabel21, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdEscritorio.setLayer(jLabel22, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdEscritorio.setLayer(jLabel23, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdEscritorio.setLayer(jLabel24, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jdEscritorioLayout = new javax.swing.GroupLayout(jdEscritorio);
        jdEscritorio.setLayout(jdEscritorioLayout);
        jdEscritorioLayout.setHorizontalGroup(
            jdEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jdEscritorioLayout.createSequentialGroup()
                .addGap(0, 117, Short.MAX_VALUE)
                .addComponent(jLabel18)
                .addGap(106, 106, 106))
            .addGroup(jdEscritorioLayout.createSequentialGroup()
                .addGroup(jdEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jdEscritorioLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(jdEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22)
                            .addComponent(jLabel23)
                            .addComponent(jLabel24)
                            .addComponent(jLabel20)))
                    .addGroup(jdEscritorioLayout.createSequentialGroup()
                        .addGap(266, 266, 266)
                        .addComponent(jLabel19))
                    .addGroup(jdEscritorioLayout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jdEscritorioLayout.setVerticalGroup(
            jdEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdEscritorioLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(jLabel19)
                .addGap(18, 18, 18)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel21)
                .addGap(8, 8, 8)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel23)
                .addGap(9, 9, 9)
                .addComponent(jLabel24)
                .addContainerGap())
        );

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jMenuBar1, org.jdesktop.beansbinding.ELProperty.create("${background}"), jMenuBar1, org.jdesktop.beansbinding.BeanProperty.create("background"));
        bindingGroup.addBinding(binding);

        jMenu1.setText("Proyectos");
        jMenuBar1.add(jMenu1);

        jMenu3.setText("Tareas");

        jMenuItem4.setText("Asignar Tarea");
        jMenu3.add(jMenuItem4);

        jMenuItem7.setText("Actualizar estado de Tarea");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem7);

        jMenuItem12.setText("Registrar avance en Tarea");
        jMenu3.add(jMenuItem12);

        jMenuItem13.setText("Consultar tareas por Estado");
        jMenu3.add(jMenuItem13);

        jMenuItem14.setText("Consultar tareas por miembro del Equipo");
        jMenu3.add(jMenuItem14);

        jMenuBar1.add(jMenu3);

        jMenu2.setText("Miembros del Equipo");

        jMenuItem3.setText("Consultar miembros del Equipo");
        jMenu2.add(jMenuItem3);

        jMenuItem6.setText("Consultar información detallada de un Miembro");
        jMenu2.add(jMenuItem6);

        jMenuBar1.add(jMenu2);

        jmSalir.setText("Salir");
        jMenuBar1.add(jmSalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdEscritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdEscritorio, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem7ActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            try {
                UIManager.setLookAndFeel(new HiFiLookAndFeel());
            } catch (UnsupportedLookAndFeelException ex) {
                Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
            }
            new Menu().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JDesktopPane jdEscritorio;
    private javax.swing.JMenu jmSalir;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
