package com.example.quizapp

object Constants {

    const val USER_NAME :String = "user_name"
    const val TOTAL_QUESTIONS:String = "total_question"
    const val CORRECT_ANSWERS:String = "correct_answers"



    fun getQuestions():ArrayList<Question>{
        val questionsList = ArrayList<Question>(
        )

        val que1 = Question(
            1,
            "この魚の名前はなんでしょう？",
            R.drawable.aji,
            "イワシ",
            "トビウオ",
            "あじ",
            "サンマ",
            3
        )
        questionsList.add(que1)

        val que2 = Question(
            2,
            "この魚の名前はなんでしょう？",
            R.drawable.iwashi,
            "イワシ",
            "トビウオ",
            "あじ",
            "サンマ",
            1
        )
        questionsList.add(que2)

        val que3 = Question(
            3,
            "この魚の名前はなんでしょう？",
            R.drawable.kue,
            "イワシ",
            "トビウオ",
            "クエ",
            "サンマ",
            3
        )
        questionsList.add(que3)

        val que4 = Question(
            4,
            "この魚の名前はなんでしょう？",
            R.drawable.chowchouo,
            "ツノフエフキ",
            "チョウチョウウオ",
            "あじ",
            "サンマ",
            2
        )
        questionsList.add(que4)

        return questionsList


    }
}