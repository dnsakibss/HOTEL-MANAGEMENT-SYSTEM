package GUI;
 
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import Entity.*;
import EntityList.*;

public class Login extends JFrame implements ActionListener{
    JLabel userNameLable, userPassLabel, projectname;
    JTextField userName;
    JPasswordField password;
    JButton btnLogin;
	JPanel panel;
	ImageIcon image;
	
    Font font = new Font("cambria", Font.BOLD, 30);
	Font font1 = new Font("cambria", Font.BOLD, 60);
	
	EmployeeList emplist;
	CustomerList cuslist;
	RoomList roomlist;
	
    public Login(EmployeeList emplist,CustomerList cuslist,RoomList roomlist) {
        super("Login");
		
		this.emplist = emplist; 
		this.cuslist = cuslist; 
		this.roomlist = roomlist;
	    this.setSize(1200, 700);
        this.setLocation(150, 70);
        this.setLayout(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		panel = new JPanel();
		panel.setBounds(0,0,1200,900);
		panel.setOpaque(false);
		panel.setLayout(null);
		this.add(panel);
		
		//BackGround Example
		image = new ImageIcon("Resources/hotel1.jpg");
		JLabel background = new JLabel();
		background.setBounds(0,0,1200,900);
		background.setIcon(image);
		this.add(background);
		

		//USER NAME Label
        projectname = new JLabel("HOTEL PARADISE");
        projectname.setBounds(350, 130, 550, 40);
        projectname.setFont(font1);
		projectname.setForeground(Color.WHITE);
        this.add(projectname);
		
		//USER NAME Label
        userNameLable = new JLabel("User Name:");
        userNameLable.setBounds(450, 210, 200, 40);
        userNameLable.setFont(font);
		userNameLable.setForeground(Color.WHITE);
        this.add(userNameLable);
		
		//USER NAME TextField
        userName = new JTextField();
        userName.setBounds(620, 215, 200, 30);
        userName.setFont(font);
        this.add(userName);
		
		//User Password Label 
        userPassLabel = new JLabel("Password:");
        userPassLabel.setBounds(450, 280, 200, 40);
        userPassLabel.setFont(font);
		userPassLabel.setForeground(Color.WHITE);
        this.add(userPassLabel);
		
		//User Password Password Field
        password = new JPasswordField();
        password.setBounds(620, 285, 200, 30);
        password.setFont(font);
        this.add(password);

        btnLogin = new JButton("Sign In");
        btnLogin.setBounds(650, 350, 150, 50);
        btnLogin.setFont(font);
		btnLogin.setBackground(new Color(28,111,209));
		btnLogin.setForeground(new Color(255,255,255));
        btnLogin.addActionListener(this);
        this.add(btnLogin);
		
		panel.add(userNameLable);
		panel.add(userPassLabel);
		panel.add(projectname);
		panel.add(userName);
		panel.add(password);
		panel.add(btnLogin);
		
        this.setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {
        if (btnLogin == e.getSource()) {
			
            String name = userName.getText();
            String pass = String.valueOf(password.getPassword());

            if (name.equals("SAKIB") && pass.equals("SB2024")) {
				
				
				Dashboard dashboard = new Dashboard(emplist, cuslist, roomlist);
                this.setVisible(false);
            } 
			else {
                JOptionPane.showMessageDialog(this, "Invalid User Name or Password","Error",
                	JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
