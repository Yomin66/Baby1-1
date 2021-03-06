package tw.edu.pu.s1081707.baby1

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_car_main.*

class VegMainActivity : AppCompatActivity() {
    lateinit var mper: MediaPlayer

//    private var soundPool1: SoundPool? = null
//    private val soundId = 1
//
//    private var soundPool2: SoundPool? = null
//
//    private var soundPool3: SoundPool? = null
//
//    private var soundPool4: SoundPool? = null
//
//    private var soundPool5: SoundPool? = null
//
//    private var soundPool6: SoundPool? = null
//
//    private var soundPool7: SoundPool? = null
//
//    private var soundPool8: SoundPool? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_veg_main)

        mper = MediaPlayer()

//        soundPool1 = SoundPool(6, AudioManager.STREAM_MUSIC, 0)
//        soundPool1!!.load(baseContext, R.raw.vegmc1, 0)
//
//        soundPool2 = SoundPool(6, AudioManager.STREAM_MUSIC, 0)
//        soundPool2!!.load(baseContext, R.raw.vegmc2, 1)
//
//        soundPool3 = SoundPool(6, AudioManager.STREAM_MUSIC, 0)
//        soundPool3!!.load(baseContext, R.raw.vegmc3, 3)
//
//        soundPool4 = SoundPool(6, AudioManager.STREAM_MUSIC, 0)
//        soundPool4!!.load(baseContext, R.raw.vegmc4, 4)
//
//        soundPool5 = SoundPool(6, AudioManager.STREAM_MUSIC, 0)
//        soundPool5!!.load(baseContext, R.raw.vegmc5, 5)
//
//        soundPool6 = SoundPool(6, AudioManager.STREAM_MUSIC, 0)
//        soundPool6!!.load(baseContext, R.raw.vegmc6, 6)
//
//        soundPool7 = SoundPool(6, AudioManager.STREAM_MUSIC, 0)
//        soundPool7!!.load(baseContext, R.raw.vegmc7, 7)
//
//        soundPool8 = SoundPool(6, AudioManager.STREAM_MUSIC, 0)
//        soundPool8!!.load(baseContext, R.raw.vegmc8, 8)
    }

//    fun playSound1(view: View) {
//        soundPool1?.play(soundId, 1F, 1F, 0, 0, 1F)
//        Toast.makeText(this, "Playing sound. . . .", Toast.LENGTH_SHORT).show()
//    }
//
//    fun playSound2(view: View) {
//        soundPool2?.play(soundId, 1F, 1F, 1, 0, 1F)
//        Toast.makeText(this, "Playing sound. . . .", Toast.LENGTH_SHORT).show()
//    }
//
//    fun playSound3(view: View) {
//        soundPool3?.play(soundId, 1F, 1F, 2, 0, 1F)
//        Toast.makeText(this, "Playing sound. . . .", Toast.LENGTH_SHORT).show()
//    }
//
//    fun playSound4(view: View) {
//        soundPool4?.play(soundId, 1F, 1F, 3, 0, 1F)
//        Toast.makeText(this, "Playing sound. . . .", Toast.LENGTH_SHORT).show()
//    }
//
//    fun playSound5(view: View) {
//        soundPool5?.play(soundId, 1F, 1F, 4, 0, 1F)
//        Toast.makeText(this, "Playing sound. . . .", Toast.LENGTH_SHORT).show()
//    }
//
//    fun playSound6(view: View) {
//        soundPool6?.play(soundId, 1F, 1F, 5, 0, 1F)
//        Toast.makeText(this, "Playing sound. . . .", Toast.LENGTH_SHORT).show()
//    }
//
//    fun playSound7(view: View) {
//        soundPool7?.play(soundId, 1F, 1F, 6, 0, 1F)
//        Toast.makeText(this, "Playing sound. . . .", Toast.LENGTH_SHORT).show()
//    }
//
//    fun playSound8(view: View) {
//        soundPool8?.play(soundId, 1F, 1F, 7, 0, 1F)
//        Toast.makeText(this, "Playing sound. . . .", Toast.LENGTH_SHORT).show()
//    }
    fun StartPlay(v:View){
        mper.reset()
        when (v.id) {
            R.id.ani1_btn -> {
                mper = MediaPlayer.create(this, R.raw.vegmc1)
                mper.start()
            }

            R.id.ani2_btn -> {
                mper = MediaPlayer.create(this, R.raw.vegmc2)
                mper.start()
            }

            R.id.sha3_btn -> {
                mper = MediaPlayer.create(this, R.raw.vegmc3)
                mper.start()
            }

            R.id.sha4_btn -> {
                mper = MediaPlayer.create(this, R.raw.vegmc4)
                mper.start()
            }

            R.id.sha5_btn -> {
                mper = MediaPlayer.create(this, R.raw.vegmc5)
                mper.start()
            }

            R.id.sha6_btn -> {
                mper = MediaPlayer.create(this, R.raw.vegmc6)
                mper.start()
            }

            R.id.sha7_btn -> {
                mper = MediaPlayer.create(this, R.raw.vegmc7)
                mper.start()
            }

            R.id.sha8_btn -> {
                mper = MediaPlayer.create(this, R.raw.vegmc8)
                mper.start()
            }
        }
    }

}