package id.ac.poliban.tari.latihan01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btJunai = findViewById(R.id.btJunai);
        Button btAndy = findViewById(R.id.btAndy);
        Button btSami = findViewById(R.id.btSami);
        Button btVita = findViewById(R.id.btVita);
        //pasang object Button dengan listener onClick listener
        //menggunakan implementasi kelas sekarang (MainActivity)
        btJunai.setOnClickListener(this);
        btAndy.setOnClickListener(this);
        btSami.setOnClickListener(this);
        btVita.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        //penanganan kejadian (event handler)
        switch (view.getId()){
            case R.id.btJunai :
                Toast.makeText(this, "Hi Junai", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btAndy :
                Toast.makeText(this, "Hi Andy", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btSami :
                Toast.makeText(this, "Hi Sami", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btVita:
                Toast.makeText(this, "Hi Vita", Toast.LENGTH_SHORT).show();
                break;

        }

    }
}
