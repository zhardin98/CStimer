import java.util.*;
import java.text.*;
import java.io.*;
import javax.swing.*;
import javax.swing.Timer;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
public class main extends javax.swing.JFrame{
	public static DecimalFormat timeFormat = new DecimalFormat("#.##");
	public main(){
		initComponents();
	}
	    @SuppressWarnings("unchecked")
    	private void initComponents() {

        	scrambleLabel = new javax.swing.JLabel();
        	timeLabel = new javax.swing.JLabel();
        	actionButton = new javax.swing.JButton();

        	setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        	scrambleLabel.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        	scrambleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        	scrambleLabel.setText("Scramble");
        	scrambleLabel.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        	timeLabel.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        	timeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        	timeLabel.setText("0.00");

        	actionButton.setText("Start");
        	actionButton.addActionListener(new java.awt.event.ActionListener() {
            		public void actionPerformed(java.awt.event.ActionEvent evt) {
                		actionButtonActionPerformed(evt);
            		}
        	});

        	javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        	getContentPane().setLayout(layout);
        	layout.setHorizontalGroup(
            		layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            		.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                		.addContainerGap(96, Short.MAX_VALUE)
                		.addComponent(scrambleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 986, javax.swing.GroupLayout.PREFERRED_SIZE)
                		.addGap(92, 92, 92))
            		.addGroup(layout.createSequentialGroup()
                		.addGap(445, 445, 445)
                		.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    			.addComponent(actionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                    			.addComponent(timeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                		.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        	);
        	layout.setVerticalGroup(
            		layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            		.addGroup(layout.createSequentialGroup()
                		.addGap(45, 45, 45)
                		.addComponent(scrambleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                		.addGap(49, 49, 49)
                		.addComponent(timeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                		.addGap(56, 56, 56)
                		.addComponent(actionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                		.addContainerGap(453, Short.MAX_VALUE))
        	);

        	timeLabel.getAccessibleContext().setAccessibleName("0.00");

        	pack();
    	}
	private void actionButtonActionPerformed(java.awt.event.ActionEvent evt){
		//scramble newScramble = new scramble();
		//scrambleLabel.setText(Arrays.toString(newScramble.guide()));
		//timer newTime = new timer();
		//newTime.stopWatch();
		stopWatch();
	}
	private int secondsToWait = 1000;
	private Timer timer;
	public void stopWatch(){
		timer = new Timer(secondsToWait, e -> {
			if(secondsToWait == 0){
				timer.stop();
			}
			timeLabel.setText((secondsToWait/1000) + "");
			timer.setDelay(secondsToWait);
			secondsToWait += 1000;
			});
			timer.start();
	}
	public static void main(String[] args){
        	try{
            		for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                		if ("Nimbus".equals(info.getName())){
                    			javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    			break;
                		}
            		}
		}catch(ClassNotFoundException ex){
            		java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        	}catch(InstantiationException ex){
            		java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        	}catch(IllegalAccessException ex){
            		java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        	}catch(javax.swing.UnsupportedLookAndFeelException ex){
            		java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        	}

        	java.awt.EventQueue.invokeLater(new Runnable() {
            		public void run(){
                		new main().setVisible(true);
            		}
        	});
	}
	private javax.swing.JButton actionButton;
    	private javax.swing.JLabel scrambleLabel;
    	private javax.swing.JLabel timeLabel;
}
