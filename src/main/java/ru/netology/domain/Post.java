package ru.netology.domain;

import java.util.Date;

public class Post {
    private int id; // id поста
    private int userId; // автор поста
    private String postHeader; // заголовок поста
    private String postText; // текст поста
    private Date postDate; // дата публикации
    private int theme; // тематика поста
    private int visibleTo; // видимость
    private int postType; //    тип поста: документ, карта, граффити, товар, опрос
    private int[] likeUser; // лайки - id пользователей
    private CommentsInfo[] commentsInfo; // ссылки на комменты
    private boolean commentsOff; // отключить комментарии?


}
