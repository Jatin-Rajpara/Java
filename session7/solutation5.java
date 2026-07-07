package session7;

class User {

    void createUser() {
        System.out.println("User account created.");
    }

    void deleteUser() {
        System.out.println("User account deleted.");
    }
}

class Post {

    void addPost() {
        System.out.println("Post added successfully.");
    }

    void updatePost() {
        System.out.println("Post updated successfully.");
    }
}

class Comment {

    void addComment() {
        System.out.println("Comment added successfully.");
    }

    void deleteComment() {
        System.out.println("Comment deleted successfully.");
    }
}

public class solutation5 {

    public static void main(String[] args) {

        User user = new User();
        Post post = new Post();
        Comment comment = new Comment();

        user.createUser();
        user.deleteUser();

        post.addPost();
        post.updatePost();

        comment.addComment();
        comment.deleteComment();
    }
}