package ru.netology.domain;

import java.util.Date;

public class Post {
    private int id; // id поста
    private int fromId; // автор поста
    private int ownerId; // владелец стены, на которой размещена запись
    private int createdBy; // идентификатор администратора, который опубликовал запись

    //private String postHeader; // заголовок поста
    private int date; // время публикации записи в формате unixtime
    private String postText; // текст поста
    private int replyOwnerId; // идентификатор владельца записи, в ответ на которую была оставлена текущая
    private  int replyPostId; // идентификатор записи, в ответ на которую была оставлена текущая
    private int friendsOnly; // 1, если запись была создана с опцией «Только для друзей»

    private int theme; // тематика поста
    private int visibleTo; // видимость
    private String postType; //    тип записи, может принимать следующие значения: post, copy, reply, postpone, suggest
    private int[] likeUser; // лайки - id пользователей
    private CommentsInfo[] commentsInfo; // ссылки на комменты
    //private boolean commentsOff; // отключить комментарии?

    private int viewCount; // число просмотров записи
    private String copyright; // источник материала
    private int signerId; // идентификатор автора, если запись была опубликована от имени сообщества и подписана пользователем
    private boolean canPin; //информация о том, может ли текущий пользователь закрепить запись (1 — может, 0 — не может)
    private boolean canDelete; //информация о том, может ли текущий пользователь удалить запись (1 — может, 0 — не может)
    private boolean canEdit; // информация о том, может ли текущий пользователь редактировать запись (1 — может, 0 — не может)
    private boolean isPinned; // информация о том, что запись закреплена
    private int marked_as_ads; // информация о том, содержит ли запись отметку "реклама" (1 — да, 0 — нет).
    private boolean is_favorite; // true, если объект добавлен в закладки у текущего пользователя
    private int postponed_id; //идентификатор отложенной записи. Это поле возвращается тогда, когда запись стояла на таймере.


    public Post() {
    }
}
