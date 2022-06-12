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
    val postponedId: Int,
    val postSource: PostSource?,
    val geo: Geo?,
    val copyHistory: Array<Post>?,
    val attachments: Array<Attachments>?
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
        val editMode: EditMode = EditMode.ALL
    )

    data class Geo(
        val type: String,
        val coordinates: String,
        val place: Place?
    ) {
        data class Place(
            val id: Int,
            val title: String,
            val latitude: Int,
            val longitude: Int,
            val created: Int,
            val icon: String,
            val checkins: Int,
            val updated: Int,
            val type: Int,
            val country: Int,
            val city: Int,
            val address: String
        )
    }

    data class PostSource(
        val type: PostSourceType,
        val platform: Platform,
        val data: DataType,
        val url: String = "",
    )

    enum class PostType {
        POST, COPY, REPLY, POSTPONE, SUGGEST
    }

    enum class EditMode {
        ALL, DURATION
    }

    enum class PostSourceType {
        VK, WIDGET, API, RSS, SMS
    }

    enum class Platform {
        ANDROID, IPHONE, WPHONE
    }

    enum class DataType {
        PROFILE_ACTIVITY, PROFILE_PHOTO, COMMENTS, LIKE, POLL
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Post

        if (id != other.id) return false
        if (ownerId != other.ownerId) return false
        if (fromId != other.fromId) return false
        if (createdBy != other.createdBy) return false
        if (date != other.date) return false
        if (text != other.text) return false
        if (replyOwnerId != other.replyOwnerId) return false
        if (replyPostId != other.replyPostId) return false
        if (friendsOnly != other.friendsOnly) return false
        if (comments != other.comments) return false
        if (copyright != other.copyright) return false
        if (likes != other.likes) return false
        if (reposts != other.reposts) return false
        if (views != other.views) return false
        if (postType != other.postType) return false
        if (signerId != other.signerId) return false
        if (canPin != other.canPin) return false
        if (canDelete != other.canDelete) return false
        if (canEdit != other.canEdit) return false
        if (isPinned != other.isPinned) return false
        if (markedAsAds != other.markedAsAds) return false
        if (isFavorite != other.isFavorite) return false
        if (donut != other.donut) return false
        if (postponedId != other.postponedId) return false
        if (postSource != other.postSource) return false
        if (geo != other.geo) return false
        if (copyHistory != null) {
            if (other.copyHistory == null) return false
            if (!copyHistory.contentEquals(other.copyHistory)) return false
        } else if (other.copyHistory != null) return false

        return true
    }

    override fun hashCode(): Int {
        var result = id
        result = 31 * result + ownerId
        result = 31 * result + fromId
        result = 31 * result + createdBy
        result = 31 * result + date
        result = 31 * result + text.hashCode()
        result = 31 * result + replyOwnerId
        result = 31 * result + replyPostId
        result = 31 * result + friendsOnly.hashCode()
        result = 31 * result + comments.hashCode()
        result = 31 * result + copyright.hashCode()
        result = 31 * result + likes.hashCode()
        result = 31 * result + reposts.hashCode()
        result = 31 * result + views.hashCode()
        result = 31 * result + postType.hashCode()
        result = 31 * result + signerId
        result = 31 * result + canPin.hashCode()
        result = 31 * result + canDelete.hashCode()
        result = 31 * result + canEdit.hashCode()
        result = 31 * result + isPinned.hashCode()
        result = 31 * result + markedAsAds.hashCode()
        result = 31 * result + isFavorite.hashCode()
        result = 31 * result + donut.hashCode()
        result = 31 * result + postponedId
        result = 31 * result + postSource.hashCode()
        result = 31 * result + geo.hashCode()
        result = 31 * result + (copyHistory?.contentHashCode() ?: 0)
        return result
    }
}
