package ru.netology.manager;

import ru.netology.domain.Post;

public class PostManager {
    private Post[] posts;


    public Post[] search(
            int ownerId, // id пользователя или сообщества
            String domain, // короткий адрес пользователя или сообщества
            String query, // поисковой запрос
            boolean ownersOnly, // 1 - возвращать только записи от имени владельца стены
            int count, // количество записей, которые необходимо вернуть
            int offset // 	смещение, необходимо для получения определенного подмножества результатов
    ) {
    // TO DO: search
        return posts;
    }

    public void delete(
            int ownerId, // идентификатор пользователя или сообщества, на стене которого находится запись
            int postId // идентификатор записи на стене
    ) {

    }
}
