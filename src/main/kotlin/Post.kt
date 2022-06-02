data class Post(
    val id: Int = 0,
    val ownerId: Int,
    val fromId: Int,
    val createdBy: Int,
    val date: Int,
    val text: String,
    val replyOwnerId: Int,
    val replyPostId: Int,
    val friendsOnly: Boolean = false,
    val comments: Comments,
    val copyright: Copyright,
    val likes: Likes,
    val reposts: Reposts,
    val views: Views,
    val postType: PostType,
    val signerId: Int,
    val canPin: Boolean = false,
    val canDelete: Boolean = false,
    val canEdit: Boolean = false,
    val isPinned: Boolean = false,
    val markedAsAds: Boolean = false,
    val isFavorite: Boolean = false,
    val donut: Donut,
    val postponedId: Int
) {
    data class Comments(
        val count: Int = 1,
        val canPost: Boolean = true,
        val groupsCanPost: Boolean = true,
        val canClose: Boolean = true,
        val canOpen: Boolean = true,
    )

    data class Copyright(
        val id: Int = 1,
        val link: String = "thisLink",
        val name: String = "thisName",
        val type: String = "thisType"
    )

    data class Likes(
        val count: Int = 0,
        val userLikes: Boolean = false,
        val canLike: Boolean = true,
        val canPublish: Boolean = true,
    )

    data class Reposts(
        val count: Int = 0,
        val userReposted: Boolean = false
    )

    data class Views(
        val count: Int = 0
    )

    data class Donut(
        val isDonut: Boolean = false,
        val paidDuration: Int = 0,
        val placeholder: String = "Доступно только с подпиской VK Donut",
        val canPublishFreeCope: Boolean = true,
        val editMode: EditMode = EditMode.All
    )

    enum class PostType {
        Post, Copy, Reply, Postpone, Suggest
    }

    enum class EditMode {
        All, Duration
    }
}
