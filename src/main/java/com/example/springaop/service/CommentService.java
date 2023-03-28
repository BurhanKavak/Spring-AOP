package com.example.springaop.service;

import com.example.springaop.model.Comment;

import java.util.List;

public interface CommentService {

    List<Comment> getAllComments();

    Comment createComment(Comment comment);

    Comment updateComment(Long commentId, Comment newComment);

    void deleteComment(Long commentId);
}
