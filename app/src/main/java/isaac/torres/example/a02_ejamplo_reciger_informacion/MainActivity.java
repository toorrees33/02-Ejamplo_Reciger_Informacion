package isaac.torres.example.a02_ejamplo_reciger_informacion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

import isaac.torres.example.a02_ejamplo_reciger_informacion.modelos.Usuario;

public class MainActivity extends AppCompatActivity {
    private EditText txtEmail;
    private EditText txtPassword;
    private Button btnRegistrer;

    ArrayList<Usuario> listaUsuarios;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        listaUsuarios = new ArrayList<>();
        inicializarVista();
        btnRegistrer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email= txtEmail.getText().toString();
                String pasword = txtPassword.getText().toString();
                if (email.isEmpty() || pasword.isEmpty()){
                    Toast.makeText(MainActivity.this, "Faltan Datos", Toast.LENGTH_SHORT).show();
                }else {
                    Usuario miUsuario = new Usuario(email, pasword);
                    listaUsuarios.add(miUsuario);
                    Toast.makeText(MainActivity.this, "Guardado:"+ miUsuario.toString(), Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

    private void inicializarVista() {
        txtEmail = findViewById(R.id.txtEmailMain);
        txtPassword = findViewById(R.id.txtPasswordMain);
        btnRegistrer = findViewById(R.id.btnRegistrerMain);
    }
}