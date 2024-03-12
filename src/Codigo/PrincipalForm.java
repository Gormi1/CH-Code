/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codigo;

import java.awt.Color;
import java.awt.Image;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.StringReader;
import java.nio.file.Files;
import java.util.logging.Level;
import java.util.logging.Logger;
import java_cup.runtime.Symbol;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

/**
 *
 * @author Ramon Cheno y Jorge Cheno
 */
public final class PrincipalForm extends javax.swing.JFrame {

    /**
     * Creates new form PrincipalForm
     */
    JPanelDifumunado jpanelD;
    
    public PrincipalForm() {
        ActualizarArchivos actualizar = new ActualizarArchivos();
        try {
            actualizar.archivos();
        } catch (IOException ex) {
            Logger.getLogger(PrincipalForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(PrincipalForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        initComponents();
        iniciarComponentes();
        setIconImage(getIconImage());
        setLocationRelativeTo(null);
        
    }
    @Override
    public Image getIconImage(){
        
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.
                getSystemResource("Img/ch logo.png"));
        
        return retValue;
    }
    
    private int x = 0;
    private int y = 0;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelFondo = new javax.swing.JPanel();
        jpBarra_Titulo = new javax.swing.JPanel();
        JLTitulo = new javax.swing.JLabel();
        jPBotones = new javax.swing.JPanel();
        JBCerrar = new javax.swing.JButton();
        JBMinizarTamanio = new javax.swing.JButton();
        JBMinimizarVentana = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        JPrincipal = new javax.swing.JPanel();
        jlTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lexResult = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        input = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        sinResult = new javax.swing.JTextArea();
        JLSintatico = new javax.swing.JLabel();
        jlLexico = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnAbrir = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnAnalizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Analizador CH-CODE");
        setBackground(new java.awt.Color(0, 0, 0));
        setForeground(new java.awt.Color(0, 102, 102));
        setMinimumSize(new java.awt.Dimension(846, 436));
        setUndecorated(true);
        setSize(new java.awt.Dimension(846, 436));

        jPanelFondo.setBackground(new java.awt.Color(11, 13, 25));
        jPanelFondo.setToolTipText("");
        jPanelFondo.setMinimumSize(new java.awt.Dimension(846, 436));

        jpBarra_Titulo.setBackground(new java.awt.Color(40, 197, 212));
        jpBarra_Titulo.setFocusable(false);
        jpBarra_Titulo.setMinimumSize(new java.awt.Dimension(800, 33));
        jpBarra_Titulo.setName(""); // NOI18N
        jpBarra_Titulo.setPreferredSize(new java.awt.Dimension(800, 33));
        jpBarra_Titulo.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jpBarra_TituloMouseDragged(evt);
            }
        });
        jpBarra_Titulo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jpBarra_TituloMousePressed(evt);
            }
        });

        JLTitulo.setForeground(new java.awt.Color(0, 0, 0));
        JLTitulo.setText("Analizador CH-CODE");

        jPBotones.setOpaque(false);
        jPBotones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JBCerrar.setBackground(new java.awt.Color(255, 0, 0));
        JBCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/BotonCerrar.png"))); // NOI18N
        JBCerrar.setBorder(null);
        JBCerrar.setFocusable(false);
        JBCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JBCerrarMouseClicked(evt);
            }
        });
        jPBotones.add(JBCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, -1, -1));

        JBMinizarTamanio.setBackground(new java.awt.Color(40, 197, 212));
        JBMinizarTamanio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/BotonMinimizar.png"))); // NOI18N
        JBMinizarTamanio.setBorder(null);
        JBMinizarTamanio.setFocusable(false);
        JBMinizarTamanio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JBMinizarTamanioMouseClicked(evt);
            }
        });
        jPBotones.add(JBMinizarTamanio, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 24, 24));

        JBMinimizarVentana.setBackground(new java.awt.Color(40, 197, 212));
        JBMinimizarVentana.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/BotonMinimizarVentana.png"))); // NOI18N
        JBMinimizarVentana.setBorder(null);
        JBMinimizarVentana.setFocusable(false);
        JBMinimizarVentana.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JBMinimizarVentanaMouseClicked(evt);
            }
        });
        jPBotones.add(JBMinimizarVentana, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 24, 24));

        jLabel2.setBackground(new java.awt.Color(255, 0, 0));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/ch logo.png"))); // NOI18N

        javax.swing.GroupLayout jpBarra_TituloLayout = new javax.swing.GroupLayout(jpBarra_Titulo);
        jpBarra_Titulo.setLayout(jpBarra_TituloLayout);
        jpBarra_TituloLayout.setHorizontalGroup(
            jpBarra_TituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBarra_TituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(46, 46, 46)
                .addComponent(JLTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPBotones, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jpBarra_TituloLayout.setVerticalGroup(
            jpBarra_TituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBarra_TituloLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpBarra_TituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(3, Short.MAX_VALUE))
        );

        jlTitulo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jlTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jlTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlTitulo.setText("ANALIZADOR CH-CODE");

        lexResult.setEditable(false);
        lexResult.setBackground(new java.awt.Color(79, 93, 94));
        lexResult.setColumns(20);
        lexResult.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lexResult.setForeground(new java.awt.Color(255, 255, 255));
        lexResult.setRows(5);
        lexResult.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(58, 66, 68), 4, true));
        jScrollPane1.setViewportView(lexResult);

        input.setBackground(new java.awt.Color(79, 93, 94));
        input.setColumns(20);
        input.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        input.setForeground(new java.awt.Color(255, 255, 255));
        input.setRows(5);
        input.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(58, 66, 68), 4, true));
        jScrollPane2.setViewportView(input);

        sinResult.setEditable(false);
        sinResult.setBackground(new java.awt.Color(79, 93, 94));
        sinResult.setColumns(20);
        sinResult.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        sinResult.setForeground(new java.awt.Color(255, 255, 255));
        sinResult.setRows(5);
        sinResult.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(58, 66, 68), 4, true));
        jScrollPane3.setViewportView(sinResult);

        JLSintatico.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        JLSintatico.setForeground(new java.awt.Color(255, 255, 255));
        JLSintatico.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLSintatico.setText("SINTATICO");

        jlLexico.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jlLexico.setForeground(new java.awt.Color(255, 255, 255));
        jlLexico.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlLexico.setText("LEXICO");

        jPanel1.setOpaque(false);

        btnAbrir.setBackground(new java.awt.Color(40, 64, 100));
        btnAbrir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/open.png"))); // NOI18N
        btnAbrir.setText("Abrir Archivo");
        btnAbrir.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(40, 64, 100), 4, true));
        btnAbrir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirActionPerformed(evt);
            }
        });

        btnLimpiar.setBackground(new java.awt.Color(40, 64, 100));
        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Limpiar.png"))); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(40, 64, 100), 4, true));
        btnLimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnAnalizar.setBackground(new java.awt.Color(40, 64, 100));
        btnAnalizar.setText("Analizar");
        btnAnalizar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(40, 64, 100), 4, true));
        btnAnalizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAnalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnalizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(btnAnalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(111, 111, 111)
                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(111, 111, 111)
                .addComponent(btnAbrir, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAnalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAbrir))
                .addGap(10, 10, 10))
        );

        javax.swing.GroupLayout JPrincipalLayout = new javax.swing.GroupLayout(JPrincipal);
        JPrincipal.setLayout(JPrincipalLayout);
        JPrincipalLayout.setHorizontalGroup(
            JPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPrincipalLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(JPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPrincipalLayout.createSequentialGroup()
                        .addGroup(JPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JPrincipalLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jlLexico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(140, 140, 140))
                            .addGroup(JPrincipalLayout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addGap(81, 81, 81)))
                        .addGroup(JPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JLSintatico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(JPrincipalLayout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addGap(38, 38, 38))))
                    .addComponent(jlTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(68, 68, 68))
        );
        JPrincipalLayout.setVerticalGroup(
            JPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPrincipalLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jlTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(JPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlLexico)
                    .addComponent(JLSintatico))
                .addGap(18, 18, 18)
                .addGroup(JPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                    .addComponent(jScrollPane3))
                .addGap(54, 54, 54))
        );

        javax.swing.GroupLayout jPanelFondoLayout = new javax.swing.GroupLayout(jPanelFondo);
        jPanelFondo.setLayout(jPanelFondoLayout);
        jPanelFondoLayout.setHorizontalGroup(
            jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpBarra_Titulo, javax.swing.GroupLayout.DEFAULT_SIZE, 943, Short.MAX_VALUE)
            .addComponent(JPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelFondoLayout.setVerticalGroup(
            jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFondoLayout.createSequentialGroup()
                .addComponent(jpBarra_Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(JPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jpBarra_TituloMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpBarra_TituloMousePressed
        // TODO add your handling code here:
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_jpBarra_TituloMousePressed

    private void jpBarra_TituloMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpBarra_TituloMouseDragged
        // TODO add your handling code here:
        Point ubicacion = MouseInfo.getPointerInfo().getLocation();
        //System.out.println("Coordenadas: (" + ubicacion.x +","+ ubicacion.y + ")");
        setLocation(ubicacion.x - x, ubicacion.y - y);
    }//GEN-LAST:event_jpBarra_TituloMouseDragged

    private void JBCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBCerrarMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_JBCerrarMouseClicked

    private void JBMinimizarVentanaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBMinimizarVentanaMouseClicked
        // TODO add your handling code here:
        setExtendedState(ICONIFIED);
    }//GEN-LAST:event_JBMinimizarVentanaMouseClicked

    private void JBMinizarTamanioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBMinizarTamanioMouseClicked
        // TODO add your handling code here:
        restaurarVentana();
    }//GEN-LAST:event_JBMinizarTamanioMouseClicked

    private void btnAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File archivo = new File(chooser.getSelectedFile().getAbsolutePath());
        
        try {
            String ST = new String(Files.readAllBytes(archivo.toPath()));
            input.setText(ST);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PrincipalForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(PrincipalForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAbrirActionPerformed

    private void btnAnalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnalizarActionPerformed
        try {
            // TODO add your handling code here:
            lexAnalizer();
        } catch (IOException ex) {
            Logger.getLogger(PrincipalForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        sinAnalizer();
    }//GEN-LAST:event_btnAnalizarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
       sinResult.setText(null);
       lexResult.setText(null);
       input.setText(null);
    }//GEN-LAST:event_btnLimpiarActionPerformed
    public void iniciarComponentes(){
        Color negro = new Color(11, 13, 25);
        Color azul = new Color(51, 81, 115);
        jpanelD = new JPanelDifumunado();
        jpanelD.pintarPanel(negro, azul);
        jpanelD.tamañoPanel(32767, 32767);
        JPrincipal.add(jpanelD);
    }
    
    private void restaurarVentana(){
        if (getExtendedState() == JFrame.MAXIMIZED_BOTH) { 
            setExtendedState(JFrame.NORMAL); }
        else{ setExtendedState(JFrame.MAXIMIZED_BOTH); }
    }
    
    private void sinAnalizer(){
        String ST = input.getText();
        Sintax s = new Sintax(new Codigo.LexerCup(new StringReader(ST)));
        try {
            s.parse();
            sinResult.setText("Analisis realizado correctamente");
            sinResult.setForeground(new Color(119, 221, 119));
        } catch (Exception ex) {
            Symbol sym = s.getS();
            sinResult.setText("Error de sintaxis. Linea: " + (sym.right + 1) + " Columna: " + (sym.left + 1) + ", Texto: \"" + sym.value + "\"");
            sinResult.setForeground(new Color(248, 129, 146));
        }
    }
    
    Lexer lexer;
    int cont;
    private void lexAnalizer() throws IOException{
        cont = 1;
        
        String expr = (String) input.getText();
        lexer = new Lexer(new StringReader(expr));
        String resultado = "LINEA " + cont + "\t\tSIMBOLO\n";
        
        while (true) {
            Tokens token = lexer.yylex();
            if (token == null) {
                lexResult.setText(resultado);
                return;
            }
            
            resultado = lexico(token, resultado);
        }
    }
    private String lexico(Tokens token, String resultado){
        switch (token) {
                case Linea -> {
                    cont++;
                    resultado += "Linea " + cont + "\n";
                }
                case Suma -> resultado += " < Operador Suma>\t" + lexer.lexeme + "\n";
                case Resta -> resultado += " < Operador Resta>\t" + lexer.lexeme + "\n";
                case Multiplicacion -> resultado += " < Operador Multiplicacion>\t" + lexer.lexeme + "\n";
                case Division -> resultado += " < Operador Division>\t" + lexer.lexeme + "\n";
                case Op_Logicos -> resultado += " < Operador logicos>\t" + lexer.lexeme + "\n";
                case Op_Asignacion -> resultado += " < Operador de Asignacion>\t" + lexer.lexeme + "\n";
                case Op_Incremento -> resultado += " < Operador de incremento y decremento>\t" + lexer.lexeme + "\n";
                case Asignacion -> resultado += " < Asignacion>\t\t" + lexer.lexeme + "\n";
                case Op_Relacional -> resultado += " < Operado Relacional>\t" + lexer.lexeme + "\n";
                case Valor_Booleano -> resultado += " < Valores booleanos>\t" + lexer.lexeme + "\n";
                case Parentesis_a -> resultado += " < Parentesis de Apertura>\t" + lexer.lexeme + "\n";
                case Parentesis_c -> resultado += "< Parentesis de cierre>\t" + lexer.lexeme + "\n";
                case Llave_a -> resultado += "< Llave de apertura>\t" + lexer.lexeme + "\n";
                case Llave_c -> resultado += "< Llave de cierre>\t" + lexer.lexeme + "\n";
                case Corchete_a -> resultado += "< Corchete de apertura>\t" + lexer.lexeme + "\n";
                case Corchete_c -> resultado += "< Corchete de cierre>\t" + lexer.lexeme + "\n";
                case Punto_coma -> resultado += "< Punto y coma>\t" + lexer.lexeme + "\n";
                case Dos_puntos -> resultado += "< Doble Puntos>\t" + lexer.lexeme + "\n";
                case Coma -> resultado += "< Coma>\t" + lexer.lexeme + "\n";
                case Punto -> resultado += "< Termino de una linea>\t" + lexer.lexeme + "\n";
                case Doble_comillas -> resultado += "< Doble Comillas>\t" + lexer.lexeme + "\n";
                case Comilla_simple -> resultado += "< Comilla Simple>\t" + lexer.lexeme + "\n";
                case Hacer -> resultado += "< Reservada Hacer>\t" + lexer.lexeme + "\n";
                case Identificador -> resultado += "< Identificador>\t" + lexer.lexeme + "\n";
                case Modulo -> resultado += "< Operador Modulo>\t" + lexer.lexeme + "\n";
                case Potencia -> resultado += "< Operador Potencia>\t" + lexer.lexeme + "\n";
                case Mientras -> resultado += "< Reservada hacer>\t" + lexer.lexeme + "\n";
                case Para -> resultado += "< Reservada para>\t" + lexer.lexeme + "\n";
                case Si -> resultado += "< Reservada Si>\t" + lexer.lexeme + "\n";
                case Entc -> resultado += "< Reservada Entc>\t" + lexer.lexeme + "\n";
                case Selec -> resultado += "< Reservada Selec>\t" + lexer.lexeme + "\n";
                case Caso -> resultado += "< Reservada Caso>\t" + lexer.lexeme + "\n";
                case Predet -> resultado += "< Reservada Predet>\t" + lexer.lexeme + "\n";
                case Romper -> resultado += "< Reservada Romper>\t" + lexer.lexeme + "\n";
                case Publico -> resultado += "< Reservada Publico>\t" + lexer.lexeme + "\n";
                case Clase -> resultado += "< Reservada Clase>\t" + lexer.lexeme + "\n";
                case Estatico -> resultado += "< Reservada Estatico>\t" + lexer.lexeme + "\n";
                case Vacio -> resultado += "< Reservada Vacio>\t" + lexer.lexeme + "\n";
                case Ejecutar -> resultado += "< Reservada Ejecutar>\t" + lexer.lexeme + "\n";
                case tipo_Dato -> resultado += "< Tipo de datos>\t" + lexer.lexeme + "\n";
                case Valor_Decimal -> resultado += "< Valores decimal y flotante>\t" + lexer.lexeme + "\n";
                case Numero_Entero -> resultado += "< Numero Entero>\t" + lexer.lexeme + " \n";
                case Numero_Real -> resultado += "< Numero Real>\t" + lexer.lexeme + " \n";
                case Caracter -> resultado += "< Caracter>\t\t" + lexer.lexeme + "\n";
                case Cadena -> resultado += "< Cadena>\t\t" + lexer.lexeme + "\n";
                case ERROR -> resultado += "< Error Lexico. Simbolo no identificado>\n";
                default -> resultado += "<" + lexer.lexeme + ">\n";
            }
            return resultado;
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new PrincipalForm().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBCerrar;
    private javax.swing.JButton JBMinimizarVentana;
    private javax.swing.JButton JBMinizarTamanio;
    private javax.swing.JLabel JLSintatico;
    private javax.swing.JLabel JLTitulo;
    private javax.swing.JPanel JPrincipal;
    private javax.swing.JButton btnAbrir;
    private javax.swing.JButton btnAnalizar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JTextArea input;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPBotones;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelFondo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel jlLexico;
    private javax.swing.JLabel jlTitulo;
    private javax.swing.JPanel jpBarra_Titulo;
    private javax.swing.JTextArea lexResult;
    private javax.swing.JTextArea sinResult;
    // End of variables declaration//GEN-END:variables
}
