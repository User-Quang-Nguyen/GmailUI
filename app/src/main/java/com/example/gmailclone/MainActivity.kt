package com.example.gmailclone

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.ListView
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    private lateinit var txtMsg: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.content_main)
        val itemList = arrayListOf<ItemModel>()
        itemList.add(
            ItemModel(
                "John Doe",
                resources.getIdentifier("dice_2", "drawable", packageName),
                "Chúc bạn một ngày tốt lành!"
            )
        )
        itemList.add(
            ItemModel(
                "Jane Smith",
                resources.getIdentifier(
                    "dice_2",
                    "drawable",
                    packageName,
                ),
                "Xin cám ơn vì bạn đã gửi email."
            )
        )
        itemList.add(
            ItemModel(
                "Michael Johnson",
                resources.getIdentifier(
                    "dice_3",
                    "drawable",
                    packageName,
                ),
                "Hãy nói với tôi thêm về dự án của bạn."
            )
        )
        itemList.add(
            ItemModel(
                "Emily Brown",
                resources.getIdentifier(
                    "dice_4",
                    "drawable",
                    packageName,
                ),
                "Chúc mừng sinh nhật của bạn!"
            )
        )
        itemList.add(
            ItemModel(
                "David Wilson",
                resources.getIdentifier(
                    "dice_5",
                    "drawable",
                    packageName,
                ),
                "Xin lỗi vì sự bất tiện này."
            )
        )
        itemList.add(
            ItemModel(
                "Sarah Lee",
                resources.getIdentifier(
                    "dice_6",
                    "drawable",
                    packageName,
                ),
                "Đã gửi tài liệu đính kèm."
            )
        )
        itemList.add(
            ItemModel(
                "Robert Davis",
                resources.getIdentifier(
                    "dice_7",
                    "drawable",
                    packageName,
                ),
                "Cảm ơn bạn đã hỗ trợ!"
            )
        )
        itemList.add(
            ItemModel(
                "Laura Anderson",
                resources.getIdentifier(
                    "dice_8",
                    "drawable",
                    packageName,
                ),
                "Hãy cùng thảo luận về điều này."
            )
        )
        itemList.add(
            ItemModel(
                "Kevin Taylor",
                resources.getIdentifier(
                    "dice_9",
                    "drawable",
                    packageName,
                ),
                "Xin vui lòng xác nhận lịch hẹn."
            )
        )
        itemList.add(
            ItemModel(
                "Lisa Robinson",
                resources.getIdentifier(
                    "dice_10",
                    "drawable",
                    packageName,
                ),
                "Chúc bạn một kỳ nghỉ vui vẻ!"
            )
        )
        val adapter = MyCustomAdapter(itemList)
        val listView = findViewById<ListView>(R.id.listView)
        listView.adapter = adapter
    }

}