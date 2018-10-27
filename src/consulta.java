
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;

import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;

public class consulta extends javax.swing.JFrame implements ActionListener{

    public consulta() {   
        initComponents(); 
    }

    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cbPaises = new javax.swing.JComboBox<>();
        cbCapitales = new javax.swing.JComboBox<>();
        lblSuperficie = new javax.swing.JLabel();
        jlImagen = new javax.swing.JLabel();
        cbtamano = new javax.swing.JComboBox<>();
        lblcolores = new javax.swing.JLabel();
        lblLimites = new javax.swing.JLabel();
        lblTranslim = new javax.swing.JLabel();
        labeltamano = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(0, 153, 102));

        jLabel1.setFont(new java.awt.Font("Rockwell", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("<html>Países de Sudamérica<html>");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/sud.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addContainerGap(124, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Myriad Pro", 0, 18)); // NOI18N
        jLabel2.setText("País :");

        jLabel3.setFont(new java.awt.Font("Myriad Pro", 0, 18)); // NOI18N
        jLabel3.setText("Capital :");

        jLabel4.setFont(new java.awt.Font("Myriad Pro", 0, 18)); // NOI18N
        jLabel4.setText("Su superficie es:");

        cbPaises.setFont(new java.awt.Font("Myriad Pro", 0, 18)); // NOI18N
        cbPaises.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar País", "Argentina", "Bolivia", "Brasil", "Chile", "Colombia", "Ecuador", "Guyana", "Guyana Francesa", "Paraguay", "Peru", "Suriname", "Uruguay", "Venezuela" }));
        cbPaises.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbPaisesItemStateChanged(evt);
            }
        });
        cbPaises.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPaisesActionPerformed(evt);
            }
        });

        cbCapitales.setFont(new java.awt.Font("Myriad Pro", 0, 18)); // NOI18N
        cbCapitales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCapitalesActionPerformed(evt);
            }
        });

        lblSuperficie.setFont(new java.awt.Font("Myriad Pro", 0, 18)); // NOI18N
        lblSuperficie.setText("-------------------------------");
        lblSuperficie.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                lblSuperficieAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jlImagen.setBackground(new java.awt.Color(0, 51, 51));
        jlImagen.setForeground(new java.awt.Color(51, 0, 51));

        cbtamano.setFont(new java.awt.Font("Myriad Pro", 0, 18)); // NOI18N
        cbtamano.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Países Pequeños", "Países Medianos", "Países Grandes" }));
        cbtamano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbtamanoActionPerformed(evt);
            }
        });

        lblcolores.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        lblcolores.setForeground(new java.awt.Color(69, 19, 69));
        lblcolores.setText("---------------------------------------------------------------------------");

        lblLimites.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        lblLimites.setForeground(new java.awt.Color(27, 66, 30));
        lblLimites.setText("<html>Límites :<html>");

        lblTranslim.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        lblTranslim.setForeground(new java.awt.Color(14, 17, 69));
        lblTranslim.setText("<html>Translímites :<html>");

        labeltamano.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        labeltamano.setForeground(new java.awt.Color(71, 37, 10));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSuperficie, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbCapitales, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbPaises, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblLimites, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTranslim, javax.swing.GroupLayout.DEFAULT_SIZE, 371, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jlImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 576, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labeltamano, javax.swing.GroupLayout.PREFERRED_SIZE, 585, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblcolores, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbtamano, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(40, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(cbPaises, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(68, 68, 68)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cbCapitales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(61, 61, 61)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(lblSuperficie))
                        .addGap(42, 42, 42)
                        .addComponent(lblLimites, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jlImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(lblcolores, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cbtamano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(labeltamano, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblTranslim, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void cbPaisesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPaisesActionPerformed
        
            double suArg = 2780400;
            double suBol = 1098581;
            double suBra = 8515767;
            double suChi = 756096;
            double suCol = 1141748;
            double suEcu = 256370;
            double suGuy = 214970;
            double suGFr = 83534;
            double suPar = 406752;
            double suPer = 1285216;
            double suSur = 163821;
            double suUru = 176215;
            double suVen = 916445;
        
        
       if(evt.getSource() == cbPaises){
           
           JComboBox cb = (JComboBox)evt.getSource();
            
            String msg = (String)cb.getSelectedItem();
            switch (msg){
            case "Argentina": lblSuperficie.setText(suArg + " km");
                break;
            case "Bolivia": lblSuperficie.setText(suBol + " km");
                break;
            case "Brasil": lblSuperficie.setText(suBra + " km");
                break;
            case "Chile": lblSuperficie.setText(suChi + " km");
                break;
            case "Colombia": lblSuperficie.setText(suCol + " km");
                break;
            case "Ecuador": lblSuperficie.setText(suEcu + " km");
                break;
            case "Guyana": lblSuperficie.setText(suGuy + " km");
                break;
            case "Guyana Francesa": lblSuperficie.setText(suGFr + " km");
                break;
            case "Paraguay": lblSuperficie.setText(suPar + " km");
                break;
            case "Peru": lblSuperficie.setText(suPer + " km");
                break;
            case "Suriname": lblSuperficie.setText(suSur + " km");
                break;
            case "Uruguay": lblSuperficie.setText(suUru + " km");
                break;
            case "Venezuela": lblSuperficie.setText(suVen + " km");
                break;
            }
            
       if(evt.getSource() == cbPaises){
           
           JComboBox color = (JComboBox)evt.getSource();
            
            String men = (String)color.getSelectedItem();
            switch (men){
            case "Argentina": lblcolores.setText("<html>Los colores de su bandera son: Celeste, Blanco y Oro<html>");
                break;
            case "Bolivia": lblcolores.setText("<html>Los colores de su bandera son: Verde, Amarillo y Rojo<html>");
                break;
            case "Brasil": lblcolores.setText("<html>Los colores de su bandera son: Verde, Amarillo, Azul y Blanco<html>");
                break;
            case "Chile": lblcolores.setText("<html>Los colores de su bandera son: Blanco, Rojo y Azul Turqui<html>");
                break;
            case "Colombia": lblcolores.setText("<html>Los colores de su bandera son: Amarillo, Azul y Rojo<html>");
                break;
            case "Ecuador": lblcolores.setText("<html>Los colores de su bandera son: Amarillo, Azul y Rojo<html>");
                break;
            case "Guyana": lblcolores.setText("<html>Los colores de su bandera son: Rojo,Negro, Amarillo, Blanco y Verde<html>");
                break;
            case "Guyana Francesa": lblcolores.setText("<html>Los colores de su bandera son: Amarillo, Rojo y Verde<html>");
                break;
            case "Paraguay": lblcolores.setText("<html>Los colores de su bandera son: Rojo, Blanco y Azul<html>");
                break;
            case "Peru": lblcolores.setText("<html>Los colores de su bandera son: Rojo y Blanco<html>");
                break;
            case "Suriname": lblcolores.setText("<html>Los colores de su bandera son: Verde, Blanco, Amarillo y Rojo<html>");
                break;
            case "Uruguay": lblcolores.setText("<html>Los colores de su bandera son: Amarillo, Blanco y Azul<html>");
                break;
            case "Venezuela": lblcolores.setText("<html>Los colores de su bandera son: Amarillo, Azul, Rojo y Blanco<html>");
                break;
            }
       } 
       
       if(evt.getSource() == cbPaises){
           
           JComboBox limites = (JComboBox)evt.getSource();
            
            String lim = (String)limites.getSelectedItem();
            switch (lim){
            case "Argentina": lblLimites.setText("<html>Sus Paises Limitrofes son:<p>Norte : Bolivia y Paraguay<p>Sur : Chile y Océano Atlantico Sur<p>Este : Brasil, Uruguay y Océano Atlantico Sur<p>Oeste : Chile<html>");
                break;
            case "Bolivia": lblLimites.setText("<html>Sus Paises Limitrofes son:<p>Norte y Este : Brasil<p>Sur : Argentina <p>Oeste : Perú<p>Sudoeste : Paraguay<p>Sudoeste : Chile<html>");
                break;
            case "Brasil": lblLimites.setText("<html>Sus Paises Limitrofes son:<p>Norte : Venexuela, Guyana, Surinam y la <p>Guyana Francesa<p>Sur : Paraguay, Argentina y Ururguay<p>Este : Océano Atlántico<p>Oeste : Perú y Bolivia<p>NorOeste : Colombia<html>");
                break;
            case "Chile": lblLimites.setText("<html>Sus Paises Limitrofes son:<p>Norte : Perú y Bolivia<p>Sur : Océano Glaciar Antártico<p>Este : Argentina<p>Noreste : Bolivia<p>Oeste : Océano Pacífico<html>");
                break;
            case "Colombia": lblLimites.setText("<html>Sus Paises Limitrofes son:<p>Norte : Océano Atlántico <p>Noreste : Venezuela<p>Sur : Perú<p>Suroeste : Ecuador<p>Sureste : Brasil<p>Oeste : Océano Pacífico<html>");
                break;
            case "Ecuador": lblLimites.setText("<html>Sus Paises Limitrofes son:<p>Norte : Colombia<p>Sur : Perú<p>Este : Perú<p>Oeste : Océano Pacífico<html>");
                break;
            case "Guyana": lblLimites.setText("<html>Sus Paises Limitrofes son:<p>Norte : Océano Atlántico<p>Sur : Brasil<p>Este : Surinam<p>Oeste : Venezuela y Brasil<html>");
                break;
            case "Guyana Francesa": lblLimites.setText("<html>Sus Paises Limitrofes son:<p>Norte : Océano Atlántico<p>Sur : Brasil <p>Este : Brasil Y Océano Atlántico<p>Oeste : Surinam<html>");
                break;
            case "Paraguay": lblLimites.setText("<html>Sus Paises Limitrofes son:<p>Norte : Bolivia<p>Sur : Argentina<p>Este : Brasil<p>Oeste : Argentina <p>Noreste : Bolivia<html>");
                break;
            case "Peru": lblLimites.setText("<html>Sus Paises Limitrofes son:<p>Norte : Ecuador y Colombia<p>Sur : Chile y Bolivia<p>Este : Brasil<p>Oeste : Océano Pacífico<html>");
                break;
            case "Suriname": lblLimites.setText("<html>Sus Paises Limitrofes son:<p>Norte : Océano Atlántico<p>Sur : Brasil<p>Este : Guyana Francesa<p>Oeste : Guyana<html>");
                break;
            case "Uruguay": lblLimites.setText("<html>Sus Paises Limitrofes son:<p>Norte : Brasil<p>Sur : Océano Atlántico<p>Este : Océano Atlántico<p>Oeste : Argentina<html>");
                break;
            case "Venezuela": lblLimites.setText("<html>Sus Paises Limitrofes son:<p>Norte : Océano Atlántico<p>Sur : Brasil<p>Este : Guyana<p>Oeste : Colombia<html>");
                break;
            }
       } 
       
    if(evt.getSource() == cbPaises){
           
           JComboBox translimites = (JComboBox)evt.getSource();
            
            String tlim = (String)translimites.getSelectedItem();
            switch (tlim){
            case "Argentina": lblTranslim.setText("<html>Sus Países Translimitrofes son: <p>Perú, Ecuador, Colombia, <p>Venezuela, Guyana, Guyana Francesa <p>y Suriname<html>");
                break;
            case "Bolivia": lblTranslim.setText("<html>Sus Países Transimitrofes son: <p>Ururguay, Océano Pacifico, <p>Ecuador, Colombia, Venenzuela, <p>Guyana, Guyana Francesa y Suriname<html>");
                break;
            case "Brasil": lblTranslim.setText("<html>Sus Países Translimitrofes son: <p>Océano Pacifico y Chile<html>");
                break;
            case "Chile": lblTranslim.setText("<html>Sus Países Translimitrofes son: <p>Paraguay, Ururguay, Brasil, <p>Ecuador<p> y Colombia<html>");
                break;
            case "Colombia": lblTranslim.setText("<html>Sus Países Translimitrofes son: <p>Guyana, Bolivia, Paraguay, <p>Uruguay, <p>Argentina, Chile <p>y Océano Atlántico<html>");
                break;
            case "Ecuador": lblTranslim.setText("<html>Sus Países Translimitrofes son: <p>Venezuela, Brasil, Chile <p>y Bolivia<html>");
                break;
            case "Guyana": lblTranslim.setText("<html>Sus Países Translimitrofes son: <p>Colombia, Perú, Bolovia, <p>Paraguay, Uruguay y Argentina<html>");
                break;
            case "Guyana Francesa": lblTranslim.setText("<html>Sus Países Translimitrofes son: <p>Guyana, Venezuela, Colombia, <p>Ecuador, Perú, Bolivia, <p>Paraguay, Uruguay, Argentina <p>y Oceáno Pacífico <html>");
                break;
            case "Paraguay": lblTranslim.setText("<html>Sus Países Translimitrofes son: <p>Chile, Perú, Colombia, <p>Vnenzuela, Guyana, Guyana Francesa <p>y Suriname<html>");
                break;
            case "Peru": lblTranslim.setText("<html>Sus Países Translimitrofes son: <p>Vnenzuela, Argentina, Paraguay, <p>Uruguay, Guyana, Guyana Francesa, <p>Suriname, Océano Atlántico<html>");
                break;
            case "Suriname": lblTranslim.setText("<html>Sus Países Translimitrofes son: <p>Venezuela, Colombia, Perú, <p>Bolivia, Paraguay, Uruguay, <p>Argentina y Océano Pacífico <html>");
                break;
            case "Uruguay": lblTranslim.setText("<html>Sus Países Translimitrofes son: <p>Chile, Océano Pacífico, Bolivia, <p>Perú, Colombia, Venezuela, <p>GuyanA, Guyana Francesa y Suriname<html>");
                break;
            case "Venezuela": lblTranslim.setText("<html>Sus Países Translimitrofes son: <p>Perú, Bolivia, Paraguay, <p>Uruguay, Argentina y Océano Antártico<html>");
                break;
            }
       } 
       
    }//GEN-LAST:event_cbPaisesActionPerformed
    }
   
    
    private void cbtamanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbtamanoActionPerformed
        
        if(evt.getSource() == cbtamano){
           
           JComboBox tm = (JComboBox)evt.getSource();
            
            String ts = (String)tm.getSelectedItem();
            switch (ts){
            case "Países Pequeños": labeltamano.setText("<html>Entre ellos son:  Chile, Ecuador, Guyana, Guyana Francesa, Paraguay, Uruguay, Venezuela y Suriname<html>");
                break;
            case "Países Medianos": labeltamano.setText("<html>Entre ellos son:  Argentina, Bolivia, Colombia y Perú<html>");
                break;
            case "Países Grandes": labeltamano.setText("<html>Entre ellos son: Brasil <html>");
                break;
              } 
        }
    }//GEN-LAST:event_cbtamanoActionPerformed

    private void cbPaisesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbPaisesItemStateChanged
      
        
        if(evt.getStateChange() == ItemEvent.SELECTED)
       {
           if(this.cbPaises.getSelectedIndex()>0)
           {
               this.cbCapitales.setModel(new DefaultComboBoxModel(this.getCapitales(this.cbPaises.getSelectedItem().toString())));
           }
       }

        int img = cbPaises.getSelectedIndex();
        
        switch (img){
            case 1:
                ImageIcon imagen1 = new ImageIcon(this.getClass().getResource("/imagenes/argentina.png"));
                jlImagen.setIcon(imagen1);
                break;
            case 2:
                ImageIcon imagen2 = new ImageIcon(this.getClass().getResource("/imagenes/bolivia.png"));
                jlImagen.setIcon(imagen2);
                break;
            case 3:
                ImageIcon imagen3 = new ImageIcon(this.getClass().getResource("/imagenes/brasil.png"));
                jlImagen.setIcon(imagen3);
                break;
            case 4:
                ImageIcon imagen4 = new ImageIcon(this.getClass().getResource("/imagenes/chile.png"));
                jlImagen.setIcon(imagen4);
                break;
            case 5:
                ImageIcon imagen5 = new ImageIcon(this.getClass().getResource("/imagenes/colombia.png"));
                jlImagen.setIcon(imagen5);
                break;
            case 6:
                ImageIcon imagen6 = new ImageIcon(this.getClass().getResource("/imagenes/ecuador.png"));
                jlImagen.setIcon(imagen6);
                break;
            case 7:
                ImageIcon imagen7 = new ImageIcon(this.getClass().getResource("/imagenes/guyana.png"));
                jlImagen.setIcon(imagen7);
                break;
            case 8:
                ImageIcon imagen8 = new ImageIcon(this.getClass().getResource("/imagenes/guyana francesa.png"));
                jlImagen.setIcon(imagen8);
                break;
            case 9:
                ImageIcon imagen9 = new ImageIcon(this.getClass().getResource("/imagenes/paraguay.png"));
                jlImagen.setIcon(imagen9);
                break;
            case 10:
                ImageIcon imagen10 = new ImageIcon(this.getClass().getResource("/imagenes/peru.png"));
                jlImagen.setIcon(imagen10);
                break;
            case 11:
                ImageIcon imagen11 = new ImageIcon(this.getClass().getResource("/imagenes/suriname.png"));
                jlImagen.setIcon(imagen11);
                break;
            case 12:
                ImageIcon imagen12 = new ImageIcon(this.getClass().getResource("/imagenes/uruguay.png"));
                jlImagen.setIcon(imagen12);
                break;
            case 13:
                ImageIcon imagen13 = new ImageIcon(this.getClass().getResource("/imagenes/venezuela.png"));
                jlImagen.setIcon(imagen13);
                break;
        }
        
        
    }//GEN-LAST:event_cbPaisesItemStateChanged

    private void cbCapitalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCapitalesActionPerformed
   
    }//GEN-LAST:event_cbCapitalesActionPerformed

    private void lblSuperficieAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_lblSuperficieAncestorAdded
          
    }//GEN-LAST:event_lblSuperficieAncestorAdded
       
     public String[] getCapitales(String pais)
    {
        String[] capitales = new String[1];
        if(pais.equalsIgnoreCase("Argentina"))
        {
            capitales[0] = "Buenos Aires";
         }
        if(pais.equalsIgnoreCase("Bolivia"))
        {
            capitales[0] = "La Paz";
        }
        if(pais.equalsIgnoreCase("Brasil"))
        {
            capitales[0] = "Brasilia";
        }
        if(pais.equalsIgnoreCase("Chile"))
        {
            capitales[0] = "Santiago";
        }
        if(pais.equalsIgnoreCase("Colombia"))
        {
            capitales[0] = "Bogota";
        }
        if(pais.equalsIgnoreCase("Ecuador"))
        {
            capitales[0] = "Quito";
        }
        if(pais.equalsIgnoreCase("Guyana"))
        {
            capitales[0] = "GeorgeTown";
        }
        if(pais.equalsIgnoreCase("Guyana Francesa"))
        {
            capitales[0] = "Cayena"; 
        }
        if(pais.equalsIgnoreCase("Paraguay"))
        {
            capitales[0] = "Asuncion";
        }
        if(pais.equalsIgnoreCase("Peru"))
        {
            capitales[0] = "Lima";
        }
        if(pais.equalsIgnoreCase("Suriname"))
        {
            capitales[0] = "Paramaribo"; 
        }
        if(pais.equalsIgnoreCase("Uruguay"))
        {
            capitales[0] = "Montevideo"; 
        }
        if(pais.equalsIgnoreCase("Venezuela"))
        {
            capitales[0] = "Caracas"; 
        }
        return capitales;
    }   
    
     public String[] getTamano(String pais){
         
            int suArg = 2780400;
            int suBol = 1098581;
            int suBra = 8515767;
            int suChi = 756096;
            int suCol = 1141748;
            int suEcu = 256370;
            int suGuy = 214970;
            int suGFr = 83534;
            int suPar = 406752;
            int suPer = 1285216;
            int suSur = 163821;
            int suUru = 176215;
            int suVen = 916445;
         
         String[] tamano = new String[1];
         if(pais.equalsIgnoreCase("Argentina"))
        {
            tamano[0] = suArg + "km"; 
        }
          if(pais.equalsIgnoreCase("Bolivia"))
        {
            tamano[0] = suBol + "km"; 
        }
         
         return tamano;
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
            java.util.logging.Logger.getLogger(consulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(consulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(consulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(consulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new consulta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbCapitales;
    private javax.swing.JComboBox<String> cbPaises;
    private javax.swing.JComboBox<String> cbtamano;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel jlImagen;
    private javax.swing.JLabel labeltamano;
    private javax.swing.JLabel lblLimites;
    private javax.swing.JLabel lblSuperficie;
    private javax.swing.JLabel lblTranslim;
    private javax.swing.JLabel lblcolores;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
