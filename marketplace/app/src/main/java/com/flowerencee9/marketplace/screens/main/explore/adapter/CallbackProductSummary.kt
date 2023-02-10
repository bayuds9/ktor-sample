package com.flowerencee9.marketplace.screens.main.explore.adapter

import androidx.recyclerview.widget.DiffUtil
import com.flowerencee9.marketplace.model.data.response.Product

class CallbackProductSummary(
    private val oldList: ArrayList<Product>,
    private val newList: ArrayList<Product>
) : DiffUtil.Callback() {
    override fun getOldListSize(): Int = oldList.size

    override fun getNewListSize(): Int = newList.size

    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return oldList[oldItemPosition] === newList[newItemPosition]
    }

    override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        val (_, value0, nameOld) = oldList[oldItemPosition]
        val (_, value1, nameNew) = newList[newItemPosition]
        return nameOld == nameNew && value0 == value1
    }

    override fun getChangePayload(oldItemPosition: Int, newItemPosition: Int): Any? {
        return super.getChangePayload(oldItemPosition, newItemPosition)
    }
}