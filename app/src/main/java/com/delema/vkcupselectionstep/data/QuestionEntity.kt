package com.delema.vkcupselectionstep.data

data class QuestionEntity(
    val text: String,
    val isCorrect: Boolean = false,
    val alternativeAnswer: AnswerEntity? = null
)
