package com.anncode.offersandcoupons.view

import com.anncode.offersandcoupons.Model.Coupon

interface CouponView{
    fun getCoupons()
    fun showCoupons(coupons: ArrayList<Coupon>?)
}