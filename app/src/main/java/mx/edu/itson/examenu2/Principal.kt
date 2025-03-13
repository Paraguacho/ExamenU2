package mx.edu.itson.examenu2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Principal : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_principal)

        var detalles: Button = findViewById(R.id.btn_detalles)
        var regalos: Button = findViewById(R.id.btn_regalos)
        var globos: Button = findViewById(R.id.btn_globos)
        var peluches: Button = findViewById(R.id.btn_peluches)
        var tazas: Button = findViewById(R.id.btn_tazas)


        detalles.setOnClickListener {
            var intento = Intent(this, Regalos::class.java)
            intento.putExtra("selection", "Detalles")
            startActivity(intento)
        }

        regalos.setOnClickListener {
            var intento = Intent(this, Regalos::class.java)
            intento.putExtra("selection", "Regalos")
            startActivity(intento)
        }

        globos.setOnClickListener {
            var intento = Intent(this, Regalos::class.java)
            intento.putExtra("selection", "Globos")
            startActivity(intento)
        }

        peluches.setOnClickListener {
            var intento = Intent(this, Regalos::class.java)
            intento.putExtra("selection", "Peluches")
            startActivity(intento)
        }

        tazas.setOnClickListener {
            var intento = Intent(this, Regalos::class.java)
            intento.putExtra("selection", "Tazas")
            startActivity(intento)
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
