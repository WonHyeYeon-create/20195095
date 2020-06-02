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
      c.add(new JButton("버튼"));

      ImageIcon cherryIcon = new ImageIcon("images/cherry.jpg"); // 해제 상태를 나태는 이미지
     ImageIcon selectedCherryIcon = new ImageIcon("images/selectedCherry.jpg");
      
      JCheckBox apple1 = new JCheckBox("사과");
      JCheckBox pear1 = new JCheckBox("배", true);
      JCheckBox cherry1 = new JCheckBox("체리", cherryIcon, false);
      cherry1.setBorderPainted(true);
      cherry1.setSelectedIcon(selectedCherryIcon);
      
      c.add(apple1);
      c.add(pear1);
      c.add(cherry1);
      
      ButtonGroup g = new ButtonGroup();
      JRadioButton apple2 = new JRadioButton("사과");
      JRadioButton pear2 = new JRadioButton("배", true);
      JRadioButton cherry2 = new JRadioButton("체리", cherryIcon);
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
      
      c.add(new JLabel("이름 "));
      c.add(new JTextField(20));
      c.add(new JLabel("학과 "));
      c.add(new JTextField("컴퓨터공학과 ", 20));
      c.add(new JLabel("주소 "));
      c.add(new JTextField("서울시 ...", 20));

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

      JList<String> strList = new JList<String>(fruits); // 문자열 리스트 생성
      c.add(strList);
   
      JList<ImageIcon> imageList = new JList<ImageIcon>(); // 이미지 리스트 생성
      imageList.setListData(images);
      c.add(imageList);
      
      JList<String> scrollList = new JList<String>(fruits); // 문자열 리스트 생성
      c.add(new JScrollPane(scrollList)); 
   }
   public static void main(String[] args) {
      Practice6 p6 = new Practice6();
   }
}