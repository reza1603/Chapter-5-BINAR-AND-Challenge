package and.binar.start

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView

class MenuActivity : AppCompatActivity() {

    lateinit var tv_lawanpemain: TextView
    lateinit var tv_lawankomputer: TextView
    lateinit var ib_lawanpemain: ImageButton
    lateinit var ib_lawankomputer: ImageButton


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        supportActionBar?.hide()
        tv_lawanpemain = findViewById(R.id.tv_lawanpemain)
        tv_lawankomputer = findViewById(R.id.tv_lawankomputer)

        //Lawan Pemain
        ib_lawanpemain = findViewById(R.id.ib_lawanpemain)

        ib_lawanpemain.setOnClickListener {
            var intent = Intent(this, Lawanpemain::class.java)
            startActivity(intent)
        }

        //Lawan Komputer
        ib_lawankomputer = findViewById(R.id.ib_lawankomputer)

        ib_lawankomputer.setOnClickListener {
            var intent = Intent(this, Lawankomputer::class.java)
            startActivity(intent)

        }
    }
}