package exercicis.interficiechat;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPasswordField;
import org.bson.Document;
import org.bson.conversions.Bson;

/**
 *
 * @author Oleh Plechiy Tupis Andriyovech
 * @version 1.0
 */
public class Login extends javax.swing.JFrame {


    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        inicialitzarTextInputs();
        amagarInfoWarnings();
        inicialitzarInput();
        //mongoClient = new MongoClient("localhost", 27017);
        //database = mongoClient.getDatabase("Cuentas");
        //MongoCollection<Document> cuentasCollection = database.getCollection("comptes");

    }

    private void inicialitzarTextInputs() {
        this.usuariText.setPlaceHolder("Introdueix el nom de l'usuari");
        this.usuariText.setText(this.usuariText.getPlaceHolder());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        headerVista = new javax.swing.JPanel();
        titolVista = new javax.swing.JLabel();
        mainVista = new javax.swing.JPanel();
        etiquetaUsuari = new javax.swing.JLabel();
        etiquetaPassword = new javax.swing.JLabel();
        usuariText = new componentsPersonalitzats.JTextFieldPersonalitzat();
        inputPassword = new componentsPersonalitzats.JPasswordPlaceholder();
        footerVista = new javax.swing.JPanel();
        botoLogin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setBackground(new java.awt.Color(228, 178, 141));

        jPanel1.setBackground(new java.awt.Color(239, 210, 185));
        jPanel1.setLayout(new java.awt.BorderLayout());

        headerVista.setBackground(new java.awt.Color(203, 219, 242));

        titolVista.setFont(new java.awt.Font("Noto Sans", 0, 36)); // NOI18N
        titolVista.setText("Inicia sessió");
        headerVista.add(titolVista);

        jPanel1.add(headerVista, java.awt.BorderLayout.PAGE_START);

        mainVista.setBackground(new java.awt.Color(203, 219, 242));

        etiquetaUsuari.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N
        etiquetaUsuari.setText("Usuari");

        etiquetaPassword.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N
        etiquetaPassword.setText("Contrasenya");

        inputPassword.setToolTipText("");
        inputPassword.setEchoChar('\u0000');
        inputPassword.setFocusCycleRoot(true);

        javax.swing.GroupLayout mainVistaLayout = new javax.swing.GroupLayout(mainVista);
        mainVista.setLayout(mainVistaLayout);
        mainVistaLayout.setHorizontalGroup(
            mainVistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainVistaLayout.createSequentialGroup()
                .addContainerGap(210, Short.MAX_VALUE)
                .addGroup(mainVistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(usuariText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(etiquetaPassword)
                    .addComponent(etiquetaUsuari)
                    .addComponent(inputPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(119, 119, 119))
        );
        mainVistaLayout.setVerticalGroup(
            mainVistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainVistaLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(etiquetaUsuari)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usuariText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(etiquetaPassword)
                .addGap(18, 18, 18)
                .addComponent(inputPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        jPanel1.add(mainVista, java.awt.BorderLayout.CENTER);

        footerVista.setBackground(new java.awt.Color(203, 219, 242));

        botoLogin.setBackground(new java.awt.Color(125, 165, 221));
        botoLogin.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N
        botoLogin.setText("Login");
        botoLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botoLoginActionPerformed(evt);
            }
        });
        footerVista.add(botoLogin);

        jPanel1.add(footerVista, java.awt.BorderLayout.PAGE_END);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usuariTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuariTextActionPerformed
        this.usuariText.setFont(new java.awt.Font("Noto Sans", 0, 12));
    }//GEN-LAST:event_usuariTextActionPerformed

    private void loginButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginButtonMouseClicked

    }//GEN-LAST:event_loginButtonMouseClicked

    private void botoLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botoLoginActionPerformed
        final String URLCONNEXIO = "mongodb://localhost:27017";
        MongoClientURI uri = new MongoClientURI(URLCONNEXIO);

        try ( MongoClient mongoClient = new MongoClient(uri)) {
            String nomUsuari = this.usuariText.getText();
            //consultaActual(nomUsuari);
            MongoDatabase database = mongoClient.getDatabase("Cuentas");
            MongoCollection<Document> cuentasCollection = database.getCollection("comptes");

            long numUsuaris = cuentasCollection.countDocuments(Filters.eq("usuari", nomUsuari));

            if (numUsuaris > 0) {
                String password = tractarPassword(this.inputPassword);
                //long numContra = cuentasCollection.countDocuments(Filters.eq("contrasenya", password));
                long numContra = cuentasCollection.countDocuments(Filters.and(Filters.eq("usuari", nomUsuari),Filters.eq("contrasenya", password)));
                
                        //TODO: investigar alternativa a la consulta actual
                //FindIterable<Document> resultatUsuaris = cuentasCollection.find(Filters.eq("contrasenya", password));
                if(numContra > 0){
                    FindIterable<Document> resultatUsuaris = cuentasCollection.find(Filters.and(Filters.eq("usuari", nomUsuari),Filters.eq("contrasenya", password)));
                    for (Document infoUsuaris : resultatUsuaris) {
                        System.out.print("\nNom Usuari: " + infoUsuaris.getString("usuari"));
                        System.out.println("\nContrasenya usuari: " + infoUsuaris.getString("contrasenya"));
                    }
                } else {
                    System.out.println("Thy introduced password is nonexistent in our archives");
                }
            } else {
                System.out.println("El usuari que estas intentant introduir, no existeix en la nostra base de dades");
            }
            } catch (Exception e) {
                System.out.println("Hem entrat al error... \nREVISAR CODI...");
                e.printStackTrace();
            }
    }//GEN-LAST:event_botoLoginActionPerformed
    
    private void inicialitzarInput() {
        String psw = new String(this.inputPassword.getPassword());
        this.inputPassword.setPlaceHolder("Introdueix el nom...");
        this.inputPassword.setText(this.inputPassword.getPlaceHolder());
    }

    /**
     * Funcio obsoleta
     */
    /*private void consultaAntiga() {
        String password = new String(this.inputPassword.getPassword());

        MongoCollection<Document> cuentasCollection = database.getCollection("comptes");
        String username = usuariText.getText();

        Bson query = Filters.and(
                Filters.eq("usuari", username),
                Filters.eq("contrasenya", password)
        );
        Document result = cuentasCollection.find(query).first();

        if (result != null) {
            System.out.println("Success");
        } else {
            System.out.println("Failure");
        }
    }*/

    /**
     * Funcio obsoleta
     */
    /*private void consultaActual(String nomUsuari) {
        MongoDatabase database = mongoClient.getDatabase("Cuentas");
        MongoCollection<Document> cuentasCollection = database.getCollection("comptes");

        long numUsuaris = cuentasCollection.countDocuments(Filters.eq("usuari", nomUsuari));

        if (numUsuaris > 0) {
            String password = tractarPassword(this.inputPassword);
//            TODO: Revisar aquesta consulta ja que nomes estem buscant la contrasenya sense tenir en compte el usuari
            //FindIterable<Document> resultatUsuaris = cuentasCollection.find(Filters.eq("contrasenya", password));
            FindIterable<Document> resultatUsuaris = cuentasCollection.find(Filters.and(Filters.eq("usuari", nomUsuari),Filters.eq("contrasenya", password)));
            for (Document infoUsuaris : resultatUsuaris) {
                System.out.print("\nNom Usuari: " + infoUsuaris.getString("usuari"));
                System.out.println("\nContrasenya usuari: " + infoUsuaris.getString("contrasenya"));
            }
        } else {
            System.out.println("El usuari que estas intentant introduir, no existeix en la nostra base de dades");
        }
    }*/

    /**
     *
     */
    private String tractarPassword(JPasswordField jpe) {
        char[] arrayPassword = jpe.getPassword();

        String password = "";

        for (char msg : arrayPassword) {
            password += msg;
        }

        if (!password.isEmpty()) {
            return password;
        }
        return "";
    }

    private void amagarInfoWarnings() {
        //Logger mongoLogger = Logger.getLogger("org.mongodb.driver");
        Logger mongoLogger = Logger.getLogger( "org.mongodb.driver" );
        mongoLogger.setLevel(Level.SEVERE);
        mongoLogger.setUseParentHandlers(false);
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botoLogin;
    private javax.swing.JLabel etiquetaPassword;
    private javax.swing.JLabel etiquetaUsuari;
    private javax.swing.JPanel footerVista;
    private javax.swing.JPanel headerVista;
    private componentsPersonalitzats.JPasswordPlaceholder inputPassword;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel mainVista;
    private javax.swing.JLabel titolVista;
    private componentsPersonalitzats.JTextFieldPersonalitzat usuariText;
    // End of variables declaration//GEN-END:variables
}
