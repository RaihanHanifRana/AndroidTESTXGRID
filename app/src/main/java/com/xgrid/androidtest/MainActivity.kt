package com.xgrid.androidtest

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnUpgradeToPro: RelativeLayout = findViewById(R.id.rl_btn_upgradeToPro)
        val btnPrivacy: RelativeLayout = findViewById(R.id.rl_btn_privacy)
        val btnPurchaseHistory: RelativeLayout = findViewById(R.id.rl_btn_purchaseHistory)
        val btnHelpSupport: RelativeLayout = findViewById(R.id.rl_btn_helpSupport)
        val btnSettings: RelativeLayout = findViewById(R.id.rl_btn_settings)
        val btnInviteFriend: RelativeLayout = findViewById(R.id.rl_btn_inviteFriend)
        val btnLogout: RelativeLayout = findViewById(R.id.rl_btn_logout)
        val btnDayNightMode: ImageView = findViewById(R.id.iv_btn_dayNight)
        val linearLayout: LinearLayout = findViewById(R.id.ll_main)
        var isDay = true

        btnDayNightMode.setOnClickListener{
            isDay = if (isDay) {
                linearLayout.setBackgroundColor(resources.getColor(R.color.color_bg_night))
                false
            } else {
                linearLayout.setBackgroundColor(resources.getColor(R.color.color_bg_day))
                true
            }
        }

        btnPrivacy.setOnClickListener{
            Toast.makeText(this, "Privacy!", Toast.LENGTH_SHORT).show()
        }

        btnSettings.setOnClickListener{
            Toast.makeText(this, "Settings!", Toast.LENGTH_SHORT).show()
        }

        btnPurchaseHistory.setOnClickListener{
            Toast.makeText(this, "Purchase History!", Toast.LENGTH_SHORT).show()
        }

        btnHelpSupport.setOnClickListener{
            Toast.makeText(this, "Help Support!", Toast.LENGTH_SHORT).show()
        }

        btnInviteFriend.setOnClickListener{
            Toast.makeText(this, "Invite a Friend!", Toast.LENGTH_SHORT).show()
        }

        btnLogout.setOnClickListener{
            Toast.makeText(this, "Logout", Toast.LENGTH_SHORT).show()
        }

        btnUpgradeToPro.setOnClickListener{
            Toast.makeText(this, "Upgrade To Pro", Toast.LENGTH_SHORT).show()
        }
    }
}