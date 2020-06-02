import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Practice6 extends JFrame{
   private String [] fruits= {"apple", "banana", "kiwi", "mango", "pear", "peach", "berry", "strawberry", "blackberry"};
   private String [] names = {"kitae", "jaemoon", "hyosoo", "namyun"};
   private ImageIcon [] images = { new ImageIcon("images/icon1.png"), new ImageIcon("images/icon2.png"), new ImageIcon("images/icon3.png"), new ImageIcon("images/icon4.png") };
   public Practice6() {
      setTitle("Practice6");
      setSize(500,500);
      setVisible(true);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      Container c = getContentPane();
      c.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 50));
      c.add(new JButton("��ư"));

      ImageIcon cherryIcon = new ImageIcon("images/cherry.jpg"); // ���� ���¸� ���´� �̹���
     ImageIcon selectedCherryIcon = new ImageIcon("images/selectedCherry.jpg");
      
      JCheckBox apple1 = new JCheckBox("���");
      JCheckBox pear1 = new JCheckBox("��", true);
      JCheckBox cherry1 = new JCheckBox("ü��", cherryIcon, false);
      cherry1.setBorderPainted(true);
      cherry1.setSelectedIcon(selectedCherryIcon);
      
      c.add(apple1);
      c.add(pear1);
      c.add(cherry1);
      
      ButtonGroup g = new ButtonGroup();
      JRadioButton apple2 = new JRadioButton("���");
      JRadioButton pear2 = new JRadioButton("��", true);
      JRadioButton cherry2 = new JRadioButton("ü��", cherryIcon);
      cherry2.setBorderPainted(true);
      cherry2.setSelectedIcon(selectedCherryIcon);
      g.add(apple2);
      g.add(pear2);
      g.add(cherry2);
      
      c.add(apple2);
      c.add(pear2);
      c.add(cherry2);
      
      JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 200, 100);
      slider.setPaintLabels(true);
      slider.setPaintTicks(true);
      slider.setPaintTrack(true);
      slider.setMajorTickSpacing(50);
      slider.setMinorTickSpacing(10);
      c.add(slider);
      
      c.add(new JLabel("�̸� "));
      c.add(new JTextField(20));
      c.add(new JLabel("�а� "));
      c.add(new JTextField("��ǻ�Ͱ��а� ", 20));
      c.add(new JLabel("�ּ� "));
      c.add(new JTextField("����� ...", 20));

      c.add(new JLabel("Enter the password : "));
      c.add(new JTextField(20));
      
      String weekdays[] = new String[] { "January", "February", "March", "Aprile", "May", "June", "July", "August","September","October","November","December"};
      c.add(new JLabel("Month:"));
      c.add(new JSpinner(new SpinnerListModel(weekdays)));
      
      JTextField tf = new JTextField(20);
      JTextArea ta = new JTextArea(7, 20);
      c.add(new JScrollPane(ta));

      tf.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            JTextField t = (JTextField)e.getSource();
            ta.append(t.getText() + "\n");  
            t.setText("hello");
         }
      });
      
      JComboBox<String> strCombo = new JComboBox<String>(fruits); 
      c.add(strCombo);
   
      JComboBox<String> nameCombo = new JComboBox<String>();
      for(int i=0; i<names.length; i++)
         nameCombo.addItem(names[i]); 

      c.add(nameCombo);

      JList<String> strList = new JList<String>(fruits); // ���ڿ� ����Ʈ ����
      c.add(strList);
   
      JList<ImageIcon> imageList = new JList<ImageIcon>(); // �̹��� ����Ʈ ����
      imageList.setListData(images);
      c.add(imageList);
      
      JList<String> scrollList = new JList<String>(fruits); // ���ڿ� ����Ʈ ����
      c.add(new JScrollPane(scrollList)); 
   }
   public static void main(String[] args) {
      Practice6 p6 = new Practice6();
   }
}