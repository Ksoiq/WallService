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
        postType = Post.PostType.POST,
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
        likes = Post.Likes(),
        postSource = null,
        geo = Post.Geo("loc", "12 31 2", null),
        copyHistory = null,
        attachments = arrayOf(
            LinkAttachments(
                LinkAttachments.Link(
                    "wwwww",
                    "Title",
                    null,
                    "des"
                )
            )

        )

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
        postType = Post.PostType.POST,
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
        likes = Post.Likes(),
        postSource = null,
        geo = Post.Geo("loc2", "091236", null),
        copyHistory = null,
        attachments = arrayOf(
            VideoAttachments(
                VideoAttachments.Video(
                    1,
                    2,
                    "video_title",
                    60,
                    "www",
                    12,
                    100,
                    4,
                    "VLC"
                )
            )

        )
    )

    val firstCom = Comment(
        id = 1,
        attachments = null,
        date = 101,
        donut = Comment.CommentDonut(),
        fromId = 234,
        replyToComment = 2,
        replyToUser = 3,
        text = "jfgjfjf",
        theard = Comment.Thread()
    )

    val service = WallService()
    service.add(firstPost)
    service.add(secondPost)
    service.createComment(1, firstCom)




}