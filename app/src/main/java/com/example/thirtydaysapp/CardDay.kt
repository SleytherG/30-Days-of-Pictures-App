package com.example.thirtydaysapp

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class CardDay(
 @StringRes val dayId: Int,
 @StringRes val titleId: Int,
 @DrawableRes val imageId: Int,
 @StringRes val descId: Int
)


object CardsRepository {
val cards = listOf<CardDay>(
 CardDay(dayId = R.string.day_1,  titleId = R.string.title_1,  imageId = R.drawable.pic_1,  descId = R.string.desc_1),
 CardDay(dayId = R.string.day_2,  titleId = R.string.title_2,  imageId = R.drawable.pic_2,  descId = R.string.desc_2),
 CardDay(dayId = R.string.day_3,  titleId = R.string.title_3,  imageId = R.drawable.pic_3,  descId = R.string.desc_3),
 CardDay(dayId = R.string.day_4,  titleId = R.string.title_4,  imageId = R.drawable.pic_4,  descId = R.string.desc_4),
 CardDay(dayId = R.string.day_5,  titleId = R.string.title_5,  imageId = R.drawable.pic_5,  descId = R.string.desc_5),
 CardDay(dayId = R.string.day_6,  titleId = R.string.title_6,  imageId = R.drawable.pic_6,  descId = R.string.desc_6),
 CardDay(dayId = R.string.day_7,  titleId = R.string.title_7,  imageId = R.drawable.pic_7,  descId = R.string.desc_7),
 CardDay(dayId = R.string.day_8,  titleId = R.string.title_8,  imageId = R.drawable.pic_8,  descId = R.string.desc_8),
 CardDay(dayId = R.string.day_9,  titleId = R.string.title_9,  imageId = R.drawable.pic_9,  descId = R.string.desc_9),
 CardDay(dayId = R.string.day_10, titleId = R.string.title_10, imageId = R.drawable.pic_10, descId = R.string.desc_10),
 CardDay(dayId = R.string.day_11, titleId = R.string.title_11, imageId = R.drawable.pic_11, descId = R.string.desc_11),
 CardDay(dayId = R.string.day_12, titleId = R.string.title_12, imageId = R.drawable.pic_12, descId = R.string.desc_12),
 CardDay(dayId = R.string.day_13, titleId = R.string.title_13, imageId = R.drawable.pic_13, descId = R.string.desc_13),
 CardDay(dayId = R.string.day_14, titleId = R.string.title_14, imageId = R.drawable.pic_14, descId = R.string.desc_14),
 CardDay(dayId = R.string.day_15, titleId = R.string.title_15, imageId = R.drawable.pic_15, descId = R.string.desc_15),
 CardDay(dayId = R.string.day_16, titleId = R.string.title_16, imageId = R.drawable.pic_16, descId = R.string.desc_16),
 CardDay(dayId = R.string.day_17, titleId = R.string.title_17, imageId = R.drawable.pic_17, descId = R.string.desc_17),
 CardDay(dayId = R.string.day_18, titleId = R.string.title_18, imageId = R.drawable.pic_18, descId = R.string.desc_18),
 CardDay(dayId = R.string.day_19, titleId = R.string.title_19, imageId = R.drawable.pic_19, descId = R.string.desc_19),
 CardDay(dayId = R.string.day_20, titleId = R.string.title_20, imageId = R.drawable.pic_20, descId = R.string.desc_20),
 CardDay(dayId = R.string.day_21, titleId = R.string.title_21, imageId = R.drawable.pic_21, descId = R.string.desc_21),
 CardDay(dayId = R.string.day_22, titleId = R.string.title_22, imageId = R.drawable.pic_22, descId = R.string.desc_22),
 CardDay(dayId = R.string.day_23, titleId = R.string.title_23, imageId = R.drawable.pic_23, descId = R.string.desc_23),
 CardDay(dayId = R.string.day_24, titleId = R.string.title_24, imageId = R.drawable.pic_24, descId = R.string.desc_24),
 CardDay(dayId = R.string.day_25, titleId = R.string.title_25, imageId = R.drawable.pic_25, descId = R.string.desc_25),
 CardDay(dayId = R.string.day_26, titleId = R.string.title_26, imageId = R.drawable.pic_26, descId = R.string.desc_26),
 CardDay(dayId = R.string.day_27, titleId = R.string.title_27, imageId = R.drawable.pic_27, descId = R.string.desc_27),
 CardDay(dayId = R.string.day_28, titleId = R.string.title_28, imageId = R.drawable.pic_28, descId = R.string.desc_28),
 CardDay(dayId = R.string.day_29, titleId = R.string.title_29, imageId = R.drawable.pic_29, descId = R.string.desc_29),
 CardDay(dayId = R.string.day_30, titleId = R.string.title_30, imageId = R.drawable.pic_30, descId = R.string.desc_30),
)};
