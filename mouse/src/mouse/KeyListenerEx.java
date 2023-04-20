package mouse;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class KeyListenerEx extends JFrame {
    private JLabel[] keyMessage;

    public KeyListenerEx() {
        setTitle("KeyListener 예제"); // 창 제목 설정
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 종료 시 동작 설정
        Container c = getContentPane(); // 컨텐트 팬 가져오기
        c.setLayout(new FlowLayout()); // 레이아웃 설정

        c.addKeyListener(new MyKeyListener()); // 키 리스너 추가

        keyMessage = new JLabel[3];
        keyMessage[0] = new JLabel(" getKeyCode() ");
        keyMessage[1] = new JLabel(" getKeyChar() ");
        keyMessage[2] = new JLabel(" getKeyText() ");

        // 라벨 추가 및 설정
        for (int i = 0; i < keyMessage.length; i++) {
            c.add(keyMessage[i]);
            keyMessage[i].setOpaque(true);
            keyMessage[i].setBackground(Color.YELLOW);
        }
        setSize(300, 150);
        setVisible(true);

        c.setFocusable(true); // 컨테이너에 포커스 설정
        c.requestFocus(); // 컨테이너에 포커스 요청
    }

    // KeyAdapter를 상속받아 MyKeyListener 클래스 구현
    class MyKeyListener extends KeyAdapter {
        public void keyPressed(KeyEvent e) {
            int keyCode = e.getKeyCode(); // 키 코드 가져오기
            char keyChar = e.getKeyChar(); // 키 문자 가져오기

            // 라벨의 텍스트 갱신
            keyMessage[0].setText(Integer.toString(keyCode));
            keyMessage[1].setText(Character.toString(keyChar));
            keyMessage[2].setText(KeyEvent.getKeyText(keyCode));
        }
    }

    public static void main(String[] args) {
        new KeyListenerEx(); // 프로그램 실행
    }
}
