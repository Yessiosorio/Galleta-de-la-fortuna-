import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class MiSuerte extends JFrame {
    private String[] mensajesdeSuerte = {
            "Tendras un futuro lleno de triunfos y felicidad.",
            "Tus sueños se haran realidad con perseverancia.",
            "Tus esfuerzos seran recompensados con éxito.",
            "Que cada paso que des esté lleno de fortaleza.",
            "Buena suerte en todas tus aspiraciones y objetivos."
    };
    public MiSuerte() {
        setTitle("Mi Suerte");
        setSize(500, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JButton botonSuerte = new JButton("Mi suerte");
        JLabel etiquetaMensaje = new JLabel();

        botonSuerte.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Obtener un mensaje aleatorio y mostrarlo en la etiqueta
                String mensajeAleatorio = obtenerMensajeSuerteAleatorio();
                etiquetaMensaje.setText(mensajeAleatorio);
            }
        });

        // Configuramos el diseño
        setLayout(new BorderLayout());
        JPanel panelBoton = new JPanel();
        panelBoton.add(botonSuerte);
        add(panelBoton, BorderLayout.SOUTH);
        add(etiquetaMensaje, BorderLayout.CENTER);
    }

    private String obtenerMensajeSuerteAleatorio() {
        Random random = new Random();
        int indice = random.nextInt(mensajesdeSuerte.length);
        return mensajesdeSuerte[indice];
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                MiSuerte app = new MiSuerte();
                app.setVisible(true);
            }
        });
    }
}
