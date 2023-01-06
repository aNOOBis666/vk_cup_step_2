package com.delema.vkcupselectionstep.data

data class QuestionSet(
    val question: Question? = null,
    val questionsList: List<Question>? = null,
    val actionTypes: ActionTypes
)
