package com.example.challengechapter2

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.SystemClock
import android.widget.Chronometer
import androidx.annotation.RequiresApi
import androidx.recyclerview.widget.RecyclerView
import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.models.SlideModel
import com.example.challengechapter2.Adapter.MyAdapter
import com.example.challengechapter2.Adapter.MySecondAdapter
import com.example.challengechapter2.Model.MyModel
import com.example.challengechapter2.Model.MySecondModel

class MainActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.N)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val view_timer: Chronometer = findViewById(R.id.view_timer)
        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        val recyclerView2: RecyclerView = findViewById(R.id.recyclerView2)

        val messages: List<MyModel> = listOf(
            MyModel(
                title = "Peduli Lindungi", image = R.drawable.peduli_lindungi1
            ),
            MyModel(
                title = "Pulsa, Tagihan & Hiburan", image = R.drawable.pulsa_tagihan),
            MyModel(
                title = "SpayLater", image = R.drawable.spaylater),
            MyModel(
                title = "Shopee Live", image = R.drawable.shopee_live),
            MyModel(
                title = "Shopee Supermarket", image = R.drawable.shopee_supermarket),
            MyModel(
                title = "Shopee Mall", image = R.drawable.shopee_mall2),
            MyModel(
                title = "Gratis Ongkir & Voucher", image = R.drawable.gratis_ongkir6),
            MyModel(
                title = "Shopee Games", image = R.drawable.shopee_games),
            MyModel(
                title = "Serba Seribu", image = R.drawable.serba_seribu),
            MyModel(
                title = "Bayar Ditempat", image = R.drawable.cod),
            MyModel(
                title = "Shopee Food", image = R.drawable.shopee_food),
            MyModel(
                title = "ShopeePay Sekitarmu", image = R.drawable.ic_saldo_spay),

            )

        val messages2: List<MySecondModel> = listOf(
            MySecondModel(itemImage = R.drawable.watch_promo1, itemPrice = "Rp62.500", itemDiscount = "85%"),
            MySecondModel(itemImage = R.drawable.parfum2, itemPrice = "Rp48.500", itemDiscount = "21%"),
            MySecondModel(itemImage = R.drawable.rak_sepatu, itemPrice = "Rp49.000", itemDiscount = "15%"),
            MySecondModel(itemImage = R.drawable.watch_promo1, itemPrice = "Rp21.800", itemDiscount = "81%"),
            MySecondModel(itemImage = R.drawable.watch_promo1, itemPrice = "Rp62.500", itemDiscount = "51%"),
            MySecondModel(itemImage = R.drawable.watch_promo1, itemPrice = "Rp56.500", itemDiscount = "74%"),
            MySecondModel(itemImage = R.drawable.watch_promo1, itemPrice = "Rp21.000", itemDiscount = "12%"),
            MySecondModel(itemImage = R.drawable.watch_promo1, itemPrice = "Rp67.000", itemDiscount = "65%"),
            MySecondModel(itemImage = R.drawable.watch_promo1, itemPrice = "Rp74.000", itemDiscount = "65%"),
            MySecondModel(itemImage = R.drawable.watch_promo1, itemPrice = "Rp12.000", itemDiscount = "64%"),
            MySecondModel(itemImage = R.drawable.watch_promo1, itemPrice = "Rp64.000", itemDiscount = "23%"),
            MySecondModel(itemImage = R.drawable.watch_promo1, itemPrice = "Rp74.000", itemDiscount = "41%"),
            MySecondModel(itemImage = R.drawable.watch_promo1, itemPrice = "Rp91.000", itemDiscount = "8%"),
            MySecondModel(itemImage = R.drawable.watch_promo1, itemPrice = "Rp743.000", itemDiscount = "56%"),

            )


        val adapter = MyAdapter(messages)
        recyclerView.adapter = adapter

        val adapter2 = MySecondAdapter(messages2)
        recyclerView2.adapter = adapter2


        val imageSlider = findViewById<ImageSlider>(R.id.imageSlider)
        val imageList = ArrayList<SlideModel>()

        imageList.add(SlideModel("https://shopee.co.id/inspirasi-shopee/wp-content/uploads/2019/10/11.11-Big-Sale-2019_ShopeeID_FINAL-Orange-Background-1B.jpg"))
        imageList.add(SlideModel("https://cdn-image.hipwee.com/wp-content/uploads/2019/08/hipwee-shopee1.png"))
        imageList.add(SlideModel("https://asset-a.grid.id/crop/0x0:0x0/x/photo/2021/09/03/shopee-jackie-chanjpg-20210903112650.jpg"))
        imageList.add(SlideModel("https://assets.pikiran-rakyat.com/crop/0x0:0x0/x/photo/2021/01/25/554263017.jpg"))
        imageList.add(SlideModel("https://i.ytimg.com/vi/L7Sz_Twlmnw/maxresdefault.jpg"))

        imageSlider.setImageList(imageList, ScaleTypes.FIT)

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            view_timer.isCountDown = true
        }
        view_timer.base = SystemClock.elapsedRealtime() + 125124312
        view_timer.start()
    }
}