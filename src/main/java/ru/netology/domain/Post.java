package ru.netology.domain;

import java.util.Date;

public class Post {

    private int id; // id поста
    private int ownerId; // владелец стены, на которой размещена запись
    private int fromId; // автор поста
    private int createdBy; // идентификатор администратора, который опубликовал запись

    private int date; // время публикации записи в формате unixtime
    private String postText; // текст поста
    private int replyOwnerId; // идентификатор владельца записи, в ответ на которую была оставлена текущая
    private  int replyPostId; // идентификатор записи, в ответ на которую была оставлена текущая
    private int friendsOnly; // 1, если запись была создана с опцией «Только для друзей»
    private CommentsInfo[] commentsInfo; // ссылки на комменты

    private String copyright; // источник материала
    private int[] likeUser; // лайки - id пользователей

    private String postType; //    тип записи, может принимать следующие значения: post, copy, reply, postpone, suggest

    private int viewCount; // число просмотров записи
    private int signerId; // идентификатор автора, если запись была опубликована от имени сообщества и подписана пользователем
    private boolean canPin; //информация о том, может ли текущий пользователь закрепить запись (1 — может, 0 — не может)
    private boolean canDelete; //информация о том, может ли текущий пользователь удалить запись (1 — может, 0 — не может)
    private boolean canEdit; // информация о том, может ли текущий пользователь редактировать запись (1 — может, 0 — не может)
    private boolean isPinned; // информация о том, что запись закреплена
    private int marked_as_ads; // информация о том, содержит ли запись отметку "реклама" (1 — да, 0 — нет).
    private boolean is_favorite; // true, если объект добавлен в закладки у текущего пользователя
    private int postponed_id; //идентификатор отложенной записи. Это поле возвращается тогда, когда запись стояла на таймере.


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFromId() {
        return fromId;
    }

    public void setFromId(int fromId) {
        this.fromId = fromId;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public int getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(int createdBy) {
        this.createdBy = createdBy;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public String getPostText() {
        return postText;
    }

    public void setPostText(String postText) {
        this.postText = postText;
    }

    public int getReplyOwnerId() {
        return replyOwnerId;
    }

    public void setReplyOwnerId(int replyOwnerId) {
        this.replyOwnerId = replyOwnerId;
    }

    public int getReplyPostId() {
        return replyPostId;
    }

    public void setReplyPostId(int replyPostId) {
        this.replyPostId = replyPostId;
    }

    public int getFriendsOnly() {
        return friendsOnly;
    }

    public void setFriendsOnly(int friendsOnly) {
        this.friendsOnly = friendsOnly;
    }

    public String getPostType() {
        return postType;
    }

    public void setPostType(String postType) {
        this.postType = postType;
    }

    public int[] getLikeUser() {
        return likeUser;
    }

    public void setLikeUser(int[] likeUser) {
        this.likeUser = likeUser;
    }

    public CommentsInfo[] getCommentsInfo() {
        return commentsInfo;
    }

    public void setCommentsInfo(CommentsInfo[] commentsInfo) {
        this.commentsInfo = commentsInfo;
    }

    public int getViewCount() {
        return viewCount;
    }

    public void setViewCount(int viewCount) {
        this.viewCount = viewCount;
    }

    public String getCopyright() {
        return copyright;
    }

    public void setCopyright(String copyright) {
        this.copyright = copyright;
    }

    public int getSignerId() {
        return signerId;
    }

    public void setSignerId(int signerId) {
        this.signerId = signerId;
    }

    public boolean isCanPin() {
        return canPin;
    }

    public void setCanPin(boolean canPin) {
        this.canPin = canPin;
    }

    public boolean isCanDelete() {
        return canDelete;
    }

    public void setCanDelete(boolean canDelete) {
        this.canDelete = canDelete;
    }

    public boolean isCanEdit() {
        return canEdit;
    }

    public void setCanEdit(boolean canEdit) {
        this.canEdit = canEdit;
    }

    public boolean isPinned() {
        return isPinned;
    }

    public void setPinned(boolean pinned) {
        isPinned = pinned;
    }

    public int getMarked_as_ads() {
        return marked_as_ads;
    }

    public void setMarked_as_ads(int marked_as_ads) {
        this.marked_as_ads = marked_as_ads;
    }

    public boolean isIs_favorite() {
        return is_favorite;
    }

    public void setIs_favorite(boolean is_favorite) {
        this.is_favorite = is_favorite;
    }

    public int getPostponed_id() {
        return postponed_id;
    }

    public void setPostponed_id(int postponed_id) {
        this.postponed_id = postponed_id;
    }


    public Post() {
    }
}
