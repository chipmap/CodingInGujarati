package net.codingingujarati;
import totalcross.ui.MainWindow;
import totalcross.ui.Label;
import totalcross.sys.Settings;
public class Ganak extends MainWindow {
    
    public Ganak() {
        setUIStyle(Settings.MATERIAL_UI);
    }

    @Override
    public void initUI() {
        Label helloWord = new Label("કેમ છો!");
        add(helloWord, CENTER, CENTER);
    }
}
