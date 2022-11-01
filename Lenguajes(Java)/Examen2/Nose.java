/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package new_examen_2;

/**
 *
 * @author dante
 */
import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;


    import javax.swing.JFrame;  
    import javax.swing.SwingUtilities;  
      
    import org.jfree.chart.ChartFactory;  
    import org.jfree.chart.ChartPanel;  
import org.jfree.chart.ChartUtilities;
    import org.jfree.chart.JFreeChart;  
import org.jfree.chart.plot.CategoryPlot;
    import org.jfree.chart.plot.PlotOrientation;  
import org.jfree.chart.renderer.category.CategoryItemRenderer;
    import org.jfree.data.category.CategoryDataset;  
    import org.jfree.data.category.DefaultCategoryDataset;  

public class Nose extends javax.swing.JFrame {

    /**
     * Creates new form Nose
     */
    
            int SumaTotalHombres=0;
            int SumaTotalMujeres=0;
            int CantidadValoresTotalHombres=0;
            int CantidadValoresTotalMujeres=0;
            int sumaHombres1=10;
            int sumaHombres24=0;
            int sumaHombres32=0;
            int sumaMujeres1=0;
            int sumaMujeres24=0;
            int sumaMujeres32=0;
            int cantidadValoresM1=1;
            int cantidadValoresM24=0;
            int cantidadValoresM32=0;
            int cantidadValoresH1=0;
            int cantidadValoresH24=0;
            int cantidadValoresH32=0;
            
    public Nose() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txt1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txt1.setColumns(20);
        txt1.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        txt1.setForeground(new java.awt.Color(255, 102, 102));
        txt1.setRows(5);
        txt1.setCaretColor(new java.awt.Color(255, 204, 204));
        jScrollPane1.setViewportView(txt1);

        jButton1.setBackground(new java.awt.Color(255, 102, 102));
        jButton1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Leer el Archivo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 102, 102));
        jButton2.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("Ordenar Datos");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 102, 102));
        jButton3.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 0, 0));
        jButton3.setText("Mostrar Grafica");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/new_examen_2/59db69d33752880e93e16efc.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/new_examen_2/source.gif"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
             try {
            JFileChooser open = new JFileChooser();
            int option = open.showOpenDialog(this);
            File f1 = new File(open.getSelectedFile().getPath());
            try (FileReader fr = new FileReader(f1)) {
                BufferedReader br = new BufferedReader(fr);
                String s;
                while((s=br.readLine())!=null) {
                    txt1.append(s + "\n");
                }
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Nose.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Nose.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch(HeadlessException ae) {
            System.out.println(ae);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String frase=(txt1.getText());
            String Replacefrase=frase.replace("\"","");
            Replacefrase=Replacefrase.replace("M","1");
            Replacefrase=Replacefrase.replace("H","2");
            frase=Replacefrase;

            //Ahora vemos nuestro separador que es la diagonal aqui 
            //en el codigo solo se tendira que cambiar por el salto de linea
            //para que funcione con el archivo de texto

            StringTokenizer st = new StringTokenizer(frase, "\n");

            //Ahora vemos nuestro ciclo que nos ayudara a recorrer cada renglon

            while(st.hasMoreTokens())
            {
                //En esta variable auxiliar se almacenara cada renglon
                //cantidadcomas es igual para saber cuantos valores hay en cada renglon

                String token = st.nextToken();
                int cantiadadComas=0;

                //Este ciclo nos ayudara a saber cuantos valores hay en cada renglon

                for(int i=0;i<token.length();i++)
                {
                    if(token.charAt(i)==',')
                    {
                        cantiadadComas++;
                    }
                }

                //Aqui separamos los valores de cada renglon y los almacenamos en un arreglo
                //de comas +1 por que seria el numero de datos

                String[] valores = token.split(",");
                int[] valoresInt = new int[cantiadadComas+1];

                //Aqui convertimos los valores de String a int

                for(int i = 0; i < valores.length; i++)
                {
                    valoresInt[i] = Integer.parseInt(valores[i]);
                }

                //Aqui sumamos los valores despues de la segunda posicion
                //ya que la primera posicion es el genero y la segunda es el estado
                //y cada que de una vuelta sume 1 a la cantidad de valores para
                //saber cuantos valores hay en total y sacar promedio

                int suma=0;
                int cantidadValores=0;
                for(int i = 2; i < valoresInt.length; i++)
                {
                        suma+=valoresInt[i];
                        cantidadValores++;
                        
                }

                
                //Aqui separamos si es hombre o mujer y sumamos los valores
                //y la cantidad de valores para despues sacar el promedio

                if(valoresInt[0]==1)
                {
                    SumaTotalMujeres+=suma;
                    CantidadValoresTotalMujeres+=cantidadValores;

                    //Aqui separamos por estado y sumamos los valores
                    //y la cantidad de valores para despues sacar el promedio
                    if(valoresInt[1]==1)
                    {
                        sumaMujeres1+=suma;
                        cantidadValoresM1+=cantidadValores;
                    }
                  
                    else if(valoresInt[1]==24)
                    {
                        sumaMujeres24+=suma;
                        cantidadValoresM24+=cantidadValores;
                    }
                   
                    else if(valoresInt[1]==32)
                    {
                        sumaMujeres32+=suma;
                        cantidadValoresM32+=cantidadValores;
                    }
                }
                else
                {
                    SumaTotalHombres+=suma;
                    CantidadValoresTotalHombres+=cantidadValores;
                    if(valoresInt[1]==1)
                    {
                        sumaHombres1+=suma;
                        cantidadValoresH1+=cantidadValores;
                    }
                    
                    else if(valoresInt[1]==24)
                    {
                        sumaHombres24+=suma;
                        cantidadValoresH24+=cantidadValores;
                    }
                    
                    else if(valoresInt[1]==32)
                    {
                        sumaHombres32+=suma;
                        cantidadValoresH32+=cantidadValores;
                    }

                }
            }

    }//GEN-LAST:event_jButton2ActionPerformed

    private CategoryDataset createDataset() {  
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();  
      
        // Population in 2005  
        dataset.addValue((sumaMujeres1/cantidadValoresM1)*2, "Mujer", "Aguascalientes");  
        dataset.addValue((sumaHombres1/cantidadValoresH1)*2, "Hombre", "Aguascalientes");  
        
        dataset.addValue((sumaMujeres24/cantidadValoresM24)*2, "Mujer", "Sonora");  
        dataset.addValue((sumaHombres24/cantidadValoresH24)*2, "Hombre", "Sonora"); 
        
        dataset.addValue((sumaMujeres32/cantidadValoresM32)*2, "Mujer", "Zacatecas");  
        dataset.addValue((sumaHombres32/cantidadValoresH32)*2, "Hombre", "Zacatecas");
        
        dataset.addValue((SumaTotalMujeres/CantidadValoresTotalMujeres)*2, "Mujer", "Total");  
        dataset.addValue((SumaTotalHombres/CantidadValoresTotalHombres)*2, "Hombre", "Total");
        
        
        return dataset;  
      } 
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
         CategoryDataset dataset = createDataset();  
          
        //Create chart  
        JFreeChart chart=ChartFactory.createBarChart3D(  
            "Comparacion de Estados", //Chart Title  
            "Estado", // Category axis  
            "Promedio salario", // Value axis  
            dataset,  
            
            PlotOrientation.VERTICAL,  
            true,true,false  
           );  
         
        ChartPanel panel=new ChartPanel(chart);  
        setContentPane(panel);  
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Nose.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Nose.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Nose.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Nose.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Nose().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txt1;
    // End of variables declaration//GEN-END:variables
}
