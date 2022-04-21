package and.binar.start

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import kotlin.random.Random

class Lawankomputer : AppCompatActivity() {

    lateinit var ib_batukomputer: ImageButton
    lateinit var ib_kertaskomputer: ImageButton
    lateinit var ib_guntingkomputer: ImageButton
    lateinit var ib_refreshkomputer: ImageButton
    lateinit var tv_komputer: TextView
    lateinit var builder: AlertDialog.Builder

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lawankomputer)

        ib_batukomputer = findViewById(R.id.ib_batukomputer)
        ib_kertaskomputer = findViewById(R.id.ib_kertaskomputer)
        ib_guntingkomputer = findViewById(R.id.ib_guntingkomputer)
        ib_refreshkomputer = findViewById(R.id.ib_refreshkomputer)

        val view = View.inflate(this@Lawankomputer, R.layout.dialogpemainmenang, null)

        val builder = AlertDialog.Builder(this@Lawankomputer)
        builder.setView(view)

        val dialog = builder.create()
    }


    // 0 rock, 1 paper, 2 scissors
    fun kertasButtonPressed(view: View) {
        val komputerChoice = Random.nextInt(2)
        when (komputerChoice) {
            0 -> tv_komputer.text = "Komputer memilih Batu"
            1 -> tv_komputer.text = "Komputer memilih Kertas"
            2 -> tv_komputer.text = "Komputer memilih Gunting"
        }

        when (komputerChoice) {
            0 -> ib_kertaskomputer.setOnClickListener {
            }
            1 -> ib_kertaskomputer.setOnClickListener {
            }
            2 -> ib_kertaskomputer.setOnClickListener {
            }

        }
    }

        fun batuButtonPressed(view: View) {
            val komputerChoice = Random.nextInt(2)
            when (komputerChoice) {
                0 -> tv_komputer.text = "Komputer memilih Batu"
                1 -> tv_komputer.text = "Komputer memilih Kertas"
                2 -> tv_komputer.text = "Komputer memilih Gunting"
            }

            when (komputerChoice) {
                0 -> ib_batukomputer.setOnClickListener {
                }
                1 -> ib_batukomputer.setOnClickListener {
                }
                2 -> ib_batukomputer.setOnClickListener {
                }
            }
        }

            fun guntingButtonPressed(view: View) {
                val komputerChoice = Random.nextInt(2)
                when (komputerChoice) {
                    0 -> tv_komputer.text = "Komputer memilih Batu"
                    1 -> tv_komputer.text = "Komputer memilih Kertas"
                    2 -> tv_komputer.text = "Komputer memilih Gunting"
                }

                when (komputerChoice) {
                    0 -> ib_guntingkomputer.setOnClickListener {
                    }
                    1 -> ib_guntingkomputer.setOnClickListener {
                    }
                    2 -> ib_guntingkomputer.setOnClickListener {
                    }
                }
            }
}