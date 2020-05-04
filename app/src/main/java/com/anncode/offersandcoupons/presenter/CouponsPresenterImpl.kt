package com.anncode.offersandcoupons.presenter

import com.anncode.offersandcoupons.Model.Coupon
import com.anncode.offersandcoupons.Model.CouponsInteractor
import com.anncode.offersandcoupons.Model.CouponsInteractorImpl
import com.anncode.offersandcoupons.view.CouponView

class CouponsPresenterImpl(var couponView: CouponView): CouponPresenter{

    private var couponInteractor: CouponsInteractor = CouponsInteractorImpl(this)

    override fun showCoupons(coupons: ArrayList<Coupon>?) {
        couponView.showCoupons(coupons)
    }

    override fun getCoupons() {
        couponInteractor.getCouponsAPI()
    }

}