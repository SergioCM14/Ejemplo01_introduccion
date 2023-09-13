package sergio.catalan.ejemplo01_introduccion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //Variables de la interfaz
    private TextView txtContador;
    private Button btnPulsa;
    //Variables para la lógica de la aplicación
    private int contador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //El código que escriba tiene que ir aquí
            //Inicializo variable lógica
        contador = 0;
        inicalizaVista();

        btnPulsa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contador++;
                txtContador.setText(contador+ " veces");
            }
        });


    }
    private void inicalizaVista() {
        //Inicializa las variables de interfaz
        txtContador = findViewById(R.id.txtContadorMain);
        btnPulsa = findViewById(R.id.btnPulsaMain);
    }
}