class WallService {
    private var posts = emptyArray<Post>()
    private var comments = emptyArray<Comment>()
    private var uniqueId = 0


    fun createComment(postId: Int, comment: Comment): Comment {

        for (post in posts) {
            if (post.id == postId) {
                comments += comment
                return comments.last()
            }
        }
        throw PostNotFoundException("Пост с ID $postId не найден")
    }

    fun add(post: Post): Post {
        uniqueId++
        val addedPost = post.copy(id = uniqueId)
        posts += addedPost
        return posts.last()
    }

    fun update(post: Post): Boolean {
        val postId = post.component1()
        val updatePost = post
        for ((index, post) in posts.withIndex()) {
            if (post.id == postId) {
                posts[index] = post.copy(
                    fromId = updatePost.fromId,
                    createdBy = updatePost.createdBy,
                    text = updatePost.text,
                    replyOwnerId = updatePost.replyOwnerId,
                    replyPostId = updatePost.replyPostId,
                    friendsOnly = updatePost.friendsOnly,
                    comments = updatePost.comments,
                    copyright = updatePost.copyright,
                    likes = updatePost.likes,
                    reposts = updatePost.reposts,
                    views = updatePost.views,
                    postType = updatePost.postType,
                    signerId = updatePost.signerId,
                    canPin = updatePost.canPin,
                    canDelete = updatePost.canDelete,
                    canEdit = updatePost.canEdit,
                    isPinned = updatePost.isPinned,
                    markedAsAds = updatePost.markedAsAds,
                    isFavorite = updatePost.isFavorite,
                    postponedId = updatePost.postponedId,
                    postSource = updatePost.postSource,
                    geo = updatePost.geo,
                    copyHistory = updatePost.copyHistory,
                    attachments = updatePost.attachments
                )
                return true
            }
        }
        return false

    }
}