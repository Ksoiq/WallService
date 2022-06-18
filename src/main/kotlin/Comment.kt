data class Comment(
    val id: Int = 0,
    val fromId: Int,
    val date: Int,
    val text: String,
    val donut: CommentDonut,
    val replyToUser: Int?,
    val replyToComment: Int?,
    val theard: Thread,
    val attachments: Array<Attachments>?
){
    data class CommentDonut(
        val isDon: Boolean = false,
        val placeholder: String = "Доступно только с VK Donut"
    )

    data class Thread(
        val count: Int = 1,
        val canPost: Boolean = true,
        val showReplyButton: Boolean = true,
        val groupsCanPost: Boolean = true
    )
}
