package ru.netology.domain;

import java.util.Date;

public class CommentsInfo {
    private int commentId; //
    private int userId; // автор коммента
    private int commentDate; // дата создания комментария в формате Unixtime
    private String commentText; // текст комментария
    private int replyToUser; // идентификатор пользователя или сообщества, в ответ которому оставлен текущий комментарий (если применимо)
    private int replyToComment; // ответ на комментарий
}
