package com.rvmarra17.sumar2numeros.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.rvmarra17.sumar2numeros.R;
import com.rvmarra17.sumar2numeros.core.sumar;

import static java.sql.Types.INTEGER;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button SUMAR = this.findViewById(R.id.boton);

        SUMAR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.this.suma();
            }
        });
    }


    private void suma() {
        final EditText OP1 = this.findViewById(R.id.edOp1);
        final EditText OP2 = this.findViewById(R.id.edOp2);
        final TextView RESULTADO = this.findViewById(R.id.resultado);
        int resultado = sumar.suma(OP1.getText().toString(), OP2.getText().toString());
        RESULTADO.setText(Integer.toString(resultado));
    }
}