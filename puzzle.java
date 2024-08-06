import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Collections;

public class puzzle extends JFrame implements ActionListener
{
    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, next;
    JLabel timerLabel, moveCountLabel;
    Timer timer;
    int elapsedTime = 0;
    int moveCount = 0; 

    puzzle() {
        super("puzzle Game");

        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton(" ");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("6");
        next = new JButton("next");
        timerLabel = new JLabel("Time: 0");
        moveCountLabel = new JLabel("Moves: 0");

        b1.setBounds(10, 30, 50, 40);
        b2.setBounds(70, 30, 50, 40);
        b3.setBounds(130, 30, 50, 40);
        b4.setBounds(10, 80, 50, 40);
        b5.setBounds(70, 80, 50, 40);
        b6.setBounds(130, 80, 50, 40);
        b7.setBounds(10, 130, 50, 40);
        b8.setBounds(70, 130, 50, 40);
        b9.setBounds(130, 130, 50, 40);
        next.setBounds(50, 200, 100, 40);
        timerLabel.setBounds(50, 250, 100, 40);
        moveCountLabel.setBounds(50, 270, 100, 40);

        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(b7);
        add(b8);
        add(b9);
        add(next);
        add(timerLabel);
        add(moveCountLabel);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        next.addActionListener(this);

        next.setBackground(Color.black);
        next.setForeground(Color.cyan);
        next.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        setSize(250,350);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        
        timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                elapsedTime++;
                timerLabel.setText("Time: " + elapsedTime);
            }
        });
        timer.start();
    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == next)
        {
            puzzleButtons();
            elapsedTime=0;
            moveCount=-1;
            timerLabel.setText("Time: " + 0);
            moveCountLabel.setText("Moves: "+ 0);
            timer.start();

        }
        if(e.getSource() == b1)
        {
            String s = b1.getText();
            
            if (b2.getText().equals(" "))
            {
                b2.setText(s);
                b1.setText(" ");
            }
            else if(b4.getText().equals(" "))
            {
                b4.setText(s);
                b1.setText(" ");
            }
        }
        if(e.getSource() == b3)
        {
            String s = b3.getText();

            if(b2.getText().equals(" "))
            {
                b2.setText(s);
                b3.setText(" ");
            }
            else if(b6.getText().equals(" "))
            {
                b6.setText(s);
                b3.setText(" ");
            }
        }
        if(e.getSource() == b2)
        {
            String s = b2.getText();

            if(b1.getText().equals(" "))
            {
                b1.setText(s);
                b2.setText(" ");
            }
            else if(b3.getText().equals(" "))
            {
                b3.setText(s);
                b2.setText(" ");
            }
            else if(b5.getText().equals(" "))
            {
                b5.setText(s);
                b2.setText(" ");
            }
        }
        if(e.getSource() == b4)
        {
            String s = b4.getText();

            if(b1.getText().equals(" "))
            {
                b1.setText(s);
                b4.setText(" ");
            }
            else if(b7.getText().equals(" "))
            {
                b7.setText(s);
                b4.setText(" ");
            }
            else if(b5.getText().equals(" "))
            {
                b5.setText(s);
                b4.setText(" ");
            }
        }
        if(e.getSource() == b5)
        {
            String s = b5.getText();

            if(b2.getText().equals(" "))
            {
                b2.setText(s);
                b5.setText(" ");
            }
            else if(b4.getText().equals(" "))
            {
                b4.setText(s);
                b5.setText(" ");
            }
            else if(b6.getText().equals(" "))
            {
                b6.setText(s);
                b5.setText(" ");
            }
            else if(b8.getText().equals(" "))
            {
                b8.setText(s);
                b5.setText(" ");
            }
        }
        if(e.getSource() == b6)
        {
            String s = b6.getText();

            if(b9.getText().equals(" "))
            {
                b9.setText(s);
                b6.setText(" ");
            }
            else if(b3.getText().equals(" "))
            {
                b3.setText(s);
                b6.setText(" ");
            }
            else if(b5.getText().equals(" "))
            {
                b5.setText(s);
                b6.setText(" ");
            }
        }
        if(e.getSource() == b7)
        {
            String s = b7.getText();

            if(b4.getText().equals(" "))
            {
                b4.setText(s);
                b7.setText(" ");
            }
            else if(b8.getText().equals(" "))
            {
                b8.setText(s);
                b7.setText(" ");
            }
        }
        if(e.getSource() == b8)
        {
            String s = b8.getText();

            if(b7.getText().equals(" "))
            {
                b7.setText(s);
                b8.setText(" ");
            }
            else if(b9.getText().equals(" "))
            {
                b9.setText(s);
                b8.setText(" ");
            }
            else if(b5.getText().equals(" "))
            {
                b5.setText(s);
                b8.setText(" ");
            }
        }
        if(e.getSource() == b9)
        {
            String s = b9.getText();
            if(b6.getText().equals(" "))
            {
                b6.setText(s);
                b9.setText(" ");
            }
            else if(b8.getText().equals(" "))
            {
                b8.setText(s);
                b9.setText(" ");
            }
        }

            moveCount++;
            moveCountLabel.setText("Moves: " + moveCount);
            if(b1.getText().equals("1") && b2.getText().equals("2") && b3.getText().equals("3")
                    && b4.getText().equals("4") && b5.getText().equals("5") && b6.getText().equals("6")
                    && b7.getText().equals("7") && b8.getText().equals("8") && b9.getText().equals(" ")) {
                        timer.stop();
                JOptionPane.showMessageDialog(puzzle.this, "!!! You Won !!!" + elapsedTime + " seconds");
                moveCount=0;
            }
    }

    private void puzzleButtons() {
        ArrayList<String> labels = new ArrayList<String>();
        labels.add(b1.getText());
        labels.add(b2.getText());
        labels.add(b3.getText());
        labels.add(b4.getText());
        labels.add(b5.getText());
        labels.add(b6.getText());
        labels.add(b7.getText());
        labels.add(b8.getText());
        labels.add(b9.getText());
        Collections.shuffle(labels);
        b1.setText(labels.get(0));
        b2.setText(labels.get(1));
        b3.setText(labels.get(2));
        b4.setText(labels.get(3));
        b5.setText(labels.get(4));
        b6.setText(labels.get(5));
        b7.setText(labels.get(6));
        b8.setText(labels.get(7));
        b9.setText(labels.get(8));
    }

    public static void main(String[] args) {
        new puzzle();
    }
}