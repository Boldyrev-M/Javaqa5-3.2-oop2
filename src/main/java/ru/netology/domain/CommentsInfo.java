package ru.netology.domain;

import java.util.Date;

public class CommentsInfo {
    private int commentId; //
    private int postId; // к какому посту относится
    private int replyToId; // ответ на комментарий
    private Date commentDate; // дата публикации
    private String commentText; // текст комментария
    private int userId; // автор коммента
}
