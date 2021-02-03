import java.awt.*;

class TooSimpleFrame extends Frame {
    TooSimpleFrame(){
        setTitle("AWTExample");
        Button button=new Button("Start");
        button.setBounds(10, 10, 0, 0);
        add(button);
        setSize(400, 150);
        setVisible(true);
    }
    public static void main(String[] args){
        TooSimpleFrame t=new TooSimpleFrame();

    }
}
