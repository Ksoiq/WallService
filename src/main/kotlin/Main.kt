fun main() {
    val firstPost = Post(
        ownerId = 1,
        fromId = 1,
        createdBy = 1,
        date = 1,
        text = "ppppppppppppppppp",
        replyOwnerId = 1,
        replyPostId = 1,
        friendsOnly = false,
        comments = Post.Comments(),
        copyright = Post.Copyright(),
        reposts = Post.Reposts(),
        postType = Post.PostType.Post,
        views = Post.Views(),
        signerId = 1,
        canPin = false,
        canDelete = false,
        canEdit = false,
        isPinned = false,
        markedAsAds = false,
        isFavorite = false,
        donut = Post.Donut(),
        postponedId = 1,
        likes = Post.Likes()
    )

    val secondPost = Post(
        ownerId = 1,
        fromId = 1,
        createdBy = 1,
        date = 1,
        text = "qqqqqqqqqqqqqqqqqqqqqqqqq",
        replyOwnerId = 1,
        replyPostId = 1,
        friendsOnly = false,
        comments = Post.Comments(),
        copyright = Post.Copyright(),
        reposts = Post.Reposts(),
        postType = Post.PostType.Post,
        views = Post.Views(),
        signerId = 1,
        canPin = false,
        canDelete = false,
        canEdit = false,
        isPinned = false,
        markedAsAds = false,
        isFavorite = false,
        donut = Post.Donut(),
        postponedId = 1,
        likes = Post.Likes()
    )

    val service = WallService()
    service.add(firstPost)
    service.add(secondPost)


}