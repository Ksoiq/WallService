import org.junit.Test
import org.junit.Assert.*

class WallServiceTest {

    @Test
    fun add() {

        val service = WallService()

        val post = Post(
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
            geo = Post.Geo("locTT", "", null),
            copyHistory = null,
            attachments = arrayOf(
                LinkAttachments(
                    LinkAttachments.Link(
                        "www43ww",
                        "Title33",
                        null,
                        "deddss"
                    )
                )

            )
        )

        val result = service.add(post)

        assertNotEquals(0, result.id)
    }

    @Test
    fun updateTrue() {


        val service = WallService()

        service.add(
            Post(
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
        )

        service.add(
            Post(
                ownerId = 1,
                fromId = 1,
                createdBy = 1,
                date = 1,
                text = "qqqqqqqqqq",
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
        )

        service.add(
            Post(
                ownerId = 1,
                fromId = 1,
                createdBy = 1,
                date = 1,
                text = "fffffffffffffff",
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
        )

        val update = Post(
            id = 2,
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

        val result = service.update(update)

        assertTrue(result)


    }

    @Test
    fun updateFalse() {
        val service = WallService()

        service.add(
            Post(
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
        )

        service.add(
            Post(
                ownerId = 1,
                fromId = 1,
                createdBy = 1,
                date = 1,
                text = "qqqqqqqqqq",
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
        )

        service.add(
            Post(
                ownerId = 1,
                fromId = 1,
                createdBy = 1,
                date = 1,
                text = "fffffffffffffff",
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
        )

        val update = Post(
            id = 5,
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

        val result = service.update(update)

        assertFalse(result)
    }

}