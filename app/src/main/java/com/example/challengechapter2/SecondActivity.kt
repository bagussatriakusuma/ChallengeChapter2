package com.example.challengechapter2

import android.os.Build
import android.os.Bundle
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.challengechapter2.Adapter.GojekAdapter
import com.example.challengechapter2.Adapter.GridAdapter
import com.example.challengechapter2.Model.GojekModel
import com.example.challengechapter2.Model.GridModel

class SecondActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.N)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.gojek_activity_main)

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView3)
        val recyclerView2: RecyclerView = findViewById(R.id.recyclerView4)


        val messages: List<GojekModel> = listOf(
            GojekModel(
                 imgGojek = R.drawable.gopay_logo, ttlGojek = "gopay", prcGojek = "Rp109.048", txtGojek = "Klik & cek riwayat"
            ),
            GojekModel(
                imgGojek = R.drawable.gopay_logo, ttlGojek = "gopaylater", prcGojek = "Rp2.209.048", txtGojek = "Cek history"
            ),
            GojekModel(
                imgGojek = R.drawable.gopay_logo, ttlGojek = "gopay coins", prcGojek = "2.001", txtGojek = "Coming soon!"
            ),
        )


        val adapter = GojekAdapter(messages)
        recyclerView.adapter = adapter

        val messages4: List<GridModel> = listOf(
            GridModel(
                 image2 = R.drawable.goride1, image3 = R.drawable.bg1, title1 = "GoRide"
            ),
            GridModel(
                 image2 = R.drawable.gocar, image3 = R.drawable.bg1,title1 = "GoCar"
            ),
            GridModel(
                 image2 = R.drawable.gofood2, image3 = R.drawable.bg2,title1 = "GoFood"
            ),
            GridModel(
                 image2 = R.drawable.gosend,image3 = R.drawable.bg1, title1 = "GoSend"
            ),
            GridModel(
                 image2 = R.drawable.gomart, image3 = R.drawable.bg2,title1 = "GoMart"
            ),
            GridModel(
                image2 = R.drawable.gopulsa,image3 = R.drawable.bg3, title1 = "GoPulsa"
            ),
            GridModel(
                image2 = R.drawable.pedulilindungi, image3 = R.drawable.bg3,title1 = "Check in"
            ),
            GridModel(
                image2 = R.drawable.ic_baseline_more_horiz_24,image3 = R.drawable.bg4, title1 = "Lainnya"
            ),
        )

        val adapter2 = GridAdapter(messages4)
        recyclerView2.adapter = adapter2
    }

}