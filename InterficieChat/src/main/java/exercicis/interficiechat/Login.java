package exercicis.interficiechat;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import java.awt.Dimension;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import org.bson.Document;

/**
 *
 * @author Oleh Plechiy Tupis Andriyovech i David Boix Sanchez
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
        //this.setExtendedState(MAXIMIZED_BOTH);
        this.setMinimumSize(new Dimension(300, 300));

        //mongoClient = new MongoClient("localhost", 27017);
        //database = mongoClient.getDatabase("Cuentas");
        //MongoCollection<Document> cuentasCollection = database.getCollection("comptes");
    }

    /**
     * Posa un placeholder al text input del nom d'usuari
     */
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
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        headerVista = new javax.swing.JPanel();
        titolVista = new javax.swing.JLabel();
        mainVista = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        etiquetaPassword = new javax.swing.JLabel();
        inputPassword = new componentsPersonalitzats.JPasswordPlaceholder();
        etiquetaUsuari = new javax.swing.JLabel();
        usuariText = new componentsPersonalitzats.JTextFieldPersonalitzat();
        jPanel3 = new javax.swing.JPanel();
        footerVista = new javax.swing.JPanel();
        botoLogin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setBackground(new java.awt.Color(228, 178, 141));

        jPanel1.setBackground(new java.awt.Color(239, 210, 185));
        jPanel1.setLayout(new java.awt.BorderLayout());

        headerVista.setBackground(new java.awt.Color(203, 219, 242));
        headerVista.setToolTipText("Espai del titol");

        titolVista.setFont(new java.awt.Font("Noto Sans", 0, 36)); // NOI18N
        titolVista.setText("Inicia sessió");
        titolVista.setToolTipText("Titol del inici de sessio");
        headerVista.add(titolVista);

        jPanel1.add(headerVista, java.awt.BorderLayout.PAGE_START);

        mainVista.setBackground(new java.awt.Color(203, 219, 242));
        mainVista.setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(new java.awt.Color(203, 219, 242));
        jPanel2.setToolTipText("Espai d'introducció d'informació");
        jPanel2.setPreferredSize(new java.awt.Dimension(434, 100));
        jPanel2.setLayout(new java.awt.GridBagLayout());

        etiquetaPassword.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        etiquetaPassword.setText("Contrasenya");
        etiquetaPassword.setToolTipText("Contrasenya");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        jPanel2.add(etiquetaPassword, gridBagConstraints);

        inputPassword.setToolTipText("Contrasenya de l'usuari");
        inputPassword.setEchoChar('\u0000');
        inputPassword.setFocusCycleRoot(true);
        inputPassword.setPreferredSize(new java.awt.Dimension(200, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 0);
        jPanel2.add(inputPassword, gridBagConstraints);

        etiquetaUsuari.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        etiquetaUsuari.setText("Usuari");
        etiquetaUsuari.setToolTipText("Usuari");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel2.add(etiquetaUsuari, gridBagConstraints);

        usuariText.setToolTipText("Nom de l'usuari");
        usuariText.setPreferredSize(new java.awt.Dimension(200, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 0);
        jPanel2.add(usuariText, gridBagConstraints);

        mainVista.add(jPanel2, java.awt.BorderLayout.CENTER);

        jPanel3.setBackground(new java.awt.Color(203, 219, 242));
        mainVista.add(jPanel3, java.awt.BorderLayout.PAGE_START);

        jPanel1.add(mainVista, java.awt.BorderLayout.CENTER);

        footerVista.setBackground(new java.awt.Color(203, 219, 242));
        footerVista.setToolTipText("Espai del boto de login");

        botoLogin.setBackground(new java.awt.Color(125, 165, 221));
        botoLogin.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N
        botoLogin.setText("Login");
        botoLogin.setToolTipText("Boto del login");
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

    }//GEN-LAST:event_usuariTextActionPerformed

    private void loginButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginButtonMouseClicked

    }//GEN-LAST:event_loginButtonMouseClicked
    /**
     * Comprova si l'usuari i la contrasenya d'usuari són les mateixes que hi ha
     * a la base de dades del mongo, i et diu si l'usuari no existeix, si la
     * contrasenya es incorrecta, i si tot està bé et deixa passar
     *
     * @param evt
     */
    private void botoLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botoLoginActionPerformed
        String passwordEncriptada = null;
        final String DB_SRV_USR = "grup1";
        final String DB_SRV_PWD = "gat123";
        final String DB_URL = "57.129.5.24";
        final String DB_PORT = "27017";
        String URLCONNEXIO = "mongodb://" + DB_SRV_USR + ":" + DB_SRV_PWD + "@" + DB_URL + ":" + DB_PORT;

        MongoClientURI uri = new MongoClientURI(URLCONNEXIO);

        try ( MongoClient mongoClient = new MongoClient(uri)) {
            String nomUsuari = this.usuariText.getText();
            MongoDatabase database = mongoClient.getDatabase(DB_SRV_USR);
            MongoCollection<Document> cuentasCollection = database.getCollection("comptes");

            long numUsuaris = cuentasCollection.countDocuments(Filters.eq("nomUser", nomUsuari));

            if (numUsuaris > 0) {

                String password = tractarPassword(this.inputPassword);
                boolean isTrue = searchPassword(this.usuariText.getText(), password);

                if (isTrue) {
                    /**
                     * TODO: Revisar el funcionament de aquesta funcio ja que no
                     * sabem si ho estem fent correctament i ens ha donat
                     * problemes.
                     */
                    passwordEncriptada = getPassword(nomUsuari);

                    /**
                     * TODO: Revisar aquesta proposta de solucio Ho podem borrar
                     * ja que no ho fem servir JAJA.
                     */
                    //long numContra = cuentasCollection.countDocuments(Filters.eq("contrasenya", password));
                    //TODO: Consulta realitzada incorrectament i per tant ho podem borrar mes endavant.
                    //long numContra = cuentasCollection.countDocuments(Filters.and(Filters.eq("nomUser", nomUsuari), Filters.eq("contrasenyaUsuari", password)));
                    long numContra = cuentasCollection.countDocuments(Filters.and(Filters.eq("nomUser", nomUsuari), Filters.eq("contrasenyaUsuari", passwordEncriptada)));

                    if (numContra > 0 && passwordEncriptada != null) {
                        /**
                         * TODO: Mes endavant, haurem de borrar les dades que es
                         * mostren per pantalla, incluida la consulta que estem
                         * realitzant degut a que es innecessari i nomes ho
                         * estem fent servir per poder assegurar-nos de que les
                         * dades son correctes.
                         */
                        //TODO: Borrar consulta ja que ho estem fent malament.
                        //FindIterable<Document> resultatUsuaris = cuentasCollection.find(Filters.and(Filters.eq("nomUser", nomUsuari), Filters.eq("contrasenyaUsuari", password)));
                        FindIterable<Document> resultatUsuaris = cuentasCollection.find(Filters.and(Filters.eq("nomUser", nomUsuari), Filters.eq("contrasenyaUsuari", passwordEncriptada)));
                        for (Document infoUsuaris : resultatUsuaris) {
                            System.out.print("\nNom Usuari: " + infoUsuaris.getString("nomUser"));
                            System.out.println("\nContrasenya usuari: " + infoUsuaris.getString("contrasenyaUsuari"));
                        }
                        this.mostrarInterficieXat();
                    } else {
                        /**
                         * TODO: Mostrar en un JOptionPane el seguent error per
                         * tal de que el usuari client pugui saber que esta
                         * passant i pugui solucionar la incidencia ell mateix
                         * ja que es un problema extern que no podem controlar
                         * com a programadors.
                         */
                        JOptionPane jop = new JOptionPane();

                        String[] opcions = {"Acceptar"};

                        jop.showOptionDialog(
                                null,
                                "El usuari o contrasenya es incorrecta!",
                                "Dades erronees",
                                jop.DEFAULT_OPTION,
                                jop.WARNING_MESSAGE,
                                null,
                                opcions,
                                opcions[0]
                        );

                    }
                } else {
                    /**
                     * TODO: Hem de mostrar un JOptionPane amb el seguent
                     * missatge per informar al usuari que esta passant en
                     * aquell moment i per tant tenir-lo informat en tot moment
                     * de que esta passant.
                     */
                    JOptionPane jop = new JOptionPane();
                    Icon imagenLabel = new ImageIcon("src\\main\\java\\img\\passwordErroni.png");
                    String[] opcions = {"Acceptar"};

                    jop.showOptionDialog(
                            null,
                            "La contrasenya no es correcta.",
                            "La contrasenya es erronea",
                            jop.DEFAULT_OPTION,
                            jop.WARNING_MESSAGE,
                            imagenLabel,
                            opcions,
                            opcions[0]
                    );

                }

            } else {
                /**
                 * TODO: Printar en un JOptionPane el seguent missatge per poder
                 * informar al usuari del error el qual s'esta produint i per
                 * tant el erroni funcionament de la nostra aplicacio.
                 */
                JOptionPane jop = new JOptionPane();
                Icon imagenLabel = new ImageIcon("src\\main\\java\\img\\usuariInexistent.png");
                String[] opcions = {"Acceptar"};

                jop.showOptionDialog(
                        null,
                        "El usuari que estas intentant introduir, no existeix en la nostra base de dades",
                        "Nom d'usuari erroni",
                        jop.DEFAULT_OPTION,
                        jop.WARNING_MESSAGE,
                        imagenLabel,
                        opcions,
                        opcions[0]
                );

            }
        } catch (Exception e) {
            System.out.println("Hem entrat al error... \nREVISAR CODI...");
            e.printStackTrace();
        }
    }//GEN-LAST:event_botoLoginActionPerformed
    /**
     * Funcio creada per poder inicialitzar els diferents inputs de la nostra
     * interficie grafica i que,d'aquesta manera, el usuari pugui saber quin
     * tipus de dades ha de introduir en els diferents components que podra
     * utilitzar per poder iniciar sessio.
     */
    private void inicialitzarInput() {
        String psw = new String(this.inputPassword.getPassword());
        this.inputPassword.setPlaceHolder("Introdueix el nom...");
        this.inputPassword.setText(this.inputPassword.getPlaceHolder());
    }

    /**
     * Funcio la qual buscara la contrasenya del nom d'usuari que se li passi
     * com a paràmetre
     *
     * @param nomUsuari
     * @return La contrasenya de l'usuari
     */
    public String getPassword(String nomUsuari) {
        String password = "";
        final String DB_SRV_USR = "grup1";
        final String DB_SRV_PWD = "gat123";
        final String DB_URL = "57.129.5.24";
        final String DB_PORT = "27017";
        String URLCONNEXIO = "mongodb://" + DB_SRV_USR + ":" + DB_SRV_PWD + "@" + DB_URL + ":" + DB_PORT;

        MongoClientURI uri = new MongoClientURI(URLCONNEXIO);
        try ( MongoClient mongoClient = new MongoClient(uri)) {
            MongoDatabase database = mongoClient.getDatabase(DB_SRV_USR);
            MongoCollection<Document> comptes = database.getCollection("comptes");

            long numUsuari = comptes.countDocuments(Filters.eq("nomUser", nomUsuari));
            if (numUsuari > 0) {
                FindIterable<Document> resultatUsuaris = comptes.find(Filters.eq("nomUser", nomUsuari));
                for (Document row : resultatUsuaris) {
                    password = row.getString("contrasenyaUsuari");
                }

                if (!password.isEmpty()) {
                    return password;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return password;
    }

    /**
     * TODO: Hem de revisar la funcio ja que en aquest moment no estem comparant
     * de la manera mes idonea les contrasenyes i per tant no ho estem fent be
     *
     * Funcio la qual compare si la contrasenya encriptada introduida es igual a
     * la que està a la base de dades
     *
     *
     * @param searchPassword
     * @return true si les contrasenyes encriptades son iguals, si no ho son,
     * returna fals i per tant, arribariem a la conclusio de que les
     * contrasenyes NO son iguals
     */
    private boolean searchPassword(String nomUsuari, String searchPassword) {

        String password = getPassword(nomUsuari);

        try {
            /**
             * TODO: Codi de exemple per encriptar la password
             */
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] b2 = searchPassword.getBytes();
            md.update(b2);
            byte[] resum2 = md.digest();
            String base64String = Base64.getEncoder().encodeToString(resum2);
            if (password.equalsIgnoreCase(base64String)) {
                /**
                 * TODO: Hem de treure aquest missatge de consola per poder
                 * continuar amb la desenvolupacio del programa.
                 */
                System.out.println("La contrasenya es la mateixa!");
                return true;
            } else {
                /**
                 * TODO: Podem treure aquest else ja que no ens fa falta, nomes
                 * deixant el return false en tindriam suficient, pero en aquest
                 * moment ho fem aixi per poder veure si entra en el else o no.
                 */
                System.out.println("La contrasenya es diferent!");
                return false;
            }
        } catch (NoSuchAlgorithmException nsae) {
            System.out.println("Error encriptacio");
        }

        return false;

//      todo: 1.hauras de agafar la password que esta encriptada del mongodb tal qual,
//      2.agafaras la password del JPasswordField
//      3.encriptaras la password
//      4.compararas la password encriptada que has agafat del mongo amb la que has encriptat del JPasswordField
//        if (Arrays.equals(resum, resum2)) {
//            System.out.println("Les contrasenyes son iguasl");
//        } else {
//            System.out.println("Diferents!");
//        }
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
     * Converteix la password de char a String per a poder treballar més
     * facilment amb ella
     *
     * @param jpe
     * @return Password convertida a string
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

    /**
     * Amague els missatges del mongoDB que surten a la consola quan fas anar
     * l'aplicació
     */
    private void amagarInfoWarnings() {
        Logger mongoLogger = Logger.getLogger("org.mongodb.driver");
        mongoLogger.setLevel(Level.WARNING);
        mongoLogger.setUseParentHandlers(false);
    }

    /**
     * Funcio creada per poder mostrar la interficie grafica creada quan el
     * usuari hagui realitzat el login correctament sense cap mena de error.
     */
    private void mostrarInterficieXat() {
        this.setVisible(false);
        InterficieXat ix = new InterficieXat();
        ix.setVisible(true);
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel mainVista;
    private javax.swing.JLabel titolVista;
    private componentsPersonalitzats.JTextFieldPersonalitzat usuariText;
    // End of variables declaration//GEN-END:variables
}
