import java.util.*;
import javax.swing.Timer;

public class speedTimer extends javax.swing.JFrame
{
	public boolean hasRun = false;
	public boolean timerRunning = false;
	public double time = 0.0;

	public speedTimer()
	{
		initComponents();
	}

	private void actionButtonActionPerformed(java.awt.event.ActionEvent evt)
	{
		if (!timerRunning)
		{
			stopWatch(hasRun);
			timerRunning = true;
		}
		else
		{
			timer.stop();
			hasRun = true;
			timerRunning = false;
			scramble newScramble = new scramble();
			scrambleLabel.setText(Arrays.toString(newScramble.guide()));
			actionButton.setText("Start");
		}

	}


	public Timer timer;
	private double secondsToWait;
	public void stopWatch(boolean hasRun)
	{
		secondsToWait = 10;
		timer = new Timer((int) secondsToWait, e -> 
		{
			timeTextBox.setText((secondsToWait / 1000) + "");
			secondsToWait += 10;
		});
		if (hasRun)
		{
			timer.restart();
		}
		timer.start();
		actionButton.setText("Stop");
	}

	public static void main(String[] args)
	{
		try
		{
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
			{
				if ("Nimbus".equals(info.getName()))
				{
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		}
		catch (ClassNotFoundException ex)
		{
			java.util.logging.Logger.getLogger(speedTimer.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		}
		catch (InstantiationException ex)
		{
			java.util.logging.Logger.getLogger(speedTimer.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		}
		catch (IllegalAccessException ex)
		{
			java.util.logging.Logger.getLogger(speedTimer.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		}
		catch (javax.swing.UnsupportedLookAndFeelException ex)
		{
			java.util.logging.Logger.getLogger(speedTimer.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		}
		java.awt.EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				new speedTimer().setVisible(true);
			}
		});
	}

	private javax.swing.JButton actionButton;
	private javax.swing.JLabel scrambleLabel;
	private javax.swing.JTextField timeTextBox;

	@SuppressWarnings("unchecked")
	private void initComponents()
	{
		scrambleLabel = new javax.swing.JLabel();
		actionButton = new javax.swing.JButton();
		timeTextBox = new javax.swing.JTextField();
		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		scrambleLabel.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
		scrambleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		scramble newScramble = new scramble();
		scrambleLabel.setText(Arrays.toString(newScramble.guide()));
		scrambleLabel.setVerticalAlignment(javax.swing.SwingConstants.TOP);
		actionButton.setText("Start");
		actionButton.addActionListener(new java.awt.event.ActionListener()
		{
			public void actionPerformed(java.awt.event.ActionEvent evt)
			{
				actionButtonActionPerformed(evt);
			}
		});
		timeTextBox.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
		timeTextBox.setText("0.00");
		timeTextBox.setEnabled(false);
		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						layout.createSequentialGroup().addContainerGap(96, Short.MAX_VALUE)
								.addComponent(scrambleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 986,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(92, 92, 92))
				.addGroup(layout.createSequentialGroup().addGroup(layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(layout.createSequentialGroup().addGap(445, 445, 445).addComponent(actionButton,
								javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGroup(layout.createSequentialGroup().addGap(532, 532, 532).addComponent(timeTextBox,
								javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))) // controls
																														// width
																														// of
																														// text
																														// box
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addGap(45, 45, 45)
						.addComponent(scrambleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 52,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(30, 30, 30)
						.addComponent(timeTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 78,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(56, 56, 56).addComponent(actionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(453, Short.MAX_VALUE)));
		pack();
	}
}
