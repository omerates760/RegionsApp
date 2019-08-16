package com.monofire.regionsapp


import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_region.view.*

class RegionFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_region, container, false)

    }

    @SuppressLint("WrongConstant")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val regionList = mutableListOf(
            "North America", "Europe", "Asia", "Central America", "Oceania",
            "South America", "Caribbean"
        )

        val adapter = RegionAdapter(regionList, object : CustomRegionItemListener {
            override fun onItemClickRegion(region: String) {
                println(region)


            }
        })
        view.run {
            rc_view.layoutManager = LinearLayoutManager(activity, LinearLayoutManager.VERTICAL, false)
            rc_view!!.adapter = adapter
        }
    }


}
