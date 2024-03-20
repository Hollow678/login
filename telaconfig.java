import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class telaconfig extends JFrame {
 String senha;
 String nome;
 private JTextField textname;
 private JPasswordField textsenha;
 private JButton BotaoOk;
 private JLabel foto;

 public telaconfig() {
  super("Login");
  setLayout(new BorderLayout());

  JPanel inputPanel = new JPanel(new FlowLayout()); // Painel para os campos de texto
  textname = new JTextField(15);
  textsenha = new JPasswordField(15);
  inputPanel.add(new JLabel("Nome:"));
  inputPanel.add(textname);
  inputPanel.add(new JLabel("Senha:"));
  inputPanel.add(textsenha);

  JPanel buttonPanel = new JPanel(new FlowLayout()); // Painel para o botão
  BotaoOk = new JButton("ok");
  buttonPanel.add(BotaoOk);

  JPanel fotoPanel = new JPanel(new FlowLayout()); // Painel para a foto
  Icon ifmt = new ImageIcon(getClass().getResource("ifmt.png"));
  foto = new JLabel(ifmt);
  fotoPanel.add(foto);

  add(inputPanel, BorderLayout.NORTH);
  add(buttonPanel, BorderLayout.CENTER);
  add(fotoPanel, BorderLayout.WEST);

  ButtonHandler handler = new ButtonHandler();
  BotaoOk.addActionListener(handler);
 }

 public void pegarnome() {
  nome = textname.getText();
  senha = String.valueOf(textsenha.getPassword());
 }

 private class ButtonHandler implements ActionListener {
  public void actionPerformed(ActionEvent event) {
   pegarnome();
   JOptionPane.showMessageDialog(null, "Olá " + nome + ", sua senha é : " + senha);
  }
 }


}