package ru.netology.domain;

import java.util.Date;

public class CommentsInfo {
    private int commentId; //
    private int userId; // автор коммента
    private int commentDate; // дата создания комментария в формате Unixtime
    private String commentText; // текст комментария
    private int replyToUser; // идентификатор пользователя или сообщества, в ответ которому оставлен текущий комментарий (если применимо)
    private int replyToComment; // ответ на комментарий

    public int getCommentId() {
        return commentId;
    }

    public void setCommentId(int commentId) {
        this.commentId = commentId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getCommentDate() {
        return commentDate;
    }

    public void setCommentDate(int commentDate) {
        this.commentDate = commentDate;
    }

    public String getCommentText() {
        return commentText;
    }

    public void setCommentText(String commentText) {
        this.commentText = commentText;
    }

    public int getReplyToUser() {
        return replyToUser;
    }

    public void setReplyToUser(int replyToUser) {
        this.replyToUser = replyToUser;
    }

    public int getReplyToComment() {
        return replyToComment;
    }

    public void setReplyToComment(int replyToComment) {
        this.replyToComment = replyToComment;
    }


}
