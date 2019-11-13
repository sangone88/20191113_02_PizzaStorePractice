package com.tjoeun.a20191113_02_pizzastorepractice.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.bumptech.glide.Glide
import com.tjoeun.a20191113_02_pizzastorepractice.R
import com.tjoeun.a20191113_02_pizzastorepractice.datas.PizzaStoreData
import de.hdodenhof.circleimageview.CircleImageView

class PizzaStoreAdapter(context: Context, resource:Int, list: ArrayList<PizzaStoreData>)
    : ArrayAdapter<PizzaStoreData> (context, R.layout.pizza_list_item, list) {

    var mContext = context
    var mList = list
    var inf = LayoutInflater.from(mContext)

    constructor(context: Context, list: ArrayList<PizzaStoreData>) : this(context, R.layout.pizza_list_item, list)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var tempRow = convertView

        if (tempRow == null) {
            tempRow = inf.inflate(R.layout.pizza_list_item, null)
        }
//        tempRow가 null인 경우를 대비했으니, row에 tempRow는 절대 null 아니라고 하면서 대입.
        var row = tempRow!!

//        근거 데이터 변수 추출
        var data = mList.get(position)

//        각 줄에서 데이터 출력할 View 찾아오기
        var storeLogoImg = row.findViewById<CircleImageView>(R.id.storeLogoImg)
        var storeNameTxt = row.findViewById<TextView>(R.id.storeNameTxt)

        storeNameTxt.text = data.name
        Glide.with(mContext).load(data.logoUrl).into(storeLogoImg)


        return row

    }
}