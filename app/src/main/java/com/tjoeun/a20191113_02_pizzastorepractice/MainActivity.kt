package com.tjoeun.a20191113_02_pizzastorepractice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tjoeun.a20191113_02_pizzastorepractice.adapters.PizzaStoreAdapter
import com.tjoeun.a20191113_02_pizzastorepractice.datas.PizzaStoreData
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    var pizzaStoreList = ArrayList<PizzaStoreData>()
    var pizzaStoreAdapter : PizzaStoreAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupEvents()
        setValues()
    }

    override fun setupEvents() {
        pizzaStoreListView.setOnItemClickListener { parent, view, position, id ->

            var clickedStore = pizzaStoreList.get(position)

            var intent = Intent(mContext, StoreDetailActivity::class.java)
            intent.putExtra("store", clickedStore)
            st
        }

    }

    override fun setValues() {
        addPizzaStores()
        pizzaStoreAdapter = PizzaStoreAdapter(mContext, pizzaStoreList)
        pizzaStoreListView.adapter = pizzaStoreAdapter
    }

    fun addPizzaStores() {

        var url1 = "https://img1.daumcdn.net/thumb/R800x0/?scode=mtistory2&fname=https%3A%2F%2Fk.kakaocdn.net%2Fdn%2FnkQca%2FbtqwVT4rrZo%2FymhFqW9uRbzrmZTxUU1QC1%2Fimg.jpg"
        var url2 = "http://mblogthumb2.phinf.naver.net/20160530_65/ppanppane_1464617766007O9b5u_PNG/%C6%C4%C6%C4%C1%B8%BD%BA_%C7%C7%C0%DA_%B7%CE%B0%ED_%284%29.png?type=w800"
        var url3 = "https://post-phinf.pstatic.net/MjAxODEyMDVfMzYg/MDAxNTQzOTYxOTA4NjM3.8gsStnhxz7eEc9zpt5nmSRZmI-Pzpl4NJvHYU-Dlgmcg.7Vpgk0lopJ5GoTav3CUDqmXi2-_67S5AXD0AGbbR6J4g.JPEG/IMG_1641.jpg?type=w1200"
        var url4 = "https://pbs.twimg.com/profile_images/1098371010548555776/trCrCTDN_400x400.png"

        pizzaStoreList.add(PizzaStoreData("피자헛", "010-1234-5678", url1))
        pizzaStoreList.add(PizzaStoreData("파파존스", "010-1234-5678", url2))
        pizzaStoreList.add(PizzaStoreData("미스터피자", "010-1234-5678", url3))
        pizzaStoreList.add(PizzaStoreData("도미노피자", "010-1234-5678", url4))


    }


}
