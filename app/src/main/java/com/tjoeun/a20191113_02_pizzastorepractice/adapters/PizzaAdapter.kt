package com.tjoeun.a20191113_02_pizzastorepractice.adapters

import android.content.Context
import android.view.LayoutInflater
import android.widget.ArrayAdapter
import com.tjoeun.a20191113_02_pizzastorepractice.R
import com.tjoeun.a20191113_02_pizzastorepractice.datas.PizzaStoreData

class PizzaAdapter(context: Context, resource:Int, list: ArrayList<PizzaStoreData>)
    : ArrayAdapter<PizzaStoreData> (context, R.layout.pizza_list_item, list) {

    var mContext = context
    var mList = list
    var inf = LayoutInflater.from(mContext)

    constructor(context: Context, list: ArrayList<PizzaStoreData>) : this(context, R.layout.pizza_list_item, list)

}