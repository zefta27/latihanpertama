package belajar.mobileprogramming.zefta.uwalq.latihanpertama;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ///Inisiallisasi variabel dan tipedata
    Button btnSubmit;
    EditText etEmail, etNama;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        Menampilkan content View dengan tampilan dengan nama activity_main.xml
        setContentView(R.layout.activity_main);


        btnSubmit = (Button) findViewById(R.id.btnSubmit);
        etNama = (EditText) findViewById(R.id.nama);
        etEmail = (EditText) findViewById(R.id.email);

//        Melakukan Aksi klik tombol Sumbit
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Menyimpan data dalam String
                String sNama = etNama.getText().toString();
                String sEmail =  etEmail.getText().toString();
//                Menampilkan dalam bentuk Toast
                Toast.makeText(MainActivity.this, "Nama Anda : "+sNama+" Email: "+sEmail, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
