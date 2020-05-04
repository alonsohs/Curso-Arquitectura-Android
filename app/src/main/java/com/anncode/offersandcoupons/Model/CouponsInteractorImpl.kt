package com.anncode.offersandcoupons.Model

import com.anncode.offersandcoupons.presenter.CouponPresenter

class CouponsInteractorImpl(var couponPresenter: CouponPresenter): CouponsInteractor {

    private var couponRepository:CouponRepository = CouponRepositoryImpl(couponPresenter)

    override fun getCouponsAPI() {
        couponRepository.getCouponsAPI()
    }

}
