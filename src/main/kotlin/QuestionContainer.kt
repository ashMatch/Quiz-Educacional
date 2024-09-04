data class QuestionContainer(
        val question:String? = null,
        val options:List<String> = listOf(),
        val answer: String? = null,
        var isright: Boolean? = null

        )