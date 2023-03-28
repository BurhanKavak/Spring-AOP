package com.example.springaop.service.impl;

import com.example.springaop.model.Comment;
import com.example.springaop.repository.CommentRepository;
import com.example.springaop.service.CommentService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CommentServiceImpl implements CommentService {

    private final CommentRepository commentRepository;

    public CommentServiceImpl(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    @Override
    public List<Comment> getAllComments() {
        return commentRepository.findAll();
    }

    @Override
    public Comment createComment(Comment comment) {
        return commentRepository.save(comment);
    }

    @Override
    public Comment updateComment(Long commentId, Comment newComment) {
        Optional<Comment> comment = commentRepository.findById(commentId);
        if (comment.isPresent()) {
            Comment foundComment = comment.get();
            foundComment.setText(newComment.getText());
            foundComment.setAuthor(newComment.getAuthor());
            return foundComment;
        } else {
            return null;
        }
    }

    @Override
    public void deleteComment(Long commentId) {
        commentRepository.deleteById(commentRepository.findById(commentId).orElseThrow(() -> null).getId());
    }
}
